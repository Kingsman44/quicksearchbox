package com.google.android.apps.gsa.sidekick.main.entry;

import android.net.Uri;
import com.google.android.apps.gsa.proactive.C84165c;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.br */
/* compiled from: PG */
public final class C91340br extends C91953ad {

    /* renamed from: a */
    private final C91307al f254890a;

    /* renamed from: b */
    private final Uri f254891b;

    /* renamed from: c */
    private final C21370a f254892c;

    public C91340br(C91307al alVar, Uri uri, C21370a aVar) {
        this.f254890a = alVar;
        this.f254891b = uri;
        this.f254892c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo85609b(C7718hj hjVar) {
        if (hjVar.f26962c != 241 || !((Boolean) hjVar.f26963d).booleanValue() || !m149357g(hjVar)) {
            return false;
        }
        this.f254890a.mo85602c(hjVar, C58485gu.m89845m());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7718hj mo85623c(C7718hj hjVar) {
        if (!m149357g(hjVar)) {
            return hjVar;
        }
        C7711hc hcVar = (C7711hc) hjVar.toBuilder();
        hcVar.copyOnWrite();
        C7718hj hjVar2 = (C7718hj) hcVar.instance;
        hjVar2.f26938J = null;
        hjVar2.f26955a &= -1073741825;
        C7718hj hjVar3 = (C7718hj) hcVar.build();
        this.f254890a.mo85603d(hjVar, hjVar3);
        return hjVar3;
    }

    /* renamed from: g */
    private final boolean m149357g(C7718hj hjVar) {
        if ((hjVar.f26955a & 1073741824) == 0) {
            return false;
        }
        if (this.f254891b != null) {
            C7874nd ndVar = hjVar.f26938J;
            if (ndVar == null) {
                ndVar = C7874nd.f27577J;
            }
            if (new C84165c(ndVar, hjVar).mo77615a().equals(this.f254891b)) {
                return true;
            }
        }
        C7874nd ndVar2 = hjVar.f26938J;
        if (ndVar2 == null) {
            ndVar2 = C7874nd.f27577J;
        }
        return (ndVar2.f27589a & 8) == 0 || TimeUnit.SECONDS.toMillis(ndVar2.f27594f) <= this.f254892c.mo26870b();
    }
}
