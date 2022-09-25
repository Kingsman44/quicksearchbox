package com.google.android.apps.gsa.search.core.service;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.ai */
/* compiled from: PG */
public final /* synthetic */ class C86613ai implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86626av f233993a;

    /* renamed from: b */
    public final /* synthetic */ long f233994b;

    /* renamed from: c */
    public final /* synthetic */ C86775r f233995c;

    public /* synthetic */ C86613ai(C86626av avVar, long j, C86775r rVar) {
        this.f233993a = avVar;
        this.f233994b = j;
        this.f233995c = rVar;
    }

    public final void run() {
        C86626av avVar = this.f233993a;
        long j = this.f233994b;
        C86775r rVar = this.f233995c;
        int indexOfKey = avVar.f234024b.indexOfKey(j);
        if (indexOfKey >= 0) {
            avVar.mo80241g((C86775r) avVar.f234024b.valueAt(indexOfKey), true, false);
        }
        C58976aa aaVar = C58975e.f156826a;
        avVar.f234024b.put(j, rVar);
        avVar.mo80252r();
    }
}
