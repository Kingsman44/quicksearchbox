package com.google.android.apps.gsa.sidekick.main.actions;

import android.os.AsyncTask;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.shared.p7244m.C91763c;
import com.google.android.apps.gsa.sidekick.shared.util.C91957ah;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7735i;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7762j;
import com.google.p375ai.p378b.C7950pz;
import com.google.p375ai.p378b.C7952qa;
import com.google.p375ai.p378b.C7963ql;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.l */
/* compiled from: PG */
public class C91253l extends AsyncTask {

    /* renamed from: b */
    private static final C59071e f254688b = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.actions.l");

    /* renamed from: a */
    public final C7718hj f254689a;

    /* renamed from: c */
    private final C91376f f254690c;

    /* renamed from: d */
    private final C7708h f254691d;

    /* renamed from: e */
    private final C21370a f254692e;

    public C91253l(C91376f fVar, C7718hj hjVar, C7708h hVar, C21370a aVar) {
        this.f254690c = fVar;
        hjVar.getClass();
        this.f254689a = hjVar;
        hVar.getClass();
        this.f254691d = hVar;
        this.f254692e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7752iq mo85520b(C7708h hVar, long j) {
        return C91957ah.m150910a(this.f254689a, hVar, j, (C7669fo) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        C7752iq b = mo85520b(this.f254691d, this.f254692e.mo26870b());
        C7735i iVar = (C7735i) C7762j.f27177h.createBuilder();
        iVar.copyOnWrite();
        C7762j jVar = (C7762j) iVar.instance;
        b.getClass();
        jVar.mo16958a();
        jVar.f27180b.add(b);
        C7762j jVar2 = (C7762j) iVar.build();
        C7950pz pzVar = (C7950pz) C91763c.m150327a(C7642eo.ACTION).toBuilder();
        pzVar.copyOnWrite();
        C7952qa qaVar = (C7952qa) pzVar.instance;
        jVar2.getClass();
        qaVar.f27923d = jVar2;
        qaVar.f27920a |= 8;
        C7963ql qlVar = this.f254690c.mo85696a((C7952qa) pzVar.build(), C91376f.f254951b).f254946a;
        if (qlVar == null) {
            ((C59052c) ((C59052c) f254688b.mo56225c()).mo56372aa(11507)).mo56386p("Error sending request to the server");
        }
        return qlVar;
    }
}
