package com.google.android.libraries.p579ar.faceviewer.utils;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.faceviewer.utils.f */
/* compiled from: PG */
public final class C10673f {

    /* renamed from: a */
    public final HashSet f35598a = new HashSet();

    /* renamed from: b */
    private final Executor f35599b;

    /* renamed from: c */
    private boolean f35600c;

    public C10673f(Executor executor) {
        this.f35599b = executor;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo18711a() {
        C60870cx a;
        this.f35600c = true;
        a = C60856cj.m92892a(this.f35598a).mo57334a(C10670c.f35595a, this.f35599b);
        this.f35598a.clear();
        return a;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo18712b(C10672e eVar) {
        if (this.f35600c) {
            return C60856cj.m92898g();
        }
        C60870cx a = eVar.mo18640a();
        this.f35598a.add(a);
        C60856cj.m92911t(a, new C10671d(this, a), this.f35599b);
        return a;
    }

    /* renamed from: c */
    public final synchronized boolean mo18713c() {
        return this.f35600c;
    }
}
