package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.engine.am.ab;
import com.google.android.apps.gsa.nga.engine.geniefm.C76095a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80431k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80432l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80433m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80438r;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80441u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80442v;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4535g.C59203do;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.m */
/* compiled from: PG */
public final class C79030m {

    /* renamed from: a */
    public final ab f217330a;

    /* renamed from: b */
    private final C76095a f217331b;

    /* renamed from: c */
    private final C79851ai f217332c;

    /* renamed from: d */
    private final C91142g f217333d;

    public C79030m(C76095a aVar, C79851ai aiVar, ab abVar, C91142g gVar) {
        this.f217331b = aVar;
        this.f217332c = aiVar;
        this.f217330a = abVar;
        this.f217333d = gVar;
    }

    /* renamed from: a */
    public final C79029l mo73787a(C80413ae aeVar, List list, C83320io ioVar, Locale locale) {
        C79850ah c = this.f217332c.mo74252c(33, ioVar);
        try {
            boolean j = this.f217333d.mo85405j(C90126fx.f251540kj);
            C80433m mVar = (C80433m) C80434n.f220756h.createBuilder();
            C80438r rVar = C80438r.NGA_PRESIGNALS;
            mVar.copyOnWrite();
            C80434n nVar = (C80434n) mVar.instance;
            nVar.f220763f = rVar.f220782f;
            nVar.f220758a |= 32;
            mVar.copyOnWrite();
            C80434n nVar2 = (C80434n) mVar.instance;
            aeVar.getClass();
            nVar2.f220759b = aeVar;
            nVar2.f220758a |= 1;
            C80431k kVar = (C80431k) C80432l.f220749e.createBuilder();
            kVar.mo74327a(list);
            mVar.copyOnWrite();
            C80434n nVar3 = (C80434n) mVar.instance;
            C80432l lVar = (C80432l) kVar.build();
            lVar.getClass();
            nVar3.f220761d = lVar;
            nVar3.f220758a |= 4;
            mVar.copyOnWrite();
            C80434n nVar4 = (C80434n) mVar.instance;
            ioVar.getClass();
            nVar4.f220764g = ioVar;
            nVar4.f220758a |= 64;
            String languageTag = locale.toLanguageTag();
            mVar.copyOnWrite();
            C80434n nVar5 = (C80434n) mVar.instance;
            languageTag.getClass();
            nVar5.f220758a |= 2;
            nVar5.f220760c = languageTag;
            mVar.copyOnWrite();
            C80434n nVar6 = (C80434n) mVar.instance;
            nVar6.f220758a |= 8;
            nVar6.f220762e = j;
            C80436p a = this.f217331b.mo72046a((C80434n) mVar.build());
            if (a != null) {
                C80442v vVar = a.f220772e;
                if (vVar == null) {
                    vVar = C80442v.f220789e;
                }
                double d = vVar.f220793c;
                C80442v vVar2 = a.f220772e;
                if (vVar2 == null) {
                    vVar2 = C80442v.f220789e;
                }
                C80441u a2 = C80441u.m128163a(vVar2.f220794d);
                if (a2 == null) {
                    a2 = C80441u.NOT_SET;
                }
                C79019b bVar = new C79019b(d, a2);
                if (c != null) {
                    c.mo74255b();
                }
                return bVar;
            }
            C79019b bVar2 = new C79019b(C59203do.f157270a, C80441u.NOT_SET);
            if (c != null) {
                c.mo74255b();
            }
            return bVar2;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
