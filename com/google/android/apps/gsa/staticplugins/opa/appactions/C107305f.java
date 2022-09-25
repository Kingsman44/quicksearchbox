package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107259a;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107260b;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107261c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107277a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import com.google.assistant.p3861at.C49814aa;
import com.google.assistant.p3861at.C49830ao;
import com.google.assistant.p3861at.C50463y;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.f */
/* compiled from: PG */
public final class C107305f implements C46440f {

    /* renamed from: a */
    private static final C59071e f298637a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appactions.f");

    /* renamed from: b */
    private final Fragment f298638b;

    /* renamed from: c */
    private final C58881cr f298639c;

    /* renamed from: d */
    private final C62921ba f298640d;

    /* renamed from: e */
    private final Consumer f298641e;

    /* renamed from: f */
    private final C73812a f298642f;

    /* renamed from: g */
    private final C107264bc f298643g;

    /* renamed from: h */
    private final Consumer f298644h;

    /* renamed from: i */
    private final C107277a f298645i;

    public C107305f(C62921ba baVar, C107277a aVar, C73812a aVar2, C107264bc bcVar, Fragment fragment, C58881cr crVar, Consumer consumer, Consumer consumer2) {
        this.f298638b = fragment;
        this.f298639c = crVar;
        this.f298640d = baVar;
        this.f298641e = consumer;
        this.f298645i = aVar;
        this.f298642f = aVar2;
        this.f298643g = bcVar;
        this.f298644h = consumer2;
    }

    /* renamed from: d */
    private final boolean m178119d(ProtoParsers.ParcelableProto parcelableProto) {
        C50463y yVar = (C50463y) parcelableProto.mo58938a(C50463y.f131328c, this.f298640d);
        return yVar.f131330a == 2 && ((C49830ao) yVar.f131331b).f129489f.isEmpty();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
        C59104x d = f298637a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AppActionsMixinCB");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(23546)).mo56386p("Failed to add shortcut.");
        this.f298642f.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
        if (m178119d((ProtoParsers.ParcelableProto) obj)) {
            C47393f.m84236g(new C107260b(), this.f298638b);
            return;
        }
        this.f298645i.mo95890a(th, C89885b.OPA_APP_ACTIONS_SHORTCUTS_NOTIFICATION_OVERLAY_SAVE_FAILED_VALUE, 168724065);
        this.f298641e.accept(false);
        C107308i iVar = (C107308i) this.f298639c.mo6453a();
        iVar.getClass();
        C47393f.m84236g(new C107261c(iVar), this.f298638b);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj2;
        this.f298641e.accept(false);
        if (m178119d((ProtoParsers.ParcelableProto) obj)) {
            C47393f.m84236g(new C107260b(), this.f298638b);
            return;
        }
        C49814aa aaVar = (C49814aa) parcelableProto.mo58938a(C49814aa.f128669f, this.f298640d);
        if (aaVar.f128671a) {
            C59104x b = f298637a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AppActionsMixinCB");
            ((C59052c) ((C59052c) b).mo56372aa(23549)).mo56386p("Successfully added shortcut");
            this.f298642f.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SUCCESS);
            C107308i iVar = (C107308i) this.f298639c.mo6453a();
            iVar.getClass();
            C47393f.m84236g(new C107259a(iVar), this.f298638b);
            return;
        }
        int b2 = C49263ai.m85396b(aaVar.f128672b);
        int i = 2;
        if (b2 != 0 && b2 == 6) {
            C59104x b3 = f298637a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AppActionsMixinCB");
            ((C59052c) ((C59052c) b3).mo56372aa(23548)).mo56386p("Starting shortcut query dialog");
            C107264bc bcVar = this.f298643g;
            C0167am activity = this.f298638b.getActivity();
            Context context = this.f298638b.getContext();
            C107308i iVar2 = (C107308i) this.f298639c.mo6453a();
            iVar2.getClass();
            C107263bb a = bcVar.mo95888a(activity, context, (String) iVar2.mo95857h().orElse(BuildConfig.FLAVOR), this.f298644h);
            int b4 = C49263ai.m85396b(aaVar.f128672b);
            if (b4 != 0) {
                i = b4;
            }
            a.e();
            a.h(i);
            return;
        }
        C59104x c = f298637a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AppActionsMixinCB");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(23547);
        int b5 = C49263ai.m85396b(aaVar.f128672b);
        if (b5 != 0) {
            i = b5;
        }
        cVar.mo56387q("Failed to add shortcut, error code: %s", C49263ai.m85395a(i));
        this.f298642f.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SERVER_ERROR);
        this.f298645i.mo95890a((Throwable) null, C89885b.OPA_APP_ACTIONS_SHORTCUTS_NOTIFICATION_OVERLAY_SAVE_FAILED_VALUE, 168724065);
        C107308i iVar3 = (C107308i) this.f298639c.mo6453a();
        iVar3.getClass();
        C47393f.m84236g(new C107261c(iVar3), this.f298638b);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        this.f298641e.accept(true);
    }
}
