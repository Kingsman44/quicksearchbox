package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107947v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.an */
/* compiled from: PG */
public final class C107862an implements C107874az {

    /* renamed from: a */
    static final ComponentName f300144a = new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity");

    /* renamed from: b */
    private final C68214a f300145b;

    /* renamed from: c */
    private final C107947v f300146c;

    public C107862an(C68214a aVar, C107947v vVar) {
        this.f300145b = aVar;
        this.f300146c = vVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        switch (a.ordinal()) {
            case 74:
                this.f300146c.mo27807a(new Intent("android.settings.AIRPLANE_MODE_SETTINGS").setFlags(268435456));
                return true;
            case 75:
                Intent intent = new Intent();
                intent.setComponent(f300144a);
                this.f300146c.mo27807a(intent);
                return true;
            case 76:
                this.f300146c.mo27807a(new Intent("android.settings.DATA_ROAMING_SETTINGS").setFlags(268435456));
                return true;
            case 77:
                this.f300146c.mo27807a(new Intent("android.settings.WIFI_SETTINGS").setFlags(268435456));
                return true;
            case 78:
                this.f300146c.mo27807a(new Intent("android.settings.WIRELESS_SETTINGS").setFlags(268435456));
                return true;
            case 79:
                this.f300146c.mo27807a(new Intent("android.intent.action.VIEW", Uri.parse(((C86124t) this.f300145b.mo27525b()).mo79758x(C90110fh.f250714t))).setFlags(268435456).addCategory("android.intent.category.BROWSABLE"));
                return true;
            default:
                return true;
        }
    }
}
