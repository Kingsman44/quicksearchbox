package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a */
/* compiled from: PG */
final class C122619a extends C122708p {

    /* renamed from: a */
    private final String f339801a;

    /* renamed from: b */
    private final String f339802b;

    /* renamed from: c */
    private final C63179l f339803c;

    public C122619a(String str, String str2, C63179l lVar) {
        if (str != null) {
            this.f339801a = str;
            if (str2 != null) {
                this.f339802b = str2;
                if (lVar != null) {
                    this.f339803c = lVar;
                    return;
                }
                throw new NullPointerException("Null location");
            }
            throw new NullPointerException("Null zoneIdString");
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final C63179l mo105695a() {
        return this.f339803c;
    }

    /* renamed from: b */
    public final String mo105696b() {
        return this.f339801a;
    }

    /* renamed from: c */
    public final String mo105697c() {
        return this.f339802b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122708p) {
            C122708p pVar = (C122708p) obj;
            return this.f339801a.equals(pVar.mo105696b()) && this.f339802b.equals(pVar.mo105697c()) && this.f339803c.equals(pVar.mo105695a());
        }
    }

    public final int hashCode() {
        return ((((this.f339801a.hashCode() ^ 1000003) * 1000003) ^ this.f339802b.hashCode()) * 1000003) ^ this.f339803c.hashCode();
    }

    public final String toString() {
        String str = this.f339801a;
        String str2 = this.f339802b;
        String obj = this.f339803c.toString();
        return "CacheKey{text=" + str + ", zoneIdString=" + str2 + ", location=" + obj + "}";
    }
}
