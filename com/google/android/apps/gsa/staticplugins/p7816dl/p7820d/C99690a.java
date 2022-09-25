package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.widget.FrameLayout;
import android.widget.RemoteViews;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.p1859d.p1860a.C22746q;
import com.google.android.libraries.gsa.p1859d.p1860a.C22747r;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.a */
/* compiled from: PG */
public final /* synthetic */ class C99690a implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99702j f278966a;

    public /* synthetic */ C99690a(C99702j jVar) {
        this.f278966a = jVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C22747r rVar;
        C99702j jVar = this.f278966a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return;
        }
        if (!((Boolean) ((C99711s) jVar.f278994b).f279024d.f63720e).booleanValue() || (rVar = jVar.f279004l) == null) {
            FrameLayout frameLayout = new FrameLayout(jVar.f278993a);
            C22747r rVar2 = jVar.f279004l;
            C22746q qVar = jVar.f278995c;
            qVar.f62589d = frameLayout;
            qVar.f62590e = frameLayout;
            qVar.f62588c = (RemoteViews) axVar.mo56107c();
            qVar.f62591f = new C99701i(jVar, rVar2);
            jVar.f279004l = new C22747r(qVar.f62586a, qVar.f62587b, qVar.f62588c, qVar.f62590e, qVar.f62589d, qVar.f62591f);
            jVar.f279004l.setFocusable(true);
            jVar.f279002j.addView(jVar.f279004l);
            return;
        }
        rVar.updateAppWidget((RemoteViews) axVar.mo56107c());
    }
}
