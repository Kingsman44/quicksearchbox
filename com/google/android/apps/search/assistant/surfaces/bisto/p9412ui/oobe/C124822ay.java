package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ay */
/* compiled from: PG */
public final class C124822ay {

    /* renamed from: a */
    public final C124821ax f344375a = new C124821ax(this);

    /* renamed from: b */
    public final NetworkCheckerFragment f344376b;

    /* renamed from: c */
    public final C47770dh f344377c;

    /* renamed from: d */
    private final ConnectivityManager f344378d;

    /* renamed from: e */
    private final C124848bs f344379e;

    /* renamed from: f */
    private final C46485f f344380f;

    public C124822ay(NetworkCheckerFragment networkCheckerFragment, ConnectivityManager connectivityManager, C47770dh dhVar, C124848bs bsVar, C46485f fVar) {
        this.f344376b = networkCheckerFragment;
        this.f344378d = connectivityManager;
        this.f344377c = dhVar;
        this.f344379e = bsVar;
        this.f344380f = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo106658a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f344380f.mo50482c(this.f344376b).mo50509e(R.id.assistant_bisto_oobe_next, this.f344379e);
    }

    /* renamed from: b */
    public final boolean mo106659b() {
        NetworkInfo activeNetworkInfo = this.f344378d.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
