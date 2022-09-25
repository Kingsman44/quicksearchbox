package com.google.android.libraries.lens.sdk.avs;

import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.lens.sdk.avs.c */
/* compiled from: PG */
public final /* synthetic */ class C24861c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C24890g f67914a;

    /* renamed from: b */
    public final /* synthetic */ C24280f f67915b;

    public /* synthetic */ C24861c(C24890g gVar, C24280f fVar) {
        this.f67914a = gVar;
        this.f67915b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C24890g gVar = this.f67914a;
        C24280f fVar = this.f67915b;
        C60870cx d = gVar.f67981b.mo30022d((C24424r) obj, fVar);
        ((C58970a) ((C58970a) C24890g.f67980a.mo56224b()).mo56372aa(48863)).mo56386p("On device request sent.");
        gVar.f67982c.mo30052b(C24874i.LENS_PRIME_QUERY_REQUEST);
        return d;
    }
}
