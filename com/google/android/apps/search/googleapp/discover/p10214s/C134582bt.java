package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bt */
/* compiled from: PG */
public final class C134582bt {
    /* renamed from: a */
    public static final Instant m218299a(C134577bo boVar) {
        C69664n.m101061g(boVar, "<this>");
        if ((boVar.f366513a & 8) != 0) {
            C63042fg fgVar = boVar.f366517e;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C69664n.m101060f(fgVar, "this.lastUserInteractionTimestamp");
            return C62949a.m95469d(fgVar);
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(boVar.f366514b);
        C69664n.m101060f(ofEpochMilli, "{\n      Instant.ofEpochM…rInteractionTimeMs)\n    }");
        return ofEpochMilli;
    }
}
