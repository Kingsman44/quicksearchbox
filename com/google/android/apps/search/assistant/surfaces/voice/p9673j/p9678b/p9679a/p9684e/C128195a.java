package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.a */
/* compiled from: PG */
final class C128195a extends C128202h {

    /* renamed from: a */
    public String f352661a;

    /* renamed from: b */
    public Optional f352662b = Optional.empty();

    /* renamed from: c */
    private int f352663c;

    /* renamed from: d */
    private boolean f352664d;

    /* renamed from: e */
    private byte f352665e;

    /* renamed from: a */
    public final C128203i mo108356a() {
        String str;
        if (this.f352665e == 3 && (str = this.f352661a) != null) {
            return new C128196b(str, this.f352663c, this.f352662b, this.f352664d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f352661a == null) {
            sb.append(" id");
        }
        if ((this.f352665e & 1) == 0) {
            sb.append(" queryResourceId");
        }
        if ((this.f352665e & 2) == 0) {
            sb.append(" showOnLockscreen");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo108357b(int i) {
        this.f352663c = i;
        this.f352665e = (byte) (this.f352665e | 1);
    }

    /* renamed from: c */
    public final void mo108358c(boolean z) {
        this.f352664d = z;
        this.f352665e = (byte) (this.f352665e | 2);
    }
}
