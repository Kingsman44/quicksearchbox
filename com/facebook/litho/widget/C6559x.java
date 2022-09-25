package com.facebook.litho.widget;

import android.support.p033v7.widget.C0594dj;

/* renamed from: com.facebook.litho.widget.x */
/* compiled from: PG */
final class C6559x extends C0594dj {

    /* renamed from: a */
    final /* synthetic */ C6416ab f19532a;

    public C6559x(C6416ab abVar) {
        this.f19532a = abVar;
    }

    public final int getSpanSize(int i) {
        C6425ak akVar = this.f19532a.f19046b;
        if (akVar == null) {
            return 1;
        }
        C6491cw m = akVar.mo13511m(i);
        if (m.mo13530l()) {
            return this.f19532a.f19045a.mSpanCount;
        }
        return m.mo13519a();
    }
}
