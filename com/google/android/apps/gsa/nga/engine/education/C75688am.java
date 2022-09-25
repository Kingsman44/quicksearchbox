package com.google.android.apps.gsa.nga.engine.education;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.android.apps.gsa.nga.engine.education.p6017b.C75706ac;
import com.google.android.apps.gsa.nga.engine.education.p6017b.C75721g;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74818bc;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80574h;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80575i;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80576j;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80667aw;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80719cu;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80721cw;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3775ac.p3779d.C48461a;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import dagger.C68214a;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.am */
/* compiled from: PG */
public final class C75688am {

    /* renamed from: a */
    public static final C58974d f210098a = C58974d.m91136j();

    /* renamed from: b */
    public static final C58528ij f210099b = C58528ij.m90012L(e.a, e.h, e.f);

    /* renamed from: c */
    public final C60950i f210100c;

    /* renamed from: d */
    public final C75743bc f210101d;

    /* renamed from: e */
    public final Optional f210102e;

    /* renamed from: f */
    public final C79863k f210103f;

    /* renamed from: g */
    public final C75706ac f210104g;

    /* renamed from: h */
    public final C68214a f210105h;

    /* renamed from: i */
    public final C91142g f210106i;

    /* renamed from: j */
    public final C68214a f210107j;

    /* renamed from: k */
    public final C81315k f210108k;

    /* renamed from: l */
    public final C74818bc f210109l;

    /* renamed from: m */
    public final C68214a f210110m;

    /* renamed from: n */
    public final C68214a f210111n;

    /* renamed from: o */
    public final C68214a f210112o;

    /* renamed from: p */
    public final C68214a f210113p;

    /* renamed from: q */
    public final C75751f f210114q;

    /* renamed from: r */
    public final AtomicReference f210115r = new AtomicReference(Optional.empty());

    /* renamed from: s */
    public final C83305i f210116s;

    /* renamed from: t */
    private final Context f210117t;

    /* renamed from: u */
    private final C75721g f210118u;

    public C75688am(Context context, C60950i iVar, C75743bc bcVar, Optional optional, C79863k kVar, C75706ac acVar, C68214a aVar, C81315k kVar2, C91142g gVar, C68214a aVar2, C74818bc bcVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C75751f fVar, C75721g gVar2, C83305i iVar2) {
        this.f210117t = context;
        this.f210100c = iVar;
        this.f210101d = bcVar;
        this.f210102e = optional;
        this.f210103f = kVar;
        this.f210104g = acVar;
        this.f210105h = aVar;
        this.f210108k = kVar2;
        this.f210106i = gVar;
        this.f210107j = aVar2;
        this.f210109l = bcVar2;
        this.f210110m = aVar3;
        this.f210111n = aVar4;
        this.f210112o = aVar5;
        this.f210113p = aVar6;
        this.f210114q = fVar;
        this.f210118u = gVar2;
        this.f210116s = iVar2;
    }

    /* renamed from: a */
    public final C75687al mo71825a(Locale locale, C75650ai aiVar, C48468h hVar) {
        C75684ai aiVar2;
        C48468h hVar2 = C48468h.UNKNOWN_MODE;
        C75746c cVar = C75746c.OTHER;
        int b = aiVar.mo71799c().mo71780b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            String c = aiVar.mo71799c().mo71796c();
            Optional map = aiVar.mo71808m(locale).map(new C75972r(hVar));
            if (aiVar.mo71797a().mo71795b()) {
                aiVar2 = new C75684ai(true, Optional.m71637of((String) aiVar.mo71797a().mo71794a().orElse(this.f210106i.mo85403h(C90040cs.f248660a))));
            } else {
                aiVar2 = new C75684ai(false, Optional.empty());
            }
            return new C75687al(c, map, aiVar2);
        } else if (i == 1) {
            String string = ((C81515c) this.f210111n.mo27525b()).mo75121a(locale).getString(aiVar.mo71799c().mo71779a(), new Object[0]);
            Optional m = aiVar.mo71808m(locale);
            C48461a aVar = (C48461a) C48462b.f125188k.createBuilder();
            aVar.copyOnWrite();
            C48462b bVar = (C48462b) aVar.instance;
            string.getClass();
            bVar.f125191a = 1 | bVar.f125191a;
            bVar.f125192b = string;
            aVar.copyOnWrite();
            C48462b bVar2 = (C48462b) aVar.instance;
            bVar2.f125194d = 5;
            bVar2.f125191a |= 4;
            String languageTag = locale.toLanguageTag();
            aVar.copyOnWrite();
            C48462b bVar3 = (C48462b) aVar.instance;
            languageTag.getClass();
            bVar3.f125191a |= 32;
            bVar3.f125196f = languageTag;
            aVar.copyOnWrite();
            C48462b bVar4 = (C48462b) aVar.instance;
            bVar4.f125199i = hVar.f125214h;
            bVar4.f125191a |= 64;
            return new C75687al(string, Optional.m71637of((C48462b) m.orElse((C48462b) aVar.build())), new C75684ai(false, Optional.empty()));
        } else {
            throw new AssertionError("Unknown suggestion type.");
        }
    }

    /* renamed from: b */
    public final C80587u mo71826b() {
        long d = this.f210106i.mo85399d(C90037cp.f248594dl);
        if (d == 1) {
            return C80587u.CLICK_SUGGESTION_TEXT_SECOND_LINE_ONLY;
        }
        if (d == 2) {
            return C80587u.CLICK_DISABLED;
        }
        return C80587u.CLICK_WHOLE_PLATE;
    }

    /* renamed from: c */
    public final C80719cu mo71827c(Locale locale, Optional optional) {
        C80574h hVar = (C80574h) C80576j.f221168d.createBuilder();
        hVar.copyOnWrite();
        ((C80576j) hVar.instance).f221172c = C80575i.m128207a(3);
        String uri = new Intent("android.intent.action.VIEW", Uri.parse((String) optional.orElse(this.f210106i.mo85403h(C90040cs.f248660a)))).toUri(0);
        hVar.copyOnWrite();
        uri.getClass();
        ((C80576j) hVar.instance).f221170a = uri;
        C80576j jVar = (C80576j) hVar.build();
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        kVar.copyOnWrite();
        C80578l lVar = (C80578l) kVar.instance;
        jVar.getClass();
        lVar.f221176b = jVar;
        lVar.f221175a = 3;
        Optional of = Optional.m71637of((C80578l) kVar.build());
        C80667aw awVar = new C80667aw();
        awVar.mo74510c(((C81515c) this.f210111n.mo27525b()).mo75121a(locale).getString(R.string.nga_quick_actions_app_suggestion_disclosure_text_full_line, new Object[]{((C81515c) this.f210111n.mo27525b()).mo75121a(locale).getString(R.string.nga_quick_actions_app_suggestion_disclosure_text, new Object[0]), ((C81515c) this.f210111n.mo27525b()).mo75121a(locale).getString(R.string.nga_quick_actions_app_suggestion_info_icon, new Object[0])}));
        awVar.mo74509b(of);
        return awVar.mo74508a();
    }

    /* renamed from: d */
    public final C80721cw mo71828d() {
        long d = this.f210106i.mo85399d(C90037cp.f248591di);
        if (d == 1) {
            return C80721cw.GLOW;
        }
        if (d == 2) {
            return C80721cw.DOTS;
        }
        if (d == 3) {
            return C80721cw.FACEONLY;
        }
        return C80721cw.MOLECULE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo71829e(java.util.Locale r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.nga.engine.education.b.ac r0 = r6.f210104g
            com.google.assistant.ac.d.h r0 = r0.mo71854b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo71833i(r0)
            com.google.assistant.ac.d.h r1 = com.google.assistant.p3775ac.p3779d.C48468h.UNKNOWN_MODE
            if (r0 == r1) goto L_0x00a4
            com.google.android.apps.gsa.nga.engine.education.b.ac r1 = r6.f210104g
            dagger.a r2 = r1.f210152c
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.nga.engine.education.a.y r2 = (com.google.android.apps.gsa.nga.engine.education.p6016a.C75674y) r2
            r3 = 1
            com.google.android.apps.gsa.nga.engine.education.a.af[] r3 = new com.google.android.apps.gsa.nga.engine.education.p6016a.C75647af[r3]
            r4 = 0
            com.google.android.apps.gsa.nga.engine.education.a.af r5 = com.google.android.apps.gsa.nga.engine.education.p6016a.C75647af.HOME_SCREEN
            r3[r4] = r5
            com.google.common.b.gu r2 = r2.mo71819d(r7, r3)
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.nga.engine.education.b.ab r4 = new com.google.android.apps.gsa.nga.engine.education.b.ab
            r4.<init>(r1)
            j$.util.stream.Stream r3 = r3.filter(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r3 = r3.collect(r4)
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
            r3.size()
            r2.size()
            com.google.android.apps.gsa.shared.util.v.g r4 = r1.f210154e
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251181dv
            boolean r4 = r4.mo85405j(r5)
            if (r4 == 0) goto L_0x0068
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0068
            com.google.android.apps.gsa.nga.shared.h.k r1 = r1.f210153d
            com.google.common.util.concurrent.cx r1 = r1.mo74872T()
            com.google.android.apps.gsa.nga.engine.education.b.aa r3 = com.google.android.apps.gsa.nga.engine.education.p6017b.C75704aa.f210148a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r1, r3)
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r2)
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r2)
            r3 = r1
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
        L_0x0068:
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r3)
            j$.util.Optional r1 = r1.findFirst()
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x0093
            com.google.android.apps.gsa.nga.engine.x.k r2 = r6.f210103f
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SELECTED_MODE_SUGGESTION_FETCH_SUCCESS
            r2.mo74271b(r3)
            com.google.android.apps.gsa.nga.shared.h.k r2 = r6.f210108k
            java.lang.Object r3 = r1.get()
            com.google.android.apps.gsa.nga.engine.education.a.ai r3 = (com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai) r3
            java.lang.String r3 = r3.mo71806j()
            com.google.common.util.concurrent.cx r2 = r2.mo74910z(r3)
            com.google.android.apps.gsa.nga.engine.education.p r3 = com.google.android.apps.gsa.nga.engine.education.C75761p.f210249a
            com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at.m128763g(r2, r3)
            goto L_0x009a
        L_0x0093:
            com.google.android.apps.gsa.nga.engine.x.k r2 = r6.f210103f
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SELECTED_MODE_SUGGESTION_FETCH_FAILED
            r2.mo74271b(r3)
        L_0x009a:
            com.google.android.apps.gsa.nga.engine.education.q r2 = new com.google.android.apps.gsa.nga.engine.education.q
            r2.<init>(r6, r7, r0)
            j$.util.Optional r7 = r1.map(r2)
            return r7
        L_0x00a4:
            com.google.android.apps.gsa.nga.engine.x.k r7 = r6.f210103f
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SELECTED_MODE_SUGGESTION_FETCH_FAILED
            r7.mo74271b(r0)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.C75688am.mo71829e(java.util.Locale):j$.util.Optional");
    }

    /* renamed from: f */
    public final Optional mo71830f(Optional optional, C48468h hVar, Locale locale) {
        Optional empty = Optional.empty();
        if (hVar != C48468h.UNKNOWN_MODE) {
            empty = optional.map(new C75975u(this, locale, hVar));
        }
        if (!empty.isEmpty() || !this.f210106i.mo85405j(C90126fx.f251206eT)) {
            return empty;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f210103f.mo74271b(C89849ae.FRE_OVERAPP_MODE_SUGGESTION_FETCH_FAILED_SHOW_FALLBACK);
        return mo71829e(locale);
    }

    /* renamed from: g */
    public final Optional mo71831g(e eVar) {
        if (eVar.equals(e.aw) || eVar.equals(e.bi) || eVar.equals(e.bb)) {
            return (Optional) this.f210115r.getAndSet(Optional.empty());
        }
        this.f210115r.set(Optional.empty());
        return Optional.empty();
    }

    /* renamed from: h */
    public final Optional mo71832h() {
        return ((C80987g) this.f210107j.mo27525b()).mo74767d();
    }

    /* renamed from: i */
    public final void mo71833i(C48468h hVar) {
        C48468h hVar2 = C48468h.UNKNOWN_MODE;
        C75746c cVar = C75746c.OTHER;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            this.f210103f.mo74271b(C89849ae.FRE_UNKNOWN_DISPLAY_MODE_SELECTED);
        } else if (ordinal == 1) {
            this.f210103f.mo74271b(C89849ae.FRE_NEW_USER_DISPLAY_MODE_SELECTED);
        } else if (ordinal == 2) {
            this.f210103f.mo74271b(C89849ae.FRE_ACTIVATED_USER_MODE_SELECTED);
        } else if (ordinal == 3) {
            this.f210103f.mo74271b(C89849ae.FRE_OVERAPP_DISPLAY_MODE_SELECTED);
        }
    }

    /* renamed from: j */
    public final void mo71834j(Optional optional, Optional optional2, Locale locale) {
        optional.ifPresent(new C75978x(this, locale, optional2));
    }

    /* renamed from: k */
    public final boolean mo71835k(String str) {
        if (((C75050a) this.f210105h.mo27525b()).mo71417a().mo71458b().a()) {
            return false;
        }
        this.f210115r.set(Optional.m71637of(new C75687al(str, Optional.empty(), new C75684ai(false, Optional.empty()))));
        return true;
    }

    /* renamed from: l */
    public final boolean mo71836l(C48468h hVar) {
        if (!this.f210106i.mo85405j(C90040cs.f248650Q) || hVar == C48468h.NEW_USER_INPUT_PLATE || hVar == C48468h.UNKNOWN_MODE) {
            return false;
        }
        C75706ac acVar = this.f210104g;
        acVar.f210153d.mo74895k();
        return ((long) acVar.f210156g.mo71866a()) < acVar.f210154e.mo85399d(C90126fx.f251068bo);
    }

    /* renamed from: m */
    public final boolean mo71837m() {
        if (this.f210106i.mo85405j(C90040cs.f248657X) && this.f210117t.getResources().getConfiguration().orientation != 2) {
            if (this.f210106i.mo85405j(C90040cs.f248656W)) {
                return this.f210118u.mo71867b();
            }
            if (((long) this.f210108k.mo74896l()) < this.f210106i.mo85399d(C90040cs.f248658Y)) {
                return true;
            }
        }
        return false;
    }
}
