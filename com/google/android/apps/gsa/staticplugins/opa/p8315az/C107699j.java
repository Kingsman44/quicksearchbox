package com.google.android.apps.gsa.staticplugins.opa.p8315az;

import android.os.Bundle;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83637az;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83642bd;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.az.j */
/* compiled from: PG */
public final /* synthetic */ class C107699j implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C107703n f299692a;

    public /* synthetic */ C107699j(C107703n nVar) {
        this.f299692a = nVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C107703n nVar = this.f299692a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.TTS_PLAYBACK_STARTED) {
            C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
            C83642bd bdVar = C83642bd.f228007a;
            wVar.copyOnWrite();
            C83673y yVar = (C83673y) wVar.instance;
            bdVar.getClass();
            yVar.f228084c = bdVar;
            yVar.f228083b = 2;
            ((C107759j) nVar.f299697b.mo27525b()).mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
        } else if (a == C88244um.TTS_PLAYBACK_DONE) {
            C83671w wVar2 = (C83671w) C83673y.f228080e.createBuilder();
            C83637az azVar = C83637az.f228001a;
            wVar2.copyOnWrite();
            C83673y yVar2 = (C83673y) wVar2.instance;
            azVar.getClass();
            yVar2.f228084c = azVar;
            yVar2.f228083b = 3;
            ((C107759j) nVar.f299697b.mo27525b()).mo96275k((C83673y) wVar2.build(), Bundle.EMPTY);
        }
    }
}
