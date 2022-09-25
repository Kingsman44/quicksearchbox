package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
public abstract class CommandRunContext {
    public abstract ByteStore byteStore();

    public abstract boolean enableV2();

    public abstract SenderStateOuterClass$SenderState senderState();
}
