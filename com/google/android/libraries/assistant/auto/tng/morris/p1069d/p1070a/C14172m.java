package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14186b;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c;
import com.google.common.p4526f.C59071e;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.m */
/* compiled from: PG */
public final class C14172m implements C14186b {

    /* renamed from: a */
    public static final C59071e f42930a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.d.a.m");

    /* renamed from: b */
    public final AtomicLong f42931b = new AtomicLong();

    /* renamed from: c */
    public final LinkedHashMap f42932c = new LinkedHashMap();

    /* renamed from: d */
    public final C14177r f42933d;

    /* renamed from: e */
    public Optional f42934e;

    public C14172m(C14177r rVar) {
        this.f42933d = rVar;
        this.f42934e = Optional.empty();
    }

    /* renamed from: a */
    public final C14187c mo21509a(long j) {
        return (C14187c) this.f42932c.get(Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo21510c(long j) {
        this.f42932c.remove(Long.valueOf(j));
    }

    /* renamed from: d */
    public final void mo21511d() {
        this.f42934e = Optional.empty();
    }

    /* renamed from: e */
    public final void mo21512e(C14170k kVar) {
        this.f42934e = Optional.m71637of(kVar);
    }
}
