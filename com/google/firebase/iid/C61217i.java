package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146025e;
import com.google.android.gms.tasks.C146046z;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.i */
/* compiled from: PG */
public final /* synthetic */ class C61217i implements C146025e {
    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        Object obj;
        Class<IOException> cls = IOException.class;
        synchronized (((C146014aj) abVar).f394702a) {
            ((C146014aj) abVar).mo122505s();
            ((C146014aj) abVar).mo122506t();
            if (!cls.isInstance(((C146014aj) abVar).f394705d)) {
                Exception exc = ((C146014aj) abVar).f394705d;
                if (exc == null) {
                    obj = ((C146014aj) abVar).f394704c;
                } else {
                    throw new C146046z(exc);
                }
            } else {
                throw cls.cast(((C146014aj) abVar).f394705d);
            }
        }
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String obj2 = bundle.toString();
                Log.w("FirebaseInstanceId", "Unexpected response: ".concat(obj2), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
