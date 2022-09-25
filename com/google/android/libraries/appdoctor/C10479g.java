package com.google.android.libraries.appdoctor;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.appdoctor.p573a.C10444a;
import com.google.common.p4552o.p4566l.C60226z;
import java.util.Random;

/* renamed from: com.google.android.libraries.appdoctor.g */
/* compiled from: PG */
public final class C10479g implements C10444a {

    /* renamed from: a */
    final boolean f35249a;

    /* renamed from: b */
    final C143658k f35250b = null;

    /* renamed from: c */
    private final Context f35251c;

    public C10479g(Context context) {
        context.getClass();
        this.f35251c = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f35249a = new Random().nextDouble() > 1.0d;
    }

    /* renamed from: a */
    public final void mo18486a(C60226z zVar) {
        if (this.f35249a) {
            Log.d("ClearcutAppDoctorLogger", "Not Logging: Sampling rate prevented logging");
        } else if ((zVar.f162947a & 4) != 0) {
            Log.w("ClearcutAppDoctorLogger", "Failed to determine opt-in status. Dropping log.");
        } else {
            Log.d("ClearcutAppDoctorLogger", "Not logging: empty");
        }
    }
}
