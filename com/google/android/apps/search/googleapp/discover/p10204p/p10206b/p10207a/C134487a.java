package com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10207a;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134501g;
import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134502h;
import com.google.p4222bl.p4223a.p4224a.C56062af;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5477g.C69678a;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.b.a.a */
/* compiled from: PG */
public final class C134487a {
    /* renamed from: a */
    public static final C134502h m218246a(C56062af afVar, Context context) {
        C134501g gVar = (C134501g) C134502h.f366287f.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C69664n.m101061g(gVar, "builder");
        String str = afVar.f149374a;
        C69664n.m101060f(str, "this@toOnDeviceMediaImage.url");
        C69664n.m101061g(str, "value");
        gVar.copyOnWrite();
        C134502h hVar = (C134502h) gVar.instance;
        str.getClass();
        hVar.f366289a |= 1;
        hVar.f366290b = str;
        int b = m218247b(context, afVar.f149375b);
        gVar.copyOnWrite();
        C134502h hVar2 = (C134502h) gVar.instance;
        hVar2.f366289a |= 2;
        hVar2.f366291c = b;
        int b2 = m218247b(context, afVar.f149376c);
        gVar.copyOnWrite();
        C134502h hVar3 = (C134502h) gVar.instance;
        hVar3.f366289a |= 4;
        hVar3.f366292d = b2;
        boolean z = afVar.f149377d;
        gVar.copyOnWrite();
        C134502h hVar4 = (C134502h) gVar.instance;
        hVar4.f366289a |= 8;
        hVar4.f366293e = z;
        C62942bv build = gVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134502h) build;
    }

    /* renamed from: b */
    private static final int m218247b(Context context, int i) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        C69664n.m101060f(displayMetrics, "context.resources.displayMetrics");
        return C69678a.m101088a(((float) i) / (displayMetrics.xdpi / 160.0f));
    }
}
