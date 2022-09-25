package com.google.android.apps.gsa.search.core.service;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.service.as */
/* compiled from: PG */
public final /* synthetic */ class C86623as implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86626av f234007a;

    /* renamed from: b */
    public final /* synthetic */ long f234008b;

    /* renamed from: c */
    public final /* synthetic */ boolean f234009c;

    public /* synthetic */ C86623as(C86626av avVar, long j, boolean z) {
        this.f234007a = avVar;
        this.f234008b = j;
        this.f234009c = z;
    }

    public final void run() {
        C86626av avVar = this.f234007a;
        long j = this.f234008b;
        boolean z = this.f234009c;
        C86775r rVar = (C86775r) avVar.f234024b.get(j);
        if (rVar != null && z) {
            rVar.mo80390l();
        }
        avVar.mo80241g(rVar, true, true);
    }
}
