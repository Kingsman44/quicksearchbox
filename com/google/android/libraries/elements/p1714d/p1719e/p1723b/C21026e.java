package com.google.android.libraries.elements.p1714d.p1719e.p1723b;

import android.util.Pair;
import com.google.android.libraries.elements.interfaces.C21285ca;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.e.b.e */
/* compiled from: PG */
public final class C21026e {
    /* renamed from: a */
    public static Map m39514a(C58833ax axVar) {
        C58490gz gzVar = new C58490gz(4);
        if (axVar.mo56113h()) {
            for (Map.Entry entry : ((Map) axVar.mo56107c()).entrySet()) {
                gzVar.mo55429h(Integer.valueOf(((C21285ca) ((Pair) entry.getValue()).first).mo26793a().mo58810a()), (Pair) entry.getValue());
            }
        }
        return gzVar.mo55427f(true);
    }
}
