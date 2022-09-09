---
layout: essay
type: essay
title: "Ask Smart Questions, Don't Be a Luser!"
# All dates must be YYYY-MM-DD format!
date: 2022-09-08
published: true
labels:
  - Questions
  - Answers
  - StackOverflow
---

<img width="300px" class="rounded float-start pe-4" src="../img/QuestionMark-img.jpeg">

## The importance of asking smart questions

Asking a smart question can be the difference between receiving helpful answers that further your knowledge, and receiving rude answers or no answers at all. With the insane volume of questions that get posted online, it's important to think about who you're asking your question to, and the details of the question. For example, if you have a question about literature and decide to ask it on stackoverflow, your question will probably either be immedeately flagged/closed or responded to negatively. The reason for this being that stackoverflow is designated as a place to discuss topics relating to programming, which means that people looking to answer questions, are looking to answer questions pertaining to programming. Along with using the right platform, being sufficiently informed on the topic of the question can allow you to specify what you need help with. Providing limited information, or not doing the right research before asking your question could lead to you being labelled as a Luser. 

## Example of a Luser

Even if you are well intentioned, if you put no effort into the question you are asking, the people answering will put no little to no effort in providing a answer. An example of this can be seen on [this](https://stackoverflow.com/questions/73655156/hello-guys-please-i-need-some-help-from-someone) stackoverflow question where the user is asking:
```
Question: hello guys, please i need some help from someone? [closed]

Execution failed for task ':arcore_flutter_plugin:compileDebugKotlin'. Compilation error. See log for more details 
Closed. This question needs debugging details. It is not currently accepting answers.
Edit the question to include desired behavior, a specific problem or error, and the shortest code necessary to reproduce the problem. This will help others answer the question.

Closed 4 hours ago.

asked 4 hours ago
Yann Assiri
New contributor

1
your question title should be something that will tell people who see it what your question is about. – 
Kevin B
 4 hours ago
```
As you can see in this example the user who posts the question is quite polite in his request, but nonetheless because he provide little to no information on what the problem he's having with the only details being the compiler error message, his post has gotten flagged and closed. Stackoverflow has become much more lax over the years, but at the bare minimum you should still atleast provide what you're trying to do/expected results, what os/language you're using, the source code for the segment you are working with, what you have tried and looked into using. 
## Example of a Smart Question

When asking questions you should aim to provide as much relevant information as possible. Your goal should be to have someone looking at your question, understand what your goal is, and enough information to replicate the conditions of your problem. One analogous way I like to think about asking good questions, is to imagine a scenario where you'd need to provide a forensic sketch artist with a description of a suspect. If you tell the artist "A guy attacked me with a wooden bat manufactured in 1992 at the park on 13th street on thursday, please draw him". the artist won't draw anything, although you've provided a lot of information, none of it is relevant to what the individual looks like, so the artist has nothing to work with. [This](https://stackoverflow.com/questions/15512137/ruby-on-rails-postgresql-library-not-loaded-error-when-starting-server) is an example of what a good question looks like on stackoverflow:
```
Question: Ruby on Rails / PostgreSQL - Library not loaded error when starting server
Asked 9 years, 5 months ago
Modified today
Viewed 4k times

Heyo. I apologize in advance if this question has been answered in another thread. I've searched through the site but I didn't find an answer. However, the closest related issue was Ruby on Rails / PostgreSQL - Library not Loaded error when starting server- libq.5.dylib, but it was never resolved, and the answer doesn't help me.

I'm trying to get PostgreSQL running on my Mac OSX 10.6.8. I already have Ruby 1.9.3p392 and Rails 3.2.13 installed.

Since I've 10.6.8, and PostGresApp requires 10.7+, I tried installing PG using the manual installer (v9.2.3) available here: http://www.enterprisedb.com/products-services-training/pgdownload

I first installed it to its default path at: /Library/PostgreSQL/9.2/. I then installed the pg gem (PATH=$PATH:/Library/PostgreSQL/9.2/bin sudo gem install pg). When I tried rails s to launch my localhost, I got the error below.

After some reading, I guessed it might be a path error, so I removed the pg gem, and then used the postgresql uninstaller. I then reinstalled pg in /users/stewartmccoy/Library/PostgreSQL/9.2/...and then reinstalled the pg gem. But I still get the same error.

Any thoughts on how I might correctly install PostgreSQL and get my rails server running?

stewart-mccoys-macbook:footy_subs stewartmccoy$ rails s
/Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg.rb:4:in `require': dlopen(/Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg_ext.bundle, 9): Library not loaded: libpq.5.dylib (LoadError)
  Referenced from: /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg_ext.bundle
  Reason: image not found - /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg_ext.bundle
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg.rb:4:in `<top (required)>'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:72:in `require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:72:in `block (2 levels) in require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:70:in `each'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:70:in `block in require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:59:in `each'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:59:in `require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler.rb:132:in `require'
    from /Users/stewartmccoy/Code/footy_subs/config/application.rb:13:in `<top (required)>'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:53:in `require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:53:in `block in <top (required)>'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:50:in `tap'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:50:in `<top (required)>'
    from script/rails:6:in `require'
    from script/rails:6:in `<main>'
stewart-mccoys-macbook:footy_subs stewartmccoy$ gem uninstall pgSuccessfully uninstalled pg-0.14.1
stewart-mccoys-macbook:footy_subs stewartmccoy$ PATH=$PATH:/users/stewartmccoy/Library/PostgreSQL/9.2/bin sudo gem install pg
Password:
Fetching: pg-0.14.1.gem (100%)
Building native extensions.  This could take a while...
Successfully installed pg-0.14.1
1 gem installed
Installing ri documentation for pg-0.14.1...
Installing RDoc documentation for pg-0.14.1...
stewart-mccoys-macbook:footy_subs stewartmccoy$ rails s
/Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg.rb:4:in `require': dlopen(/Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg_ext.bundle, 9): Library not loaded: libpq.5.dylib (LoadError)
  Referenced from: /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg_ext.bundle
  Reason: image not found - /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg_ext.bundle
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/pg-0.14.1/lib/pg.rb:4:in `<top (required)>'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:72:in `require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:72:in `block (2 levels) in require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:70:in `each'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:70:in `block in require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:59:in `each'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler/runtime.rb:59:in `require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392@global/gems/bundler-1.3.4/lib/bundler.rb:132:in `require'
    from /Users/stewartmccoy/Code/footy_subs/config/application.rb:13:in `<top (required)>'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:53:in `require'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:53:in `block in <top (required)>'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:50:in `tap'
    from /Users/stewartmccoy/.rvm/gems/ruby-1.9.3-p392/gems/railties-3.2.13/lib/rails/commands.rb:50:in `<top (required)>'
    from script/rails:6:in `require'
    from script/rails:6:in `<main>'

thankyou for providing a reasonable level of detail - Pg version, pg package type, host OS, etc. – 
Craig Ringer
 Mar 19, 2013 at 23:40
```
As you can see from this post, the author provides relevant information in the title even applying the "object-deviation" naming convention for the subject of the question. He is polite in his approach and lists chronologically the steps and approaches he's taken for solving the problem along with relevant console outputs. It's also worth noting that the indivdual came back to the post AFTER he resolved his issue to provide an update on what he did to solve the problem to provide closure for those that provided answers, and for those that are experiencing the same problem.
```
The key part of the error is:

Library not loaded: libpq.5.dylib (LoadError)
This suggests that ruby can't find libpq at runtime. To address that you should probably set the DYLD_LIBRARY_PATH environment variable to point to the lib directory of your PostgreSQL install, either globally or in a wrapper script you use to start Rails. See this superuser question for some more info.

The Pg gem can find the library during compilation and installation because the pg_config executable is on the PATH and it uses that to find libpq. It appears that it doesn't store the path for use at runtime so you have to set the runtime dynamic linker up yourself.

A simple wrapper script (in case you don't want to modify your global environment) is something like:

#!/bin/bash
export DYLD_LIBRARY_PATH=/path/to/pg/lib 
exec rails "$@"
The "$@" basically means "pass all arguments to this script through as if they were passed here directly". It preserves quoting correctly and essentially means that the rails command can't tell you didn't run it directly.
Craig Ringer
289k6868 gold badges652652 silver badges739739 bronze badges

Thanks Craig. Is there a reason I wouldn't want to globally set the DYLD_LIBRARY_PATH environment variable? If the wrapper script is the best approach, how should I save the script and where? i.e. with what filename and extension and in what directory, so Rails knows to run the script at runtime? – 
stewartm
Mar 20, 2013 at 0:38

@stewartmccoy Rails doesn't run the script, you use the script to start Rails. Use it as if it were the rails command. In most cases it's fine to set DYLD_LIBRARY_PATH globally though, the only reason not to is if there are library name conflicts. – 
Craig Ringer
Mar 20, 2013 at 0:47

I tried searching SO / googling for how to set DYLD_LIBRARY_PATH globally, but couldn't find a solution that made sense. How can I do that? I assume I would need to set the path to /users/stewartmccoy/Library/PostgreSQL/9.2/ since that's where I have pg installed? And, if I take that approach, will I be able to just use rails s to view apps on localhost? – 
stewartm
Mar 20, 2013 at 1:13 

@stewartmccoy Yes, if you set it globally you can use the rails command without a wrapper. You want to add the directory containing libpq.5.dylib to the DYLD_LIBRARY_PATH, it'll be in the lib directory of the Pg install. For setting it - put it in your .bashrc or whatever, lots of options. I don't use Apple gear much so I can't be more specific about that part. – 
Craig Ringer
Mar 20, 2013 at 1:18 

For those that come after, I permanently fixed this by editing .bash_profile in VIM and adding export DYLD_LIBRARY_PATH=/Users/stewartmccoy/Library/PostgreSQL/9.2/lib:$DYLD_LIBRARY_P‌​‌​ATH, and then restarting Terminal before doing rails s. – 
stewartm
Mar 20, 2013 at 2:57
```
