package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80103ar;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80523t;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80525v;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89121b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89124e;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.r */
/* compiled from: PG */
public final class C103736r implements C103651a {

    /* renamed from: a */
    public final C89121b f288893a;

    /* renamed from: b */
    private final C89124e f288894b;

    /* renamed from: c */
    private final C22871g f288895c;

    public C103736r(C89121b bVar, C22871g gVar, C89124e eVar) {
        this.f288893a = bVar;
        this.f288895c = gVar;
        this.f288894b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80525v vVar;
        C80103ar arVar;
        C80525v vVar2;
        if (bnVar.f219917a != 19) {
            return C60856cj.m92900i(C80275dd.f220288c);
        }
        e eVar = e.a;
        if (bnVar.f219917a == 19) {
            vVar = (C80525v) bnVar.f219918b;
        } else {
            vVar = C80525v.f221055c;
        }
        if ((vVar.f221057a & 1) != 0) {
            if (bnVar.f219917a == 19) {
                vVar2 = (C80525v) bnVar.f219918b;
            } else {
                vVar2 = C80525v.f221055c;
            }
            int a = C80523t.m128191a(vVar2.f221058b);
            if (a != 0 && a == 2) {
                eVar = e.bv;
            }
        }
        C89124e eVar2 = this.f288894b;
        if (bnVar.f219917a == 17) {
            arVar = (C80103ar) bnVar.f219918b;
        } else {
            arVar = C80103ar.f219810d;
        }
        return this.f288895c.mo28209i(eVar2.mo83112b(Locale.forLanguageTag(arVar.f219813b), eVar), "[NGA] FinishSetupClickHandler.handleClick", new C103735q(this));
    }
}
