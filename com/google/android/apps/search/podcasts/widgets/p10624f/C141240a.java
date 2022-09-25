package com.google.android.apps.search.podcasts.widgets.p10624f;

import android.support.p031v4.app.C0167am;
import androidx.activity.C0800m;
import androidx.navigation.C3807af;
import androidx.navigation.C3825ax;

/* renamed from: com.google.android.apps.search.podcasts.widgets.f.a */
/* compiled from: PG */
public final class C141240a extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C141243d f383450a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141240a(C141243d dVar) {
        super(true);
        this.f383450a = dVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        C3807af afVar = (C3807af) this.f383450a.f383458f.get();
        if (afVar != null) {
            C141243d dVar = this.f383450a;
            C3825ax f = afVar.mo8046f();
            if (f == null || f.f12360i != afVar.mo8047g().f12375b) {
                afVar.mo8061u();
                return;
            }
            int i = afVar.mo8047g().f12360i;
            int i2 = dVar.f383460h;
            if (i == i2) {
                C0167am activity = dVar.f383456d.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            dVar.f383455c.mo48182d(i2);
        }
    }
}
