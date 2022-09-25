package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106285m;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.h */
/* compiled from: PG */
public final /* synthetic */ class C106307h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106308i f296589a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f296590b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f296591c;

    public /* synthetic */ C106307h(C106308i iVar, byte[] bArr, Bundle bundle) {
        this.f296589a = iVar;
        this.f296590b = bArr;
        this.f296591c = bundle;
    }

    public final void run() {
        C106308i iVar = this.f296589a;
        byte[] bArr = this.f296590b;
        Bundle bundle = this.f296591c;
        C106309j jVar = iVar.f296592a;
        try {
            C106286n nVar = (C106286n) C62942bv.parseFrom((C62942bv) C106286n.f296543f, bArr, C62921ba.m95368a());
            C58976aa aaVar = C58975e.f156826a;
            C106285m.m177064a(nVar.f296546b).name();
            ClassLoader classLoader = jVar.getClass().getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            switch (C106285m.m177064a(nVar.f296546b).ordinal()) {
                case 0:
                    C106304e eVar = jVar.f296596d;
                    ((C107705p) eVar.f296580b.mo27525b()).mo96238k();
                    ((C107705p) eVar.f296580b.mo27525b()).mo96236i();
                    C106317r rVar = jVar.f296597e;
                    ((C107705p) rVar.f296612b.mo27525b()).mo96238k();
                    ((C107705p) rVar.f296612b.mo27525b()).mo96236i();
                    jVar.f296597e.mo95489c(nVar, bundle);
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    jVar.f296597e.mo95489c(nVar, bundle);
                    return;
                case 5:
                case 11:
                case 18:
                    if (!jVar.f296596d.mo95482e() && !jVar.f296597e.mo95490d()) {
                        jVar.mo95485b();
                        return;
                    }
                    return;
                case 7:
                case 8:
                case 10:
                case 17:
                    jVar.f296596d.mo95480c(nVar, bundle);
                    return;
                case 9:
                case 12:
                case 14:
                case 15:
                case 16:
                    jVar.f296596d.mo95481d(nVar, bundle);
                    return;
                case 13:
                    if (!((C86124t) jVar.f296598f.mo27525b()).mo79746e(C90126fx.f250967T) || jVar.f296599g.l()) {
                        jVar.f296596d.mo95481d(nVar, bundle);
                        return;
                    } else {
                        jVar.f296596d.mo95480c(nVar, bundle);
                        return;
                    }
                default:
                    return;
            }
        } catch (Exception unused) {
            C59104x c = C106309j.f296593a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NgaEntryPointBinderProv");
            ((C59052c) ((C59052c) c).mo56372aa(25230)).mo56386p("ngaEventData could not be parsed");
        }
    }
}
