package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80902aq;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C107087ad implements C80902aq {

    /* renamed from: a */
    public final /* synthetic */ C107097an f298145a;

    /* renamed from: b */
    public final /* synthetic */ C50738bc f298146b;

    public /* synthetic */ C107087ad(C107097an anVar, C50738bc bcVar) {
        this.f298145a = anVar;
        this.f298146b = bcVar;
    }

    /* renamed from: a */
    public final void mo49513a(Throwable th) {
        C107097an anVar = this.f298145a;
        C50738bc bcVar = this.f298146b;
        C58970a aVar = (C58970a) ((C58970a) ((C58970a) anVar.f298159c.mo56225c()).mo56382g(th)).mo56372aa(23506);
        String str = bcVar.f132037d;
        C50701am a = C50701am.m85887a(bcVar.f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        aVar.mo56359L("Failed to add chip: %s, %s, %s", str, a.name(), bcVar.f132038e);
    }
}
