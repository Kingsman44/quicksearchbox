package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3861at.C49814aa;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49843ba;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ak */
/* compiled from: PG */
final class C10324ak extends k {

    /* renamed from: a */
    final /* synthetic */ C10325al f34984a;

    /* renamed from: b */
    final /* synthetic */ C10321ah f34985b;

    public C10324ak(C10325al alVar, C10321ah ahVar) {
        this.f34984a = alVar;
        this.f34985b = ahVar;
    }

    /* renamed from: gn */
    public final void mo18418gn(Throwable th) {
        C10321ah ahVar = this.f34985b;
        if (th instanceof C90523o) {
            C59104x d = C10325al.f34986a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppShortcutSrvCtrl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(557)).mo56386p("network error");
            ahVar.f34976d.mo57356n(DataType$UpdateResult.m25244d(3));
        } else {
            ahVar.f34976d.mo57357o(th);
        }
        this.f34984a.f34999n.set(false);
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo18419go(Object obj) {
        C10321ah ahVar = this.f34985b;
        C49814aa aaVar = ((acz) obj).f129023l;
        if (aaVar == null) {
            aaVar = C49814aa.f128669f;
        }
        int i = 2;
        if (aaVar.f128671a) {
            if (ahVar.f34973a.isPresent()) {
                C10325al alVar = ahVar.f34977e;
                DesugarAtomicReference.updateAndGet(alVar.f34996k, new C10318ae(alVar, new C10320ag(ahVar.f34974b, ahVar.f34975c, ahVar.f34973a, aaVar)));
            }
            ahVar.f34976d.mo57356n(DataType$UpdateResult.m25245e(aaVar.f128673c));
            f fVar = ahVar.f34977e.f34988c;
            String str = ahVar.f34974b;
            C49843ba baVar = ahVar.f34975c.f129479p;
            if (baVar == null) {
                baVar = C49843ba.f129533d;
            }
            int b = C49279ay.m85402b(baVar.f129536b);
            int i2 = b == 0 ? 2 : b;
            C49826ak akVar = ahVar.f34975c;
            C49843ba baVar2 = akVar.f129479p;
            if (baVar2 == null) {
                baVar2 = C49843ba.f129533d;
            }
            int b2 = C49277aw.m85400b(baVar2.f129537c);
            fVar.a(str, i2, b2 == 0 ? 2 : b2, akVar.f129476m, aaVar.f128674d);
        } else {
            SettableFuture settableFuture = ahVar.f34976d;
            int b3 = C49263ai.m85396b(aaVar.f128672b);
            if (b3 != 0) {
                i = b3;
            }
            settableFuture.mo57356n(DataType$UpdateResult.m25246f(i));
        }
        this.f34984a.f34999n.set(false);
    }
}
