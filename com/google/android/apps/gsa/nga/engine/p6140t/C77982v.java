package com.google.android.apps.gsa.nga.engine.p6140t;

import com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a.C79149g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.v */
/* compiled from: PG */
abstract class C77982v implements C77975o {

    /* renamed from: c */
    public static final C77982v f214744c = new C77953a((C79149g) null, (C58485gu) null, (Locale) null, 0, 0);

    /* renamed from: a */
    public abstract int mo72913a();

    /* renamed from: b */
    public abstract int mo72914b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C79149g mo72915c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C58485gu mo72916d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Locale mo72917e();

    /* renamed from: f */
    public final boolean mo72935f(String str) {
        C58485gu d = mo72916d();
        if (mo72915c() == null || mo72917e() == null || d == null || str.isEmpty()) {
            return false;
        }
        C58528ij a = mo72915c().mo73816a(str, mo72917e());
        if (a.isEmpty()) {
            return false;
        }
        return Collection.EL.stream(d).anyMatch(new C77978r(a));
    }
}
