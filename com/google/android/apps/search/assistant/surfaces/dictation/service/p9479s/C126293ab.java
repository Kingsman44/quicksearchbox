package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.common.base.C58838bb;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.ab */
/* compiled from: PG */
public abstract class C126293ab {
    /* renamed from: c */
    public static C126293ab m206509c(C63122a aVar) {
        C58838bb.m90868c(!Objects.equals(aVar, C63122a.SUCCESS_STARTED));
        return new C126331h(aVar, (C125422z) null);
    }

    /* renamed from: f */
    public static C126293ab m206510f(C125422z zVar) {
        return new C126331h(C63122a.CANCEL_ALREADY_DICTATING, zVar);
    }

    /* renamed from: a */
    public abstract C63122a mo107515a();

    /* renamed from: b */
    public abstract C125422z mo107516b();

    /* renamed from: d */
    public final C63122a mo107517d() {
        return mo107515a().equals(C63122a.CANCEL_ALREADY_DICTATING) ? C63122a.SUCCESS_STARTED : mo107515a();
    }

    /* renamed from: e */
    public final boolean mo107518e() {
        return mo107517d().equals(C63122a.SUCCESS_STARTED) && mo107516b() != null;
    }
}
