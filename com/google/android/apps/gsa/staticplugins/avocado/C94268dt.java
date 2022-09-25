package com.google.android.apps.gsa.staticplugins.avocado;

import android.util.Size;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dt */
/* compiled from: PG */
public final class C94268dt implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
    }
}
