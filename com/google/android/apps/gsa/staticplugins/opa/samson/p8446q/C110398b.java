package com.google.android.apps.gsa.staticplugins.opa.samson.p8446q;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.q.b */
/* compiled from: PG */
public final class C110398b {

    /* renamed from: e */
    private static final C59071e f307680e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.q.b");

    /* renamed from: a */
    public final Context f307681a;

    /* renamed from: b */
    public final C87568k f307682b;

    /* renamed from: c */
    public final C87571n f307683c;

    /* renamed from: d */
    public final C86124t f307684d;

    public C110398b(Context context, C87568k kVar, C87571n nVar, C86124t tVar) {
        this.f307681a = context;
        this.f307682b = kVar;
        this.f307683c = nVar;
        this.f307684d = tVar;
    }

    /* renamed from: a */
    public static int m183812a() {
        return new Object().hashCode();
    }

    /* renamed from: b */
    public final Bundle mo98626b(String str, String str2, C87565h hVar, boolean z, Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("query_string", str2);
        if (intent == null && hVar != null) {
            hVar.f236560f = 4;
            hVar.f236497A = true;
            hVar.f236568n = str;
            hVar.f236507K = true;
            hVar.f236508L = true;
            intent = this.f307682b.mo81687a(this.f307681a, hVar.mo81685a(), 268468224);
        } else if (intent == null) {
            C59104x d = f307680e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmbRespUtil");
            ((C59052c) ((C59052c) d).mo56372aa(25996)).mo56386p("Should provide either overrideIntent or intentExtrasBuilder.");
            int i = C90755l.f253831a;
            return bundle;
        }
        bundle.putParcelable("chip_intent", PendingIntent.getActivity(this.f307681a, m183812a(), intent, 335544320));
        if (z) {
            bundle.putInt("ui_element_type", 0);
        }
        return bundle;
    }

    /* renamed from: c */
    public final Bundle mo98627c(C87565h hVar, int i) {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putInt("ui_element_type", 1);
        hVar.f236560f = 2;
        hVar.f236507K = true;
        if (this.f307684d.mo79746e(C90126fx.f251313gU)) {
            intent = C87566i.m142321t(this.f307681a, hVar);
            intent.setAction("com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH");
        } else {
            intent = this.f307682b.mo81687a(this.f307681a, hVar.mo81685a(), 268468224);
        }
        bundle.putParcelable("entry_point_intent", PendingIntent.getActivity(this.f307681a, m183812a(), intent, 335544320));
        if (i != -1) {
            bundle.putParcelable("entry_point_icon", Icon.createWithResource(this.f307681a, i));
        }
        return bundle;
    }
}
