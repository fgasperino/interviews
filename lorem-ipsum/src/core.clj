(ns core)

(comment
  ;; 1. Fetch the content of the page https://lipsum.com.
  ;; 2. Find the all words (letters, numbers) in the page content.
  ;; 2.1 Ignore all HTML tag syntax (e.g <, >, />, ...)
  ;; 2.2 Keep HTML tag keys (e.g. html, div, ...)
  ;; 3. Sum the number of times each word found occurs.

  (def url "https://www.lipsum.com/feed/html"))

