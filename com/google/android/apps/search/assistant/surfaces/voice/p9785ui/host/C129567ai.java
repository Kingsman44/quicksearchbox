package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.ai */
/* compiled from: PG */
public final class C129567ai {
    /* renamed from: a */
    public static final String m211554a(C129676j jVar) {
        C69664n.m101061g(jVar, "<this>");
        C129662i a = C129662i.m211713a(jVar.f355893b);
        if (a == null) {
            a = C129662i.DEFAULT_NOT_VISIBLE;
        }
        return a.name();
    }

    /* renamed from: b */
    public static final String m211555b(C129541aa aaVar) {
        C129688v vVar;
        C69664n.m101061g(aaVar, "<this>");
        int a = C129692z.m211747a(aaVar.f355593a);
        int i = a - 1;
        C129687u uVar = C129687u.TYPE_UNSPECIFIED;
        if (a != 0) {
            String str = "UNKNOWN";
            if (i == 0) {
                if (aaVar.f355593a == 1) {
                    vVar = (C129688v) aaVar.f355594b;
                } else {
                    vVar = C129688v.f355911c;
                }
                C69664n.m101060f(vVar, "activity");
                C129687u a2 = C129687u.m211745a(vVar.f355914b);
                if (a2 == null) {
                    a2 = C129687u.TYPE_UNSPECIFIED;
                }
                int ordinal = a2.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        str = "DEFAULT_ACTIVITY";
                    } else if (ordinal == 2) {
                        str = "FULLSCREEN_ACTIVITY";
                    } else if (ordinal == 3) {
                        str = "TRANSIENT_ACTIVITY";
                    } else {
                        throw new C69677g();
                    }
                }
                return "ACTIVITY=".concat(str);
            } else if (i == 1) {
                return "ASSIST_LAYER";
            } else {
                if (i == 2) {
                    return str;
                }
                throw new C69677g();
            }
        } else {
            throw null;
        }
    }
}
