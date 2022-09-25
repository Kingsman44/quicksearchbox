package com.google.android.libraries.web.weblayer.p3446a;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.web.p3343a.C43228d;
import com.google.android.libraries.web.p3343a.p3344a.C43223c;
import com.google.android.libraries.web.weblayer.p3446a.p3447a.C44116b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.web.weblayer.a.e */
/* compiled from: PG */
public final class C44121e implements C43223c {

    /* renamed from: a */
    public final C44116b f114840a;

    /* renamed from: b */
    private final Fragment f114841b;

    public C44121e(Fragment fragment, C44116b bVar) {
        this.f114841b = fragment;
        this.f114840a = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo46276a() {
        if (this.f114841b.getLifecycle().mo5789a().equals(C2383n.DESTROYED)) {
            return C60856cj.m92899h(new C43228d("WebFragment is destroyed."));
        }
        return C2169h.m6027a(new C44119c(this));
    }
}
