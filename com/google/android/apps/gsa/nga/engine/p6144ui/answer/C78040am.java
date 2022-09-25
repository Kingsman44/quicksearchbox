package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.am */
/* compiled from: PG */
final class C78040am extends C78033af {

    /* renamed from: a */
    public Optional f214973a = Optional.empty();

    /* renamed from: b */
    public Optional f214974b = Optional.empty();

    /* renamed from: c */
    public Optional f214975c = Optional.empty();

    /* renamed from: d */
    public Optional f214976d = Optional.empty();

    /* renamed from: e */
    public C58485gu f214977e;

    /* renamed from: f */
    public boolean f214978f;

    /* renamed from: g */
    public boolean f214979g;

    /* renamed from: h */
    public boolean f214980h;

    /* renamed from: i */
    public final Optional f214981i = Optional.empty();

    /* renamed from: j */
    public byte f214982j;

    /* renamed from: a */
    public final void mo72991a(boolean z) {
        this.f214978f = z;
        this.f214982j = (byte) (this.f214982j | 1);
    }

    /* renamed from: b */
    public final void mo72992b(boolean z) {
        this.f214980h = z;
        this.f214982j = (byte) (this.f214982j | 4);
    }

    /* renamed from: c */
    public final void mo72993c(boolean z) {
        this.f214979g = z;
        this.f214982j = (byte) (this.f214982j | 2);
    }

    /* renamed from: d */
    public final void mo72994d(C58485gu guVar) {
        if (guVar != null) {
            this.f214977e = guVar;
            return;
        }
        throw new NullPointerException("Null suggestions");
    }
}
