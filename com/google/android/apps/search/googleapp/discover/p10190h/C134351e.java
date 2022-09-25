package com.google.android.apps.search.googleapp.discover.p10190h;

import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.h.e */
/* compiled from: PG */
public final class C134351e {

    /* renamed from: a */
    public final C134349c f365957a;

    /* renamed from: b */
    public final C47770dh f365958b;

    /* renamed from: c */
    public final C133148g f365959c;

    public C134351e(C134349c cVar, C47770dh dhVar, boolean z, boolean z2, C133148g gVar) {
        C69664n.m101061g(dhVar, "traceCreation");
        this.f365957a = cVar;
        this.f365958b = dhVar;
        this.f365959c = gVar;
        if (!z && !z2) {
            throw new AssertionError("Should only use DebugDialogFragment on dev or test builds!");
        }
    }
}
