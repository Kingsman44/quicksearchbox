package com.google.android.libraries.assistant.pcp.p1546d;

import com.google.assistant.p3803ag.p3809c.C49046el;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.d.a */
/* compiled from: PG */
public final class C18573a extends C18576d {

    /* renamed from: a */
    public C18579g f52593a;

    /* renamed from: b */
    public C49046el f52594b;

    /* renamed from: c */
    public Optional f52595c = Optional.empty();

    /* renamed from: d */
    public Optional f52596d = Optional.empty();

    /* renamed from: a */
    public final void mo24060a(C49046el elVar) {
        if (elVar != null) {
            this.f52594b = elVar;
            return;
        }
        throw new NullPointerException("Null featureConfig");
    }

    /* renamed from: b */
    public final void mo24061b(Optional optional) {
        if (optional != null) {
            this.f52595c = optional;
            return;
        }
        throw new NullPointerException("Null lastFeatureUpdate");
    }

    /* renamed from: c */
    public final void mo24062c(Optional optional) {
        if (optional != null) {
            this.f52596d = optional;
            return;
        }
        throw new NullPointerException("Null proactiveDataSourceId");
    }
}
