package com.google.android.apps.gsa.staticplugins.p7795dg;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6519al.p6674cu.C85211a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86945bl;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88256uy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88257uz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88259va;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88261vc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88266vh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88267vi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88268vj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88269vk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88270vl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88271vm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88303wr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88381zo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88383zq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88384zr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88385zs;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaq;
import com.google.android.apps.gsa.search.shared.service.p6935b.aar;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.dg.e */
/* compiled from: PG */
public final class C99527e extends C86734a implements C85211a {

    /* renamed from: a */
    public final C86610af f278480a;

    /* renamed from: b */
    public final Context f278481b;

    /* renamed from: c */
    public final C86054o f278482c;

    /* renamed from: f */
    public final C86945bl f278483f;

    /* renamed from: g */
    private final SharedPreferences f278484g;

    /* renamed from: h */
    private final C22871g f278485h;

    /* renamed from: i */
    private final Executor f278486i;

    /* renamed from: j */
    private final C86034c f278487j;

    /* renamed from: com.google.android.apps.gsa.staticplugins.dg.e$a */
    /* compiled from: PG */
    public interface C99528a {
        /* renamed from: hl */
        C58833ax mo91481hl();
    }

    public C99527e(C86610af afVar, Context context, C86945bl blVar, SharedPreferences sharedPreferences, C22871g gVar, Executor executor, C86034c cVar, C86054o oVar) {
        super(C118575h.WORKER_SEARCH_PLATE, "searchplate");
        this.f278480a = afVar;
        this.f278481b = context;
        this.f278483f = blVar;
        this.f278484g = sharedPreferences;
        this.f278485h = gVar;
        this.f278486i = executor;
        this.f278487j = cVar;
        this.f278482c = oVar;
    }

    /* renamed from: a */
    public final void mo78791a() {
        if (this.f278480a.mo80227h()) {
            C86775r rVar = this.f278480a.f233977l;
            rVar.f234383e.mo80379b(new C87684al(C88244um.NO_SPEECH_DETECTED).mo81964a());
        }
    }

    /* renamed from: b */
    public final void mo78792b() {
        if (this.f278480a.mo80227h()) {
            Account a = this.f278482c.mo79668a();
            C47633f h = C47633f.m84733g(this.f278487j.mo79697b()).mo51515h(new C99523a(this), this.f278486i);
            C47633f i = h.mo51516i(C99524b.f278473a, this.f278486i);
            C46459k.m82829b(C60856cj.m92895d(h, i).mo57336c(new C99525c(this, a, h, i), this.f278486i), "Failed to set Location settings changed prompt shown.", new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo78793c(String str, String str2) {
        if (this.f278480a.mo80227h()) {
            C88261vc vcVar = (C88261vc) C88262vd.f238728d.createBuilder();
            vcVar.copyOnWrite();
            C88262vd vdVar = (C88262vd) vcVar.instance;
            str.getClass();
            vdVar.f238730a |= 1;
            vdVar.f238731b = str;
            if (str2 != null) {
                vcVar.copyOnWrite();
                C88262vd vdVar2 = (C88262vd) vcVar.instance;
                vdVar2.f238730a |= 2;
                vdVar2.f238732c = str2;
            }
            C86610af afVar = this.f278480a;
            C87684al alVar = new C87684al(C88244um.SET_FINAL_RECOGNIZED_TEXT);
            alVar.mo81965b(C88260vb.f238727a, (C88262vd) vcVar.build());
            afVar.mo80228i(alVar.mo81964a());
        }
    }

    /* renamed from: e */
    public final void mo78794e(SearchError searchError) {
        if (this.f278480a.mo80227h()) {
            C86610af afVar = this.f278480a;
            C87684al alVar = new C87684al(C88244um.SHOW_ERROR);
            alVar.mo81966c(new ParcelableVoiceAction(searchError));
            afVar.mo80228i(alVar.mo81964a());
        }
    }

    /* renamed from: f */
    public final void mo78795f() {
        this.f278480a.mo80228i(new C87684al(C88244um.LANGUAGE_SWITCHER_NUDGE_TTS_PLAYBACK_COMPLETE).mo81964a());
    }

    /* renamed from: g */
    public final void mo78796g(int i) {
        if (this.f278480a.mo80227h() && !this.f278480a.f233977l.f234384f.f236953f.equals("transcription")) {
            C86610af afVar = this.f278480a;
            C87684al alVar = new C87684al(C88244um.SHOW_RECOGNITION_STATE);
            C62940bt btVar = C88302wq.f238816a;
            C88303wr wrVar = (C88303wr) C88304ws.f238817c.createBuilder();
            wrVar.copyOnWrite();
            C88304ws wsVar = (C88304ws) wrVar.instance;
            wsVar.f238819a |= 1;
            wsVar.f238820b = i;
            alVar.mo81965b(btVar, (C88304ws) wrVar.build());
            afVar.mo80228i(alVar.mo81964a());
        }
        this.f278485h.mo28212l("setRecognitionState", new C99526d(this, i));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchPlateWorker");
    }

    /* renamed from: h */
    public final void mo78797h(int i, String str, String str2) {
        if (this.f278480a.mo80227h()) {
            C86610af afVar = this.f278480a;
            C87684al alVar = new C87684al(C88244um.SET_EXTERNAL_FLAGS);
            C62940bt btVar = C88256uy.f238719a;
            C88257uz uzVar = (C88257uz) C88259va.f238721e.createBuilder();
            uzVar.copyOnWrite();
            C88259va vaVar = (C88259va) uzVar.instance;
            vaVar.f238723a |= 1;
            vaVar.f238724b = i;
            uzVar.copyOnWrite();
            C88259va vaVar2 = (C88259va) uzVar.instance;
            str.getClass();
            vaVar2.f238723a |= 2;
            vaVar2.f238725c = str;
            uzVar.copyOnWrite();
            C88259va vaVar3 = (C88259va) uzVar.instance;
            str2.getClass();
            vaVar3.f238723a |= 4;
            vaVar3.f238726d = str2;
            alVar.mo81965b(btVar, (C88259va) uzVar.build());
            afVar.mo80228i(alVar.mo81964a());
        }
    }

    /* renamed from: i */
    public final void mo78798i(int i, int i2) {
        if (this.f278480a.mo80227h()) {
            C86610af afVar = this.f278480a;
            C87684al alVar = new C87684al(C88244um.SET_SEARCH_PLATE_MODE);
            C62940bt btVar = C88266vh.f238738a;
            C88267vi viVar = (C88267vi) C88268vj.f238739e.createBuilder();
            viVar.copyOnWrite();
            C88268vj vjVar = (C88268vj) viVar.instance;
            vjVar.f238741a |= 1;
            vjVar.f238742b = i;
            viVar.copyOnWrite();
            C88268vj vjVar2 = (C88268vj) viVar.instance;
            vjVar2.f238741a |= 2;
            vjVar2.f238743c = i2;
            viVar.copyOnWrite();
            C88268vj vjVar3 = (C88268vj) viVar.instance;
            vjVar3.f238741a |= 4;
            vjVar3.f238744d = true;
            alVar.mo81965b(btVar, (C88268vj) viVar.build());
            afVar.mo80228i(alVar.mo81964a());
        }
    }

    /* renamed from: j */
    public final void mo78799j(Query query) {
        if (this.f278480a.mo80227h()) {
            C86610af afVar = this.f278480a;
            C87684al alVar = new C87684al(C88244um.SET_QUERY);
            alVar.mo81966c(query);
            afVar.mo80228i(alVar.mo81964a());
        }
    }

    /* renamed from: k */
    public final void mo78800k(String str, String str2, String str3) {
        if (this.f278480a.mo80227h()) {
            C88381zo zoVar = (C88381zo) C88382zp.f238991e.createBuilder();
            zoVar.copyOnWrite();
            C88382zp zpVar = (C88382zp) zoVar.instance;
            str.getClass();
            zpVar.f238993a |= 1;
            zpVar.f238994b = str;
            zoVar.copyOnWrite();
            C88382zp zpVar2 = (C88382zp) zoVar.instance;
            str2.getClass();
            zpVar2.f238993a |= 2;
            zpVar2.f238995c = str2;
            if (str3 != null) {
                zoVar.copyOnWrite();
                C88382zp zpVar3 = (C88382zp) zoVar.instance;
                zpVar3.f238993a |= 4;
                zpVar3.f238996d = str3;
            }
            C86610af afVar = this.f278480a;
            C87684al alVar = new C87684al(C88244um.UPDATE_RECOGNIZED_TEXT);
            alVar.mo81965b(C88380zn.f238990a, (C88382zp) zoVar.build());
            afVar.mo80228i(alVar.mo81964a());
        }
    }

    /* renamed from: l */
    public final void mo78801l(List list, String str, int i, LinkedHashMap linkedHashMap) {
        C88270vl vlVar = (C88270vl) C88271vm.f238746g.createBuilder();
        vlVar.copyOnWrite();
        C88271vm vmVar = (C88271vm) vlVar.instance;
        C62971cq cqVar = vmVar.f238749b;
        if (!cqVar.mo58948c()) {
            vmVar.f238749b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) vmVar.f238749b);
        vlVar.copyOnWrite();
        C88271vm vmVar2 = (C88271vm) vlVar.instance;
        str.getClass();
        boolean z = true;
        vmVar2.f238748a |= 1;
        vmVar2.f238750c = str;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aaq aaq = (aaq) aar.f237098d.createBuilder();
            String str2 = (String) entry.getKey();
            aaq.copyOnWrite();
            aar aar = (aar) aaq.instance;
            str2.getClass();
            aar.f237100a |= 1;
            aar.f237101b = str2;
            String str3 = (String) entry.getValue();
            aaq.copyOnWrite();
            aar aar2 = (aar) aaq.instance;
            str3.getClass();
            aar2.f237100a |= 2;
            aar2.f237102c = str3;
            aar aar3 = (aar) aaq.build();
            vlVar.copyOnWrite();
            C88271vm vmVar3 = (C88271vm) vlVar.instance;
            aar3.getClass();
            C62971cq cqVar2 = vmVar3.f238752e;
            if (!cqVar2.mo58948c()) {
                vmVar3.f238752e = C62942bv.mutableCopy(cqVar2);
            }
            vmVar3.f238752e.add(aar3);
        }
        int i2 = this.f278484g.getInt("language_switcher_nudge_impression_count", 0);
        if (this.f278484g.getBoolean("language_switcher_interacted", false) || i2 >= i) {
            z = false;
        }
        boolean z2 = this.f278484g.getBoolean("language_switcher_auto_option_selected", false);
        vlVar.copyOnWrite();
        C88271vm vmVar4 = (C88271vm) vlVar.instance;
        vmVar4.f238748a |= 2;
        vmVar4.f238751d = z;
        vlVar.copyOnWrite();
        C88271vm vmVar5 = (C88271vm) vlVar.instance;
        vmVar5.f238748a |= 4;
        vmVar5.f238753f = z2;
        C86610af afVar = this.f278480a;
        C87684al alVar = new C87684al(C88244um.SET_SEARCH_PLATE_VOICE_SEARCH_LANGUAGE);
        alVar.mo81965b(C88269vk.f238745a, (C88271vm) vlVar.build());
        afVar.mo80228i(alVar.mo81964a());
    }

    /* renamed from: m */
    public final void mo78802m(String str) {
        C88384zr zrVar = (C88384zr) C88385zs.f238998c.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            zrVar.copyOnWrite();
            C88385zs zsVar = (C88385zs) zrVar.instance;
            str.getClass();
            zsVar.f239000a |= 1;
            zsVar.f239001b = str;
        }
        C87684al alVar = new C87684al(C88244um.UPDATE_SEARCHBOX_HINT_TEXT);
        alVar.mo81965b(C88383zq.f238997a, (C88385zs) zrVar.build());
        this.f278480a.mo80228i(alVar.mo81964a());
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
