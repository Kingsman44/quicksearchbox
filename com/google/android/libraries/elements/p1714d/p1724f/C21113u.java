package com.google.android.libraries.elements.p1714d.p1724f;

import android.util.Pair;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.f.u */
/* compiled from: PG */
final class C21113u implements C69822d {

    /* renamed from: a */
    private final C58495hd f59156a;

    public C21113u(C58495hd hdVar) {
        this.f59156a = hdVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25875a(Object obj) {
        C58490gz gzVar = new C58490gz(4);
        for (Object obj2 : (Object[]) obj) {
            Pair pair = (Pair) obj2;
            String str = (String) pair.first;
            byte[] bArr = (byte[]) this.f59156a.get(str);
            bArr.getClass();
            gzVar.mo55429h(str, (byte[]) ((C58833ax) pair.second).mo56109e(bArr));
        }
        return gzVar.mo55427f(true);
    }
}
