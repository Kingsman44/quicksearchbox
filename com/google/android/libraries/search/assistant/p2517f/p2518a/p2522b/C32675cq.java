package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cq */
/* compiled from: PG */
public final class C32675cq {

    /* renamed from: a */
    public final Map f87572a = new LinkedHashMap();

    /* renamed from: b */
    public boolean f87573b;

    /* renamed from: c */
    public final C32673co f87574c;

    public C32675cq(int i) {
        this.f87574c = new C32673co(i);
    }

    /* renamed from: a */
    public final C32674cp mo38238a() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (C32672cn cnVar : this.f87572a.values()) {
            if (cnVar instanceof C32671cm) {
                i++;
            } else if (cnVar instanceof C32669ck) {
                i2++;
            } else if (C69664n.m101066l(cnVar, C32670cl.f87564a)) {
                i3++;
            }
        }
        return new C32674cp(i, i2, i3);
    }
}
