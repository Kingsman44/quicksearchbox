package com.google.android.apps.gsa.assistant.settings.base;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73892d;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.act;

/* renamed from: com.google.android.apps.gsa.assistant.settings.base.d */
/* compiled from: PG */
final class C9501d extends k {

    /* renamed from: a */
    final /* synthetic */ boolean f32975a;

    /* renamed from: b */
    final /* synthetic */ C73892d f32976b;

    /* renamed from: c */
    final /* synthetic */ int f32977c;

    /* renamed from: d */
    final /* synthetic */ C9504g f32978d;

    public C9501d(C9504g gVar, boolean z, C73892d dVar, int i) {
        this.f32978d = gVar;
        this.f32975a = z;
        this.f32976b = dVar;
        this.f32977c = i;
    }

    /* renamed from: gn */
    public final void mo17781gn(Throwable th) {
        this.f32978d.mo17815z(R.string.assistant_settings_retrieve_error_message);
        if (this.f32975a) {
            this.f32978d.mo17800k();
        }
        this.f32976b.mo65370b().gn(th);
        this.f32978d.f32990f.remove(Integer.valueOf(this.f32977c));
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo17782go(Object obj) {
        act act = (act) obj;
        if (this.f32975a) {
            this.f32978d.mo17800k();
        }
        this.f32976b.mo65370b().go(act);
        this.f32978d.f32990f.remove(Integer.valueOf(this.f32977c));
    }
}
