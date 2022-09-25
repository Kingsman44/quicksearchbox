package com.google.android.libraries.phenotype.client;

import android.os.Binder;

/* renamed from: com.google.android.libraries.phenotype.client.g */
/* compiled from: PG */
public final /* synthetic */ class C31668g {
    /* renamed from: a */
    public static Object m59011a(C31669h hVar) {
        long clearCallingIdentity;
        try {
            return hVar.mo37308a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = hVar.mo37308a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
