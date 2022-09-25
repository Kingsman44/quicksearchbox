package com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10186a;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134264a;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134266b;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.apps.tiktok.inject.C47231d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C134265a implements C134270b {

    /* renamed from: a */
    public final /* synthetic */ Fragment f365765a;

    public /* synthetic */ C134265a(Fragment fragment) {
        this.f365765a = fragment;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        Fragment fragment = this.f365765a;
        C134266b bVar = new C134266b();
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            for (Fragment fragment2 : fragmentManager.f634a.mo677i()) {
                if (fragment2 instanceof C47231d) {
                    Object z = ((C47231d) fragment2).mo17754z();
                    if (z instanceof C134270b) {
                        C134286f a = ((C134270b) z).mo111669a();
                        C69664n.m101061g(a, "feature");
                        bVar.f365766a.add(a);
                    }
                }
            }
        }
        return C134264a.m217841a("FragmentManager", bVar);
    }
}
