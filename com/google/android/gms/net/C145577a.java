package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.C144023z;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.dynamite.C144149k;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.net.a */
/* compiled from: PG */
public final class C145577a {

    /* renamed from: a */
    public static final Object f393614a = new Object();

    /* renamed from: b */
    public static String f393615b = "0";

    /* renamed from: c */
    private static final String f393616c = "a";

    /* renamed from: d */
    private static final C143876h f393617d = C143876h.f389991d;

    /* renamed from: e */
    private static DynamiteModule f393618e;

    private C145577a() {
    }

    /* renamed from: a */
    static DynamiteModule m236659a() {
        DynamiteModule dynamiteModule;
        synchronized (f393614a) {
            dynamiteModule = f393618e;
        }
        return dynamiteModule;
    }

    @Deprecated
    /* renamed from: b */
    public static void m236660b(Context context) {
        synchronized (f393614a) {
            if (!m236661c()) {
                C143919bh.m233971n(context, "Context must not be null");
                ClassLoader classLoader = C145577a.class.getClassLoader();
                C143919bh.m233958a(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    C143700ab.m233443e(context, 11925000);
                    DynamiteModule d = DynamiteModule.m234354d(context, DynamiteModule.f390445a, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = d.f390459e.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != C145577a.class.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) method.invoke((Object) null, new Object[0]);
                        C143919bh.m233958a(num);
                        int intValue = num.intValue();
                        String str = (String) method2.invoke((Object) null, new Object[0]);
                        C143919bh.m233958a(str);
                        f393615b = str;
                        if (intValue < 3) {
                            Intent k = f393617d.mo119363k(context, 2, "cr");
                            if (k == null) {
                                Log.e(f393616c, "Unable to fetch error resolution intent");
                                throw new C144022y();
                            }
                            String str2 = f393615b;
                            throw new C144023z(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + intValue + ". The Cronet implementation version is " + str2, k);
                        }
                        f393618e = d;
                        return;
                    }
                    Log.e(f393616c, "ImplVersion class is missing from Cronet module.");
                    throw new C144022y();
                } catch (ClassNotFoundException e) {
                    Log.e(f393616c, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((C144022y) new C144022y().initCause(e));
                } catch (C144149k e2) {
                    Log.e(f393616c, "Unable to load Cronet module", e2);
                    throw ((C144022y) new C144022y().initCause(e2));
                } catch (Exception e3) {
                    Log.e(f393616c, "Unable to read Cronet version from the Cronet module ", e3);
                    throw ((C144022y) new C144022y().initCause(e3));
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m236661c() {
        return m236659a() != null;
    }
}
