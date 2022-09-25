package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

import android.content.Intent;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.d */
/* compiled from: PG */
public final class C135458d {
    /* renamed from: a */
    public static C135462h m219648a(Intent intent) {
        try {
            return (C135462h) ProtoParsers.m95519b(intent, "google.app.browser.params.key", C135462h.f369059n, C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static void m219649b(C135462h hVar, Intent intent) {
        if (intent.hasExtra("google.app.browser.params.key")) {
            C135459e eVar = (C135459e) m219648a(intent).toBuilder();
            eVar.mergeFrom(hVar);
            hVar = (C135462h) eVar.build();
        }
        ProtoParsers.m95531n(intent, "google.app.browser.params.key", hVar);
    }
}
