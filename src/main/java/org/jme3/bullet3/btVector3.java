package org.jme3.bullet3;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Platform;

@Platform(include = "LinearMath/btVector3.h")
public class btVector3 extends Pointer {

    static {
        Loader.load();
    }

    public btVector3() {
        allocate();
    }

    private native void allocate();

    public native float getX();
}
