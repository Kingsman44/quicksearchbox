package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.libraries.search.video.thirdparty.C41616r;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.h */
/* compiled from: PG */
public final /* synthetic */ class C117586h implements C41616r {

    /* renamed from: a */
    public final /* synthetic */ C117598t f326410a;

    public /* synthetic */ C117586h(C117598t tVar) {
        this.f326410a = tVar;
    }

    /* renamed from: a */
    public final void mo44134a(boolean z) {
        C117598t tVar = this.f326410a;
        if (z) {
            if (tVar.f326430f.getResources().getConfiguration().orientation != 2) {
                tVar.mo103396h(6);
            }
        } else if (tVar.f326430f.getResources().getConfiguration().orientation != 1) {
            tVar.mo103396h(7);
        }
    }
}
