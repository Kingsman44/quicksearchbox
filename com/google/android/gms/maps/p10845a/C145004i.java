package com.google.android.gms.maps.p10845a;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.maps.a.i */
/* compiled from: PG */
public final class C145004i {

    /* renamed from: a */
    private static final String f391989a = "i";

    /* renamed from: b */
    private static Context f391990b;

    /* renamed from: c */
    private static C144998c f391991c;

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.p10845a.C144998c m235663a(android.content.Context r3, int r4) {
        /*
            com.google.android.gms.common.internal.C143919bh.m233958a(r3)
            java.lang.String r0 = f391989a
            java.lang.String r1 = "preferredRenderer: "
            java.lang.String r2 = com.google.android.gms.maps.C145010g.m235671a(r4)
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.d(r0, r1)
            com.google.android.gms.maps.a.c r1 = f391991c
            if (r1 != 0) goto L_0x0091
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = com.google.android.gms.common.C143700ab.m233440b(r3, r1)
            if (r1 != 0) goto L_0x008b
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = m235666d(r3, r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)     // Catch:{ ClassNotFoundException -> 0x0083 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0083 }
            java.lang.Object r0 = m235665c(r0)     // Catch:{ ClassNotFoundException -> 0x0083 }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x003f
            r0 = 0
            goto L_0x0053
        L_0x003f:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.p10845a.C144998c
            if (r2 == 0) goto L_0x004d
            r0 = r1
            com.google.android.gms.maps.a.c r0 = (com.google.android.gms.maps.p10845a.C144998c) r0
            goto L_0x0053
        L_0x004d:
            com.google.android.gms.maps.a.c r1 = new com.google.android.gms.maps.a.c
            r1.<init>(r0)
            r0 = r1
        L_0x0053:
            f391991c = r0
            android.content.Context r3 = m235666d(r3, r4)     // Catch:{ RemoteException -> 0x007c }
            java.lang.Object r3 = p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ RemoteException -> 0x007c }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ RemoteException -> 0x007c }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x007c }
            com.google.android.gms.f.k r4 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x007c }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x007c }
            android.os.Parcel r3 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x007c }
            com.google.android.p445a.C8850c.m23499h(r3, r4)     // Catch:{ RemoteException -> 0x007c }
            r4 = 223810000(0xd5711d0, float:6.627343E-31)
            r3.writeInt(r4)     // Catch:{ RemoteException -> 0x007c }
            r4 = 6
            r0.mo17262he(r4, r3)     // Catch:{ RemoteException -> 0x007c }
            com.google.android.gms.maps.a.c r3 = f391991c
            return r3
        L_0x007c:
            r3 = move-exception
            com.google.android.gms.maps.model.g r4 = new com.google.android.gms.maps.model.g
            r4.<init>(r3)
            throw r4
        L_0x0083:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            r3.<init>(r4)
            throw r3
        L_0x008b:
            com.google.android.gms.common.y r3 = new com.google.android.gms.common.y
            r3.<init>()
            throw r3
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.p10845a.C145004i.m235663a(android.content.Context, int):com.google.android.gms.maps.a.c");
    }

    /* renamed from: b */
    private static Context m235664b(Exception exc, Context context) {
        Log.e(f391989a, "Failed to load maps module, use pre-Chimera", exc);
        return C143700ab.m233441c(context);
    }

    /* renamed from: c */
    private static Object m235665c(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())));
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())));
        }
    }

    /* renamed from: d */
    private static Context m235666d(Context context, int i) {
        Context context2;
        Context context3 = f391990b;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        String str = i != 0 ? i + -1 != 0 ? "com.google.android.gms.maps_core_dynamite" : "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_dynamite";
        try {
            context2 = DynamiteModule.m234354d(context, DynamiteModule.f390445a, str).f390459e;
        } catch (Exception e) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    Log.d(f391989a, "Attempting to load maps_dynamite again.");
                    context2 = DynamiteModule.m234354d(context, DynamiteModule.f390445a, "com.google.android.gms.maps_dynamite").f390459e;
                } catch (Exception e2) {
                    context2 = m235664b(e2, context);
                }
            } else {
                context2 = m235664b(e, context);
            }
        }
        f391990b = context2;
        return context2;
    }
}
