package io.getarrays.server.enumeration;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Status {

    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;


}
