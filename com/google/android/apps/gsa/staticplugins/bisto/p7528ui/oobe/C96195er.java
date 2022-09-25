package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63139e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63140f;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.er */
/* compiled from: PG */
public final /* synthetic */ class C96195er implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C96206fb f269265a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f269266b;

    public /* synthetic */ C96195er(C96206fb fbVar, byte[] bArr) {
        this.f269265a = fbVar;
        this.f269266b = bArr;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C96206fb fbVar = this.f269265a;
        byte[] bArr = this.f269266b;
        C58976aa aaVar = C58975e.f156826a;
        C63139e eVar = (C63139e) C63140f.f170505f.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        eVar.copyOnWrite();
        C63140f fVar = (C63140f) eVar.instance;
        fVar.f170507a |= 1;
        fVar.f170508b = A;
        return C60922j.m93044g(fbVar.f269291f.mo90114d(fbVar.f269292g, ((C63140f) eVar.build()).toByteArray()), new C96184eg(fbVar, bArr), fbVar.f269290e);
    }
}
