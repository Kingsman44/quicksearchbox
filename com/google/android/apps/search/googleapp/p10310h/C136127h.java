package com.google.android.apps.search.googleapp.p10310h;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.collections.p10142a.C133493b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.common.base.C58838bb;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.h.h */
/* compiled from: PG */
public final class C136127h {
    /* renamed from: a */
    public static void m221196a(Intent intent, C136129j jVar) {
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.InternalGoogleAppActivityEntrypoint");
        intent.addFlags(268435456);
        if (jVar.mo112787i()) {
            intent.addFlags(32768);
        }
        Uri.Builder builder = new Uri.Builder();
        Uri data = intent.getData();
        if (data != null) {
            builder = data.buildUpon();
        }
        builder.scheme("ga").path("/data").appendQueryParameter("tab_type", Integer.toString(jVar.mo112777a().f379907i)).appendQueryParameter("go_back_to_discover_feed_from_srp", Boolean.toString(jVar.mo112788j()));
        if (jVar.mo112785h().isPresent()) {
            C137418g gVar = (C137418g) jVar.mo112785h().get();
            Map unmodifiableMap = Collections.unmodifiableMap(gVar.f373773e);
            int i = gVar.f373769a;
            if (!((i & 2) == 0 && (i & 4) == 0 && unmodifiableMap.isEmpty() && (gVar.f373769a & 16) == 0)) {
                C58838bb.m90868c(1 == (gVar.f373769a & 1));
                C137416e eVar = (C137416e) gVar.toBuilder();
                String trim = gVar.f373770b.trim();
                eVar.copyOnWrite();
                C137418g gVar2 = (C137418g) eVar.instance;
                trim.getClass();
                gVar2.f373769a = 1 | gVar2.f373769a;
                gVar2.f373770b = trim;
                gVar = (C137418g) eVar.build();
            }
            if (!gVar.f373770b.isEmpty() || gVar.f373776h || !gVar.f373775g.isEmpty()) {
                C59326i iVar = C59326i.f157516d;
                byte[] byteArray = gVar.toByteArray();
                builder.appendQueryParameter("ga_query_options", iVar.mo56837l(byteArray, byteArray.length));
            }
        }
        if (jVar.mo112778b().mo56113h()) {
            C59326i iVar2 = C59326i.f157516d;
            byte[] byteArray2 = ((C136123d) jVar.mo112778b().mo56107c()).toByteArray();
            builder.appendQueryParameter("discover_intent_options", iVar2.mo56837l(byteArray2, byteArray2.length));
        }
        if (jVar.mo112781e().isPresent()) {
            builder.appendQueryParameter("tab_persistence_id", (String) jVar.mo112781e().get());
        }
        if (jVar.mo112779c().isPresent()) {
            C59326i iVar3 = C59326i.f157516d;
            byte[] byteArray3 = ((C133493b) jVar.mo112779c().get()).toByteArray();
            builder.appendQueryParameter("collections_intent_options", iVar3.mo56837l(byteArray3, byteArray3.length));
        }
        if (jVar.mo112780d().isPresent()) {
            C59326i iVar4 = C59326i.f157516d;
            byte[] byteArray4 = ((C135462h) jVar.mo112780d().get()).toByteArray();
            builder.appendQueryParameter("google_app_browser_intent_options", iVar4.mo56837l(byteArray4, byteArray4.length));
        }
        if (jVar.mo112783f().isPresent()) {
            ProtoParsers.m95531n(intent, "pixel_launcher_data", (MessageLite) jVar.mo112783f().get());
        }
        if (jVar.mo112784g().isPresent()) {
            C59326i iVar5 = C59326i.f157516d;
            byte[] byteArray5 = ((C136137r) jVar.mo112784g().get()).toByteArray();
            builder.appendQueryParameter("promotion_options", iVar5.mo56837l(byteArray5, byteArray5.length));
        }
        intent.setData(builder.build());
        if (jVar.mo112789k()) {
            intent.putExtra("open_account_menu_on_start", jVar.mo112789k());
        }
    }
}
