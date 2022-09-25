package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.assistant.gallium.framework.p1507b.C18225c;
import com.google.common.base.C58889cz;
import com.google.protos.p5127o.C65663ar;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.b */
/* compiled from: PG */
public final class C18220b {

    /* renamed from: a */
    public C65663ar f51742a;

    /* renamed from: b */
    public C18207ak f51743b;

    /* renamed from: c */
    public C18240h f51744c;

    /* renamed from: d */
    public List f51745d;

    /* renamed from: e */
    public C18308k f51746e;

    /* renamed from: f */
    public C18225c f51747f;

    /* renamed from: g */
    public C18307j f51748g;

    /* renamed from: h */
    public String f51749h;

    /* renamed from: i */
    public Executor f51750i;

    /* renamed from: j */
    public boolean f51751j;

    /* renamed from: k */
    public boolean f51752k;

    /* renamed from: l */
    public Optional f51753l = Optional.empty();

    /* renamed from: m */
    public C58889cz f51754m;

    /* renamed from: n */
    public byte f51755n;

    /* renamed from: a */
    public final void mo23702a(boolean z) {
        this.f51752k = z;
        this.f51755n = (byte) (this.f51755n | 2);
    }

    /* renamed from: b */
    public final void mo23703b(boolean z) {
        this.f51751j = z;
        this.f51755n = (byte) (this.f51755n | 1);
    }

    /* renamed from: c */
    public final void mo23704c(Executor executor) {
        if (executor != null) {
            this.f51750i = executor;
            return;
        }
        throw new NullPointerException("Null executor");
    }

    /* renamed from: d */
    public final void mo23705d(List list) {
        if (list != null) {
            this.f51745d = list;
            return;
        }
        throw new NullPointerException("Null requestProcessors");
    }
}
