package com.google.android.libraries.web.weblayer.p3446a;

import android.os.RemoteException;
import android.support.p031v4.app.Fragment;
import android.webkit.ValueCallback;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.web.p3343a.C43220a;
import com.google.android.libraries.web.p3343a.C43228d;
import com.google.android.libraries.web.weblayer.p3446a.p3447a.C44116b;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72615d;

/* renamed from: com.google.android.libraries.web.weblayer.a.b */
/* compiled from: PG */
public final class C44118b implements C43220a {

    /* renamed from: a */
    private final Fragment f114836a;

    /* renamed from: b */
    private final C44116b f114837b;

    public C44118b(Fragment fragment, C44116b bVar) {
        this.f114836a = fragment;
        this.f114837b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo46275a(ValueCallback valueCallback) {
        if (this.f114836a.getLifecycle().mo5789a().equals(C2383n.DESTROYED)) {
            return C60856cj.m92899h(new C43228d("WebFragment is destroyed."));
        }
        C44114a aVar = new C44114a(valueCallback);
        C72615d b = this.f114837b.mo47083b();
        C58893dc.m90996a(b);
        C72601bj a = b.mo64482a();
        C58893dc.m90996a(a);
        C72604bm.m107399a();
        a.mo64476g();
        try {
            a.f193153k.mo63754y(new C72341bj(aVar));
            return C60866ct.f164955a;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
