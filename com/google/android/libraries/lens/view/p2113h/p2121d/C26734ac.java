package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Size;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.lens.view.h.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C26734ac implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C26734ac f72863a = new C26734ac();

    private /* synthetic */ C26734ac() {
    }

    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int i = C26735ad.f72864a;
        return ((((long) size.getWidth()) * ((long) size.getHeight())) > (((long) size2.getWidth()) * ((long) size2.getHeight())) ? 1 : ((((long) size.getWidth()) * ((long) size.getHeight())) == (((long) size2.getWidth()) * ((long) size2.getHeight())) ? 0 : -1));
    }
}
