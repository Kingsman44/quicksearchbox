package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127415b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127416c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127434k;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127455c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.b.b */
/* compiled from: PG */
public final class C127491b {

    /* renamed from: a */
    public final C127494e f351009a;

    public C127491b(C127494e eVar) {
        C69664n.m101061g(eVar, "screenStateHelper");
        this.f351009a = eVar;
    }

    /* renamed from: a */
    public static final int m208455a(C127416c cVar) {
        C69664n.m101061g(cVar, "deeplinkEntryPointContext");
        C127415b a = C127415b.m208370a(cVar.f350848b);
        if (a == null) {
            a = C127415b.UNRECOGNIZED;
        }
        if (C127490a.f351007a[a.ordinal()] == 1) {
            return e.aw.ca;
        }
        C127415b a2 = C127415b.m208370a(cVar.f350848b);
        if (a2 == null) {
            a2 = C127415b.UNRECOGNIZED;
        }
        new StringBuilder("Invalid DeeplinkEntryPointType! ").append(a2);
        throw new IllegalArgumentException("Invalid DeeplinkEntryPointType! ".concat(String.valueOf(a2)));
    }

    /* renamed from: b */
    public static final int m208456b(C127455c cVar) {
        e eVar;
        C69664n.m101061g(cVar, "selfTriggerEntryPointContext");
        C127454b a = C127454b.m208419a(cVar.f350938a);
        if (a == null) {
            a = C127454b.UNRECOGNIZED;
        }
        C127470b bVar = C127470b.UNKNOWN;
        C127415b bVar2 = C127415b.UNKNOWN;
        C127434k kVar = C127434k.UNKNOWN;
        switch (a.ordinal()) {
            case 1:
                eVar = e.w;
                break;
            case 2:
                eVar = e.A;
                break;
            case 3:
                eVar = e.u;
                break;
            case 4:
                eVar = e.S;
                break;
            case 5:
                eVar = e.bC;
                break;
            case 6:
                eVar = e.t;
                break;
            case 7:
                eVar = e.h;
                break;
            case 8:
                eVar = e.F;
                break;
            default:
                C127454b a2 = C127454b.m208419a(cVar.f350938a);
                if (a2 == null) {
                    a2 = C127454b.UNRECOGNIZED;
                }
                new StringBuilder("Invalid SelfTriggerEntryPointType! ").append(a2);
                throw new IllegalArgumentException("Invalid SelfTriggerEntryPointType! ".concat(String.valueOf(a2)));
        }
        return eVar.ca;
    }
}
