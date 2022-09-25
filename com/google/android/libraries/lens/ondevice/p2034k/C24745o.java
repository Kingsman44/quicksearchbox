package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4701g.C62342e;
import com.google.lens.p4701g.C62343f;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;

@C24266a(mo29795a = "DetectionReconciliationEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.o */
/* compiled from: PG */
public final class C24745o implements C24650eg {

    /* renamed from: a */
    private final C24748r f67625a;

    public C24745o(C24748r rVar) {
        this.f67625a = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo29949a(C24795f fVar) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = this.f67625a.f67628a;
        C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
        C62342e eVar = (C62342e) C62343f.f168300c.createBuilder();
        eVar.copyOnWrite();
        C62343f fVar2 = (C62343f) eVar.instance;
        fVar2.f168302a |= 2;
        fVar2.f168303b = 0.8f;
        C62343f fVar3 = (C62343f) eVar.build();
        mVar.copyOnWrite();
        C62351n nVar2 = (C62351n) mVar.instance;
        fVar3.getClass();
        nVar2.f168324b = fVar3;
        nVar2.f168323a = 9;
        onDeviceEngineNativeApi.mo30015f(context, (C62351n) mVar.build());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo29952d(C24795f fVar) {
        return false;
    }
}
