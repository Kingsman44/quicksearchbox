package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83321j;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.cz */
/* compiled from: PG */
public final class C79803cz implements C90991b {

    /* renamed from: a */
    private final C91142g f218792a;

    /* renamed from: b */
    private final C76092h f218793b;

    /* renamed from: c */
    private final C83321j f218794c;

    /* renamed from: d */
    private final C21370a f218795d;

    public C79803cz(C91142g gVar, C76092h hVar, C83321j jVar, C21370a aVar) {
        this.f218792a = gVar;
        this.f218793b = hVar;
        this.f218794c = jVar;
        this.f218795d = aVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C80484i iVar;
        C80484i iVar2;
        if (this.f218792a.mo85405j(C90126fx.f251680nQ)) {
            fVar.mo85278b("NGA issue").mo85276a(C90752i.m148228b(true));
        }
        fVar.mo85278b("submitter-locale-code").mo85276a(C90752i.m148229c(this.f218793b.mo72021b().mo72039e().toLanguageTag()));
        Optional d = this.f218793b.mo72021b().mo72038d();
        if (this.f218792a.mo85405j(C90014bt.f247412gf) && d.isPresent()) {
            C58485gu a = this.f218794c.mo75541a(false);
            C58528ij ijVar = C79802cy.f218791a;
            C91006f e = fVar.mo85281e((Object) null);
            String str = (String) d.get();
            C58485gu guVar = (C58485gu) Collection.EL.stream(((C58495hd) Collection.EL.stream(a).filter(C79788ck.f218770a).collect(C58370cn.m89403c(C79789cl.f218771a, Function.CC.identity(), C79790cm.f218772a))).values()).filter(C79791cn.f218773a).filter(new C79792co(this.f218795d.mo26870b() - TimeUnit.MINUTES.toMillis(this.f218792a.mo85399d(C90014bt.f247564jY)))).sorted(Comparator.EL.reversed(Comparator.CC.comparingLong(C79793cp.f218775a))).limit(this.f218792a.mo85399d(C90014bt.f247404gX)).collect(C58370cn.f155946a);
            C58528ij ijVar2 = (C58528ij) Collection.EL.stream(a).filter(C79794cq.f218776a).filter(C79795cr.f218777a).map(C79796cs.f218778a).collect(C58370cn.f155947b);
            e.mo85291r("Sherlog links for recent NGA queries");
            e.mo85278b("released sherlog logs").mo85276a(C90752i.m148233g(new Uri.Builder().scheme("http").authority("go").appendPath("assistant-sherlog-link").appendQueryParameter("account", str).build().toString()));
            e.mo85278b("client sync: zerostate").mo85276a(C90752i.m148233g(C79801cx.ZEROSTATE.mo74235a(str, Optional.empty())));
            int size = guVar.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C82889ee eeVar = (C82889ee) guVar.get(i2);
                C82885ea eaVar = eeVar.f226099d;
                if (eaVar == null) {
                    eaVar = C82885ea.f225977c;
                }
                if (eaVar.f225979a == 1) {
                    iVar = (C80484i) eaVar.f225980b;
                } else {
                    iVar = C80484i.f220937h;
                }
                String str2 = iVar.f220939a;
                if (!str2.isEmpty()) {
                    int i3 = i + 1;
                    String format = String.format(Locale.ENGLISH, "query[%d] ", new Object[]{Integer.valueOf(i)});
                    e.mo85278b(String.valueOf(format).concat("text")).mo85276a(C90752i.m148233g(str2));
                    C82885ea eaVar2 = eeVar.f226099d;
                    if (eaVar2 == null) {
                        eaVar2 = C82885ea.f225977c;
                    }
                    if (eaVar2.f225979a == 1) {
                        iVar2 = (C80484i) eaVar2.f225980b;
                    } else {
                        iVar2 = C80484i.f220937h;
                    }
                    C80478c a2 = C80478c.m128173a(iVar2.f220944f);
                    if (a2 == null) {
                        a2 = C80478c.UNRECOGNIZED;
                    }
                    if (a2 == C80478c.S3 || a2 == C80478c.SODA) {
                        e.mo85278b(String.valueOf(format).concat("S3 sherlog")).mo85276a(C90752i.m148233g(a2 == C80478c.S3 ? C79801cx.S3.mo74235a(str, Optional.m71637of(str2)) : "on-device asr"));
                        C83320io ioVar = eeVar.f226102g;
                        if (ioVar == null) {
                            ioVar = C83320io.f227132d;
                        }
                        e.mo85278b(String.valueOf(format).concat("assistant server sherlog")).mo85276a(C90752i.m148233g(ijVar2.contains(ioVar.f227136c) ? C79801cx.ASSISTANT_SERVER.mo74235a(str, Optional.m71637of(str2)) : "on-device execution"));
                    }
                    i = i3;
                }
            }
            if (Collection.EL.stream(guVar).map(C79797ct.f218779a).filter(C79798cu.f218780a).anyMatch(C79799cv.f218781a)) {
                e.mo85278b("assistant voiceless query").mo85276a(C90752i.m148233g(C79801cx.TEXT.mo74235a(str, Optional.empty())));
            }
            if (Collection.EL.stream(guVar).anyMatch(C79800cw.f218782a)) {
                e.mo85278b("empty query").mo85276a(C90752i.m148233g(C79801cx.EMPTY.mo74235a(str, Optional.empty())));
            }
        }
    }
}
