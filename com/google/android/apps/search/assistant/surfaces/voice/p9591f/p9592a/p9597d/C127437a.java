package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9597d;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127470b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.d.a */
/* compiled from: PG */
public final class C127437a {
    /* renamed from: a */
    public static final String m208388a(C127475g gVar) {
        String str;
        C69664n.m101061g(gVar, "<this>");
        C127471c cVar = gVar.f350987c;
        if (cVar == null) {
            cVar = C127471c.f350977d;
        }
        if ((cVar.f350979a & 1) != 0) {
            C127471c cVar2 = gVar.f350987c;
            if (cVar2 == null) {
                cVar2 = C127471c.f350977d;
            }
            e a = e.a(cVar2.f350981c);
            if (a == null || (str = a.name()) == null) {
                str = "INVALID_OPA_TRIGGER_TYPE";
            }
        } else {
            str = "NOT_SET";
        }
        C127471c cVar3 = gVar.f350987c;
        if (cVar3 == null) {
            cVar3 = C127471c.f350977d;
        }
        C127470b a2 = C127470b.m208430a(cVar3.f350980b);
        if (a2 == null) {
            a2 = C127470b.UNRECOGNIZED;
        }
        String name = a2.name();
        return "EntryPointType: " + name + " triggerBy: " + str;
    }
}
