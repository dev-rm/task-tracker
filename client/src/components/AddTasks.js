import React, { Component } from 'react';

export default class AddTasks extends Component {
    submitTask(event) {
        event.preventDefault();

        let task = {
            taskName: this.refs.taskName.value,
        }

        fetch("http://localhost:8080/api/tasks", {
            method: "POST",
            headers: {
                "content-type": "application/json",
            },
            body: JSON.stringify(task),
        })
        .then(response => response.json());

        window.location.reload();
    }

    render() {
        return (
                <div className="row">
                    <form className="col s12" onSubmit={this.submitTask.bind(this)}>
                    <div className="row">
                        <div className="input-field col s6">
                            <input placeholder="Placeholder" ref="taskName" type="text" className="validate"/>
                            <label htmlFor="task_name">Task Name</label>
                        </div>
                    </div>
                    <div className="row">
                        <button className="waves-effect waves-light btn" type="submit" name="action">Submit</button>
                    </div>
                    </form> 
                </div>
        )
    }
}
