package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.gms.common.data.C143861a;
import com.google.android.gms.contextmanager.C144029c;
import com.google.android.gms.contextmanager.C144085j;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.libraries.gcoreclient.p1759f.C21497a;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21500b;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21510l;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21512n;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21518t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.p */
/* compiled from: PG */
public final class C98476p implements Callable {

    /* renamed from: a */
    final /* synthetic */ int[] f274976a;

    /* renamed from: b */
    final /* synthetic */ C98477q f274977b;

    public C98476p(C98477q qVar, int[] iArr) {
        this.f274977b = qVar;
        this.f274976a = iArr;
    }

    /* JADX INFO: finally extract failed */
    public final /* synthetic */ Object call() {
        int[] iArr = this.f274976a;
        if (iArr == null || iArr.length == 0) {
            return null;
        }
        long a = this.f274977b.f274978a.mo79743a(C90120fr.f250851r);
        ArrayList arrayList = new ArrayList();
        C144085j.m234287b(System.currentTimeMillis() - ((long) ((int) a)), arrayList);
        TimeFilterImpl a2 = C144085j.m234286a(arrayList);
        C144029c cVar = new C144029c();
        for (int i : this.f274976a) {
            if (cVar.f390264a == null) {
                cVar.f390264a = new HashSet();
            }
            cVar.f390264a.add(new ContextDataFilterImpl.Inclusion(-1, i, a2, (KeyFilterImpl) null));
        }
        C21518t tVar = (C21518t) ((C21497a) this.f274977b.f274980c.mo17428b()).mo26971a(this.f274977b.f253307n, C21512n.m40632a(cVar)).mo26994a();
        if (tVar.mo26997c().mo27003f()) {
            C21510l a3 = tVar.mo26979a();
            try {
                C143861a aVar = a3.f59949a;
                int c = aVar != null ? aVar.mo119324c() : 0;
                C58976aa aaVar = C58975e.f156826a;
                byte[][] bArr = new byte[c][];
                for (int i2 = 0; i2 < c; i2++) {
                    bArr[i2] = ((C21500b) a3.mo27009b(i2)).f59922a.mo119532c();
                }
                a3.mo27010c();
                return bArr;
            } catch (Throwable th) {
                a3.mo27010c();
                throw th;
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        }
    }
}
