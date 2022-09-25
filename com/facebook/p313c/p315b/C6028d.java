package com.facebook.p313c.p315b;

import android.graphics.Rect;

/* renamed from: com.facebook.c.b.d */
/* compiled from: PG */
public final class C6028d {

    /* renamed from: a */
    public final int f17753a;

    /* renamed from: b */
    public Rect f17754b;

    /* renamed from: c */
    public final Rect f17755c;

    /* renamed from: d */
    public final long f17756d;

    /* renamed from: e */
    public final C6028d f17757e;

    public C6028d(long j, int i, Rect rect, C6028d dVar) {
        this.f17756d = j;
        this.f17753a = i;
        this.f17755c = new Rect(rect);
        this.f17757e = dVar;
        if (dVar != null) {
            m15509a(this, dVar);
        }
    }

    /* renamed from: a */
    private static void m15509a(C6028d dVar, C6028d dVar2) {
        boolean z;
        if (dVar2 != null) {
            Rect rect = dVar.f17755c;
            Rect rect2 = dVar2.f17755c;
            boolean z2 = true;
            if (rect.top < rect2.top) {
                m15510b(dVar2);
                rect2.top = rect.top;
                z = true;
            } else {
                z = false;
            }
            if (rect.bottom > rect2.bottom) {
                m15510b(dVar2);
                rect2.bottom = rect.bottom;
                z = true;
            }
            if (rect.left < rect2.left) {
                m15510b(dVar2);
                rect2.left = rect.left;
            } else {
                z2 = z;
            }
            if (rect.right > rect2.right) {
                m15510b(dVar2);
                rect2.right = rect.right;
            } else if (!z2) {
                return;
            }
            m15509a(dVar2, dVar2.f17757e);
        }
    }

    /* renamed from: b */
    private static void m15510b(C6028d dVar) {
        if (dVar.f17754b == null) {
            dVar.f17754b = new Rect(dVar.f17755c);
        }
    }
}
