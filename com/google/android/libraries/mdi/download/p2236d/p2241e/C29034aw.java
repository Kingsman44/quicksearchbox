package com.google.android.libraries.mdi.download.p2236d.p2241e;

import android.content.Context;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.C29118ff;
import com.google.android.libraries.mdi.download.p2236d.C29290lp;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58833ax;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.e.aw */
/* compiled from: PG */
public final class C29034aw {

    /* renamed from: a */
    public final C29118ff f78819a;

    /* renamed from: b */
    public final C29290lp f78820b;

    /* renamed from: c */
    public final C42813k f78821c;

    /* renamed from: d */
    public final C29037d f78822d;

    /* renamed from: e */
    public final Context f78823e;

    /* renamed from: f */
    public final C29658ia f78824f;

    /* renamed from: g */
    public final C58833ax f78825g;

    /* renamed from: h */
    public final Executor f78826h;

    public C29034aw(Context context, C29118ff ffVar, C29290lp lpVar, C42813k kVar, C29037d dVar, C29658ia iaVar, C58833ax axVar, Executor executor) {
        this.f78823e = context;
        this.f78819a = ffVar;
        this.f78820b = lpVar;
        this.f78821c = kVar;
        this.f78822d = dVar;
        this.f78824f = iaVar;
        this.f78825g = axVar;
        this.f78826h = executor;
    }

    /* renamed from: a */
    public static final String m53906a(C29392ep epVar) {
        return epVar.f79682b + "|" + epVar.f79683c;
    }

    /* renamed from: b */
    public static final Set m53907b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
