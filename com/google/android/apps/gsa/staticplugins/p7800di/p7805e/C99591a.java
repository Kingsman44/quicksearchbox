package com.google.android.apps.gsa.staticplugins.p7800di.p7805e;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.e.a */
/* compiled from: PG */
final class C99591a implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long lastModified = ((File) obj).lastModified();
        long lastModified2 = ((File) obj2).lastModified();
        if (lastModified < lastModified2) {
            return -1;
        }
        return lastModified > lastModified2 ? 1 : 0;
    }
}
