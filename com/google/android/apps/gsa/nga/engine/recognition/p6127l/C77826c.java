package com.google.android.apps.gsa.nga.engine.recognition.p6127l;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.c */
/* compiled from: PG */
public final class C77826c {

    /* renamed from: a */
    private static final C58974d f214379a = C58974d.m91136j();

    /* renamed from: b */
    private final C69464a f214380b;

    /* renamed from: c */
    private final C69464a f214381c;

    public C77826c(C69464a aVar, C69464a aVar2) {
        this.f214380b = aVar;
        this.f214381c = aVar2;
    }

    /* renamed from: a */
    public final Locale mo72835a() {
        C58495hd hdVar;
        String languageTag = ((C76092h) this.f214381c.mo17428b()).mo72021b().mo72039e().toLanguageTag();
        try {
            hdVar = C89988b.f246752a.mo85085a(((C91142g) this.f214380b.mo17428b()).mo85403h(C90126fx.f251596lm));
        } catch (IllegalArgumentException | NullPointerException e) {
            ((C58970a) ((C58970a) ((C58970a) f214379a.mo56225c()).mo56382g(e)).mo56372aa(4414)).mo56386p("Parse locale to download language pack failed for config flag");
            hdVar = C58729pv.f156485a;
        }
        return Locale.forLanguageTag((String) hdVar.getOrDefault(languageTag, languageTag));
    }
}
