package com.google.mediapipe.framework;

/* compiled from: PG */
public interface TextureFrame extends TextureReleaseCallback {
    int getHeight();

    int getTextureName();

    long getTimestamp();

    int getWidth();

    void release();

    void release(GlSyncToken glSyncToken);
}
