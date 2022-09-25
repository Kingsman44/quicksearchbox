package com.google.android.libraries.elements.p1714d.p1717c;

import android.util.Pair;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21267bj;
import com.google.android.libraries.elements.interfaces.C21268bk;
import com.google.common.p4522b.C58490gz;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.c.e */
/* compiled from: PG */
public final class C20848e {

    /* renamed from: a */
    public final Map f58427a;

    /* renamed from: b */
    public final Map f58428b;

    /* renamed from: c */
    public final C21259bb f58429c;

    public C20848e(Map map, Map map2, C21259bb bbVar) {
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            gzVar.mo55429h(Integer.valueOf(((C21268bk) entry.getValue()).mo25959a()), (C21268bk) entry.getValue());
        }
        this.f58427a = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        for (Map.Entry entry2 : map2.entrySet()) {
            gzVar2.mo55429h(Integer.valueOf(((C21267bj) ((Pair) entry2.getValue()).first).mo26758a().mo58810a()), (Pair) entry2.getValue());
        }
        this.f58428b = gzVar2.mo55427f(true);
        this.f58429c = bbVar;
    }
}
