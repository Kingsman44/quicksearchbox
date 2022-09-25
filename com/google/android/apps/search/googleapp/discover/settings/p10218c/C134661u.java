package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.u */
/* compiled from: PG */
final class C134661u implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C134662v f366703a;

    /* renamed from: b */
    final /* synthetic */ C134660t f366704b;

    public C134661u(C134662v vVar, C134660t tVar) {
        this.f366703a = vVar;
        this.f366704b = tVar;
    }

    public final void onClick(View view) {
        String str;
        C134658r rVar = (C134658r) this.f366703a.f366705a.get(this.f366704b.getBindingAdapterPosition());
        C69626l lVar = this.f366703a.f366707c;
        if (rVar.f366696d) {
            str = BuildConfig.FLAVOR;
        } else {
            str = rVar.f366695c;
        }
        lVar.mo5761a(str);
        this.f366703a.f366706b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
    }
}
