package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.android.libraries.search.p2904c.p2952o.p2954b.C37908a;
import com.google.android.libraries.search.p2904c.p2952o.p2954b.C37909b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.n.c.a.h.t */
/* compiled from: PG */
public final /* synthetic */ class C39601t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39605x f104246a;

    public /* synthetic */ C39601t(C39605x xVar) {
        this.f104246a = xVar;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        C39605x xVar = this.f104246a;
        C37656hc hcVar = (C37656hc) obj;
        C37561eb ebVar = hcVar.mo41049a().f100041b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a == 2) {
            ((C59052c) ((C59052c) C39605x.f104254a.mo56226d()).mo56372aa(53717)).mo56386p("Hotword mic open failed.");
            xVar.mo41950b(6);
            C37561eb ebVar2 = hcVar.mo41049a().f100041b;
            if (ebVar2 == null) {
                ebVar2 = C37561eb.f99800c;
            }
            return C60856cj.m92899h(new C37902d("Hotword mic open failed.", ebVar2));
        }
        xVar.f104269p = hcVar.mo41051c();
        if (!xVar.f104269p.mo56113h() && xVar.f104261h) {
            ((C59052c) ((C59052c) C39605x.f104254a.mo56226d()).mo56372aa(53716)).mo56386p("AudioBytesReceiverRegistry doesn't exist! Try to get one from AudioAccessor for exteranl DSP hotword.");
            C37909b bVar = xVar.f104265l;
            C58833ax b = hcVar.mo41050b();
            C37360ay ayVar = xVar.f104259f.f100035d;
            if (ayVar == null) {
                ayVar = C37360ay.f99224l;
            }
            C69664n.m101061g(b, "audioAccessor");
            C69664n.m101061g(ayVar, "params");
            if (!b.mo56113h()) {
                axVar = C58836b.f156633a;
            } else {
                C37446p c = bVar.f100498c.mo40957c(ayVar, C58836b.f156633a);
                C37908a aVar = new C37908a(b, c, ayVar);
                C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(aVar), bVar.f100497b), "Converting audio access from pull to push mechanism failed", new Object[0]);
                axVar = C69664n.m101061g(c, "<this>");
            }
            xVar.f104269p = axVar;
        }
        if (!xVar.f104269p.mo56113h()) {
            xVar.mo41950b(7);
            return C60856cj.m92899h(new Exception(String.format("AudioBytesReceiverRegistry doesn't exist! Listening result has AudioAccessor: %b", new Object[]{Boolean.valueOf(hcVar.mo41050b().mo56113h())})));
        }
        xVar.f104267n = C58833ax.m90834k(C2169h.m6027a(new C39593l(xVar)));
        C39594m mVar = C39594m.f104239a;
        return C60922j.m93045h((C60870cx) xVar.f104268o.mo56107c(), C47810es.m84966f(mVar), xVar.f104258e);
    }
}
