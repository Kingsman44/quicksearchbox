package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10224c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10263h;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10272q;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.assistant.shared.appactions.u;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ae */
/* compiled from: PG */
public final class C10199ae {

    /* renamed from: a */
    public static final C59071e f34623a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.appactions.ae");

    /* renamed from: b */
    public View f34624b;

    /* renamed from: c */
    public final C10421s f34625c;

    /* renamed from: d */
    public final C10263h f34626d;

    /* renamed from: e */
    public final C10325al f34627e;

    /* renamed from: f */
    public final u f34628f;

    /* renamed from: g */
    public final C68214a f34629g;

    /* renamed from: h */
    public final C91189au f34630h;

    /* renamed from: i */
    public final InputMethodManager f34631i;

    /* renamed from: j */
    public final C22871g f34632j;

    /* renamed from: k */
    public final C10224c f34633k;

    /* renamed from: l */
    public final C73812a f34634l;

    /* renamed from: m */
    public final C28310af f34635m;

    /* renamed from: n */
    public final C90021c f34636n;

    /* renamed from: o */
    public final Optional f34637o;

    /* renamed from: p */
    public final Optional f34638p;

    /* renamed from: q */
    public final Optional f34639q;

    /* renamed from: r */
    public final C46439e f34640r;

    /* renamed from: s */
    public final C10372de f34641s;

    /* renamed from: t */
    public Optional f34642t = Optional.empty();

    /* renamed from: u */
    public Optional f34643u = Optional.empty();

    /* renamed from: v */
    public C49826ak f34644v;

    public C10199ae(C10421s sVar, C10263h hVar, C10325al alVar, C68214a aVar, u uVar, C91189au auVar, InputMethodManager inputMethodManager, C22871g gVar, C10224c cVar, C73812a aVar2, C28310af afVar, C90021c cVar2, Optional optional, Optional optional2, Optional optional3, C10373df dfVar, C46439e eVar) {
        C49826ak akVar;
        C10263h hVar2 = hVar;
        this.f34625c = sVar;
        this.f34626d = hVar2;
        this.f34627e = alVar;
        this.f34629g = aVar;
        this.f34628f = uVar;
        this.f34630h = auVar;
        this.f34631i = inputMethodManager;
        this.f34632j = gVar;
        if (hVar2.f34792b == 1) {
            akVar = (C49826ak) hVar2.f34793c;
        } else {
            akVar = C49826ak.f129462q;
        }
        this.f34644v = akVar;
        this.f34633k = cVar;
        this.f34634l = aVar2;
        this.f34635m = afVar;
        this.f34636n = cVar2;
        this.f34637o = optional;
        this.f34638p = optional2;
        this.f34639q = optional3;
        this.f34640r = eVar;
        this.f34641s = dfVar.mo18453a(new C10198ad(this), sVar, C10423u.f35146a, new C10424v(this), new C10425w(this), new C10426x(this));
    }

    /* renamed from: a */
    public final int mo18336a(int i) {
        return this.f34625c.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public final void mo18337b(C49826ak akVar, boolean z) {
        C10272q qVar = (C10272q) C10273r.f34817e.createBuilder();
        C49838aw awVar = this.f34626d.f34795e;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        qVar.copyOnWrite();
        C10273r rVar = (C10273r) qVar.instance;
        awVar.getClass();
        rVar.f34820b = awVar;
        boolean z2 = true;
        rVar.f34819a |= 1;
        qVar.copyOnWrite();
        C10273r rVar2 = (C10273r) qVar.instance;
        akVar.getClass();
        rVar2.f34821c = akVar;
        rVar2.f34819a |= 2;
        long j = this.f34626d.f34794d;
        qVar.copyOnWrite();
        C10273r rVar3 = (C10273r) qVar.instance;
        rVar3.f34819a |= 4;
        rVar3.f34822d = j;
        this.f34642t = Optional.m71637of((C10273r) qVar.build());
        if (!z || akVar.f129465b.isEmpty()) {
            z2 = false;
        }
        this.f34643u = Optional.m71637of(Boolean.valueOf(z2));
        C46439e eVar = this.f34640r;
        C10325al alVar = this.f34627e;
        C49838aw awVar2 = ((C10273r) this.f34642t.get()).f34820b;
        if (awVar2 == null) {
            awVar2 = C49838aw.f129504g;
        }
        String str = awVar2.f129507b;
        C49826ak akVar2 = ((C10273r) this.f34642t.get()).f34821c;
        if (akVar2 == null) {
            akVar2 = C49826ak.f129462q;
        }
        eVar.mo50445g(new C46438d(alVar.mo18427i(str, akVar2, Optional.m71637of(Long.valueOf(((C10273r) this.f34642t.get()).f34822d)))), new C46436b((Object) null), this.f34641s);
    }
}
