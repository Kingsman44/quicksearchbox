package com.google.android.libraries.web.weblayer.p3446a.p3447a;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.coordinator.internal.fragment.C43751j;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.weblayer.p3450c.p3451a.C44142m;
import org.chromium.weblayer.C72615d;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.a.a.b */
/* compiled from: PG */
public final class C44116b {

    /* renamed from: a */
    private final Fragment f114834a;

    public C44116b(Fragment fragment) {
        this.f114834a = fragment;
    }

    /* renamed from: a */
    public static C44142m m77891a(Fragment fragment) {
        return (C44142m) new WebModelProvider(fragment).mo47072a(C44142m.class);
    }

    /* renamed from: b */
    public final C72615d mo47083b() {
        Fragment a = C43751j.m77264a(this.f114834a).mo46774a();
        if (a == null) {
            return null;
        }
        C72615d dVar = m77891a(a).f114872j;
        C69664n.m101058d(dVar);
        return dVar;
    }

    /* renamed from: c */
    public final void mo47084c(Consumer consumer) {
        C43751j.m77264a(this.f114834a).mo46775b(new C44115a(consumer));
    }
}
