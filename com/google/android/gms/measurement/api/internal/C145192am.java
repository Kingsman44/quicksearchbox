package com.google.android.gms.measurement.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144859a;
import com.google.android.gms.libs.p10836d.p10839c.C144860b;
import com.google.android.gms.measurement.api.C145178a;
import com.google.android.gms.measurement.internal.C145352ex;
import com.google.android.gms.measurement.internal.C145422hm;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.measurement.api.internal.am */
/* compiled from: PG */
public final class C145192am {

    /* renamed from: g */
    private static volatile C145192am f392451g;

    /* renamed from: a */
    public final String f392452a = "FA";

    /* renamed from: b */
    protected final ExecutorService f392453b;

    /* renamed from: c */
    public final C145178a f392454c;

    /* renamed from: d */
    public int f392455d;

    /* renamed from: e */
    public boolean f392456e;

    /* renamed from: f */
    public volatile C145195d f392457f;

    protected C145192am(Context context, Bundle bundle) {
        C144859a aVar = C144860b.f391709a;
        this.f392453b = C144859a.m235445a(1, new C145180aa());
        this.f392454c = new C145178a();
        new ArrayList();
        try {
            if (C145422hm.m236342b(context, C145352ex.m236168a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f392456e = true;
                    Log.w(this.f392452a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        mo120702b(new C145208q(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f392452a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C145191al(this));
        }
    }

    /* renamed from: c */
    public static C145192am m235849c(Context context, Bundle bundle) {
        C143919bh.m233958a(context);
        if (f392451g == null) {
            synchronized (C145192am.class) {
                if (f392451g == null) {
                    f392451g = new C145192am(context, bundle);
                }
            }
        }
        return f392451g;
    }

    /* renamed from: a */
    public final void mo120701a(Exception exc, boolean z, boolean z2) {
        this.f392456e |= z;
        if (z) {
            Log.w(this.f392452a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo120702b(new C145217z(this, exc));
        }
        Log.w(this.f392452a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: b */
    public final void mo120702b(C145183ad adVar) {
        this.f392453b.execute(adVar);
    }

    /* renamed from: d */
    public final void mo120703d(String str, String str2, Bundle bundle, boolean z) {
        mo120702b(new C145182ac(this, str, str2, bundle, z));
    }
}
