package com.google.android.gms.cast.framework.internal;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.C143394ab;
import com.google.android.gms.cast.framework.C143402aj;
import com.google.android.gms.cast.framework.C143403ak;
import com.google.android.gms.cast.framework.C143547r;
import com.google.android.gms.cast.framework.C143551v;
import com.google.android.gms.cast.framework.C143555z;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.internal.C143513f;
import com.google.android.gms.cast.framework.media.internal.C143515h;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.dynamite.C144149k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.cast.framework.internal.c */
/* compiled from: PG */
public final class C143439c {

    /* renamed from: a */
    private static final C143566ae f388976a = new C143566ae("CastDynamiteModule");

    /* renamed from: a */
    public static C143551v m232817a(Context context, CastOptions castOptions, C144165j jVar, C143547r rVar) {
        if (jVar == null) {
            return null;
        }
        try {
            return m232820d(context).mo118649f(castOptions, jVar, rVar);
        } catch (RemoteException | C143403ak e) {
            f388976a.mo118885c(e, "Unable to call %s on %s.", "newCastSessionImpl", C143443g.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: b */
    public static C143555z m232818b(Service service, C144165j jVar, C144165j jVar2) {
        if (!(jVar == null || jVar2 == null)) {
            try {
                return m232820d(service.getApplicationContext()).mo118650g(new C144166k(service), jVar, jVar2);
            } catch (RemoteException | C143403ak e) {
                f388976a.mo118885c(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", C143443g.class.getSimpleName());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C143394ab m232819c(Context context, String str, String str2, C143402aj ajVar) {
        try {
            return m232820d(context).mo118651h(str, str2, ajVar);
        } catch (RemoteException | C143403ak e) {
            f388976a.mo118885c(e, "Unable to call %s on %s.", "newSessionImpl", C143443g.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: d */
    public static C143443g m232820d(Context context) {
        try {
            IBinder c = DynamiteModule.m234354d(context, DynamiteModule.f390445a, "com.google.android.gms.cast.framework.dynamite").mo119687c("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (c == null) {
                return null;
            }
            IInterface queryLocalInterface = c.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof C143443g) {
                return (C143443g) queryLocalInterface;
            }
            return new C143442f(c);
        } catch (C144149k e) {
            throw new C143403ak(e);
        }
    }

    /* renamed from: e */
    public static C143513f m232821e(Context context, AsyncTask asyncTask, C143515h hVar, int i, int i2) {
        try {
            return m232820d(context.getApplicationContext()).mo118652i(new C144166k(asyncTask), hVar, i, i2);
        } catch (RemoteException | C143403ak e) {
            f388976a.mo118885c(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C143443g.class.getSimpleName());
            return null;
        }
    }
}
