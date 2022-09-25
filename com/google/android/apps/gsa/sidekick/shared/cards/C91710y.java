package com.google.android.apps.gsa.sidekick.shared.cards;

import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.plugins.p6468a.p6469a.C84055a;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88147qx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88148qy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88149qz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88151ra;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91670i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.y */
/* compiled from: PG */
public final class C91710y implements C91670i {

    /* renamed from: a */
    private static final C59071e f255797a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.cards.y");

    /* renamed from: b */
    private final C87680ah f255798b;

    /* renamed from: c */
    private final C91142g f255799c;

    /* renamed from: d */
    private final C84055a f255800d;

    /* renamed from: e */
    private boolean f255801e;

    /* renamed from: f */
    private boolean f255802f;

    /* renamed from: g */
    private boolean f255803g;

    public C91710y(C91142g gVar, C87680ah ahVar) {
        C84055a aVar = new C84055a(ahVar);
        aVar.f228945b = 3;
        this.f255800d = aVar;
        this.f255799c = gVar;
        this.f255798b = ahVar;
    }

    /* renamed from: a */
    public static String m150215a(String str, String str2, String str3) {
        return (String) C58557jl.m90130k(m150216g(str, str2, str3), (Object) null);
    }

    /* renamed from: g */
    private static C58485gu m150216g(String str, String str2, String str3) {
        return (TextUtils.isEmpty(str2) || !str2.startsWith(str)) ? C58485gu.m89845m() : (C58485gu) Collection.EL.stream(Uri.parse(str2).getQueryParameters(str3)).filter(C91708w.f255795a).collect(Collectors.collectingAndThen(Collectors.toList(), C91709x.f255796a));
    }

    /* renamed from: h */
    private final String m150217h(String str) {
        if (!this.f255799c.mo85405j(C90010bp.f246986bb) || str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public final void mo86093b() {
        if (this.f255802f && !this.f255803g) {
            this.f255803g = true;
            this.f255798b.mo81961c(new C88489j(C87739bu.PREPARE_CCT_SESSION).mo82013a());
        }
    }

    /* renamed from: c */
    public final void mo86094c() {
        this.f255802f = true;
    }

    /* renamed from: d */
    public final void mo86095d(String str) {
        Optional optional;
        String str2 = str;
        String a = m150215a("now-amp", str2, "amp_url");
        String h = m150217h(m150215a("now-amp", str2, "amp_cdn_url"));
        String a2 = m150215a("now-amp", str2, "amp_publisher_logo_url");
        C58485gu g = m150216g("now-amp", str2, "gau");
        C58485gu g2 = m150216g("now-amp", str2, "gcu");
        C58485gu g3 = m150216g("now-amp", str2, "glu");
        C58485gu g4 = m150216g("now-amp", str2, "is_stamp");
        int i = 0;
        boolean parseBoolean = g4.isEmpty() ? false : Boolean.parseBoolean((String) g4.get(0));
        C58485gu g5 = m150216g("now-amp", str2, "gidx");
        if (g5.isEmpty()) {
            optional = Optional.empty();
        } else {
            try {
                optional = Optional.m71637of(Integer.valueOf(Integer.parseInt((String) g5.get(0))));
            } catch (NumberFormatException unused) {
                ((C59052c) ((C59052c) f255797a.mo56226d()).mo56372aa(11864)).mo56389s("Non-integer value present for query param key: %s", "gidx");
                optional = Optional.empty();
            }
        }
        int intValue = ((Integer) optional.orElse(-1)).intValue();
        C59071e eVar = f255797a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(11865)).mo56386p("Opening AMP Url");
        if (TextUtils.isEmpty(a)) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(11866)).mo56386p("AMP url was empty");
        } else if (intValue < 0 || intValue >= g.size() || g.size() != g2.size()) {
            this.f255800d.mo77508a(a, h, a2, parseBoolean, (C88148qy) null);
        } else {
            C84055a aVar = this.f255800d;
            if (g.size() != g2.size()) {
                ((C59052c) ((C59052c) C84055a.f228944a.mo56226d()).mo56372aa(7006)).mo56386p("AMP url/cdn url count does not match, opening AMP by itself without extra viewer data.");
                aVar.mo77508a(a, h, a2, parseBoolean, (C88148qy) null);
                return;
            }
            int size = g3.size();
            int size2 = g.size();
            C88147qx qxVar = (C88147qx) C88148qy.f238276d.createBuilder();
            qxVar.copyOnWrite();
            C88148qy qyVar = (C88148qy) qxVar.instance;
            qyVar.f238278a |= 1;
            qyVar.f238279b = intValue;
            while (i < g.size()) {
                C88149qz qzVar = (C88149qz) C88151ra.f238286g.createBuilder();
                String str3 = (String) g.get(i);
                qzVar.copyOnWrite();
                C88151ra raVar = (C88151ra) qzVar.instance;
                str3.getClass();
                C58485gu guVar = g;
                raVar.f238288a |= 1;
                raVar.f238289b = str3;
                String str4 = (String) g2.get(i);
                qzVar.copyOnWrite();
                C88151ra raVar2 = (C88151ra) qzVar.instance;
                str4.getClass();
                raVar2.f238288a |= 2;
                raVar2.f238290c = str4;
                String str5 = size == size2 ? (String) g3.get(i) : BuildConfig.FLAVOR;
                qzVar.copyOnWrite();
                C88151ra raVar3 = (C88151ra) qzVar.instance;
                str5.getClass();
                raVar3.f238288a |= 4;
                raVar3.f238291d = str5;
                qxVar.mo81988a(qzVar);
                i++;
                g = guVar;
            }
            aVar.mo77508a(a, h, a2, parseBoolean, (C88148qy) qxVar.build());
        }
    }

    /* renamed from: e */
    public final void mo86096e() {
        this.f255801e = false;
        this.f255802f = false;
        if (this.f255803g) {
            this.f255803g = false;
        }
    }

    /* renamed from: f */
    public final void mo86097f(String str) {
        if (this.f255802f && !this.f255801e) {
            this.f255801e = true;
            String a = m150215a("now-amp", str, "amp_url");
            String h = m150217h(m150215a("now-amp", str, "amp_cdn_url"));
            if (TextUtils.isEmpty(a)) {
                a = m150215a("now-preload-amp", str, "amp_url");
            }
            if (TextUtils.isEmpty(h)) {
                h = m150217h(m150215a("now-preload-amp", str, "amp_cdn_url"));
            }
            if (a == null || TextUtils.isEmpty(a)) {
                ((C59052c) ((C59052c) f255797a.mo56226d()).mo56372aa(11868)).mo56389s("Invalid custom URI given: %s, ", str);
                int i = C90755l.f253831a;
                return;
            }
            this.f255800d.mo77509b(a, h);
        }
    }
}
