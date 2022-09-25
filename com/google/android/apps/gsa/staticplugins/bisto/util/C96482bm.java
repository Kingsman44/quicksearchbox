package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89618ap;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.C89682u;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124528i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.bm */
/* compiled from: PG */
public final class C96482bm implements C124528i {

    /* renamed from: a */
    public static final C59071e f269932a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.bm");

    /* renamed from: b */
    public final C92486a f269933b;

    /* renamed from: c */
    public final C89618ap f269934c;

    /* renamed from: d */
    public final C86054o f269935d;

    /* renamed from: e */
    public final Executor f269936e;

    /* renamed from: f */
    private final C89682u f269937f;

    /* renamed from: g */
    private final C68214a f269938g;

    /* renamed from: h */
    private final C88483e f269939h;

    /* renamed from: i */
    private final Executor f269940i;

    public C96482bm(C92486a aVar, C89682u uVar, C68214a aVar2, C88483e eVar, C86054o oVar, Executor executor, Executor executor2, C89618ap apVar) {
        this.f269933b = aVar;
        this.f269937f = uVar;
        this.f269934c = apVar;
        this.f269938g = aVar2;
        this.f269939h = eVar;
        this.f269935d = oVar;
        this.f269940i = executor;
        this.f269936e = executor2;
    }

    /* renamed from: a */
    public final C60870cx mo90173a(String str, String str2) {
        return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(((C89492cd) this.f269938g.mo27525b()).mo83408n(str)), new C96478bi(this, str2), this.f269940i), C124551g.class, C96479bj.f269925a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo90174b(Context context, Activity activity) {
        C59104x b = f269932a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
        ((C59052c) ((C59052c) b).mo56372aa(17243)).mo56386p("#launchLanguageSettings");
        Intent intent = new Intent(context, ProxyActivity.class);
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "language";
        c.mo24023e("opa");
        activity.startActivityForResult(intent.putExtra("android.intent.extra.INTENT", c.mo24020b().mo24031a()), 0);
    }

    /* renamed from: c */
    public final void mo90175c(Context context, Activity activity) {
        C59104x b = f269932a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
        ((C59052c) ((C59052c) b).mo56372aa(17244)).mo56386p("#launchSystemLanguageSettings");
        activity.startActivityForResult(new Intent(context, ProxyActivity.class).putExtra("android.intent.extra.INTENT", new Intent("android.settings.LOCALE_SETTINGS")), 0);
    }

    /* renamed from: d */
    public final void mo90176d(String str, boolean z) {
        C59104x b = f269932a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
        ((C59052c) ((C59052c) b).mo56372aa(17245)).mo56389s("#setHotwordPreference: %b", Boolean.valueOf(z));
        ((C89492cd) this.f269938g.mo27525b()).mo83378T(str, z);
        Bundle bundle = new Bundle();
        bundle.putString("key_device_id", str);
        bundle.putBoolean("extra_hotword_setting_state", z);
        C88489j jVar = new C88489j(C87739bu.BISTO_CHANGE_HOTWORD_ENABLED_PREF);
        jVar.mo82015c(bundle);
        C89651f.m145940a(this.f269939h, jVar.mo82013a());
    }

    /* renamed from: e */
    public final boolean mo90177e(String str, C124548d dVar) {
        if (!this.f269933b.mo87243q(str)) {
            C59104x d = f269932a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
            ((C59052c) ((C59052c) d).mo56372aa(17249)).mo56386p("locale does not match VM locale");
        }
        if (dVar.mo106526x().f386153f) {
            return true;
        }
        C58833ax b = this.f269937f.mo83585b(str, dVar.mo106480U(), dVar.mo106479T());
        if (!b.mo56113h()) {
            return false;
        }
        C59071e eVar = f269932a;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
        ((C59052c) ((C59052c) b2).mo56372aa(17246)).mo56354G("Target model: %s, Supported model list: %s", b.mo56107c(), dVar.mo106463D().toArray(C58471gg.f156097c));
        if (dVar.mo106494ah()) {
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
            ((C59052c) ((C59052c) b3).mo56372aa(17248)).mo56386p("Device supports model upload");
            return true;
        }
        boolean contains = dVar.mo106463D().contains(b.mo56107c());
        C59104x b4 = eVar.mo56224b();
        b4.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
        ((C59052c) ((C59052c) b4).mo56372aa(17247)).mo56389s("deviceHasCorrect1stStageHotwordModel: %b", Boolean.valueOf(contains));
        return contains;
    }
}
