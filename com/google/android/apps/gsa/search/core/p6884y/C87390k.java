package com.google.android.apps.gsa.search.core.p6884y;

import android.util.SparseArray;
import com.google.android.apps.gsa.search.core.p6884y.p6888d.C87294b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88027ml;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88028mm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88035mt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88036mu;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.y.k */
/* compiled from: PG */
public final class C87390k implements C91079f {

    /* renamed from: a */
    public static final C59071e f235973a = C59071e.m91332i("com.google.android.apps.gsa.search.core.y.k");

    /* renamed from: b */
    public final SparseArray f235974b = new SparseArray();

    /* renamed from: c */
    public final SparseArray f235975c = new SparseArray();

    /* renamed from: d */
    private final C87294b f235976d;

    /* renamed from: e */
    private int f235977e = 1;

    public C87390k(C87294b bVar) {
        this.f235976d = bVar;
    }

    @Deprecated
    /* renamed from: ju */
    public final void mo81047ju(String[] strArr, int i, C91078e eVar) {
        List asList = Arrays.asList(strArr);
        C88027ml mlVar = (C88027ml) C88028mm.f238037f.createBuilder();
        int i2 = this.f235977e;
        this.f235977e = i2 + 1;
        mlVar.copyOnWrite();
        C88028mm mmVar = (C88028mm) mlVar.instance;
        boolean z = true;
        mmVar.f238039a |= 1;
        mmVar.f238040b = i2;
        mlVar.copyOnWrite();
        C88028mm mmVar2 = (C88028mm) mlVar.instance;
        mmVar2.f238039a |= 2;
        mmVar2.f238042d = i - 1;
        if (eVar == null) {
            z = false;
        }
        mlVar.copyOnWrite();
        C88028mm mmVar3 = (C88028mm) mlVar.instance;
        mmVar3.f238039a |= 4;
        mmVar3.f238043e = z;
        mlVar.copyOnWrite();
        C88028mm mmVar4 = (C88028mm) mlVar.instance;
        C62971cq cqVar = mmVar4.f238041c;
        if (!cqVar.mo58948c()) {
            mmVar4.f238041c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) asList, (List) mmVar4.f238041c);
        C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
        C88028mm mmVar5 = (C88028mm) mlVar.build();
        mtVar.copyOnWrite();
        C88036mu muVar = (C88036mu) mtVar.instance;
        mmVar5.getClass();
        muVar.f238060b = mmVar5;
        muVar.f238059a = 7;
        C88036mu muVar2 = (C88036mu) mtVar.build();
        if (eVar != null) {
            this.f235974b.put(i2, eVar);
        }
        this.f235976d.mo80939a(muVar2, C58836b.f156633a);
    }
}
