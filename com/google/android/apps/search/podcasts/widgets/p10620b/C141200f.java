package com.google.android.apps.search.podcasts.widgets.p10620b;

import android.view.View;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.podcasts.widgets.b.f */
/* compiled from: PG */
public final /* synthetic */ class C141200f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141201g f383351a;

    /* renamed from: b */
    public final /* synthetic */ C141209o f383352b;

    public /* synthetic */ C141200f(C141201g gVar, C141209o oVar) {
        this.f383351a = gVar;
        this.f383352b = oVar;
    }

    public final void onClick(View view) {
        C141201g gVar = this.f383351a;
        C141209o oVar = this.f383352b;
        C47538ax c = gVar.f383353a.mo51613c("navigate to show");
        try {
            C46496q qVar = gVar.f383355c;
            C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
            String str = oVar.f383377a.f381995a;
            afVar.copyOnWrite();
            str.getClass();
            ((C141122ag) afVar.instance).f383151a = str;
            qVar.mo50508d(R.id.podcasts_action_to_show, C46490k.m82868a(afVar.build()).mo50504d());
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
