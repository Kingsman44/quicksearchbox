package com.google.android.libraries.notifications.platform.p2318f.p2328d.p2329a;

import android.content.Context;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2318f.p2328d.C30131a;
import com.google.android.libraries.notifications.platform.p2318f.p2328d.C30135b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* renamed from: com.google.android.libraries.notifications.platform.f.d.a.b */
/* compiled from: PG */
public final class C30133b implements C30131a {

    /* renamed from: a */
    private final Context f81502a;

    /* renamed from: b */
    private final C30075e f81503b;

    /* renamed from: c */
    private final C30132a f81504c;

    public C30133b(Context context, C30075e eVar, C30132a aVar) {
        this.f81502a = context;
        this.f81503b = eVar;
        this.f81504c = aVar;
    }

    /* renamed from: d */
    private final FirebaseInstanceId m55981d() {
        return FirebaseInstanceId.getInstance(C30134c.m55985a(this.f81502a, this.f81504c, this.f81503b));
    }

    /* renamed from: a */
    public final String mo35524a() {
        FirebaseInstanceId d = m55981d();
        FirebaseInstanceId.m93587f(d.f165571d);
        if (d.mo57784l(d.mo57775a())) {
            d.mo57782i();
        }
        return d.mo57777c();
    }

    /* renamed from: b */
    public final String mo35525b() {
        return this.f81502a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).getString("reg_id", (String) null);
    }

    /* renamed from: c */
    public final synchronized String mo35526c() {
        String e;
        C19559g.m37303b();
        try {
            e = m55981d().mo57779e(((C30071a) this.f81503b).f81356b, BuildConfig.FLAVOR);
            if (TextUtils.isEmpty(e)) {
                throw new C30135b();
            } else if (!e.equals(mo35525b())) {
                C30058b.m55794f("FirebaseManagerImpl", "New registration ID doesn't match the previously stored one.", new Object[0]);
                this.f81502a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).edit().putString("reg_id", e).commit();
            }
        } catch (IOException e2) {
            e = e2;
            C30058b.m55795g("FirebaseManagerImpl", e, "Exception during register with IID.", new Object[0]);
            throw new C30135b(e);
        } catch (AssertionError e3) {
            e = e3;
            C30058b.m55795g("FirebaseManagerImpl", e, "Exception during register with IID.", new Object[0]);
            throw new C30135b(e);
        } catch (NullPointerException e4) {
            e = e4;
            C30058b.m55795g("FirebaseManagerImpl", e, "Exception during register with IID.", new Object[0]);
            throw new C30135b(e);
        }
        return e;
    }
}
