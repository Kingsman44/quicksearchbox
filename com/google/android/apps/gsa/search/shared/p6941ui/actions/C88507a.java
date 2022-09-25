package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.content.Intent;
import android.provider.ContactsContract;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55421x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.a */
/* compiled from: PG */
public abstract class C88507a {

    /* renamed from: d */
    private static final C59071e f239224d = C59071e.m91332i("com.google.android.apps.gsa.search.shared.ui.actions.a");

    /* renamed from: a */
    public final C88512f f239225a;

    /* renamed from: b */
    public VoiceAction f239226b;

    /* renamed from: c */
    public C88509c f239227c;

    /* renamed from: e */
    private final String f239228e;

    /* renamed from: f */
    private final int f239229f;

    /* renamed from: g */
    private final C58833ax f239230g;

    public C88507a(C88512f fVar, String str) {
        this(fVar, str, 1, C58836b.f156633a);
    }

    public C88507a(C88512f fVar, String str, int i, C58833ax axVar) {
        this.f239225a = fVar;
        this.f239228e = str;
        this.f239229f = i;
        this.f239230g = axVar;
    }

    /* renamed from: A */
    public boolean mo82036A() {
        if (!this.f239226b.mo81079r()) {
            return true;
        }
        if (this.f239226b.mo81077p() || mo82039ao().f236254h) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public void mo82037B() {
        if (this.f239226b.mo81133M()) {
            this.f239225a.mo82091R(this.f239226b);
            mo82058u();
            mo82052o(1);
            return;
        }
        mo82045h();
    }

    /* renamed from: C */
    public final void mo82038C(int i, C87423k kVar) {
        this.f239225a.mo82106n(i, 3, kVar);
    }

    /* renamed from: ao */
    public final CardDecision mo82039ao() {
        return this.f239225a.mo82089P();
    }

    /* renamed from: ap */
    public final C91189au mo82040ap() {
        return this.f239225a.mo82094b();
    }

    /* renamed from: aq */
    public final C91097g mo82041aq() {
        return this.f239225a.mo82095c();
    }

    /* renamed from: e */
    public final C55421x mo82042e() {
        return this.f239225a.mo82096d();
    }

    /* renamed from: g */
    public void mo82044g(C88509c cVar) {
        C59071e eVar = f239224d;
        C59052c cVar2 = (C59052c) eVar.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, this.f239228e);
        ((C59052c) cVar2.mo56372aa(9783)).mo56386p("#attach");
        this.f239227c = cVar;
        if (this.f239226b.mo81081t()) {
            this.f239225a.mo82099g(this.f239226b);
        }
        if (this.f239226b.mo81065f() == null) {
            C59052c cVar3 = (C59052c) eVar.mo56226d();
            cVar3.mo56378ag(C58975e.f156826a, this.f239228e);
            ((C59052c) cVar3.mo56372aa(9784)).mo56386p("MatchingProviderInfo is null");
            int i = C90755l.f253831a;
        }
        mo82048k();
    }

    /* renamed from: h */
    public final void mo82045h() {
        if (this.f239226b.mo81051A() || this.f239226b.mo81083v()) {
            mo82052o(2);
            this.f239225a.mo82101i(this.f239226b);
            mo82058u();
            return;
        }
        mo82052o(3);
    }

    /* renamed from: i */
    public final void mo82046i() {
        mo82047j();
        this.f239225a.mo82098f(this.f239226b);
    }

    /* renamed from: j */
    public final void mo82047j() {
        if (mo82058u()) {
            this.f239225a.mo82102j(this.f239226b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo82048k();

    /* renamed from: l */
    public void mo82049l(VoiceAction voiceAction) {
        mo82057t();
    }

    /* renamed from: m */
    public final void mo82050m(int i, int i2) {
        this.f239225a.mo82105m(i, i2);
    }

    /* renamed from: n */
    public final void mo82051n() {
        mo82050m(1, 3);
        mo82041aq().mo65090b(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), new VoiceActionResultCallback(1, this.f239230g));
    }

    /* renamed from: o */
    public final void mo82052o(int i) {
        this.f239225a.mo82109q(this.f239226b, i, true);
    }

    /* renamed from: p */
    public final void mo82053p(C87423k kVar) {
        this.f239225a.mo82113u(kVar);
    }

    /* renamed from: q */
    public void mo82054q(VoiceAction voiceAction) {
        this.f239226b = voiceAction;
    }

    /* renamed from: r */
    public final void mo82055r() {
        if (!this.f239225a.mo82088O(this.f239226b) && mo82060w()) {
            mo82057t();
            this.f239225a.mo82100h(true, this.f239226b);
        }
    }

    /* renamed from: s */
    public void mo82056s() {
        mo82055r();
    }

    /* renamed from: t */
    public void mo82057t() {
        if (mo82060w()) {
            mo82048k();
        }
    }

    /* renamed from: u */
    public boolean mo82058u() {
        return this.f239225a.mo82077D();
    }

    /* renamed from: v */
    public boolean mo82059v(C87423k kVar) {
        return false;
    }

    /* renamed from: w */
    public final boolean mo82060w() {
        return this.f239227c != null;
    }

    /* renamed from: x */
    public final boolean mo82061x() {
        return this.f239229f == 2;
    }

    /* renamed from: y */
    public final boolean mo82062y() {
        return this.f239225a.mo82083J();
    }

    /* renamed from: z */
    public final boolean mo82063z() {
        return this.f239225a.mo82084K();
    }

    /* renamed from: f */
    public final List mo82043f() {
        if (!mo82060w()) {
            return new ArrayList();
        }
        C88509c cVar = this.f239227c;
        cVar.getClass();
        return cVar.mo82064b();
    }
}
