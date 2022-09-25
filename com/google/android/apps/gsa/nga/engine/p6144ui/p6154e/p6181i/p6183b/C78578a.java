package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6181i.p6183b;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6181i.C78573a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6181i.p6182a.C78574a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n.C78738d;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.i.b.a */
/* compiled from: PG */
public final /* synthetic */ class C78578a implements C78738d {

    /* renamed from: a */
    public final /* synthetic */ C78574a f216336a;

    public /* synthetic */ C78578a(C78574a aVar) {
        this.f216336a = aVar;
    }

    /* renamed from: a */
    public final void mo73151a(Intent intent) {
        C78574a aVar = this.f216336a;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((C59052c) ((C59052c) C78574a.f216333a.mo56226d()).mo56372aa(5218)).mo56386p("onNewKeyboardVisibility: bundle was null");
        } else if (!extras.containsKey("is_keyboard_showing")) {
            aVar.f216334b.mo76660b(Optional.empty());
        } else {
            aVar.f216334b.mo76660b(Optional.m71637of(new C78573a(extras.getBoolean("is_keyboard_showing", false))));
        }
    }
}
