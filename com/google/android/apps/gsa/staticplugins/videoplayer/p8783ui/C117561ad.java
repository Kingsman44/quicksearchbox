package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.ad */
/* compiled from: PG */
public final /* synthetic */ class C117561ad implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117578au f326341a;

    public /* synthetic */ C117561ad(C117578au auVar) {
        this.f326341a = auVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117578au auVar = this.f326341a;
        String str = (String) obj;
        if (!str.isEmpty()) {
            auVar.f326376n.setOnClickListener(new C117568ak(auVar, str));
            auVar.f326377o.setOnClickListener(new C117569al(auVar, str));
        }
    }
}
