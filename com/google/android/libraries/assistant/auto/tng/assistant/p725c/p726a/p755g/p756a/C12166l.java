package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p756a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17481aq;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17487aw;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.g.a.l */
/* compiled from: PG */
final class C12166l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C15481g f38853a;

    /* renamed from: b */
    final /* synthetic */ C37258g f38854b;

    public C12166l(C15481g gVar, C37258g gVar2) {
        this.f38853a = gVar;
        this.f38854b = gVar2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C12167m.f38855a.mo56226d()).mo56382g(th)).mo56372aa(44070)).mo56386p("Nlg synthesisStatusFuture failed: exception thrown.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int a;
        C17487aw awVar = (C17487aw) obj;
        int i = 1;
        if (awVar.f50493a != 1) {
            C59052c cVar = (C59052c) ((C59052c) C12167m.f38855a.mo56226d()).mo56372aa(44071);
            if (awVar.f50493a == 2 && (a = C17481aq.m34785a(((Integer) awVar.f50494b).intValue())) != 0) {
                i = a;
            }
            cVar.mo56387q("Nlg synthesisStatus failure: %d", i - 1);
            return;
        }
        this.f38853a.mo22352b(this.f38854b);
    }
}
