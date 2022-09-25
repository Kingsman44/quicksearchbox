package com.google.android.apps.search.googleapp.saves.savefeature.activity;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import android.view.View;
import androidx.core.p098j.C2069cc;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.android.apps.search.googleapp.saves.savefeature.C137299g;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.android.apps.search.googleapp.saves.savefeature.C137301i;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.C137314ab;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.C137316ad;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.C137328am;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57567ak;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57642de;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57662w;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.activity.d */
/* compiled from: PG */
public final class C137278d implements C45987ay {

    /* renamed from: a */
    private static final C59071e f373469a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.savefeature.activity.d");

    /* renamed from: b */
    private final SaveActivity f373470b;

    /* renamed from: c */
    private final C28306ab f373471c;

    /* renamed from: d */
    private final C136226a f373472d;

    /* renamed from: e */
    private final Boolean f373473e;

    /* renamed from: f */
    private final C133148g f373474f;

    public C137278d(SaveActivity saveActivity, C45989b bVar, C28306ab abVar, C32158h hVar, C136226a aVar, Boolean bool, C133148g gVar) {
        this.f373470b = saveActivity;
        this.f373471c = abVar;
        this.f373472d = aVar;
        this.f373473e = bool;
        this.f373474f = gVar;
        hVar.mo37971b(saveActivity, this, bVar);
    }

    /* renamed from: e */
    private final void m223040e() {
        SaveActivity saveActivity = this.f373470b;
        if (saveActivity != null) {
            saveActivity.finish();
        }
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Optional optional;
        C57643df dfVar;
        C57643df dfVar2;
        this.f373472d.mo112853b(awVar);
        Intent intent = this.f373470b.getIntent();
        if (intent.getParcelableExtra("SAVE_FEATURE_ACTIVITY_ARGS") == null) {
            ((C59052c) ((C59052c) f373469a.mo56226d()).mo56372aa(40944)).mo56386p("Save Feature started without args present");
            optional = Optional.empty();
        } else {
            try {
                C137300h hVar = (C137300h) ProtoParsers.m95519b(intent, "SAVE_FEATURE_ACTIVITY_ARGS", C137300h.f373505h, C62921ba.m95368a());
                int a = C137301i.m223065a(hVar.f373511e);
                if (a != 0) {
                    if (a == 3) {
                        String dataString = intent.getDataString();
                        if (C58837ba.m90859h(dataString)) {
                            ((C59052c) ((C59052c) f373469a.mo56226d()).mo56372aa(40945)).mo56386p("Save Feature started from CCT, but a URL was not present in the intent data");
                            optional = Optional.empty();
                        } else {
                            C57567ak akVar = (C57567ak) C57569am.f153797f.createBuilder();
                            String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
                            if (stringExtra != null) {
                                akVar.copyOnWrite();
                                ((C57569am) akVar.instance).f153802d = stringExtra;
                            }
                            C137299g gVar = (C137299g) hVar.toBuilder();
                            C57642de deVar = (C57642de) C57643df.f153945e.createBuilder();
                            deVar.copyOnWrite();
                            dataString.getClass();
                            ((C57643df) deVar.instance).f153947a = dataString;
                            C57643df dfVar3 = (C57643df) deVar.build();
                            akVar.copyOnWrite();
                            C57569am amVar = (C57569am) akVar.instance;
                            dfVar3.getClass();
                            amVar.f153800b = dfVar3;
                            amVar.f153799a = 9;
                            C57662w wVar = (C57662w) C57663x.f153984d.createBuilder();
                            C57665z zVar = C57665z.WEB_PAGE;
                            wVar.copyOnWrite();
                            ((C57663x) wVar.instance).f153988c = zVar.getNumber();
                            wVar.copyOnWrite();
                            C57663x xVar = (C57663x) wVar.instance;
                            dataString.getClass();
                            xVar.f153986a = 4;
                            xVar.f153987b = dataString;
                            C57663x xVar2 = (C57663x) wVar.build();
                            akVar.copyOnWrite();
                            xVar2.getClass();
                            ((C57569am) akVar.instance).f153801c = xVar2;
                            C57569am amVar2 = (C57569am) akVar.build();
                            gVar.copyOnWrite();
                            amVar2.getClass();
                            ((C137300h) gVar.instance).f373509c = amVar2;
                            optional = Optional.m71637of((C137300h) gVar.build());
                        }
                    }
                }
                optional = Optional.m71637of(hVar);
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f373469a.mo56226d()).mo56382g(e)).mo56372aa(40943)).mo56386p("Save Feature started with invalid args");
                optional = Optional.empty();
            }
        }
        if (optional.isEmpty()) {
            m223040e();
            return;
        }
        this.f373474f.mo110996d(this.f373470b, R.layout.googleapp_save_activity, 2132150664);
        C2069cc.m5650a(this.f373470b.getWindow(), true);
        if (!this.f373473e.booleanValue()) {
            AccountId accountId = awVar.f120815a.f120816a;
            C137314ab abVar = new C137314ab();
            C68324h.m98669f(abVar);
            C47247a.m84047b(abVar, accountId);
            C0154a aVar = new C0154a(this.f373470b.f727a.f739a.f744e);
            aVar.mo689v(R.id.googleapp_save_fragment_container, abVar, (String) null);
            aVar.mo509f();
            C137316ad a2 = abVar.mo17754z();
            C137300h hVar2 = (C137300h) optional.get();
            a2.f373529f.mo50381d(C62912at.f169862a, hVar2);
            if (hVar2.f373508b == 5) {
                int a3 = C137301i.m223065a(a2.mo113640a().f373511e);
                if (a3 != 0 && a3 == 7) {
                    View view = a2.f373525b.getView();
                    if (view != null) {
                        C28306ab abVar2 = a2.f373533j;
                        abVar2.mo33801b(view, abVar2.f76990a.mo33805a(C28427h.m53115a(158691)));
                    }
                    C57569am amVar3 = hVar2.f373509c;
                    if (amVar3 == null) {
                        amVar3 = C57569am.f153797f;
                    }
                    if (amVar3.f153799a == 9) {
                        dfVar2 = (C57643df) amVar3.f153800b;
                    } else {
                        dfVar2 = C57643df.f153945e;
                    }
                    if (dfVar2.f153947a.isEmpty()) {
                        a2.mo113650k(R.string.googleapp_save_feature_empty_url_error, 158687);
                    } else {
                        a2.mo113651l(true);
                    }
                } else {
                    C46439e eVar = a2.f373527d;
                    C137230y yVar = a2.f373526c;
                    C57569am amVar4 = hVar2.f373509c;
                    if (amVar4 == null) {
                        amVar4 = C57569am.f153797f;
                    }
                    if (amVar4.f153799a == 9) {
                        dfVar = (C57643df) amVar4.f153800b;
                    } else {
                        dfVar = C57643df.f153945e;
                    }
                    C46438d a4 = C46438d.m82809a(yVar.mo113594b(dfVar.f153947a));
                    eVar.mo50428h(a4.f121541a, (Object) null, a2.f373537n);
                }
            } else {
                a2.mo113651l(hVar2.f373507a);
            }
        } else {
            AccountId accountId2 = awVar.f120815a.f120816a;
            C137328am amVar5 = new C137328am();
            C68324h.m98669f(amVar5);
            C47247a.m84047b(amVar5, accountId2);
            C0154a aVar2 = new C0154a(this.f373470b.f727a.f739a.f744e);
            aVar2.mo689v(R.id.googleapp_save_fragment_container, amVar5, (String) null);
            aVar2.mo509f();
            amVar5.mo17754z().f373566i = (C137300h) optional.get();
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        m223040e();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f373471c;
        SaveActivity saveActivity = this.f373470b;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(39250));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(saveActivity.mo1322k().mo1177e(16908290), a);
    }
}
