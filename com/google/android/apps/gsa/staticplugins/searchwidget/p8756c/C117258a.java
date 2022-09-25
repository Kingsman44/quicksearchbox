package com.google.android.apps.gsa.staticplugins.searchwidget.p8756c;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6995aq.C89261d;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.p10905k.C146606e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.c.a */
/* compiled from: PG */
final class C117258a {

    /* renamed from: a */
    private static final C62910ar f325505a = C62948a.m95457h(2);

    /* renamed from: a */
    static C118474ai m194869a(Context context, C86124t tVar) {
        double millis = (double) Duration.ofMinutes(tVar.mo79743a(C89985ax.f246688aO)).toMillis();
        double d = 1.0d;
        try {
            String c = C146606e.m238841c(context.getContentResolver(), "android_id", (String) null);
            if (c != null) {
                d = 0.9d + (new Random((long) c.hashCode()).nextDouble() * 0.2d);
            }
        } catch (SecurityException unused) {
        }
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 16;
        aiVar.f328837f = true;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 1;
        Double.isNaN(millis);
        aiVar2.f328833b = (long) (millis * d);
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328834c = 1;
        aiVar3.f328832a |= 2;
        return (C118474ai) ahVar.build();
    }

    /* renamed from: b */
    static C118474ai m194870b(C84474e eVar) {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = TimeUnit.HOURS.toMillis(Math.max(C62948a.m95451b(eVar.mo78118g()), C62948a.m95451b(f325505a)));
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 4;
        aiVar2.f328835d = true;
        boolean U = eVar.mo78076U();
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328832a |= 16;
        aiVar3.f328837f = !U;
        return (C118474ai) ahVar.build();
    }

    /* renamed from: c */
    static C118474ai m194871c() {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = Duration.ofHours(8).toMillis();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 4;
        aiVar2.f328835d = true;
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328832a |= 16;
        aiVar3.f328837f = true;
        return (C118474ai) ahVar.build();
    }

    /* renamed from: d */
    static C42876ab m194872d(Context context, C42880af afVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("searchwidget");
        a.f111968c = "searchwidget";
        a.mo45821b("SearchWidgetDisabledTimestamp.pb");
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C89261d.f242033c);
        return afVar.mo45979a(i.mo45964a());
    }
}
