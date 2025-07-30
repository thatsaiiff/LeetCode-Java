# 🔥 Project Log: Fire TV CLI Tool (July 2025)

## 📌 Idea
A lightweight CLI tool to interact with Fire TV using ADB commands. The goal is to automate frequent dev/test/debug actions like launching apps, capturing logs, navigating UI, etc.

---

## 🎯 Key Features (MVP)
- Connect to Fire TV over IP (ADB)
- Launch/uninstall apps by package name
- Take screenshot/logcat
- Simulate D-pad navigation (up/down/select/back)
- List installed apps
- Kill or force-stop app

---

## 🔧 Tech Stack
- Language: Python
- Libs: `subprocess`, `argparse`, possibly `rich` or `typer` for CLI UX
- Tools: ADB (Android Debug Bridge)

---

## 🗓️ Timeline
- 🔹 Sat-Sun (August 3–4): Set up repo, basic CLI skeleton
- 🔹 Weeknights: Add one feature at a time (navigation, app management, etc.)

---

## 📚 Resources
- ADB Commands Ref: https://developer.android.com/studio/command-line/adb
- Fire TV Dev Docs: https://developer.amazon.com/docs/fire-tv

---

## ✏️ Notes
- May later integrate voice command simulations using Alexa Voice Service
- Optional: Add support for GUI with `Tkinter` or `Electron` later