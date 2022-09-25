package com.google.mediapipe.framework;

import android.graphics.Bitmap;

/* compiled from: PG */
public class AndroidPacketCreator extends PacketCreator {
    public AndroidPacketCreator(Graph graph) {
        super(graph);
    }

    private native long nativeCreateRgbImageFrame(long j, Bitmap bitmap);

    private native long nativeCreateRgbaImage(long j, Bitmap bitmap);

    private native long nativeCreateRgbaImageFrame(long j, Bitmap bitmap);
}
