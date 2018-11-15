# Sample Thorntail multi module app

Includes a library module that contains EJB and CDI beans.

## Problem

Library module `library-module` uses `@JsonProperty` which is not included in `javaee-api` and hence must include artifact `jackson-annotations` (provided) and specify its version.

