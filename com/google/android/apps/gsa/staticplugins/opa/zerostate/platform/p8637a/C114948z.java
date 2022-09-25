package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53070ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.z */
/* compiled from: PG */
public final class C114948z {

    /* renamed from: c */
    private static final C59071e f318942c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.z");

    /* renamed from: a */
    public C114756j f318943a;

    /* renamed from: b */
    public C28293k f318944b;

    /* renamed from: d */
    private final C0167am f318945d;

    /* renamed from: e */
    private final C114908ag f318946e;

    /* renamed from: f */
    private final C114742l f318947f;

    public C114948z(C0167am amVar, C114908ag agVar, C114742l lVar) {
        this.f318945d = amVar;
        this.f318946e = agVar;
        this.f318947f = lVar;
    }

    /* renamed from: a */
    public final C114905ad mo101738a() {
        FragmentManager jw = this.f318945d.mo545jw();
        jw.getClass();
        return (C114905ad) jw.f634a.mo671c("FabDialogFragment");
    }

    /* renamed from: b */
    public final void mo101739b(C53070ag agVar) {
        C114906ae aeVar;
        C114905ad a = mo101738a();
        if (a != null) {
            C114907af afVar = a.f318791b;
            if (afVar != null) {
                afVar.mo101699a(agVar);
            }
        } else {
            C114905ad adVar = new C114905ad();
            adVar.f318790a = agVar;
            adVar.f318792c = this.f318946e;
            adVar.f318793d = this.f318943a;
            adVar.show(this.f318945d.mo545jw(), "FabDialogFragment");
            this.f318945d.mo545jw().mo467ah();
        }
        C114905ad a2 = mo101738a();
        if (a2 != null) {
            C114907af afVar2 = a2.f318791b;
            C28293k kVar = null;
            if (!(afVar2 == null || (aeVar = afVar2.f318794a) == null)) {
                kVar = aeVar.mo101696j();
            }
            if (kVar != null) {
                this.f318947f.mo101570e(kVar, this.f318944b);
            } else {
                ((C59052c) ((C59052c) f318942c.mo56226d()).mo56372aa(29428)).mo56386p("FabFragmentNode is null");
            }
        }
    }
}
