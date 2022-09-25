package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;
import com.google.lens.p4705i.p4706a.C62379j;

@C24266a(mo29795a = "TextShoppingFilterEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.gu */
/* compiled from: PG */
public final class C24718gu implements C24650eg {

    /* renamed from: a */
    final C24721gx f67573a;

    public C24718gu(C24721gx gxVar) {
        this.f67573a = gxVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo29949a(C24795f fVar) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = this.f67573a.f67576a;
        C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
        C62379j jVar = fVar.f67758j;
        if (jVar == null) {
            jVar = C62379j.f168397a;
        }
        mVar.copyOnWrite();
        C62351n nVar2 = (C62351n) mVar.instance;
        jVar.getClass();
        nVar2.f168324b = jVar;
        nVar2.f168323a = 11;
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
