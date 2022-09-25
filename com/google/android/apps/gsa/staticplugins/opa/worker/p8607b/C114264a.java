package com.google.android.apps.gsa.staticplugins.opa.worker.p8607b;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3861at.C49814aa;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49843ba;
import com.google.assistant.p3861at.acz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b.a */
/* compiled from: PG */
public final /* synthetic */ class C114264a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114274k f316850a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f316851b;

    /* renamed from: c */
    public final /* synthetic */ C87693ab f316852c;

    public /* synthetic */ C114264a(C114274k kVar, C2164c cVar, C87693ab abVar) {
        this.f316850a = kVar;
        this.f316851b = cVar;
        this.f316852c = abVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114274k kVar = this.f316850a;
        C2164c cVar = this.f316851b;
        C87693ab abVar = this.f316852c;
        acz acz = (acz) obj;
        C49814aa aaVar = acz.f129023l;
        if (aaVar == null) {
            aaVar = C49814aa.f128669f;
        }
        if (!aaVar.f128671a) {
            cVar.mo5437b(Optional.empty());
            return;
        }
        C49814aa aaVar2 = acz.f129023l;
        if (aaVar2 == null) {
            aaVar2 = C49814aa.f128669f;
        }
        cVar.mo5437b(Optional.m71637of(aaVar2.f128673c));
        f fVar = kVar.f316877j;
        String str = abVar.f237120d;
        C49826ak akVar = abVar.f237119c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C49843ba baVar = akVar.f129479p;
        if (baVar == null) {
            baVar = C49843ba.f129533d;
        }
        int b = C49279ay.m85402b(baVar.f129536b);
        int i = b == 0 ? 2 : b;
        C49826ak akVar2 = abVar.f237119c;
        C49843ba baVar2 = (akVar2 == null ? C49826ak.f129462q : akVar2).f129479p;
        if (baVar2 == null) {
            baVar2 = C49843ba.f129533d;
        }
        int b2 = C49277aw.m85400b(baVar2.f129537c);
        int i2 = b2 == 0 ? 2 : b2;
        if (akVar2 == null) {
            akVar2 = C49826ak.f129462q;
        }
        String str2 = akVar2.f129476m;
        C49814aa aaVar3 = acz.f129023l;
        if (aaVar3 == null) {
            aaVar3 = C49814aa.f128669f;
        }
        fVar.a(str, i, i2, str2, aaVar3.f128674d);
    }
}
