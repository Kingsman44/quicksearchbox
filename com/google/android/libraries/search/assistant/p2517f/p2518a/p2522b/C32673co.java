package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32853cu;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32916k;
import com.google.common.p4522b.C58322at;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.co */
/* compiled from: PG */
public final class C32673co implements C32916k {

    /* renamed from: a */
    public final C32664cf f87567a;

    /* renamed from: b */
    public final C32650bs f87568b;

    public C32673co(int i) {
        C32664cf cfVar = new C32664cf();
        this.f87567a = cfVar;
        this.f87568b = new C32650bs(i, cfVar);
    }

    /* renamed from: a */
    public final void mo38233a(C32796ar arVar) {
        C69664n.m101061g(arVar, "contextKey");
        C32650bs bsVar = this.f87568b;
        C69664n.m101061g(arVar, "contextKey");
        Set<C32810be> i = ((C58322at) bsVar.f87515a).mo54987i(arVar);
        C69664n.m101060f(i, "keyToRequestMap.removeAll(contextKey)");
        for (C32810be remove : i) {
            bsVar.f87516b.remove(remove);
        }
    }

    /* renamed from: b */
    public final void mo38234b(C32680cv cvVar) {
        List list = cvVar.f87586b;
        ArrayList<C32853cu> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (!((C32853cu) next).f88073e) {
                arrayList.add(next);
            }
        }
        for (C32853cu cuVar : arrayList) {
            C32796ar arVar = cuVar.f88070b;
            if (arVar == null) {
                arVar = C32796ar.f87973c;
            }
            C69664n.m101060f(arVar, "it.contextKey");
            mo38233a(arVar);
        }
    }

    /* renamed from: e */
    public final Object mo38184e(String str, Instant instant, C69577g gVar) {
        return this.f87568b.mo38184e(BuildConfig.FLAVOR, instant, gVar);
    }
}
