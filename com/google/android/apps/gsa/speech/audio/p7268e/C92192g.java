package com.google.android.apps.gsa.speech.audio.p7268e;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60761r;

/* renamed from: com.google.android.apps.gsa.speech.audio.e.g */
/* compiled from: PG */
public final /* synthetic */ class C92192g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C92194i f257027a;

    public /* synthetic */ C92192g(C92194i iVar) {
        this.f257027a = iVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C92194i iVar = this.f257027a;
        if (iVar.f257037h.hasVibrator()) {
            C58485gu p = iVar.f257036g.mo79750p(C90082eg.f249946bI);
            if (p.size() > 1) {
                C89949q.m146523g(454);
                iVar.f257037h.vibrate(C60761r.m92761g(p), -1);
                return true;
            }
        }
        return false;
    }
}
