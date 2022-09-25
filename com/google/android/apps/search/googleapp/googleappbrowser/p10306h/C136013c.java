package com.google.android.apps.search.googleapp.googleappbrowser.p10306h;

import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43370o;
import com.google.android.libraries.web.p3353c.C43376u;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.h.c */
/* compiled from: PG */
public final class C136013c {
    /* renamed from: a */
    public static boolean m220822a(C43376u uVar) {
        if ((uVar.f113328a & 64) == 0) {
            C43369n a = C43369n.m76519a(uVar.f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            if (C43370o.f113313a.contains(a) || uVar.f113333f == 100) {
                return true;
            }
        }
        return (uVar.f113328a & 4) != 0;
    }
}
