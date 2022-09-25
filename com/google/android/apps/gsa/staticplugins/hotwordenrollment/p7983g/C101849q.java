package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92491c;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92495g;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.speech.p7271d.C92228e;
import com.google.android.apps.gsa.speech.p7271d.C92229f;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.q */
/* compiled from: PG */
public final class C101849q extends C92229f {

    /* renamed from: c */
    public static final C59071e f284086c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.q");

    /* renamed from: d */
    public final C89859i f284087d;

    /* renamed from: e */
    public boolean f284088e = false;

    /* renamed from: f */
    private final C90584f f284089f;

    /* renamed from: g */
    private final C92504i f284090g;

    /* renamed from: h */
    private final C90931ca f284091h;

    /* renamed from: i */
    private final String f284092i;

    /* renamed from: j */
    private final C86124t f284093j;

    /* renamed from: k */
    private final C118561t f284094k;

    /* renamed from: l */
    private final int f284095l;

    public C101849q(C90584f fVar, String str, C92504i iVar, C90931ca caVar, C86124t tVar, C118561t tVar2, C89859i iVar2) {
        super(C92228e.HOTWORD_MODEL, caVar, tVar);
        this.f284090g = iVar;
        this.f284091h = caVar;
        this.f284093j = tVar;
        this.f284094k = tVar2;
        this.f284087d = iVar2;
        this.f284095l = (int) tVar.mo79743a(C90082eg.f250086w);
        this.f284089f = fVar;
        this.f284092i = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86900a() {
        C59104x b = f284086c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) b).mo56372aa(20660)).mo56354G("Starting hotword model dependency check for locale: %s and model type: %s", this.f284092i, this.f284089f);
        mo92625g(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86901b() {
        C59104x b = f284086c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) b).mo56372aa(20661)).mo56386p("#internalStop");
        this.f284087d.mo83702b(C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_ON_DEPENDENCY_CHECK_CANCELLED);
    }

    /* renamed from: c */
    public final void mo92623c(int i) {
        C59071e eVar = f284086c;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) b).mo56372aa(20649)).mo56387q("#checkAfterInitialization, attempts=%d", i);
        boolean i2 = this.f284090g.mo87268i(this.f284092i, this.f284089f);
        boolean j = this.f284090g.mo87269j();
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) b2).mo56372aa(20650)).mo56358K("#checkAfterInitialization, initializedForLocale=%b, initializedWithLatestHotwordModel=%b", i2, j);
        if (!i2 || !j) {
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
            ((C59052c) ((C59052c) b3).mo56372aa(20651)).mo56386p("#checkAfterInitialization, initializing microDataManager");
            this.f284087d.mo83702b(C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_INITIALIZE_DATA_MANAGER);
            this.f284090g.mo87265f(this.f284092i, new C101846n(this, i), true, this.f284089f);
            return;
        }
        mo92624f(i);
    }

    /* renamed from: e */
    public final void mo86905e(boolean z) {
        C89849ae aeVar;
        C59104x b = f284086c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) b).mo56372aa(20659)).mo56389s("#internalFinish, success=%b", Boolean.valueOf(z));
        if (this.f284088e) {
            C89859i iVar = this.f284087d;
            if (z) {
                aeVar = C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_ON_DEPENDENCY_CHECK_SUCCESS;
            } else {
                aeVar = C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_ON_DEPENDENCY_CHECK_FAILURE;
            }
            iVar.mo83702b(aeVar);
            this.f284088e = false;
        }
        super.mo86905e(z);
    }

    /* renamed from: f */
    public final void mo92624f(int i) {
        C89849ae aeVar;
        C59071e eVar = f284086c;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) b).mo56372aa(20652)).mo56387q("#checkHotwordModelPresent, attempts=%d", i);
        if (!this.f284090g.mo87268i(this.f284092i, this.f284089f)) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
            ((C59052c) ((C59052c) b2).mo56372aa(20656)).mo56386p("#checkHotwordModelPresent failed - microDataManager is not initialized for locale and model type.");
            this.f284087d.mo83702b(C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_DATA_MANAGER_NOT_INITIALIZED);
            mo86905e(false);
        } else if (this.f284090g.mo87267h(this.f284092i, this.f284089f)) {
            if (i == 0) {
                this.f284087d.mo83702b(C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_ON_DEPENDENCY_CHECK_ALREADY_UPDATED);
            }
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
            ((C59052c) ((C59052c) b3).mo56372aa(20655)).mo56386p("#checkHotwordModelPresent success.");
            mo86905e(true);
        } else {
            if (i == 0) {
                C59104x b4 = eVar.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
                ((C59052c) ((C59052c) b4).mo56372aa(20654)).mo56389s("#checkHotwordModelPresent, requesting model download; useMdd=%b", Boolean.valueOf(this.f284093j.mo79746e(C90082eg.f250020cd)));
                C89859i iVar = this.f284087d;
                if (this.f284093j.mo79746e(C90082eg.f250020cd)) {
                    aeVar = C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_ON_DEPENDENCY_CHECK_MDD_START;
                } else {
                    aeVar = C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_ON_DEPENDENCY_CHECK_LEGACY_START;
                }
                iVar.mo83702b(aeVar);
                this.f284088e = true;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328824d = 1;
                agVar.f328821a |= 4;
                C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
                C62940bt btVar = C92495g.f258128a;
                C92491c cVar = (C92491c) C92494f.f258122e.createBuilder();
                C90584f fVar = this.f284089f;
                cVar.copyOnWrite();
                C92494f fVar2 = (C92494f) cVar.instance;
                fVar2.f258125b = fVar.f253255d;
                fVar2.f258124a = 1 | fVar2.f258124a;
                String str = this.f284092i;
                cVar.copyOnWrite();
                C92494f fVar3 = (C92494f) cVar.instance;
                str.getClass();
                fVar3.f258124a |= 4;
                fVar3.f258127d = str;
                ajVar.mo58885m(btVar, (C92494f) cVar.build());
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                C118476ak akVar = (C118476ak) ajVar.build();
                akVar.getClass();
                agVar2.f328827g = akVar;
                agVar2.f328821a |= 32;
                this.f284094k.mo103754e(C118522by.UPDATE_HOTWORD_MODELS, (C118472ag) afVar.build());
                i = 0;
            }
            if (i < this.f284095l) {
                this.f284091h.mo85137b(new C101848p(this, i), this.f284093j.mo79743a(C90082eg.f250085v));
                return;
            }
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
            ((C59052c) ((C59052c) c).mo56372aa(20653)).mo56386p("#checkHotwordModelPresent failed after reaching max attempts.");
            mo86905e(false);
        }
    }

    /* renamed from: g */
    public final void mo92625g(int i) {
        C59071e eVar = f284086c;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
        ((C59052c) ((C59052c) b).mo56372aa(20657)).mo56387q("#checkServerFlagsPresent, attempts=%d", i);
        if (this.f284093j.mo79760z()) {
            mo92623c(0);
        } else if (i < this.f284095l) {
            this.f284091h.mo85137b(new C101847o(this, i), this.f284093j.mo79743a(C90082eg.f250085v));
        } else {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordModelDepChecker");
            ((C59052c) ((C59052c) c).mo56372aa(20658)).mo56386p("#checkServerFlagsPresent failed after reaching max attempts.");
            this.f284087d.mo83702b(C89849ae.VOICE_MATCH_MODEL_DOWNLOAD_MISSING_SERVER_FLAGS);
            mo86905e(false);
        }
    }
}
