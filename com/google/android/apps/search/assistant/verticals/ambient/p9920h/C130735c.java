package com.google.android.apps.search.assistant.verticals.ambient.p9920h;

import com.google.assistant.p3860as.C49784bt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c */
/* compiled from: PG */
public final class C130735c extends C130696a {

    /* renamed from: a */
    public String f357921a;

    /* renamed from: b */
    public Optional f357922b = Optional.empty();

    /* renamed from: c */
    public Optional f357923c = Optional.empty();

    /* renamed from: d */
    private double f357924d;

    /* renamed from: e */
    private C49784bt f357925e;

    /* renamed from: f */
    private Optional f357926f = Optional.empty();

    /* renamed from: g */
    private byte f357927g;

    public C130735c() {
    }

    /* renamed from: a */
    public final C130701b mo109785a() {
        String str;
        C49784bt btVar;
        if (this.f357927g == 1 && (str = this.f357921a) != null && (btVar = this.f357925e) != null) {
            return new C130797d(str, this.f357924d, btVar, this.f357922b, this.f357926f, this.f357923c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f357921a == null) {
            sb.append(" androidApp");
        }
        if (this.f357927g == 0) {
            sb.append(" score");
        }
        if (this.f357925e == null) {
            sb.append(" scoreSignals");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo109786b(String str) {
        if (str != null) {
            this.f357921a = str;
            return;
        }
        throw new NullPointerException("Null androidApp");
    }

    /* renamed from: c */
    public final void mo109787c(double d) {
        this.f357924d = d;
        this.f357927g = 1;
    }

    /* renamed from: d */
    public final void mo109788d(C49784bt btVar) {
        if (btVar != null) {
            this.f357925e = btVar;
            return;
        }
        throw new NullPointerException("Null scoreSignals");
    }

    /* renamed from: e */
    public final void mo109789e(float f) {
        this.f357926f = Optional.m71637of(Float.valueOf(f));
    }

    public C130735c(C130701b bVar) {
        C130797d dVar = (C130797d) bVar;
        this.f357921a = dVar.f358032a;
        this.f357924d = dVar.f358033b;
        this.f357925e = dVar.f358034c;
        this.f357922b = dVar.f358035d;
        this.f357926f = dVar.f358036e;
        this.f357923c = dVar.f358037f;
        this.f357927g = 1;
    }
}
