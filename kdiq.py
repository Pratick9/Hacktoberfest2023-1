import tkinter as tk

def check_fool():
    if answer_var.get() == "Yes":
        result_label.config(text="I Knew It")
        root.after(2000, root.destroy)
    else:
        result_label.config(text="Not true!")
        answer_var.set("")

root = tk.Tk()
root.title("Fool Prank")

question_label = tk.Label(root, text="Is KD a Chotti Bacchi")
question_label.pack(pady=10)

answer_var = tk.StringVar()
answer_entry = tk.Entry(root, textvariable=answer_var)
answer_entry.pack(pady=5)

submit_button = tk.Button(root, text="Submit", command=check_fool)
submit_button.pack(pady=10)

result_label = tk.Label(root, text="")
result_label.pack()

root.mainloop()
