package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bk */
/* compiled from: PG */
public abstract class C111970bk {
    /* renamed from: a */
    public abstract long mo99275a();

    /* renamed from: b */
    public abstract long mo99276b();

    /* renamed from: c */
    public abstract C58881cr mo99277c();

    /* renamed from: d */
    public abstract C60870cx mo99278d();

    /* renamed from: e */
    public abstract C60870cx mo99279e();

    /* renamed from: f */
    public C60870cx mo99319f() {
        throw null;
    }

    /* renamed from: g */
    public final boolean mo99320g() {
        return mo99279e().isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo99321h(C86124t tVar) {
        try {
            if (!mo99278d().isDone()) {
                return true;
            }
            C111985p pVar = (C111985p) C60856cj.m92909r(mo99278d());
            if (!Collection.EL.stream(pVar.mo99311a()).allMatch(C111969bj.f311052a)) {
                C58485gu c = tVar.mo79745c(C90063do.f249533fN);
                C58800sl lA = pVar.mo99313c().iterator();
                while (lA.hasNext()) {
                    if (!c.contains(((C48672ag) lA.next()).name())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ExecutionException unused) {
        }
    }
}
