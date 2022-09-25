package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import com.google.android.apps.gsa.search.shared.actions.modular.C87426a;
import com.google.android.apps.gsa.search.shared.actions.modular.C87467f;
import com.google.android.apps.gsa.search.shared.actions.util.C87480b;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55365pr;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.v */
/* compiled from: PG */
final class C93355v extends C93356w {

    /* renamed from: a */
    final int f260369a;

    /* renamed from: b */
    final C54944ab f260370b;

    /* renamed from: c */
    final C54944ab f260371c;

    public C93355v(C93357x xVar, C87426a aVar, C55365pr prVar, int i, C54944ab abVar, C54944ab abVar2) {
        super(xVar, aVar, prVar);
        this.f260369a = i;
        this.f260370b = abVar;
        this.f260371c = abVar2;
    }

    /* renamed from: a */
    public final void mo87645a(C87480b bVar, String str) {
        C58485gu n = C58485gu.m89846n(Integer.valueOf(this.f260369a));
        C54944ab abVar = this.f260370b;
        C54944ab abVar2 = this.f260371c;
        bVar.mo81466h(str, abVar);
        bVar.f236291d = n;
        C54944ab abVar3 = C54944ab.UNKNOWN;
        bVar.f236290c = abVar2;
    }

    /* renamed from: b */
    public final void mo87646b() {
        C87467f Q = this.f260372d.mo81210Q();
        int i = this.f260369a;
        Q.mo81398b("No resource sets for argument id=" + i);
    }

    /* renamed from: c */
    public final void mo87647c(C87480b bVar, TtsRequest ttsRequest) {
        C58485gu n = C58485gu.m89846n(Integer.valueOf(this.f260369a));
        C54944ab abVar = this.f260370b;
        C54944ab abVar2 = this.f260371c;
        bVar.mo81467i(ttsRequest, abVar);
        bVar.f236291d = n;
        C54944ab abVar3 = C54944ab.UNKNOWN;
        bVar.f236290c = abVar2;
    }
}
