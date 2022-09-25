package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hj */
/* compiled from: PG */
final class C108402hj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Intent f301509a;

    /* renamed from: b */
    final /* synthetic */ C108403hk f301510b;

    public C108402hj(C108403hk hkVar, Intent intent) {
        this.f301510b = hkVar;
        this.f301509a = intent;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C108403hk.f301511a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Sharing");
        ((C59052c) ((C59052c) c).mo56372aa(24030)).mo56386p("#sharing - Failed to obtain screenshot; Launching chooser without screenshot.");
        this.f301510b.mo96844a(this.f301509a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Uri uri = (Uri) obj;
        C59104x b = C108403hk.f301511a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Sharing");
        ((C59052c) ((C59052c) b).mo56372aa(24031)).mo56386p("#sharing - Screenshot retrieval success.");
        this.f301509a.putExtra("android.intent.extra.STREAM", uri);
        this.f301509a.setClipData(ClipData.newRawUri("Screenshot of Assistant response", uri));
        this.f301509a.addFlags(1);
        this.f301509a.setType("*/*");
        this.f301510b.mo96844a(this.f301509a);
    }
}
