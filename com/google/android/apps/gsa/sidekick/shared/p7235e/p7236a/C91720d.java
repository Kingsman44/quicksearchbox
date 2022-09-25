package com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a;

import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.apps.gsa.sidekick.shared.cards.C91698m;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91907e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.e.a.d */
/* compiled from: PG */
final class C91720d extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C91907e f255812a;

    /* renamed from: b */
    final /* synthetic */ C91043j f255813b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91720d(C90929bz bzVar, C91907e eVar, C91043j jVar) {
        super("EnableSearchHistory", bzVar, 2, 4);
        this.f255812a = eVar;
        this.f255813b = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            return Boolean.valueOf(this.f255812a.mo85987p());
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C91725i.f255821a.mo56225c()).mo56382g(e)).mo56372aa(11873)).mo56386p("Error enabling search history");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        ((C91698m) this.f255813b).mo17709a((Boolean) obj);
    }
}
