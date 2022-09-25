package com.google.apps.p3589d.p3595f;

import com.google.apps.p3589d.p3591b.C45721l;
import com.google.apps.p3589d.p3591b.C45724o;
import com.google.apps.p3589d.p3600k.C45947l;

/* renamed from: com.google.apps.d.f.h */
/* compiled from: PG */
public enum C45805h {
    DEFAULT(C45821x.DEFAULT, C45806i.f120464a, 48, 119860, 119886, 913, 120572, 120598),
    ITALIC(C45821x.ITALIC, C45806i.f120464a, 48, 119860, 119886, 120546, 120572, 120598),
    BOLD(C45821x.BOLD, C45721l.f120224b, 120782, 119808, 119834, 120488, 120514, 120540),
    BOLD_ITALIC(C45821x.BOLD_ITALIC, C45721l.f120224b, 120782, 119912, 119938, 120604, 120630, 120656),
    TYPEWRITER(C45821x.TYPEWRITER, C45721l.f120224b, 120822, 120432, 120458, 913, 120572, 120598),
    CALLIGRAPHIC(r15, r5.mo49834c(), 48, 119964, 119886, 913, 120572, 120598),
    SANS_SERIF(C45821x.SANS_SERIF, C45721l.f120224b, 120802, 120224, 120250, 913, 120572, 120598),
    FRAKTUR(r15, r7.mo49834c(), 48, 120068, 120094, 913, 120572, 120598),
    BLACKBOARD(r27, r12.mo49834c(), 120792, 120120, 120146, 913, 120572, 120598);
    

    /* renamed from: j */
    public final C45821x f120455j;

    /* renamed from: k */
    public final C45721l f120456k;

    /* renamed from: l */
    public final int f120457l;

    /* renamed from: m */
    public final int f120458m;

    /* renamed from: n */
    public final int f120459n;

    /* renamed from: o */
    public final int f120460o;

    /* renamed from: p */
    public final int f120461p;

    /* renamed from: q */
    public final int f120462q;

    /* renamed from: s */
    private final C45721l f120463s;

    private C45805h(C45821x xVar, C45721l lVar, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f120455j = xVar;
        this.f120463s = lVar;
        this.f120457l = i;
        this.f120458m = i2;
        this.f120459n = i3;
        this.f120460o = i4;
        this.f120461p = i5;
        this.f120462q = i6;
        C45724o d = C45724o.m81498d();
        lVar.mo49823b(new C45804g(d));
        this.f120456k = d.mo49834c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo49962a(int i) {
        int i2;
        int i3;
        String str = (String) this.f120463s.f120221a.get(C45947l.m82055a(i));
        if (str != null) {
            return str.codePointAt(0);
        }
        if (C45806i.m81702d(i)) {
            i2 = this.f120457l;
            i3 = i - 48;
        } else if (C45806i.m81705g(i)) {
            i2 = this.f120458m;
            i3 = i - 65;
        } else if (C45806i.m81703e(i)) {
            i2 = this.f120459n;
            i3 = i - 97;
        } else if (C45806i.m81706h(i)) {
            i2 = this.f120460o;
            i3 = i - 913;
        } else if (!C45806i.m81704f(i)) {
            int indexOf = C45806i.f120465b.f120220a.indexOf(Integer.valueOf(i));
            return indexOf >= 0 ? this.f120462q + indexOf : i;
        } else {
            i2 = this.f120461p;
            i3 = i - 945;
        }
        return i2 + i3;
    }
}
