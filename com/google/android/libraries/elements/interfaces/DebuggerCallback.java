package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public abstract class DebuggerCallback {
    public abstract void configureLiveUpdating(byte[] bArr);

    public abstract void connected();

    public abstract void deleteStoreEntry(byte[] bArr);

    public abstract void disconnected();

    public abstract void getStoreSnapshot();

    public abstract void highlightElements(byte[] bArr);

    public abstract void traverseViewHierarchy();

    public abstract void updateComponentModel(byte[] bArr);

    public abstract void updateStoreEntry(byte[] bArr);
}
