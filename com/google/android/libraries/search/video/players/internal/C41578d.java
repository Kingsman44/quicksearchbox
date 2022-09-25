package com.google.android.libraries.search.video.players.internal;

import android.support.p031v4.app.C0172ar;
import android.support.p031v4.app.C0174at;
import android.support.p031v4.app.Fragment;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.video.players.internal.d */
/* compiled from: PG */
public final class C41578d {

    /* renamed from: a */
    public final Fragment f108693a;

    /* renamed from: b */
    public final C0172ar f108694b;

    public C41578d(Fragment fragment, C69464a aVar) {
        C0172ar arVar;
        this.f108693a = fragment;
        if (fragment.getActivity() != null) {
            arVar = null;
        } else {
            C0172ar b = C0172ar.m374b((C0174at) aVar.mo17428b());
            fragment.getLifecycle().mo5790b(new YouTubeHostFragmentManagerProviderImpl$1(b, fragment));
            arVar = b;
        }
        this.f108694b = arVar;
    }
}
