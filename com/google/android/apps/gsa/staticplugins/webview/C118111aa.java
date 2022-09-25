package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.aa */
/* compiled from: PG */
public final /* synthetic */ class C118111aa implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C118119ai f327757a;

    public /* synthetic */ C118111aa(C118119ai aiVar) {
        this.f327757a = aiVar;
    }

    public final void run() {
        C118119ai aiVar = this.f327757a;
        if (aiVar.f327810ac != null) {
            aiVar.f327810ac.cancel(false);
            aiVar.f327810ac = null;
        }
        if (aiVar.f327788G != null) {
            aiVar.f327788G.f235736a.reload();
        }
    }
}
