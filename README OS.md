# OSS Audit — Git 🐧

**Student:** Manmeet Walmik Sonawane  
**Registration Number:** 24BAI10180  
**Course:** Open Source Software | VITyarthi  
**Chosen Software:** Git (Licensed under GPL v2)

---

## What is this project?

This repository contains the shell scripts for the **Open Source Audit** capstone project. The chosen open-source software is **Git** — the distributed version control system created by Linus Torvalds in 2005, licensed under the GNU General Public License version 2 (GPL v2).

---

## Repository Structure

```
oss-audit-24BAI10180/
│
├── script1_system_identity.sh     ← System welcome screen with OS info
├── script2_package_inspector.sh   ← Checks if Git is installed, shows details
├── script3_disk_auditor.sh        ← Audits system directories and permissions
├── script4_log_analyzer.sh        ← Reads and analyzes log files for keywords
├── script5_manifesto_generator.sh ← Interactive open source philosophy generator
│
└── README.md                      ← This file
```

---

## Dependencies / Requirements

- A Linux system (Ubuntu, Debian, Fedora, or WSL on Windows)
- **Git** installed: `sudo apt install git` (Ubuntu/Debian)
- Bash shell (pre-installed on all Linux systems)
- No additional libraries needed

---

## How to Run the Scripts

### Step 1 — Clone this repository
```bash
git clone https://github.com/manmeetsonawane/oss-audit-24BAI10180.git
cd oss-audit-24BAI10180
```

### Step 2 — Give execute permission to all scripts
```bash
chmod +x *.sh
```

### Step 3 — Run each script

**Script 1: System Identity Report**
```bash
./script1_system_identity.sh
```
Displays a welcome screen showing Linux distribution, kernel version, logged-in user, system uptime, date/time, and the open-source license covering the OS.

---

**Script 2: FOSS Package Inspector**
```bash
./script2_package_inspector.sh
```
Checks whether Git is installed on the system, displays version and license information, and prints philosophy notes about common open-source packages using a `case` statement.

---

**Script 3: Disk and Permission Auditor**
```bash
./script3_disk_auditor.sh
```
Loops through important system directories (`/etc`, `/var/log`, `/home`, `/usr/bin`, `/tmp`) and reports their permissions, owner, and disk size. Also checks Git's config file location specifically.

---

**Script 4: Log File Analyzer**
```bash
# Using default sample log (auto-generated):
./script4_log_analyzer.sh

# Using a real system log file:
./script4_log_analyzer.sh /var/log/syslog error
```
Reads a log file line by line using a `while-read` loop, counts how many lines contain a keyword, and prints the last 5 matching lines.

---

**Script 5: Open Source Manifesto Generator**
```bash
./script5_manifesto_generator.sh
```
Asks you 3 interactive questions using `read`, then generates a personalised open source philosophy statement and saves it to `manifesto_[username].txt`.

---

## Shell Concepts Used

| Script | Concepts Demonstrated |
|--------|----------------------|
| Script 1 | Variables, command substitution `$()`, echo, output formatting |
| Script 2 | `if-then-else`, `case` statement, `command -v`, pipes with `grep` |
| Script 3 | `for` loop, arrays, `ls -ld`, `du`, `awk`, `cut`, directory checks |
| Script 4 | `while-read` loop, `if-then`, counter variables, command-line arguments `$1` `$2`, `tail` |
| Script 5 | `read` for user input, string concatenation, writing to file with `>>`, `date` command, alias concept |

---

## Chosen Software: Git

- **License:** GNU General Public License version 2 (GPL v2)
- **Created by:** Linus Torvalds (2005)
- **Official site:** https://git-scm.com
- **Source code:** https://github.com/git/git
- **Why Git?** Git was created because BitKeeper — the proprietary tool Linux developers used — revoked its free license. Torvalds built Git in just 10 days to prove that an open, community-built tool could outperform proprietary alternatives. Today it is the world's most widely used version control system.
