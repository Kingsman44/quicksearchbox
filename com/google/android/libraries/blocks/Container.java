package com.google.android.libraries.blocks;

import com.google.android.libraries.blocks.runtime.java.ContainerInstanceProxy;

/* compiled from: PG */
public class Container {

    /* renamed from: a */
    private final ContainerInstanceProxy f54704a;

    private Container(ContainerInstanceProxy containerInstanceProxy) {
        this.f54704a = containerInstanceProxy;
    }

    private static Container fromNativeContainerInstance(long j) {
        return new Container(new ContainerInstanceProxy(j));
    }

    private long getNativeContainerInstance() {
        return this.f54704a.f54706a;
    }
}
