package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6334b.C81015a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.l */
/* compiled from: PG */
final class C120027l extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C120031p f334179a;

    /* renamed from: b */
    final /* synthetic */ Bundle f334180b;

    /* renamed from: c */
    final /* synthetic */ int f334181c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120027l(C120031p pVar, Bundle bundle, int i) {
        super(0);
        this.f334179a = pVar;
        this.f334180b = bundle;
        this.f334181c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Intent intent;
        Bundle extras;
        C120031p pVar = this.f334179a;
        Bundle bundle = this.f334180b;
        int i = this.f334181c;
        Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
        C69664n.m101060f(bundle2, "args ?: Bundle.EMPTY");
        if (C120035t.m198938a(bundle2, pVar.f334188d).f334197b) {
            Bundle bundle3 = this.f334180b;
            if (bundle3 == null || (intent = (Intent) bundle3.getParcelable("com.google.voicesearch.VI_INTENT")) == null || (extras = intent.getExtras()) == null || !extras.getBoolean("extra_keep_system_dialogs")) {
                this.f334179a.closeSystemDialogs();
            }
            this.f334179a.f334189e.mo38923k(this.f334180b, this.f334181c);
        } else {
            C59052c cVar = (C59052c) C120031p.f334185a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "AgsaApaVis");
            cVar.mo56379ah(new C59094n(34634));
            cVar.mo56389s("Unexpected invocation at APA session (%s), doing re-issue.", bundle);
            pVar.finish();
            C81015a aVar = new C81015a();
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            aVar.mo74794b(bundle, i);
            pVar.f334190f.mo74800a(aVar.mo74793a());
        }
        return C69788q.f186170a;
    }
}
