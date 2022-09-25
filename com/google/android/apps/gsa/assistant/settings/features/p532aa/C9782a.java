package com.google.android.apps.gsa.assistant.settings.features.p532aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3929l.p3930a.C52722ca;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aa.a */
/* compiled from: PG */
public final /* synthetic */ class C9782a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C9785c f33758a;

    public /* synthetic */ C9782a(C9785c cVar) {
        this.f33758a = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C52722ca caVar;
        C9785c cVar = this.f33758a;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).findFirst();
        if (!findFirst.isEmpty() && ((C65849r) findFirst.get()).f179004a == 14) {
            C65849r rVar = (C65849r) findFirst.get();
            if (rVar.f179004a == 14) {
                caVar = (C52722ca) rVar.f179005b;
            } else {
                caVar = C52722ca.f138382c;
            }
            String str = caVar.f138384a ? caVar.f138385b : BuildConfig.FLAVOR;
            String F = cVar.f33761b.mo79659F();
            if (F != null) {
                cVar.f33762c.put(F, str);
            }
        }
    }
}
