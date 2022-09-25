package com.google.android.libraries.search.assistant.performer.communication;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.j */
/* compiled from: PG */
final class C35764j extends C35668dc {

    /* renamed from: a */
    private final String f93696a;

    /* renamed from: b */
    private final String f93697b;

    /* renamed from: c */
    private final C58485gu f93698c;

    /* renamed from: d */
    private final C58485gu f93699d;

    public C35764j(String str, String str2, C58485gu guVar, C58485gu guVar2) {
        this.f93696a = str;
        this.f93697b = str2;
        this.f93698c = guVar;
        this.f93699d = guVar2;
    }

    /* renamed from: a */
    public final C58485gu mo39791a() {
        return this.f93698c;
    }

    /* renamed from: b */
    public final C58485gu mo39792b() {
        return this.f93699d;
    }

    /* renamed from: c */
    public final String mo39793c() {
        return this.f93696a;
    }

    /* renamed from: d */
    public final String mo39794d() {
        return this.f93697b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35668dc) {
            C35668dc dcVar = (C35668dc) obj;
            return this.f93696a.equals(dcVar.mo39793c()) && this.f93697b.equals(dcVar.mo39794d()) && C58597ky.m90218i(this.f93698c, dcVar.mo39791a()) && C58597ky.m90218i(this.f93699d, dcVar.mo39792b());
        }
    }

    public final int hashCode() {
        return ((((((this.f93696a.hashCode() ^ 1000003) * 1000003) ^ this.f93697b.hashCode()) * 1000003) ^ this.f93698c.hashCode()) * 1000003) ^ this.f93699d.hashCode();
    }

    public final String toString() {
        String str = this.f93696a;
        String str2 = this.f93697b;
        String obj = this.f93698c.toString();
        String obj2 = this.f93699d.toString();
        return "MessageData{mimeType=" + str + ", text=" + str2 + ", attachmentUris=" + obj + ", recipients=" + obj2 + "}";
    }
}
