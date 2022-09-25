package com.google.android.libraries.assistant.auto.tng.media.p1050b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16938b;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16944g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.b.b */
/* compiled from: PG */
public final class C13986b {

    /* renamed from: a */
    public static final C59071e f42577a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.b.b");

    /* renamed from: a */
    public static C16940c m30283a(Context context, C69464a aVar) {
        ((C59052c) ((C59052c) f42577a.mo56224b()).mo56372aa(45311)).mo56386p("Creating Amp configuration from performer module");
        Bundle bundle = new Bundle();
        bundle.putString("android.media.session.BROWSE_SERVICE", "com.google.android.libraries.assistant.auto.tng.media.mediabrowser.NewsMediaBrowserService");
        C13985a aVar2 = new C13985a();
        C16938b o = C16940c.m33959o(context, 4, "AMP-auto-session-identifier");
        C16944g gVar = (C16944g) o;
        gVar.f49497e = bundle;
        o.mo23110b(((Boolean) aVar.mo17428b()).booleanValue());
        gVar.f49498f = aVar2;
        return o.mo23109a();
    }
}
