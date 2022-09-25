package com.google.android.libraries.assistant.gallium.framework.ipc.internal;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p5127o.C65647ab;
import com.google.protos.p5127o.C65648ac;
import com.google.protos.p5127o.C65653ah;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.internal.e */
/* compiled from: PG */
final class C18304e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f51938a;

    /* renamed from: b */
    final /* synthetic */ C18306g f51939b;

    public C18304e(C18306g gVar, long j) {
        this.f51939b = gVar;
        this.f51938a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof C18218av) {
            this.f51939b.mo23770a(((C18218av) th).f51741a, this.f51938a);
        } else {
            this.f51939b.mo23770a(C18219aw.m35485c(13, "Unexpected async failure; cause: ".concat(String.valueOf(C58887cx.m90975b(th)))), this.f51938a);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C65653ah ahVar = (C65653ah) obj;
        C18306g gVar = this.f51939b;
        long j = this.f51938a;
        C65647ab abVar = (C65647ab) C65648ac.f178380e.createBuilder();
        abVar.copyOnWrite();
        C65648ac acVar = (C65648ac) abVar.instance;
        acVar.f178382a |= 8;
        acVar.f178385d = j;
        abVar.copyOnWrite();
        C65648ac acVar2 = (C65648ac) abVar.instance;
        ahVar.getClass();
        acVar2.f178384c = ahVar;
        acVar2.f178383b = 2;
        try {
            gVar.f51946g.mo23766a((C65648ac) abVar.build());
        } catch (C18218av e) {
            ((C59052c) ((C59052c) C18306g.f51940a.mo56226d()).mo56372aa(47083)).mo56389s("Failed to send message to C++: %s", e.getMessage());
        }
    }
}
