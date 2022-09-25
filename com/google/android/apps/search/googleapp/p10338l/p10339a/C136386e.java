package com.google.android.apps.search.googleapp.p10338l.p10339a;

import android.app.Activity;
import android.support.p031v4.app.Fragment;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.e */
/* compiled from: PG */
public final class C136386e {

    /* renamed from: a */
    public final Activity f371315a;

    public C136386e(Activity activity) {
        C69664n.m101061g(activity, "activity");
        this.f371315a = activity;
    }

    /* renamed from: a */
    public final List mo112967a(Fragment fragment) {
        C69469c cVar = new C69469c(10);
        cVar.add(fragment);
        for (Fragment fragment2 : fragment.getChildFragmentManager().f634a.mo677i()) {
            C69664n.m101060f(fragment2, "childFragment");
            cVar.addAll(mo112967a(fragment2));
        }
        return C69540x.m100943a(cVar);
    }
}
