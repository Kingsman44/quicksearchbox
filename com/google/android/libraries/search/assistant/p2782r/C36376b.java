package com.google.android.libraries.search.assistant.p2782r;

import android.location.Location;
import android.util.Base64;
import com.google.common.base.C58817ah;
import com.google.common.p4580v.C60939a;
import com.google.protos.p4813ah.p4814a.p4815a.C63169b;
import com.google.protos.p4813ah.p4814a.p4815a.C63173f;
import com.google.protos.p4813ah.p4814a.p4815a.C63174g;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63178k;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import com.google.protos.p4813ah.p4814a.p4815a.C63183p;
import com.google.protos.p4813ah.p4814a.p4815a.C63185r;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.r.b */
/* compiled from: PG */
final class C36376b implements C58817ah {

    /* renamed from: a */
    public static final C36376b f94988a = new C36376b();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Location location = (Location) obj;
        C69664n.m101061g(location, "it");
        C63178k kVar = (C63178k) C63179l.f170583h.createBuilder();
        C69664n.m101060f(kVar, "newBuilder()");
        C63173f a = C69664n.m101061g(kVar, "builder");
        a.mo59190d(C63185r.CURRENT_LOCATION);
        a.mo59189c(C63183p.DEVICE_LOCATION);
        Duration ofMillis = Duration.ofMillis(location.getTime());
        C69664n.m101060f(ofMillis, "ofMillis(location.time)");
        long a2 = C60939a.m93079a(ofMillis);
        C63178k kVar2 = a.f170572a;
        kVar2.copyOnWrite();
        C63179l lVar = (C63179l) kVar2.instance;
        lVar.f170585a |= 4;
        lVar.f170588d = a2;
        C63174g gVar = (C63174g) C63175h.f170573d.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C63169b a3 = C69664n.m101061g(gVar, "builder");
        long round = Math.round(location.getLatitude() * 1.0E7d);
        C63174g gVar2 = a3.f170566a;
        gVar2.copyOnWrite();
        C63175h hVar = (C63175h) gVar2.instance;
        hVar.f170575a |= 1;
        hVar.f170576b = (int) round;
        long round2 = Math.round(location.getLongitude() * 1.0E7d);
        C63174g gVar3 = a3.f170566a;
        gVar3.copyOnWrite();
        C63175h hVar2 = (C63175h) gVar3.instance;
        hVar2.f170575a |= 2;
        hVar2.f170577c = (int) round2;
        a.mo59188b(a3.mo59186a());
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            C63178k kVar3 = a.f170572a;
            kVar3.copyOnWrite();
            C63179l lVar2 = (C63179l) kVar3.instance;
            lVar2.f170585a |= 128;
            lVar2.f170590f = accuracy * 1000.0f;
        }
        return "w ".concat(String.valueOf(Base64.encodeToString(a.mo59187a().toByteArray(), 10)));
    }
}
