package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.lens.p4694a.C62059bk;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.bc */
/* compiled from: PG */
public final /* synthetic */ class C27154bc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27158bg f74217a;

    /* renamed from: b */
    public final /* synthetic */ C62059bk f74218b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f74219c;

    public /* synthetic */ C27154bc(C27158bg bgVar, C62059bk bkVar, Bundle bundle) {
        this.f74217a = bgVar;
        this.f74218b = bkVar;
        this.f74219c = bundle;
    }

    public final void onClick(View view) {
        C27158bg bgVar = this.f74217a;
        C62059bk bkVar = this.f74218b;
        Bundle bundle = this.f74219c;
        bgVar.f74227d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        bgVar.f74228e.mo32810b(Uri.parse(bkVar.f167651c), bundle);
    }
}
