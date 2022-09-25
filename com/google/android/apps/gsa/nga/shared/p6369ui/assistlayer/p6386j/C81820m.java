package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j;

import android.graphics.Path;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.m */
/* compiled from: PG */
public abstract class C81820m {

    /* renamed from: b */
    public static final C81820m f223773b = C81811d.f223744a;

    /* renamed from: c */
    public static C81820m m130058c() {
        return C81811d.f223744a;
    }

    /* renamed from: d */
    public static C81820m m130059d(Path path) {
        return new C81812e(path);
    }

    /* renamed from: e */
    public static C81820m m130060e() {
        return C81813f.f223746a;
    }

    /* renamed from: f */
    public static C81820m m130061f(C81820m mVar, C81820m mVar2) {
        if (mVar.mo75343a() == 3 && mVar2.mo75343a() == 3) {
            return C81811d.f223744a;
        }
        if (mVar.mo75343a() == 3 && mVar2.mo75343a() == 2) {
            return mVar2;
        }
        if (mVar.mo75343a() == 2 && mVar2.mo75343a() == 3) {
            return mVar;
        }
        if (mVar.mo75343a() == 1 || mVar2.mo75343a() == 1) {
            return C81813f.f223746a;
        }
        Path path = new Path();
        path.addPath(mVar.mo75347b());
        path.addPath(mVar2.mo75347b());
        return new C81812e(path);
    }

    /* renamed from: a */
    public abstract int mo75343a();

    /* renamed from: b */
    public abstract Path mo75347b();
}
