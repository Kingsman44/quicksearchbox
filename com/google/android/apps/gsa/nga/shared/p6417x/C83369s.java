package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.s */
/* compiled from: PG */
public final /* synthetic */ class C83369s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C22871g f227220a;

    /* renamed from: b */
    public final /* synthetic */ String f227221b;

    /* renamed from: c */
    public final /* synthetic */ C90919bp f227222c;

    public /* synthetic */ C83369s(C22871g gVar, String str, C90919bp bpVar) {
        this.f227220a = gVar;
        this.f227221b = str;
        this.f227222c = bpVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C22871g gVar = this.f227220a;
        String str = this.f227221b;
        Object[] objArr = {str};
        gVar.mo28212l(String.format("[NGA] receive.%s", objArr), new C83365o(this.f227222c, obj));
    }
}
