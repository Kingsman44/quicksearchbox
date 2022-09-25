package com.google.android.libraries.appactions.serviceengine.impl;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.arv;
import com.google.android.libraries.appactions.serviceengine.api.ExecutionAccessor;
import com.google.assistant.p3944g.p3948b.p3949a.C52937b;
import com.google.assistant.p3944g.p3948b.p3949a.C52939d;
import com.google.assistant.p3944g.p3948b.p3949a.C52946k;
import com.google.assistant.p3944g.p3948b.p3949a.C52957v;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.aq */
/* compiled from: PG */
public final class C147908aq {

    /* renamed from: a */
    public final C52957v f398983a;

    /* renamed from: b */
    private final arv f398984b;

    public C147908aq(arv arv, C52957v vVar) {
        this.f398984b = arv;
        this.f398983a = vVar;
    }

    /* renamed from: a */
    public final ExecutionAccessor mo124572a() {
        return this.f398984b.a(this.f398983a);
    }

    /* renamed from: b */
    public final Optional mo124573b() {
        C52946k kVar = this.f398983a.f138853c;
        if (kVar == null) {
            kVar = C52946k.f138824d;
        }
        if ((kVar.f138826a & 1) == 0) {
            return Optional.empty();
        }
        C52946k kVar2 = this.f398983a.f138853c;
        if (kVar2 == null) {
            kVar2 = C52946k.f138824d;
        }
        return Optional.m71637of(kVar2.f138827b);
    }

    /* renamed from: c */
    public final Optional mo124574c() {
        C52946k kVar = this.f398983a.f138853c;
        if (kVar == null) {
            kVar = C52946k.f138824d;
        }
        C52939d dVar = kVar.f138828c;
        if (dVar == null) {
            dVar = C52939d.f138804e;
        }
        int a = C52937b.m86755a(dVar.f138809d);
        if (a == 0 || a != 2) {
            return Optional.empty();
        }
        C52946k kVar2 = this.f398983a.f138853c;
        if (kVar2 == null) {
            kVar2 = C52946k.f138824d;
        }
        C52939d dVar2 = kVar2.f138828c;
        if (dVar2 == null) {
            dVar2 = C52939d.f138804e;
        }
        return Optional.m71637of(dVar2.f138807b == 2 ? (String) dVar2.f138808c : BuildConfig.FLAVOR);
    }
}
