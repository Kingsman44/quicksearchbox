package com.google.android.gms.cast.framework.p10772a.p10773a;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.C143394ab;
import com.google.android.gms.cast.framework.C143409aq;
import com.google.android.gms.cast.framework.C143429e;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.p10772a.C143392c;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.cast.framework.a.a.e */
/* compiled from: PG */
public final class C143386e {

    /* renamed from: a */
    public static final C143566ae f388851a = new C143566ae("ApplicationAnalytics");

    /* renamed from: b */
    public final C143392c f388852b;

    /* renamed from: c */
    public final C143388g f388853c;

    /* renamed from: d */
    public final C143383b f388854d = new C143383b(this);

    /* renamed from: e */
    public final SharedPreferences f388855e;

    /* renamed from: f */
    public C143387f f388856f;

    /* renamed from: g */
    public C143466m f388857g;

    /* renamed from: h */
    public boolean f388858h;

    /* renamed from: i */
    public boolean f388859i;

    /* renamed from: j */
    private final Runnable f388860j = new C143382a(this);

    /* renamed from: k */
    private final Handler f388861k = new C144861c(Looper.getMainLooper());

    public C143386e(SharedPreferences sharedPreferences, C143392c cVar, Bundle bundle, String str) {
        this.f388855e = sharedPreferences;
        this.f388852b = cVar;
        this.f388853c = new C143388g(bundle, str);
    }

    /* renamed from: a */
    public static String m232648a() {
        C143429e a = C143429e.m232795a();
        C143919bh.m233958a(a);
        return a.mo118636c().f388829a;
    }

    /* renamed from: j */
    private final void m232649j(CastDevice castDevice) {
        C143387f fVar = this.f388856f;
        if (fVar != null) {
            fVar.f388865d = castDevice.f388610l;
            fVar.f388869h = castDevice.f388607i;
            fVar.f388870i = castDevice.f388603e;
        }
    }

    /* renamed from: k */
    private final boolean m232650k() {
        String str;
        if (this.f388856f == null) {
            f388851a.mo118884b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String a = m232648a();
        if (a == null || (str = this.f388856f.f388864c) == null || !TextUtils.equals(str, a)) {
            f388851a.mo118884b("The analytics session doesn't match the application ID %s", a);
            return false;
        }
        C143919bh.m233958a(this.f388856f);
        return true;
    }

    /* renamed from: b */
    public final void mo118551b() {
        this.f388861k.removeCallbacks(this.f388860j);
    }

    /* renamed from: c */
    public final void mo118552c() {
        if (m232650k()) {
            C143466m mVar = this.f388857g;
            CastDevice b = mVar != null ? mVar.mo118719b() : null;
            if (b != null && !TextUtils.equals(this.f388856f.f388865d, b.f388610l)) {
                m232649j(b);
            }
            C143919bh.m233958a(this.f388856f);
            return;
        }
        f388851a.mo118889g("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        mo118553d();
    }

    /* renamed from: d */
    public final void mo118553d() {
        CastDevice castDevice;
        int i = 0;
        f388851a.mo118884b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C143387f a = C143387f.m232659a(this.f388858h);
        this.f388856f = a;
        a.f388864c = m232648a();
        C143466m mVar = this.f388857g;
        if (mVar == null) {
            castDevice = null;
        } else {
            castDevice = mVar.mo118719b();
        }
        if (castDevice != null) {
            m232649j(castDevice);
        }
        C143919bh.m233958a(this.f388856f);
        C143387f fVar = this.f388856f;
        C143466m mVar2 = this.f388857g;
        if (mVar2 != null) {
            C143919bh.m233964g("Must be called from the main thread.");
            C143394ab abVar = mVar2.f388905g;
            if (abVar != null) {
                try {
                    if (abVar.mo118568e() >= 211100000) {
                        i = mVar2.f388905g.mo118569f();
                    }
                } catch (RemoteException e) {
                    C143409aq.f388903f.mo118885c(e, "Unable to call %s on %s.", "getSessionStartType", C143394ab.class.getSimpleName());
                }
            }
        }
        fVar.f388872k = i;
        C143919bh.m233958a(this.f388856f);
    }

    /* renamed from: e */
    public final void mo118554e(int i) {
        f388851a.mo118884b("log session ended with error = %d", Integer.valueOf(i));
        mo118552c();
        this.f388852b.mo118567a(this.f388853c.mo118561c(this.f388856f, i), 228);
        mo118551b();
        if (!this.f388859i) {
            this.f388856f = null;
        }
    }

    /* renamed from: f */
    public final void mo118555f() {
        C143387f fVar = this.f388856f;
        SharedPreferences sharedPreferences = this.f388855e;
        if (sharedPreferences != null) {
            C143387f.f388862a.mo118884b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("application_id", fVar.f388864c);
            edit.putString("receiver_metrics_id", fVar.f388865d);
            edit.putLong("analytics_session_id", fVar.f388866e);
            edit.putInt("event_sequence_number", fVar.f388867f);
            edit.putString("receiver_session_id", fVar.f388868g);
            edit.putInt("device_capabilities", fVar.f388869h);
            edit.putString("device_model_name", fVar.f388870i);
            edit.putInt("analytics_session_start_type", fVar.f388872k);
            edit.putBoolean("is_app_backgrounded", fVar.f388871j);
            edit.apply();
        }
    }

    /* renamed from: g */
    public final void mo118556g() {
        Handler handler = this.f388861k;
        C143919bh.m233958a(handler);
        Runnable runnable = this.f388860j;
        C143919bh.m233958a(runnable);
        handler.postDelayed(runnable, 300000);
    }

    /* renamed from: h */
    public final void mo118557h(boolean z) {
        C143566ae aeVar = f388851a;
        Object[] objArr = new Object[1];
        objArr[0] = true != z ? "foreground" : "background";
        aeVar.mo118884b("update app visibility to %s", objArr);
        this.f388858h = z;
        C143387f fVar = this.f388856f;
        if (fVar != null) {
            fVar.f388871j = z;
        }
    }

    /* renamed from: i */
    public final boolean mo118558i(String str) {
        String str2;
        if (!m232650k()) {
            return false;
        }
        C143919bh.m233958a(this.f388856f);
        if (str != null && (str2 = this.f388856f.f388868g) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f388851a.mo118884b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
