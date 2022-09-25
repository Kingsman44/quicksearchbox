package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.app.Activity;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.m */
/* compiled from: PG */
public final /* synthetic */ class C97384m implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C97359ab f271958a;

    public /* synthetic */ C97384m(C97359ab abVar) {
        this.f271958a = abVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C97359ab abVar = this.f271958a;
        if (!((Boolean) obj).booleanValue()) {
            C97376e eVar = abVar.f271894h;
            if (eVar != null) {
                eVar.dismiss();
                abVar.f271894h = null;
                if (((Boolean) ((C97369al) abVar.f271888b).f271937h.f63720e).booleanValue() && abVar.f271889c.mo56113h()) {
                    ((Activity) abVar.f271889c.mo56107c()).finish();
                }
            }
        } else if (abVar.f271894h == null && abVar.f271890d.mo56113h()) {
            abVar.f271894h = new C97376e();
            C97376e eVar2 = abVar.f271894h;
            C97394w wVar = new C97394w(abVar);
            boolean booleanValue = ((Boolean) ((C97369al) abVar.f271888b).f271934e.f63720e).booleanValue();
            eVar2.f271950b = wVar;
            eVar2.f271949a = booleanValue;
            abVar.f271894h.show((FragmentManager) abVar.f271890d.mo56107c(), "incognito_interstitial");
        }
    }
}
