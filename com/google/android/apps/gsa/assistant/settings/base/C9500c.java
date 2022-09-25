package com.google.android.apps.gsa.assistant.settings.base;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.act;

/* renamed from: com.google.android.apps.gsa.assistant.settings.base.c */
/* compiled from: PG */
final class C9500c extends k {

    /* renamed from: a */
    final /* synthetic */ C9506h f32972a;

    /* renamed from: b */
    final /* synthetic */ int f32973b;

    /* renamed from: c */
    final /* synthetic */ C9504g f32974c;

    public C9500c(C9504g gVar, C9506h hVar, int i) {
        this.f32974c = gVar;
        this.f32972a = hVar;
        this.f32973b = i;
    }

    /* renamed from: gn */
    public final void mo17779gn(Throwable th) {
        this.f32974c.mo17815z(R.string.assistant_settings_retrieve_error_message);
        this.f32974c.mo17800k();
        this.f32972a.mo17817a(th);
        this.f32974c.f32990f.remove(Integer.valueOf(this.f32973b));
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo17780go(Object obj) {
        this.f32974c.mo17800k();
        this.f32972a.mo17818b((act) obj);
        this.f32974c.f32990f.remove(Integer.valueOf(this.f32973b));
    }
}
