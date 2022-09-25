package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.p2904c.C37397bb;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.f */
/* compiled from: PG */
public final /* synthetic */ class C77522f implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C77522f f213595a = new C77522f();

    private /* synthetic */ C77522f() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C37397bb bbVar = (C37397bb) obj;
        if ((bbVar.f99322a & 1) != 0) {
            long j = bbVar.f99323b;
            if (j > 0) {
                return Optional.m71637of(Duration.ofMillis(j));
            }
        }
        return Optional.empty();
    }
}
