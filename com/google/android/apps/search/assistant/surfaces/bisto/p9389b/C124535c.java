package com.google.android.apps.search.assistant.surfaces.bisto.p9389b;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.bisto.p9389b.C124536d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124659by;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124691dc;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124692dd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124843bn;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.libraries.gsa.p1825a.p1827b.C22020a;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60105ky;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.b.c */
/* compiled from: PG */
final class C124535c implements C47506l {

    /* renamed from: a */
    final /* synthetic */ Uri f343606a;

    /* renamed from: b */
    final /* synthetic */ String f343607b;

    /* renamed from: c */
    final /* synthetic */ C124536d f343608c;

    public C124535c(C124536d dVar, Uri uri, String str) {
        this.f343608c = dVar;
        this.f343606a = uri;
        this.f343607b = str;
    }

    /* renamed from: f */
    private final C60870cx m204004f(String str, C60105ky kyVar, C47505k kVar) {
        C124659by av = ((C124536d.C124537a) C47245e.m84045a(this.f343608c.f343614e, C124536d.C124537a.class, kVar.f123336a)).mo106451av();
        C124691dc dcVar = (C124691dc) C124692dd.f343996g.createBuilder();
        dcVar.copyOnWrite();
        C124692dd ddVar = (C124692dd) dcVar.instance;
        ddVar.f343998a |= 1;
        ddVar.f343999b = str;
        return C47633f.m84733g(av.mo106578d((C124692dd) dcVar.build())).mo51515h(new C124533a(str, kyVar), this.f343608c.f343616g).mo51515h(new C124534b(this), this.f343608c.f343615f);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return this.f343608c.f343617h.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        C124536d dVar = this.f343608c;
        if (dVar.f343612c) {
            Uri uri = this.f343606a;
            String str = this.f343607b;
            C124843bn bnVar = (C124843bn) C124844bo.f344417m.createBuilder();
            bnVar.copyOnWrite();
            C124844bo boVar = (C124844bo) bnVar.instance;
            boVar.f344419a |= 1;
            boVar.f344420b = str;
            C60105ky b = C124536d.m204010b(uri);
            bnVar.copyOnWrite();
            C124844bo boVar2 = (C124844bo) bnVar.instance;
            boVar2.f344428j = b.f162530s;
            boVar2.f344419a |= 256;
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(new Intent().setComponent(ComponentName.createRelative(dVar.f343614e, "com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity")).putExtra("args", new ProtoParsers.InternalDontUse((byte[]) null, (C124844bo) bnVar.build()))));
        }
        Uri uri2 = this.f343606a;
        String str2 = this.f343607b;
        C60105ky b2 = C124536d.m204010b(uri2);
        if (this.f343608c.f343613d && b2 == C60105ky.ANDROID_OOBE_FAST_PAIR_HALF_SHEET) {
            return m204004f(str2, b2, kVar);
        }
        if (b2 == C60105ky.ANDROID_OOBE_COMPANION_VOICE_MATCH_ONLY || b2 == C60105ky.ANDROID_OOBE_COMPANION_POST_GESTURE_CONFIG) {
            return m204004f(str2, b2, kVar);
        }
        String queryParameter = uri2.getQueryParameter("source");
        int i = 703;
        if (queryParameter != null && C124536d.f343609a.containsKey(queryParameter)) {
            i = ((Integer) C124536d.f343609a.get(queryParameter)).intValue();
        }
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(new Intent().setPackage("com.google.android.googlequicksearchbox").setData(C22020a.m41268a(str2, i))));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
