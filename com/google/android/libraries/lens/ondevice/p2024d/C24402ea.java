package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24668ey;
import com.google.android.libraries.lens.ondevice.p2034k.C24682fl;
import com.google.android.libraries.lens.ondevice.p2034k.C24701gd;
import com.google.android.libraries.lens.ondevice.p2034k.C24721gx;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4705i.p4706a.C62370ab;

/* renamed from: com.google.android.libraries.lens.ondevice.d.ea */
/* compiled from: PG */
public final class C24402ea implements C24419m {

    /* renamed from: a */
    private final C24721gx f66815a;

    /* renamed from: b */
    private final C24668ey f66816b;

    /* renamed from: c */
    private final C24701gd f66817c;

    /* renamed from: d */
    private final C24682fl f66818d;

    /* renamed from: e */
    private final OnDeviceEngineNativeApi f66819e;

    public C24402ea(C24721gx gxVar, C24701gd gdVar, C24682fl flVar, C24668ey eyVar, OnDeviceEngineNativeApi onDeviceEngineNativeApi) {
        this.f66815a = gxVar;
        this.f66816b = eyVar;
        this.f66817c = gdVar;
        this.f66818d = flVar;
        this.f66819e = onDeviceEngineNativeApi;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C62370ab abVar = (C62370ab) fVar.mo29815f().mo56109e(C62370ab.f168371f);
        abVar.getClass();
        C24721gx gxVar = this.f66815a;
        gxVar.getClass();
        C24668ey eyVar = this.f66816b;
        eyVar.getClass();
        C24701gd gdVar = this.f66817c;
        gdVar.getClass();
        C24682fl flVar = this.f66818d;
        flVar.getClass();
        C60870cx gq = new C24335bo(dVar, eyVar, gdVar, flVar, gxVar, this.f66819e, bitmap, abVar).f66675a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29850j(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
