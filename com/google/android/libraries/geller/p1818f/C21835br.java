package com.google.android.libraries.geller.p1818f;

import android.content.Context;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58729pv;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.geller.f.br */
/* compiled from: PG */
public final class C21835br {

    /* renamed from: a */
    public final Geller f60245a;

    /* renamed from: b */
    public final String f60246b;

    /* renamed from: c */
    public final C21942ah f60247c;

    /* renamed from: d */
    public C58817ah f60248d;

    /* renamed from: e */
    public final ExecutorService f60249e;

    /* renamed from: f */
    public final ExecutorService f60250f;

    /* renamed from: g */
    public final ExecutorService f60251g;

    /* renamed from: h */
    public final Set f60252h;

    /* renamed from: i */
    public C58817ah f60253i = C21832bo.f60242a;

    /* renamed from: j */
    public C62910ar f60254j = C62948a.m95462m(60, 0);

    /* renamed from: k */
    public String f60255k = "geller-pa.googleapis.com";

    /* renamed from: l */
    public Map f60256l = C58729pv.f156485a;

    /* renamed from: m */
    public C21829bl f60257m = C21829bl.m40928e().mo27131a();

    /* renamed from: n */
    public Context f60258n = null;

    /* renamed from: o */
    public final C58833ax f60259o;

    /* renamed from: p */
    public final C58833ax f60260p;

    /* renamed from: q */
    public final C58833ax f60261q;

    /* renamed from: r */
    public C21847cc f60262r;

    public C21835br(Geller geller, C21942ah ahVar, Set set, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        C58836b bVar = C58836b.f156633a;
        this.f60259o = bVar;
        this.f60260p = bVar;
        this.f60261q = bVar;
        this.f60245a = geller;
        this.f60246b = "agsa";
        this.f60247c = ahVar;
        this.f60252h = set;
        this.f60249e = executorService;
        this.f60250f = executorService2;
        this.f60251g = executorService3;
    }

    /* renamed from: a */
    public final C21836bs mo27139a() {
        C58838bb.m90884s(this.f60248d != null, "A SyncContextGenerator must be set for Geller");
        return new C21836bs(this);
    }
}
