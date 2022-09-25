package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80721cw;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a */
/* compiled from: PG */
final class C75640a {

    /* renamed from: a */
    public boolean f209973a;

    /* renamed from: b */
    public boolean f209974b;

    /* renamed from: c */
    public C80721cw f209975c;

    /* renamed from: d */
    public boolean f209976d;

    /* renamed from: e */
    public C80587u f209977e;

    /* renamed from: f */
    public Optional f209978f = Optional.empty();

    /* renamed from: g */
    public Optional f209979g = Optional.empty();

    /* renamed from: h */
    public String f209980h;

    /* renamed from: i */
    public String f209981i;

    /* renamed from: j */
    public String f209982j;

    /* renamed from: k */
    public e f209983k;

    /* renamed from: l */
    public Optional f209984l = Optional.empty();

    /* renamed from: m */
    public byte f209985m;

    /* renamed from: a */
    public final void mo71770a(Optional optional) {
        if (optional != null) {
            this.f209978f = optional;
            return;
        }
        throw new NullPointerException("Null disclosureInfo");
    }

    /* renamed from: b */
    public final void mo71771b(C80587u uVar) {
        if (uVar != null) {
            this.f209977e = uVar;
            return;
        }
        throw new NullPointerException("Null freClickHandling");
    }

    /* renamed from: c */
    public final void mo71772c(C80721cw cwVar) {
        if (cwVar != null) {
            this.f209975c = cwVar;
            return;
        }
        throw new NullPointerException("Null illustrationGifType");
    }

    /* renamed from: d */
    public final void mo71773d(e eVar) {
        if (eVar != null) {
            this.f209983k = eVar;
            return;
        }
        throw new NullPointerException("Null opaTriggerType");
    }

    /* renamed from: e */
    public final void mo71774e(boolean z) {
        this.f209974b = z;
        this.f209985m = (byte) (this.f209985m | 2);
    }

    /* renamed from: f */
    public final void mo71775f(boolean z) {
        this.f209973a = z;
        this.f209985m = (byte) (this.f209985m | 1);
    }

    /* renamed from: g */
    public final void mo71776g(boolean z) {
        this.f209976d = z;
        this.f209985m = (byte) (this.f209985m | 4);
    }

    /* renamed from: h */
    public final void mo71777h(Optional optional) {
        if (optional != null) {
            this.f209984l = optional;
            return;
        }
        throw new NullPointerException("Null suggestionDisplayMode");
    }

    /* renamed from: i */
    public final void mo71778i(Optional optional) {
        if (optional != null) {
            this.f209979g = optional;
            return;
        }
        throw new NullPointerException("Null veDataOptional");
    }
}
