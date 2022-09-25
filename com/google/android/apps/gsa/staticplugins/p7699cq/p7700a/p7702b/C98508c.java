package com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b;

import com.google.android.apps.gsa.search.core.p6519al.p6638cc.C85073a;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88303wr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.cq.a.b.c */
/* compiled from: PG */
public final class C98508c {

    /* renamed from: a */
    public static final C59071e f275070a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cq.a.b.c");

    /* renamed from: b */
    public final C85073a f275071b;

    /* renamed from: c */
    public C87682aj f275072c;

    /* renamed from: d */
    public boolean f275073d;

    public C98508c(C85073a aVar) {
        this.f275071b = aVar;
    }

    /* renamed from: a */
    public final void mo91155a(int i) {
        if (this.f275073d) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C87682aj ajVar = this.f275072c;
        if (ajVar != null) {
            C87684al alVar = new C87684al(C88244um.SHOW_RECOGNITION_STATE);
            C62940bt btVar = C88302wq.f238816a;
            C88303wr wrVar = (C88303wr) C88304ws.f238817c.createBuilder();
            wrVar.copyOnWrite();
            C88304ws wsVar = (C88304ws) wrVar.instance;
            wsVar.f238819a |= 1;
            wsVar.f238820b = i;
            alVar.mo81965b(btVar, (C88304ws) wrVar.build());
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
            return;
        }
        C59104x d = f275070a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PronLearningSubC");
        ((C59052c) ((C59052c) d).mo56372aa(30723)).mo56386p("#setRecognitionState Null callback. Maybe the client is not connected");
        int i2 = C90755l.f253831a;
    }
}
