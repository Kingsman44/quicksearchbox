package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
public final class CloseableAssetFileDescriptor extends AssetFileDescriptor implements Closeable {
    private CloseableAssetFileDescriptor() {
        super((ParcelFileDescriptor) null, 0, 0);
    }

    /* renamed from: a */
    public static CloseableAssetFileDescriptor m94502a(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return null;
        }
        return new CloseableAssetFileDescriptor(assetFileDescriptor);
    }

    private CloseableAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor) {
        super(assetFileDescriptor.getParcelFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
