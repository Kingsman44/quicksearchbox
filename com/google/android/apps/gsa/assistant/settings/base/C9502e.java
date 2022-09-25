package com.google.android.apps.gsa.assistant.settings.base;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.base.e */
/* compiled from: PG */
final class C9502e extends k {

    /* renamed from: a */
    final /* synthetic */ C9506h f32979a;

    /* renamed from: b */
    final /* synthetic */ int f32980b;

    /* renamed from: c */
    final /* synthetic */ C9504g f32981c;

    public C9502e(C9504g gVar, C9506h hVar, int i) {
        this.f32981c = gVar;
        this.f32979a = hVar;
        this.f32980b = i;
    }

    /* renamed from: gn */
    public final void mo17783gn(Throwable th) {
        this.f32981c.mo17815z(R.string.assistant_settings_update_error_message);
        C9506h hVar = this.f32979a;
        if (hVar != null) {
            hVar.mo17817a(th);
        }
        this.f32981c.f32990f.remove(Integer.valueOf(this.f32980b));
    }

    /* renamed from: go */
    public final /* synthetic */ void mo17784go(Object obj) {
        acz acz = (acz) obj;
        C58976aa aaVar = C58975e.f156826a;
        C9506h hVar = this.f32979a;
        if (hVar != null) {
            hVar.mo17818b(acz);
        }
        this.f32981c.f32990f.remove(Integer.valueOf(this.f32980b));
    }
}
