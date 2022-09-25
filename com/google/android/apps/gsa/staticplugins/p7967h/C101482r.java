package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92444a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92452i;
import com.google.android.apps.gsa.staticplugins.p7967h.p7968a.C101436a;
import com.google.android.apps.gsa.staticplugins.p7967h.p7968a.C101437b;
import com.google.common.base.C58833ax;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.r */
/* compiled from: PG */
final class C101482r implements C69464a {

    /* renamed from: a */
    final /* synthetic */ C92302a f283131a;

    /* renamed from: b */
    final /* synthetic */ C89994f f283132b;

    /* renamed from: c */
    final /* synthetic */ C101437b f283133c;

    /* renamed from: d */
    final /* synthetic */ boolean f283134d;

    /* renamed from: e */
    final /* synthetic */ C68214a f283135e;

    /* renamed from: f */
    final /* synthetic */ boolean f283136f;

    /* renamed from: g */
    final /* synthetic */ C101483s f283137g;

    /* renamed from: h */
    final /* synthetic */ C58009ae f283138h;

    public C101482r(C101483s sVar, C58009ae aeVar, C92302a aVar, C89994f fVar, C101437b bVar, boolean z, C68214a aVar2, boolean z2) {
        this.f283137g = sVar;
        this.f283138h = aeVar;
        this.f283131a = aVar;
        this.f283132b = fVar;
        this.f283133c = bVar;
        this.f283134d = z;
        this.f283135e = aVar2;
        this.f283136f = z2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        C58833ax axVar;
        C58833ax g = C83794j.m133431g(this.f283137g.f283161b);
        C58009ae aeVar = this.f283138h;
        C92444a aVar = new C92444a();
        aVar.mo87128d(this.f283131a);
        aVar.mo87130f(this.f283132b);
        C101437b bVar = this.f283133c;
        boolean z = this.f283137g.f283161b.f237144k;
        C74637ae aeVar2 = (C74637ae) bVar.f283012a.mo17428b();
        aeVar2.getClass();
        C85881bd bdVar = (C85881bd) bVar.f283013b.mo17428b();
        bdVar.getClass();
        aVar.f257822c = C58833ax.m90834k(new C101436a(z, g, aeVar2, bdVar));
        if (this.f283134d) {
            axVar = C58833ax.m90834k(this.f283132b.mo83863Z());
        } else {
            axVar = C58833ax.m90834k(((bm) this.f283135e.mo27525b()).b());
        }
        aVar.f257826g = axVar;
        aVar.f257828i = C58833ax.m90834k(Boolean.valueOf(this.f283136f));
        return aeVar.mo54597a(new C101481q(new C92452i(aVar.mo87125a())));
    }
}
