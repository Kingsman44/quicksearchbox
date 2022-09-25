package com.google.android.libraries.lens.ondevice.p2035l;

import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24271c;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.android.libraries.lens.ondevice.p2034k.C24650eg;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.ondevice.l.c */
/* compiled from: PG */
public final /* synthetic */ class C24760c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C24762e f67652a;

    /* renamed from: b */
    public final /* synthetic */ String f67653b;

    /* renamed from: c */
    public final /* synthetic */ C24650eg f67654c;

    /* renamed from: d */
    public final /* synthetic */ LodeResourceHolder f67655d;

    /* renamed from: e */
    public final /* synthetic */ C24803n f67656e;

    /* renamed from: f */
    public final /* synthetic */ C24795f f67657f;

    public /* synthetic */ C24760c(C24762e eVar, String str, C24650eg egVar, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        this.f67652a = eVar;
        this.f67653b = str;
        this.f67654c = egVar;
        this.f67655d = lodeResourceHolder;
        this.f67656e = nVar;
        this.f67657f = fVar;
    }

    public final Object call() {
        C24762e eVar = this.f67652a;
        String str = this.f67653b;
        C24650eg egVar = this.f67654c;
        LodeResourceHolder lodeResourceHolder = this.f67655d;
        C24803n nVar = this.f67656e;
        C24795f fVar = this.f67657f;
        ((C58970a) ((C58970a) C24762e.f67658a.mo56224b()).mo56372aa(48858)).mo56389s("Loading primitive %s", str);
        eVar.f67661d.mo29945d(C24805p.PRIMITIVE_LOAD_START, str);
        try {
            egVar.mo29950b(eVar.f67660c, lodeResourceHolder, nVar, fVar);
            eVar.f67661d.mo29945d(C24805p.PRIMITIVE_LOAD_SUCCESS, str);
            return null;
        } catch (C24272d e) {
            eVar.mo30001e(str, 8);
            throw e;
        } catch (C24271c e2) {
            eVar.mo30001e(str, 9);
            throw e2;
        } catch (C24273e e3) {
            eVar.mo30001e(str, 10);
            throw e3;
        }
    }
}
