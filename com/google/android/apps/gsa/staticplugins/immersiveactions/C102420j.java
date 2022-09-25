package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.apps.gsa.search.shared.actions.C87420h;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87754ci;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87755cj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.j */
/* compiled from: PG */
public final class C102420j extends ContextWrapper implements C87420h {

    /* renamed from: a */
    public C87681ai f285845a;

    /* renamed from: b */
    private final C91079f f285846b;

    public C102420j(Context context, C91079f fVar) {
        super(context);
        this.f285846b = fVar;
    }

    /* renamed from: a */
    public final C91079f mo81195a() {
        return this.f285846b;
    }

    /* renamed from: b */
    public final void mo81196b(long j) {
        if (this.f285845a != null) {
            C88489j jVar = new C88489j(C87739bu.CONTACT_SELECTED_EXTERNALLY);
            C62940bt btVar = C87754ci.f237512a;
            C87755cj cjVar = (C87755cj) C87756ck.f237513c.createBuilder();
            cjVar.copyOnWrite();
            C87756ck ckVar = (C87756ck) cjVar.instance;
            ckVar.f237515a |= 1;
            ckVar.f237516b = j;
            jVar.mo82014b(btVar, (C87756ck) cjVar.build());
            this.f285845a.mo81937i(jVar.mo82013a());
        }
    }
}
