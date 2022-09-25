package com.google.android.apps.gsa.shared.util.debug;

import android.os.FileObserver;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.h */
/* compiled from: PG */
final class C91024h extends FileObserver {

    /* renamed from: a */
    private final File f254262a;

    public C91024h(File file) {
        super(file.getAbsolutePath(), 24);
        this.f254262a = file;
    }

    public final void onEvent(int i, String str) {
        stopWatching();
        this.f254262a.delete();
        SelfDestructFileProvider.m148580b().remove(this.f254262a);
    }
}
