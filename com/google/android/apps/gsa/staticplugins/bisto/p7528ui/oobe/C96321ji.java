package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ji */
/* compiled from: PG */
public final /* synthetic */ class C96321ji implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ OobeActivity f269528a;

    /* renamed from: b */
    public final /* synthetic */ String f269529b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f269530c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f269531d;

    public /* synthetic */ C96321ji(OobeActivity oobeActivity, String str, C124548d dVar, Bundle bundle) {
        this.f269528a = oobeActivity;
        this.f269529b = str;
        this.f269530c = dVar;
        this.f269531d = bundle;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        OobeActivity oobeActivity = this.f269528a;
        String str = this.f269529b;
        C124548d dVar = this.f269530c;
        Bundle bundle = this.f269531d;
        if (((Boolean) obj).booleanValue()) {
            oobeActivity.mo89932z();
        } else {
            oobeActivity.mo89926A(str, dVar, bundle);
        }
    }
}
