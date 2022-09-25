package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ba */
/* compiled from: PG */
public final /* synthetic */ class C10124ba implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10126bc f34452a;

    public /* synthetic */ C10124ba(C10126bc bcVar) {
        this.f34452a = bcVar;
    }

    public final void run() {
        Fragment fragment;
        C10126bc bcVar = this.f34452a;
        bcVar.f34458e.setVisibility(0);
        bcVar.f34459f.setVisibility(8);
        FragmentManager childFragmentManager = bcVar.f34454a.getChildFragmentManager();
        if (childFragmentManager.f634a.mo670b(R.id.content_container) == null) {
            bh bhVar = bcVar.f34455b;
            int i = bhVar.a;
            if (i == 2) {
                fragment = C10131bh.m24975f((String) bhVar.b);
            } else if (i == 1) {
                fragment = C10102af.m24918f((String) bhVar.b);
            } else {
                fragment = (Fragment) bcVar.f34457d.mo17428b();
            }
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo689v(R.id.content_container, fragment, (String) null);
            aVar.mo509f();
        }
    }
}
