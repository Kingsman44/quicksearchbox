package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Intent;
import android.widget.ProgressBar;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.p6941ui.C88506a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88510d;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88513g;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88516j;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88213ti;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88214tj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88215tk;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.actionsui.C93699x;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.AudioArgumentView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93531ai;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93532aj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.aj */
/* compiled from: PG */
public final class C102403aj extends C88499t implements C88516j {

    /* renamed from: a */
    public static final C59071e f285814a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.immersiveactions.aj");

    /* renamed from: b */
    public final C87681ai f285815b;

    /* renamed from: c */
    public final C68214a f285816c;

    /* renamed from: d */
    public final C68214a f285817d;

    /* renamed from: e */
    public final C68214a f285818e;

    /* renamed from: f */
    public C88507a f285819f;

    /* renamed from: g */
    public VoiceAction f285820g;

    /* renamed from: h */
    public C88506a f285821h;

    /* renamed from: i */
    private C88508b f285822i;

    /* renamed from: j */
    private boolean f285823j;

    /* renamed from: k */
    private CardDecision f285824k;

    /* renamed from: l */
    private VoiceAction f285825l;

    public C102403aj(C87681ai aiVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f285815b = aiVar;
        this.f285816c = aVar;
        this.f285818e = aVar2;
        this.f285817d = aVar3;
    }

    /* renamed from: u */
    private static String m169791u(CardDecision cardDecision) {
        String str = cardDecision.f236249c;
        return str != null ? str : BuildConfig.FLAVOR;
    }

    /* renamed from: v */
    private final void m169792v(long j, String str) {
        C88506a aVar;
        C88507a aVar2 = this.f285819f;
        if (aVar2 != null) {
            aVar2.mo82057t();
        }
        if (this.f285820g != null && this.f285822i != null && (aVar = this.f285821h) != null) {
            C88507a aVar3 = this.f285819f;
            String u = (aVar3 == null || aVar3.mo82039ao() == null) ? BuildConfig.FLAVOR : m169791u(this.f285819f.mo82039ao());
            C88508b bVar = this.f285822i;
            bVar.getClass();
            aVar.mo82033b(u, bVar, j, str);
        }
    }

    /* renamed from: a */
    public final C88507a mo82127a() {
        return this.f285819f;
    }

    /* renamed from: c */
    public final void mo82128c() {
        ((C88512f) this.f285816c.mo27525b()).mo82115w(false);
        this.f285822i = null;
        this.f285820g = null;
        this.f285824k = null;
    }

    /* renamed from: d */
    public final void mo82129d(Query query, List list, CardDecision cardDecision, int i) {
        CardDecision cardDecision2;
        VoiceAction voiceAction;
        ((C88512f) this.f285816c.mo27525b()).mo82116x(query, cardDecision);
        if (i == -1 || list.get(i) == null) {
            this.f285825l = null;
            return;
        }
        VoiceAction voiceAction2 = ((ParcelableVoiceAction) list.get(i)).f236008a;
        this.f285825l = voiceAction2;
        voiceAction2.getClass();
        if (!voiceAction2.mo81078q(this.f285820g)) {
            C88507a a = ((C93699x) this.f285817d.mo27525b()).mo88150a(voiceAction2, (C88512f) this.f285816c.mo27525b());
            if (a != null) {
                a.mo82054q(voiceAction2);
                this.f285819f = a;
            }
            this.f285823j = true;
        } else {
            C88507a aVar = this.f285819f;
            if (aVar != null) {
                aVar.mo82054q(voiceAction2);
                this.f285823j = false;
            }
        }
        C68214a aVar2 = this.f285816c;
        boolean z = aVar2 != null && !((C88512f) aVar2.mo27525b()).mo82083J();
        if (cardDecision.f236255i && !z && !voiceAction2.mo81086x() && !voiceAction2.mo81088z() && ((cardDecision2 = this.f285824k) == null || !cardDecision2.equals(cardDecision) || (voiceAction = this.f285820g) == null || !voiceAction.equals(voiceAction2))) {
            C58976aa aaVar = C58975e.f156826a;
            C87681ai aiVar = this.f285815b;
            C88489j jVar = new C88489j(C87739bu.REQUEST_EXECUTE_ACTION);
            jVar.mo82015c(new ParcelableVoiceAction(voiceAction2));
            C62940bt btVar = C88213ti.f238443a;
            C88214tj tjVar = (C88214tj) C88215tk.f238444d.createBuilder();
            tjVar.copyOnWrite();
            C88215tk tkVar = (C88215tk) tjVar.instance;
            tkVar.f238446a |= 1;
            tkVar.f238447b = 1;
            tjVar.copyOnWrite();
            C88215tk tkVar2 = (C88215tk) tjVar.instance;
            tkVar2.f238446a |= 2;
            tkVar2.f238448c = false;
            jVar.mo82014b(btVar, (C88215tk) tjVar.build());
            aiVar.mo81937i(jVar.mo82013a());
        }
        this.f285824k = cardDecision;
        this.f285820g = voiceAction2;
    }

    /* renamed from: fO */
    public final void mo49088fO(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        ((C88512f) this.f285816c.mo27525b()).mo82095c().mo65089a(intent);
    }

    /* renamed from: h */
    public final void mo17569h(Query query, List list, CardDecision cardDecision, int i) {
        C88507a aVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f285825l != null && (aVar = this.f285819f) != null) {
            if (this.f285823j) {
                aVar.mo82056s();
                C88507a aVar2 = this.f285819f;
                aVar2.getClass();
                C88508b n = ((C88513g) this.f285818e.mo27525b()).mo82119n(aVar2);
                if (n != null) {
                    this.f285822i = n;
                    n.setVisibility(0);
                    C88506a aVar3 = this.f285821h;
                    if (aVar3 != null) {
                        String u = m169791u(cardDecision);
                        C88508b bVar = this.f285822i;
                        bVar.getClass();
                        aVar3.mo82032a(u, bVar, query.f252749G, query.mo84347bf("android.search.extra.EVENT_ID"));
                        return;
                    }
                    return;
                }
                return;
            }
            m169792v(query.f252749G, query.mo84347bf("android.search.extra.EVENT_ID"));
        }
    }

    /* renamed from: i */
    public final void mo17570i(String str, String str2, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        C88508b bVar = this.f285822i;
        if (bVar != null) {
            bVar.mo82066f(str, str2);
        }
    }

    /* renamed from: j */
    public final void mo17574j(int i) {
        C58976aa aaVar = C58975e.f156826a;
        C88507a aVar = this.f285819f;
        if (aVar != null) {
            for (C88510d dVar : aVar.mo82043f()) {
                if (dVar instanceof C93531ai) {
                    AudioArgumentView audioArgumentView = ((C93531ai) dVar).f261167a;
                    if (audioArgumentView.f261007f && audioArgumentView.f261452r) {
                        if (audioArgumentView.f261008g == null) {
                            audioArgumentView.f261008g = new C93532aj();
                        }
                        C93532aj ajVar = audioArgumentView.f261008g;
                        int[] iArr = ajVar.f261168a;
                        int i2 = ajVar.f261169b;
                        iArr[i2] = i;
                        int i3 = ajVar.f261170c;
                        ajVar.f261169b = (i2 + 1) % 5;
                        ajVar.f261171d = Math.min(ajVar.f261171d + 1, 5);
                        ProgressBar progressBar = audioArgumentView.f261005d;
                        C93532aj ajVar2 = audioArgumentView.f261008g;
                        int i4 = ajVar2.f261171d;
                        if (i4 >= 5) {
                            i4 = 5;
                        }
                        int i5 = ajVar2.f261169b;
                        int i6 = ajVar2.f261170c;
                        int i7 = ((i5 - i4) + 5) % 5;
                        int i8 = 0;
                        do {
                            i8 += ajVar2.f261168a[i7];
                            int i9 = ajVar2.f261170c;
                            i7 = (i7 + 1) % 5;
                        } while (i7 != ajVar2.f261169b);
                        progressBar.setProgress(i8 / i4);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo49090r() {
        if (this.f285819f != null) {
            m169792v(0, (String) null);
        }
    }

    /* renamed from: t */
    public final C88512f mo93218t() {
        return (C88512f) this.f285816c.mo27525b();
    }
}
