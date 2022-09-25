package com.bumptech.glide.load.p299c.p300a;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

/* renamed from: com.bumptech.glide.load.c.a.ay */
/* compiled from: PG */
public final class C5846ay implements C5850bb {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12321a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
