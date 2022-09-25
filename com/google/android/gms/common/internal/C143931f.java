package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.common.internal.f */
/* compiled from: PG */
final class C143931f extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C143939n f390121a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143931f(C143939n nVar, Looper looper) {
        super(looper);
        this.f390121a = nVar;
    }

    /* renamed from: a */
    private static final void m233983a(Message message) {
        C143932g gVar = (C143932g) message.obj;
        gVar.mo119438b();
        gVar.mo119443f();
    }

    /* renamed from: b */
    private static final boolean m233984b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    public final void handleMessage(Message message) {
        Object obj;
        if (this.f390121a.f390142I.get() != message.arg1) {
            if (m233984b(message)) {
                m233983a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f390121a.mo119468x()) {
            m233983a(message);
        } else if (message.what == 4) {
            this.f390121a.f390139F = new ConnectionResult(1, message.arg2, (PendingIntent) null, (String) null);
            C143939n nVar = this.f390121a;
            if (!nVar.f390140G && !TextUtils.isEmpty(nVar.mo57746c()) && !TextUtils.isEmpty((CharSequence) null)) {
                try {
                    Class.forName(nVar.mo57746c());
                    C143939n nVar2 = this.f390121a;
                    if (!nVar2.f390140G) {
                        nVar2.mo119457O(3, (IInterface) null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = this.f390121a.f390139F;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(1, 8, (PendingIntent) null, (String) null);
            }
            this.f390121a.f390161y.mo119145a(connectionResult);
            this.f390121a.mo118926o(connectionResult);
        } else if (message.what == 5) {
            ConnectionResult connectionResult2 = this.f390121a.f390139F;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(1, 8, (PendingIntent) null, (String) null);
            }
            this.f390121a.f390161y.mo119145a(connectionResult2);
            this.f390121a.mo118926o(connectionResult2);
        } else if (message.what == 3) {
            ConnectionResult connectionResult3 = new ConnectionResult(1, message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null, (String) null);
            this.f390121a.f390161y.mo119145a(connectionResult3);
            this.f390121a.mo118926o(connectionResult3);
        } else if (message.what == 6) {
            this.f390121a.mo119457O(5, (IInterface) null);
            C143929d dVar = this.f390121a.f390135B;
            if (dVar != null) {
                dVar.mo119390b(message.arg2);
            }
            this.f390121a.mo119456N(message.arg2);
            this.f390121a.mo119460R(5, 1, (IInterface) null);
        } else if (message.what == 2 && !this.f390121a.mo119467w()) {
            m233983a(message);
        } else if (m233984b(message)) {
            C143932g gVar = (C143932g) message.obj;
            synchronized (gVar) {
                obj = gVar.f390122d;
                if (gVar.f390123e) {
                    String obj2 = gVar.toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            }
            if (obj != null) {
                try {
                    gVar.mo119440d();
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (gVar) {
                gVar.f390123e = true;
            }
            gVar.mo119443f();
        } else {
            int i = message.what;
            Log.wtf("GmsClient", "Don't know how to handle message: " + i, new Exception());
        }
    }
}
