package com.google.android.apps.gsa.shared.util;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.lang.reflect.Proxy;

/* renamed from: com.google.android.apps.gsa.shared.util.bl */
/* compiled from: PG */
public final class C90768bl {
    /* renamed from: a */
    public static Object m148268a(C22871g gVar, Class cls, Object obj) {
        C90765bi biVar = new C90765bi(obj, cls, gVar);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, biVar);
    }
}
