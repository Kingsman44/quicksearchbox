package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.b.a */
/* compiled from: PG */
public final class C124541a extends C124547c {

    /* renamed from: a */
    private final String f343622a;

    /* renamed from: b */
    private final Optional f343623b;

    public C124541a(String str, Optional optional) {
        if (str != null) {
            this.f343622a = str;
            if (optional != null) {
                this.f343623b = optional;
                return;
            }
            throw new NullPointerException("Null lastDownloadedTime");
        }
        throw new NullPointerException("Null modelId");
    }

    /* renamed from: a */
    public final Optional mo106455a() {
        return this.f343623b;
    }

    /* renamed from: b */
    public final String mo106456b() {
        return this.f343622a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124547c) {
            C124547c cVar = (C124547c) obj;
            return this.f343622a.equals(cVar.mo106456b()) && this.f343623b.equals(cVar.mo106455a());
        }
    }

    public final int hashCode() {
        return ((this.f343622a.hashCode() ^ 1000003) * 1000003) ^ this.f343623b.hashCode();
    }

    public final String toString() {
        String str = this.f343622a;
        String obj = this.f343623b.toString();
        return "BistoDeviceCustomizeInfoMetadata{modelId=" + str + ", lastDownloadedTime=" + obj + "}";
    }
}
