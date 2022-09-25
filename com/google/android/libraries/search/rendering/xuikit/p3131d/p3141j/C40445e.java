package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import android.net.Uri;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.e */
/* compiled from: PG */
public final class C40445e implements C40451k {

    /* renamed from: a */
    public static final /* synthetic */ int f106165a = 0;

    /* renamed from: b */
    private static final C40447g f106166b = C40447g.m70146b("Content-Type");

    /* renamed from: c */
    private final Executor f106167c;

    /* renamed from: d */
    private final C61531o f106168d;

    public C40445e(Executor executor, C61531o oVar) {
        this.f106167c = executor;
        this.f106168d = oVar;
    }

    /* renamed from: a */
    private final C60870cx m70142a(Uri uri, C58487gw gwVar, C63088z zVar, C40448h hVar) {
        C61363ae aeVar = new C61363ae();
        String uri2 = uri.toString();
        uri2.getClass();
        aeVar.f165930a = uri2;
        aeVar.f165933d = false;
        if (gwVar != null) {
            C58800sl lA = gwVar.mo54948A().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                aeVar.mo57932a(C61362ad.m93870b(((C40447g) entry.getKey()).mo42435a()), (String) entry.getValue());
            }
        }
        aeVar.mo57933b(C40446f.m70145a(hVar));
        if (zVar != null) {
            if (gwVar != null) {
                C40447g gVar = f106166b;
                if (gwVar.map.containsKey(gVar)) {
                    if (hVar == C40448h.POST || hVar == C40448h.PUT) {
                        aeVar.mo57934c((String) gwVar.mo55277g(gVar).get(0), ByteBuffer.wrap(zVar.mo59174N()));
                    } else {
                        String a = C40446f.m70145a(hVar);
                        throw new IllegalArgumentException("Can't send post data with " + a + " http method type.");
                    }
                }
            }
            throw new IllegalArgumentException("Can't send post data without Content-Type header.");
        }
        return C47633f.m84733g(this.f106168d.mo42484a(new C61365ag(aeVar))).mo51515h(C40444d.f106164a, this.f106167c);
    }

    /* renamed from: c */
    public final C60870cx mo42451c(Uri uri, C58487gw gwVar, C63088z zVar, boolean z) {
        return m70142a(uri, gwVar, zVar, zVar == null ? C40448h.GET : C40448h.POST);
    }

    /* renamed from: d */
    public final C60870cx mo42452d(Uri uri, C58487gw gwVar, C63088z zVar, boolean z, C40448h hVar) {
        return m70142a(uri, gwVar, zVar, hVar);
    }
}
