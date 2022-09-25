package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9796a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60826bg;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.a.c */
/* compiled from: PG */
public final class C129111c {

    /* renamed from: a */
    public static final C46690ah f354694a = new C46885y("MA_FA_CLIENT_OP");

    /* renamed from: b */
    public final C42876ab f354695b;

    /* renamed from: c */
    private final C46778cv f354696c;

    public C129111c(C42876ab abVar, C46778cv cvVar) {
        C69664n.m101061g(abVar, "clientOpProtoStore");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f354695b = abVar;
        this.f354696c = cvVar;
    }

    /* renamed from: a */
    public final void mo108851a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        this.f354696c.mo50787a(this.f354695b.mo46039a(new C129110b(dyVar), C60826bg.f164896a), f354694a);
    }
}
