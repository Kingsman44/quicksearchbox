package com.google.common.util.concurrent;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.as */
/* compiled from: PG */
public class C60811as {

    /* renamed from: c */
    private static final C58817ah f164868c = new C60807ao();

    /* renamed from: a */
    public final C60802aj f164869a = new C60802aj();

    /* renamed from: b */
    protected final C58485gu f164870b;

    /* renamed from: d */
    private final boolean f164871d;

    public C60811as(boolean z, Iterable iterable) {
        this.f164871d = z;
        this.f164870b = C58485gu.m89841i(iterable);
        C58801sm G = ((C58485gu) iterable).listIterator(0);
        while (G.hasNext()) {
            C60802aj ajVar = this.f164869a;
            Logger logger = C60817ay.f164883a;
            ((C60817ay) G.next()).mo57277i(ajVar);
        }
    }

    /* renamed from: c */
    private final C58485gu m92807c() {
        return C58485gu.m89841i(C58431eu.m89654f(this.f164870b).mo55247g(f164868c).mo55248h());
    }

    /* renamed from: a */
    public final C60817ay mo57266a(C60809aq aqVar, Executor executor) {
        C60817ay ayVar = new C60817ay(mo57267b().mo57334a(new C60805am(this, aqVar), executor));
        ayVar.f164884b.mo57261b(this.f164869a, C60826bg.f164896a);
        return ayVar;
    }

    /* renamed from: b */
    public final C60852cf mo57267b() {
        if (this.f164871d) {
            return C60856cj.m92894c(m92807c());
        }
        return C60856cj.m92892a(m92807c());
    }
}
