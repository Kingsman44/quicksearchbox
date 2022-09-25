package com.google.android.libraries.gsa.conversation.p1855h;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.gsa.conversation.h.z */
/* compiled from: PG */
public abstract class C22722z {
    /* renamed from: e */
    public static C22722z m42355e(C58833ax axVar, C22721y yVar, C58485gu guVar) {
        return new C22707k(axVar, yVar, guVar, C58836b.f156633a);
    }

    /* renamed from: a */
    public abstract C22721y mo27854a();

    /* renamed from: b */
    public abstract C58833ax mo27855b();

    /* renamed from: c */
    public abstract C58833ax mo27856c();

    /* renamed from: d */
    public abstract C58485gu mo27857d();

    /* renamed from: f */
    public final String mo27879f() {
        String d = C22717u.m42330d(mo27855b());
        return d == null ? BuildConfig.FLAVOR : d;
    }
}
