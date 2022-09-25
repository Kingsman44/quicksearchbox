package com.facebook.p313c;

import android.graphics.Rect;
import java.util.List;

/* renamed from: com.facebook.c.s */
/* compiled from: PG */
public final class C6060s {

    /* renamed from: a */
    public final C6060s f17826a;

    /* renamed from: b */
    public final C6063v f17827b;

    /* renamed from: c */
    public final Object f17828c;

    /* renamed from: d */
    public final Rect f17829d;

    /* renamed from: e */
    public final Rect f17830e;

    /* renamed from: f */
    final int f17831f;

    /* renamed from: g */
    public List f17832g;

    /* renamed from: h */
    private final int f17833h;

    /* renamed from: i */
    private final int f17834i;

    public C6060s(C6060s sVar, C6063v vVar, Object obj, Rect rect, Rect rect2, int i) {
        this.f17826a = sVar;
        this.f17827b = vVar;
        this.f17828c = obj;
        this.f17829d = rect;
        int i2 = 0;
        this.f17833h = sVar != null ? sVar.f17833h + rect.left : 0;
        this.f17834i = sVar != null ? rect.top + sVar.f17834i : i2;
        this.f17830e = rect2;
        this.f17831f = i;
    }

    /* renamed from: a */
    public final int mo12651a() {
        List list = this.f17832g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: b */
    public final C6060s mo12652b(int i) {
        return (C6060s) this.f17832g.get(i);
    }
}
