package com.google.p5261vr.dynamite.client;

import android.os.IInterface;

/* renamed from: com.google.vr.dynamite.client.INativeLibraryLoader */
/* compiled from: PG */
public interface INativeLibraryLoader extends IInterface {
    int checkVersion(String str);

    long initializeAndLoadNativeLibrary(String str);
}
