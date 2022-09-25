package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75647af;
import com.google.android.apps.gsa.nga.engine.education.p6016a.C75674y;
import com.google.android.apps.gsa.nga.engine.education.pie.C75908i;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.assistant.p3781ad.p3789d.p3791b.C48725g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48726h;
import com.google.assistant.p3781ad.p3789d.p3791b.C48727i;
import com.google.assistant.p3781ad.p3789d.p3791b.C48728j;
import com.google.assistant.p3781ad.p3789d.p3791b.C48729k;
import com.google.assistant.p3781ad.p3789d.p3791b.C48730l;
import com.google.assistant.p3781ad.p3789d.p3791b.C48732n;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import dagger.C68214a;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.ac */
/* compiled from: PG */
public final class C75706ac implements C75908i {

    /* renamed from: a */
    public static final C58974d f210150a = C58974d.m91136j();

    /* renamed from: b */
    public final C60950i f210151b;

    /* renamed from: c */
    public final C68214a f210152c;

    /* renamed from: d */
    public final C81315k f210153d;

    /* renamed from: e */
    public final C91142g f210154e;

    /* renamed from: f */
    public final C81515c f210155f;

    /* renamed from: g */
    public final C75721g f210156g;

    /* renamed from: h */
    public final Random f210157h = new Random();

    /* renamed from: i */
    private final boolean f210158i;

    /* renamed from: j */
    private final C76092h f210159j;

    public C75706ac(C60950i iVar, C68214a aVar, C81315k kVar, C91142g gVar, boolean z, C81515c cVar, C75721g gVar2, C76092h hVar) {
        this.f210151b = iVar;
        this.f210152c = aVar;
        this.f210153d = kVar;
        this.f210154e = gVar;
        this.f210155f = cVar;
        this.f210158i = z;
        this.f210156g = gVar2;
        this.f210159j = hVar;
    }

    /* renamed from: f */
    public static C48730l m122021f(String str, String str2, Locale locale) {
        C48727i iVar = (C48727i) C48730l.f126093h.createBuilder();
        iVar.copyOnWrite();
        C48730l lVar = (C48730l) iVar.instance;
        lVar.f126096b = 1;
        lVar.f126095a |= 1;
        iVar.copyOnWrite();
        C48730l lVar2 = (C48730l) iVar.instance;
        str.getClass();
        lVar2.f126095a |= 2;
        lVar2.f126097c = str;
        iVar.copyOnWrite();
        C48730l lVar3 = (C48730l) iVar.instance;
        str2.getClass();
        lVar3.f126095a |= 4;
        lVar3.f126098d = str2;
        C48728j jVar = (C48728j) C48729k.f126088d.createBuilder();
        String language = locale.getLanguage();
        jVar.copyOnWrite();
        C48729k kVar = (C48729k) jVar.instance;
        language.getClass();
        kVar.f126090a |= 1;
        kVar.f126091b = language;
        String country = locale.getCountry();
        jVar.copyOnWrite();
        C48729k kVar2 = (C48729k) jVar.instance;
        country.getClass();
        kVar2.f126090a |= 2;
        kVar2.f126092c = country;
        iVar.copyOnWrite();
        C48730l lVar4 = (C48730l) iVar.instance;
        C48729k kVar3 = (C48729k) jVar.build();
        kVar3.getClass();
        lVar4.f126099e = kVar3;
        lVar4.f126095a |= 8;
        C48725g gVar = (C48725g) C48726h.f126084c.createBuilder();
        gVar.copyOnWrite();
        C48726h hVar = (C48726h) gVar.instance;
        hVar.f126086a |= 1;
        hVar.f126087b = true;
        C48726h hVar2 = (C48726h) gVar.build();
        iVar.copyOnWrite();
        C48730l lVar5 = (C48730l) iVar.instance;
        hVar2.getClass();
        lVar5.f126100f = hVar2;
        lVar5.f126095a |= 16;
        return (C48730l) iVar.build();
    }

    /* renamed from: l */
    private final long m122022l() {
        return this.f210154e.mo85399d(C90126fx.f251796v);
    }

    /* renamed from: m */
    private final C48468h m122023m() {
        long millis = Duration.ofDays(this.f210154e.mo85399d(C90126fx.f251069bp)).toMillis();
        if (millis > 0) {
            C58485gu r = this.f210153d.mo74902r();
            if (r.isEmpty()) {
                return C48468h.NEW_USER_INPUT_PLATE;
            }
            if (Duration.between((Instant) r.get(r.size() - 1), this.f210151b.mo57444a()).toMillis() > millis) {
                return C48468h.ACTIVATED_USER_INPUT_PLATE;
            }
        }
        long d = this.f210154e.mo85399d(C90126fx.f251070bq);
        int f = this.f210153d.mo74890f();
        if (d <= 0 || ((long) f) < d - 1) {
            return C48468h.UNKNOWN_MODE;
        }
        return C48468h.ACTIVATED_USER_INPUT_PLATE;
    }

    /* renamed from: a */
    public final C48468h mo71853a() {
        if (!this.f210159j.mo72021b().mo72035a().mo71524d()) {
            return C48468h.UNKNOWN_MODE;
        }
        if (this.f210158i) {
            return C48468h.UNKNOWN_MODE;
        }
        if (!this.f210156g.mo71867b()) {
            return C48468h.HANDS_FREE_SUGGESTION;
        }
        this.f210153d.mo74895k();
        return C48468h.NEW_USER_INPUT_PLATE;
    }

    /* renamed from: b */
    public final C48468h mo71854b() {
        if (!this.f210154e.mo85405j(C90126fx.f251179dt)) {
            return C48468h.UNKNOWN_MODE;
        }
        if (this.f210158i) {
            return C48468h.UNKNOWN_MODE;
        }
        if (!this.f210156g.mo71867b()) {
            return m122023m();
        }
        this.f210153d.mo74895k();
        return C48468h.NEW_USER_INPUT_PLATE;
    }

    /* renamed from: c */
    public final C48468h mo71855c(Locale locale, Optional optional) {
        if (!this.f210154e.mo85405j(C90126fx.f251178ds)) {
            return C48468h.UNKNOWN_MODE;
        }
        if (this.f210158i) {
            return C48468h.UNKNOWN_MODE;
        }
        if (((long) this.f210153d.mo74888d((String) optional.orElse("CURRENT_APPLICATION_UNKNOWN"))) < this.f210154e.mo85399d(C90126fx.f251067bn)) {
            return C48468h.OVERAPP_SUGGESTION_INPUT_PLATE;
        }
        if (!this.f210154e.mo85405j(C90126fx.f251033bF) || !this.f210154e.mo85405j(C90126fx.f251034bG) || !mo71860i((String) optional.orElse("CURRENT_APPLICATION_UNKNOWN"), locale)) {
            return C48468h.UNKNOWN_MODE;
        }
        return C48468h.OVERAPP_SUGGESTION_INPUT_PLATE;
    }

    /* renamed from: d */
    public final C48468h mo71856d() {
        if (!this.f210154e.mo85405j(C90040cs.f248637D)) {
            return C48468h.UNKNOWN_MODE;
        }
        if (this.f210158i) {
            return C48468h.UNKNOWN_MODE;
        }
        if (!this.f210156g.mo71867b()) {
            return m122023m();
        }
        this.f210153d.mo74895k();
        return C48468h.NEW_USER_INPUT_PLATE;
    }

    /* renamed from: e */
    public final C48468h mo71857e() {
        if (!this.f210154e.mo85405j(C90053de.f248974g)) {
            return C48468h.UNKNOWN_MODE;
        }
        if (this.f210158i) {
            return C48468h.UNKNOWN_MODE;
        }
        if (!this.f210156g.mo71867b()) {
            return m122023m();
        }
        this.f210153d.mo74895k();
        return C48468h.NEW_USER_INPUT_PLATE;
    }

    /* renamed from: g */
    public final C58485gu mo71858g(C48732n nVar, String str, boolean z) {
        return (C58485gu) Collection.EL.stream(nVar.f126104a).filter(new C75729o(z)).filter(new C75730p(this, m122022l(), str)).collect(C58370cn.f155946a);
    }

    /* renamed from: h */
    public final C58485gu mo71859h(Locale locale, Optional optional, boolean z) {
        Stream stream = Collection.EL.stream(((C75674y) this.f210152c.mo27525b()).mo71819d(locale, C75647af.IN_APP));
        if (z) {
            stream = stream.filter(new C75728n(this, optional));
        }
        if (optional.isEmpty()) {
            return (C58485gu) stream.filter(C75734t.f210206a).collect(C58370cn.f155946a);
        }
        return (C58485gu) stream.filter(new C75735u(optional)).collect(C58370cn.f155946a);
    }

    /* renamed from: i */
    public final boolean mo71860i(String str, Locale locale) {
        return Collection.EL.stream(((C75674y) this.f210152c.mo27525b()).mo71818a(m122021f(str, BuildConfig.FLAVOR, locale)).f126104a).anyMatch(new C75740z(this, m122022l(), str));
    }

    /* renamed from: j */
    public final boolean mo71861j(String str, long j, String str2) {
        return ((long) this.f210153d.mo74879a(str2, str)) >= j;
    }

    /* renamed from: k */
    public final List mo71862k(Locale locale) {
        C58528ij F = C58528ij.m90006F(this.f210153d.mo74899o());
        return (List) Collection.EL.stream(((C75674y) this.f210152c.mo27525b()).mo71819d(locale, C75647af.HOME_SCREEN)).filter(new C75732r(this, locale, F)).collect(C58370cn.f155946a);
    }
}
