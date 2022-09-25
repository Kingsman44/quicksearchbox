package com.facebook.p313c;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.core.p097i.C1972g;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.c.l */
/* compiled from: PG */
public final class C6053l {

    /* renamed from: a */
    public static final Map f17808a = new HashMap(4);

    /* renamed from: b */
    public static final WeakHashMap f17809b = new WeakHashMap();

    /* renamed from: c */
    private static C6052k f17810c;

    /* renamed from: a */
    public static Context m15592a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: b */
    static Object m15593b(Context context, C6063v vVar) {
        C1972g d = m15595d(context, vVar.mo12657b());
        if (d == null) {
            return vVar.mo12656a(context);
        }
        Object a = d.mo5126a();
        return a == null ? vVar.mo12656a(context) : a;
    }

    /* renamed from: c */
    static void m15594c(Context context, C6063v vVar, Object obj) {
        C1972g d = m15595d(context, vVar.mo12657b());
        if (d != null) {
            d.mo5127b(obj);
        }
    }

    /* renamed from: d */
    private static C1972g m15595d(Context context, Object obj) {
        Map map = f17808a;
        Map map2 = (Map) map.get(context);
        if (map2 == null) {
            if (f17809b.containsKey(m15592a(context))) {
                return null;
            }
            if (f17810c == null) {
                f17810c = new C6052k();
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f17810c);
            }
            map2 = new HashMap();
            map.put(context, map2);
        }
        C1972g gVar = (C1972g) map2.get(obj);
        if (gVar != null) {
            return gVar;
        }
        C1972g gVar2 = new C1972g(3);
        map2.put(obj, gVar2);
        return gVar2;
    }
}
