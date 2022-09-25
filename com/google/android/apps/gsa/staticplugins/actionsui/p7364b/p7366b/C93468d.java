package com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7366b;

import com.google.android.apps.gsa.search.shared.actions.C87420h;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87754ci;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87755cj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.b.b.d */
/* compiled from: PG */
final class C93468d implements C87420h {

    /* renamed from: a */
    final /* synthetic */ C93469e f260848a;

    public C93468d(C93469e eVar) {
        this.f260848a = eVar;
    }

    /* renamed from: a */
    public final C91079f mo81195a() {
        return this.f260848a.f260850b;
    }

    /* renamed from: b */
    public final void mo81196b(long j) {
        C87681ai aiVar = this.f260848a.f260849a;
        C88489j jVar = new C88489j(C87739bu.CONTACT_SELECTED_EXTERNALLY);
        C62940bt btVar = C87754ci.f237512a;
        C87755cj cjVar = (C87755cj) C87756ck.f237513c.createBuilder();
        cjVar.copyOnWrite();
        C87756ck ckVar = (C87756ck) cjVar.instance;
        ckVar.f237515a |= 1;
        ckVar.f237516b = j;
        jVar.mo82014b(btVar, (C87756ck) cjVar.build());
        aiVar.mo81937i(jVar.mo82013a());
    }
}
