package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.C83908bn;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83826ag;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83827ah;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83828ai;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83829aj;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83831al;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83832am;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83843c;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83864x;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109805ay;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.apps.gsa.staticplugins.opaonboarding.p8654a.C115850g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.c */
/* compiled from: PG */
public abstract class C109856c extends C83907bm {

    /* renamed from: b */
    public static final C59071e f306094b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.c");

    /* renamed from: c */
    public C83893b f306095c;

    /* renamed from: d */
    public C58833ax f306096d;

    /* renamed from: e */
    public C22871g f306097e;

    /* renamed from: f */
    public C109805ay f306098f;

    /* renamed from: g */
    public C68214a f306099g;

    /* renamed from: h */
    public int f306100h = 1;

    /* renamed from: i */
    public C115850g f306101i;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C83864x mo98186e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C109778j mo98187g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo98205h(boolean z) {
        if (getActivity() == null) {
            ((C59052c) ((C59052c) f306094b.mo56226d()).mo56372aa(25285)).mo56386p("Fragment detached, opt-in not completed.");
        } else if (z) {
            this.f306100h = 2;
            mo77318iT().mo77312a();
        } else {
            mo98201i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo98201i();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C83864x e = mo98186e();
        Activity activity = getActivity();
        if (activity == null) {
            ((C59052c) ((C59052c) f306094b.mo56226d()).mo56372aa(25283)).mo56386p("Fragment detached, can't audit impression.");
            return;
        }
        C58833ax a = this.f306095c.mo77278a();
        if (!a.mo56113h()) {
            ((C59052c) ((C59052c) f306094b.mo56225c()).mo56372aa(25282)).mo56386p("no account present. skipping audit");
            return;
        }
        C83843c cVar = (C83843c) C83841av.f228478e.createBuilder();
        cVar.copyOnWrite();
        C83841av avVar = (C83841av) cVar.instance;
        e.getClass();
        avVar.f228483d = e;
        avVar.f228482c = 3;
        if (this.f306101i.mo102285c()) {
            C83828ai aiVar = (C83828ai) C83832am.f228459d.createBuilder();
            C83829aj ajVar = (C83829aj) C83831al.f228455c.createBuilder();
            C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
            C115850g gVar = this.f306101i;
            C58838bb.m90884s(gVar.mo102285c(), "Parent account name is not available outside parent-facing flows");
            String d = ((C83908bn) gVar.f321253a.mo56107c()).mo77323d();
            C58838bb.m90866a(d, "No parent account name");
            aeVar.copyOnWrite();
            C83825af afVar = (C83825af) aeVar.instance;
            afVar.f228449a |= 1;
            afVar.f228450b = d;
            ajVar.copyOnWrite();
            C83831al alVar = (C83831al) ajVar.instance;
            C83825af afVar2 = (C83825af) aeVar.build();
            afVar2.getClass();
            alVar.f228458b = afVar2;
            alVar.f228457a = 1;
            aiVar.copyOnWrite();
            C83832am amVar = (C83832am) aiVar.instance;
            C83831al alVar2 = (C83831al) ajVar.build();
            alVar2.getClass();
            amVar.f228462b = alVar2;
            amVar.f228461a |= 1;
            C83829aj ajVar2 = (C83829aj) C83831al.f228455c.createBuilder();
            C83826ag agVar = (C83826ag) C83827ah.f228451c.createBuilder();
            String a2 = this.f306101i.mo102283a();
            agVar.copyOnWrite();
            C83827ah ahVar = (C83827ah) agVar.instance;
            ahVar.f228453a = 1 | ahVar.f228453a;
            ahVar.f228454b = a2;
            ajVar2.copyOnWrite();
            C83831al alVar3 = (C83831al) ajVar2.instance;
            C83827ah ahVar2 = (C83827ah) agVar.build();
            ahVar2.getClass();
            alVar3.f228458b = ahVar2;
            alVar3.f228457a = 2;
            aiVar.copyOnWrite();
            C83832am amVar2 = (C83832am) aiVar.instance;
            C83831al alVar4 = (C83831al) ajVar2.build();
            alVar4.getClass();
            amVar2.f228463c = alVar4;
            amVar2.f228461a |= 2;
            cVar.copyOnWrite();
            C83841av avVar2 = (C83841av) cVar.instance;
            C83832am amVar3 = (C83832am) aiVar.build();
            amVar3.getClass();
            avVar2.f228481b = amVar3;
            avVar2.f228480a = 2;
        } else if (this.f306101i.mo102284b()) {
            C83828ai aiVar2 = (C83828ai) C83832am.f228459d.createBuilder();
            C83829aj ajVar3 = (C83829aj) C83831al.f228455c.createBuilder();
            C83826ag agVar2 = (C83826ag) C83827ah.f228451c.createBuilder();
            C115850g gVar2 = this.f306101i;
            C58838bb.m90884s(gVar2.mo102284b(), "Parent user ID is not available outside child-facing flows");
            String e2 = ((C83908bn) gVar2.f321253a.mo56107c()).mo77324e();
            C58838bb.m90866a(e2, "No parent user ID");
            agVar2.copyOnWrite();
            C83827ah ahVar3 = (C83827ah) agVar2.instance;
            ahVar3.f228453a |= 1;
            ahVar3.f228454b = e2;
            ajVar3.copyOnWrite();
            C83831al alVar5 = (C83831al) ajVar3.instance;
            C83827ah ahVar4 = (C83827ah) agVar2.build();
            ahVar4.getClass();
            alVar5.f228458b = ahVar4;
            alVar5.f228457a = 2;
            aiVar2.copyOnWrite();
            C83832am amVar4 = (C83832am) aiVar2.instance;
            C83831al alVar6 = (C83831al) ajVar3.build();
            alVar6.getClass();
            amVar4.f228462b = alVar6;
            amVar4.f228461a |= 1;
            C83829aj ajVar4 = (C83829aj) C83831al.f228455c.createBuilder();
            C83824ae aeVar2 = (C83824ae) C83825af.f228447c.createBuilder();
            C115850g gVar3 = this.f306101i;
            C58838bb.m90884s(gVar3.mo102284b(), "Child account name is not available outside child-facing flows");
            String b = ((C83908bn) gVar3.f321253a.mo56107c()).mo77321b();
            C58838bb.m90866a(b, "No child account name");
            aeVar2.copyOnWrite();
            C83825af afVar3 = (C83825af) aeVar2.instance;
            afVar3.f228449a |= 1;
            afVar3.f228450b = b;
            ajVar4.copyOnWrite();
            C83831al alVar7 = (C83831al) ajVar4.instance;
            C83825af afVar4 = (C83825af) aeVar2.build();
            afVar4.getClass();
            alVar7.f228458b = afVar4;
            alVar7.f228457a = 1;
            aiVar2.copyOnWrite();
            C83832am amVar5 = (C83832am) aiVar2.instance;
            C83831al alVar8 = (C83831al) ajVar4.build();
            alVar8.getClass();
            amVar5.f228463c = alVar8;
            amVar5.f228461a |= 2;
            cVar.copyOnWrite();
            C83841av avVar3 = (C83841av) cVar.instance;
            C83832am amVar6 = (C83832am) aiVar2.build();
            amVar6.getClass();
            avVar3.f228481b = amVar6;
            avVar3.f228480a = 2;
        } else {
            C83824ae aeVar3 = (C83824ae) C83825af.f228447c.createBuilder();
            String str = ((Account) a.mo56107c()).name;
            aeVar3.copyOnWrite();
            C83825af afVar5 = (C83825af) aeVar3.instance;
            str.getClass();
            afVar5.f228449a |= 1;
            afVar5.f228450b = str;
            cVar.copyOnWrite();
            C83841av avVar4 = (C83841av) cVar.instance;
            C83825af afVar6 = (C83825af) aeVar3.build();
            afVar6.getClass();
            avVar4.f228481b = afVar6;
            avVar4.f228480a = 1;
        }
        ((C83819a) this.f306096d.mo56107c()).mo77204a(activity, (C83841av) cVar.build());
    }

    public final void onDestroyView() {
        C89849ae aeVar;
        super.onDestroyView();
        if (this.f306100h == 2) {
            aeVar = C89849ae.VOICE_MATCH_CONSENT_ACCEPTED;
        } else {
            aeVar = C89849ae.VOICE_MATCH_CONSENT_SCREEN_EXIT;
        }
        ((C89859i) this.f306099g.mo27525b()).mo83702b(aeVar);
    }
}
