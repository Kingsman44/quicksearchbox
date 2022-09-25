package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118305ac;
import com.google.android.apps.gsa.store.C118308af;
import com.google.android.apps.gsa.store.C118313d;
import com.google.android.apps.gsa.store.C118326q;
import com.google.android.apps.gsa.store.C118327r;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118334w;
import com.google.android.apps.gsa.store.C118336y;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.bf */
/* compiled from: PG */
public final /* synthetic */ class C100154bf implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C21370a f280047a;

    /* renamed from: b */
    public final /* synthetic */ C118334w f280048b;

    /* renamed from: c */
    public final /* synthetic */ C100125ad f280049c;

    /* renamed from: d */
    public final /* synthetic */ long f280050d;

    /* renamed from: e */
    public final /* synthetic */ C100181g f280051e;

    /* renamed from: f */
    public final /* synthetic */ C100175c f280052f;

    /* renamed from: g */
    public final /* synthetic */ Throwable f280053g;

    /* renamed from: h */
    public final /* synthetic */ C118831d f280054h;

    /* renamed from: i */
    public final /* synthetic */ C118831d f280055i;

    /* renamed from: j */
    public final /* synthetic */ C118831d f280056j;

    /* renamed from: k */
    public final /* synthetic */ C100147az f280057k;

    public /* synthetic */ C100154bf(C21370a aVar, C118334w wVar, C100125ad adVar, C118831d dVar, long j, C118831d dVar2, C100181g gVar, C100175c cVar, C100147az azVar, Throwable th, C118831d dVar3) {
        this.f280047a = aVar;
        this.f280048b = wVar;
        this.f280049c = adVar;
        this.f280054h = dVar;
        this.f280050d = j;
        this.f280055i = dVar2;
        this.f280051e = gVar;
        this.f280052f = cVar;
        this.f280057k = azVar;
        this.f280053g = th;
        this.f280056j = dVar3;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118327r rVar;
        C118327r rVar2;
        Cursor matrixCursor;
        C21370a aVar = this.f280047a;
        C118334w wVar = this.f280048b;
        C100125ad adVar = this.f280049c;
        C118831d dVar = this.f280054h;
        long j = this.f280050d;
        C118831d dVar2 = this.f280055i;
        C100181g gVar = this.f280051e;
        C100175c cVar = this.f280052f;
        C100147az azVar = this.f280057k;
        C118831d dVar3 = this.f280056j;
        C100187m mVar = new C100187m();
        if (wVar.f328472e) {
            rVar = C118328s.m196513e(Arrays.asList(new C118336y[]{C118308af.f328389d, C118308af.f328386a, C118308af.f328390e}));
        } else {
            rVar = C118328s.m196513e(Arrays.asList(new C118336y[]{C118308af.f328389d}));
        }
        C58485gu guVar = wVar.f328468a;
        int i = ((C58724pq) guVar).f156474d;
        C118831d dVar4 = dVar3;
        int i2 = 0;
        while (i2 < i) {
            C118302a aVar2 = (C118302a) guVar.get(i2);
            rVar = C118328s.m196514f(rVar, C58597ky.m90212c(C118328s.m196509a(C118308af.m196468b(aVar2), C118308af.m196469c(aVar2)), C118328s.m196509a(C118308af.m196477k(aVar2), C118308af.m196478l(aVar2)), C118328s.m196509a(C118308af.m196474h(aVar2), C118308af.m196475i(aVar2)), C118328s.m196509a(C118308af.m196472f(aVar2), C118308af.m196473g(aVar2)), C118328s.m196509a(C118308af.m196470d(aVar2), C118308af.m196471e(aVar2))));
            mVar.mo91796d(aVar2);
            i2++;
            i = i;
            guVar = guVar;
            azVar = azVar;
        }
        C100147az azVar2 = azVar;
        C118327r e = C118328s.m196513e(Arrays.asList(new C118336y[0]));
        C58485gu guVar2 = wVar.f328469b;
        int i3 = 0;
        for (int i4 = ((C58724pq) guVar2).f156474d; i3 < i4; i4 = i4) {
            C118302a aVar3 = (C118302a) guVar2.get(i3);
            e = C118328s.m196514f(e, C58597ky.m90212c(C118308af.m196477k(aVar3), C118308af.m196474h(aVar3), C118308af.m196472f(aVar3), C118308af.m196470d(aVar3)));
            mVar.mo91796d(aVar3);
            i3++;
            guVar2 = guVar2;
        }
        C118327r e2 = C118328s.m196513e(C58597ky.m90217h(wVar.f328471d, C118308af.f328391f));
        C58485gu guVar3 = wVar.f328470c;
        int i5 = ((C58724pq) guVar3).f156474d;
        C100175c cVar2 = cVar;
        C118327r rVar3 = null;
        int i6 = 0;
        while (i6 < i5) {
            C58485gu guVar4 = guVar3;
            C118327r rVar4 = (C118327r) guVar3.get(i6);
            rVar3 = C118328s.m196515g(rVar3, rVar4);
            mVar.mo91795c(rVar4);
            i6++;
            guVar3 = guVar4;
        }
        C58838bb.m90883r(mVar.f280211a.size() <= 24);
        if (!wVar.f328473f) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C118308af.f328387b);
            arrayList.add(new C118305ac(aVar));
            rVar2 = C118326q.m196505a(arrayList, 7);
        } else {
            rVar2 = null;
        }
        C118327r g = C118328s.m196515g(rVar2, rVar3);
        if (!e2.f328453a.isEmpty()) {
            g = C118328s.m196515g(g, C118328s.m196512d(e2));
        }
        C100177cb cbVar = new C100177cb();
        cbVar.f280119d = C58833ax.m90834k("blob_table");
        cbVar.f280118c = C58833ax.m90834k(mVar);
        cbVar.mo91782b(rVar, false);
        cbVar.f280116a = C58833ax.m90834k(e);
        if (g != null) {
            cbVar.f280117b = C58833ax.m90834k(g);
        }
        ArrayList arrayList2 = new ArrayList();
        C100121a aVar4 = new C100121a(arrayList2, mVar, cbVar.mo91781a(arrayList2));
        String[] n = C118308af.m196480n(aVar4.f279948a);
        try {
            SQLiteDatabase a = adVar.mo91757a();
            if (a != null) {
                if (a.isOpen()) {
                    matrixCursor = a.rawQuery(aVar4.f279950c, n);
                    Cursor cursor = matrixCursor;
                    C118837d.m197249c(dVar, j);
                    C100124ac acVar = new C100124ac(cursor, wVar.f328468a, dVar2, aVar4.f279949b, gVar, wVar.f328472e);
                    cVar2.f280113a.add(acVar);
                    C58976aa aaVar = C58975e.f156826a;
                    C100147az azVar3 = azVar2;
                    C100173by byVar = new C100173by(acVar, azVar3.f280036b.f280115b, acVar.mo91755c());
                    C100122aa c = acVar.mo91755c();
                    azVar3.f280035a.add(byVar);
                    c.mo91750a(new C100146ay(azVar3, byVar));
                    acVar.mo91755c().mo91750a(new C100155bg(dVar4, aVar.mo26872d()));
                    return acVar;
                }
            }
            matrixCursor = new MatrixCursor(new String[]{"blob", "blob_path", "blob_key"}, 0);
            Cursor cursor2 = matrixCursor;
            C118837d.m197249c(dVar, j);
            C100124ac acVar2 = new C100124ac(cursor2, wVar.f328468a, dVar2, aVar4.f279949b, gVar, wVar.f328472e);
            cVar2.f280113a.add(acVar2);
            C58976aa aaVar2 = C58975e.f156826a;
            C100147az azVar32 = azVar2;
            C100173by byVar2 = new C100173by(acVar2, azVar32.f280036b.f280115b, acVar2.mo91755c());
            C100122aa c2 = acVar2.mo91755c();
            azVar32.f280035a.add(byVar2);
            c2.mo91750a(new C100146ay(azVar32, byVar2));
            acVar2.mo91755c().mo91750a(new C100155bg(dVar4, aVar.mo26872d()));
            return acVar2;
        } catch (Exception e3) {
            C59104x c3 = C100156bh.f280060a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "SqliteKeyBlobQuery");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(33220)).mo56386p("Error executing query");
            throw new C118313d("Error executing query", e3);
        }
    }
}
