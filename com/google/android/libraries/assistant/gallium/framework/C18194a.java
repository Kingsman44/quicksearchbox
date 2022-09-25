package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.assistant.gallium.framework.p1507b.C18225c;
import com.google.common.base.C58889cz;
import com.google.protos.p5127o.C65663ar;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.a */
/* compiled from: PG */
public final class C18194a {

    /* renamed from: a */
    public C65663ar f51705a;

    /* renamed from: b */
    public C18207ak f51706b;

    /* renamed from: c */
    public C18240h f51707c;

    /* renamed from: d */
    public C18307j f51708d;

    /* renamed from: e */
    public File f51709e;

    /* renamed from: f */
    public File f51710f;

    /* renamed from: g */
    public List f51711g;

    /* renamed from: h */
    public C18308k f51712h;

    /* renamed from: i */
    public C18225c f51713i;

    /* renamed from: j */
    public String f51714j;

    /* renamed from: k */
    public boolean f51715k;

    /* renamed from: l */
    public boolean f51716l;

    /* renamed from: m */
    public Executor f51717m;

    /* renamed from: n */
    public Optional f51718n = Optional.empty();

    /* renamed from: o */
    public C58889cz f51719o;

    /* renamed from: p */
    public byte f51720p;

    /* renamed from: a */
    public final void mo23671a(boolean z) {
        this.f51716l = z;
        this.f51720p = (byte) (this.f51720p | 2);
    }

    /* renamed from: b */
    public final void mo23672b(boolean z) {
        this.f51715k = z;
        this.f51720p = (byte) (this.f51720p | 1);
    }

    /* renamed from: c */
    public final void mo23673c(Executor executor) {
        if (executor != null) {
            this.f51717m = executor;
            return;
        }
        throw new NullPointerException("Null executor");
    }

    /* renamed from: d */
    public final void mo23674d(List list) {
        if (list != null) {
            this.f51711g = list;
            return;
        }
        throw new NullPointerException("Null requestProcessors");
    }
}
