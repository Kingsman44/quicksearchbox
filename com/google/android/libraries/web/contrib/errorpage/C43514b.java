package com.google.android.libraries.web.contrib.errorpage;

import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43374s;
import com.google.android.libraries.web.p3353c.C43376u;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.b */
/* compiled from: PG */
public enum C43514b {
    UNKNOWN,
    CONNECTIVITY,
    SSL,
    SAFE_BROWSING,
    RENDERER_GONE,
    CLIENT_DEFINED;

    /* renamed from: a */
    public static C43514b m76780a(C43362g gVar) {
        C43362g gVar2 = C43362g.UNSPECIFIED;
        int ordinal = gVar.ordinal();
        if (ordinal == 3) {
            return SSL;
        }
        if (ordinal != 4) {
            return ordinal != 5 ? UNKNOWN : SAFE_BROWSING;
        }
        return CONNECTIVITY;
    }

    /* renamed from: b */
    public static C43514b m76781b(C43376u uVar) {
        C43374s a = C43374s.m76523a(uVar.f113337j);
        if (a == null) {
            a = C43374s.RENDER_UNSUPPORTED;
        }
        if (a.equals(C43374s.RENDER_DEAD_IN_FOREGROUND)) {
            return RENDERER_GONE;
        }
        if ((uVar.f113328a & 4) == 0) {
            return CLIENT_DEFINED;
        }
        C43363h hVar = uVar.f113331d;
        if (hVar == null) {
            hVar = C43363h.f113275f;
        }
        C43362g a2 = C43362g.m76515a(hVar.f113278b);
        if (a2 == null) {
            a2 = C43362g.UNSPECIFIED;
        }
        return m76780a(a2);
    }
}
