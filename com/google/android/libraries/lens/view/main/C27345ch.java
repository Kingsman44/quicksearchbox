package com.google.android.libraries.lens.view.main;

import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;

/* renamed from: com.google.android.libraries.lens.view.main.ch */
/* compiled from: PG */
public final /* synthetic */ class C27345ch implements C46852f {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74837a;

    public /* synthetic */ C27345ch(C27384dt dtVar) {
        this.f74837a = dtVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        C27384dt dtVar = this.f74837a;
        if (!((Boolean) obj).booleanValue()) {
            Toast.makeText(dtVar.f74900V, R.string.lens_no_search_permission, 1).show();
            dtVar.mo32917C();
        }
    }
}
