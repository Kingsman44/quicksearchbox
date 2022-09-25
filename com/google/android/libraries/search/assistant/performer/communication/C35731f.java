package com.google.android.libraries.search.assistant.performer.communication;

import android.net.Uri;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f */
/* compiled from: PG */
final class C35731f extends C35545bd {

    /* renamed from: a */
    private final Uri f93642a;

    /* renamed from: b */
    private final String f93643b;

    public C35731f(Uri uri, String str) {
        if (uri != null) {
            this.f93642a = uri;
            if (str != null) {
                this.f93643b = str;
                return;
            }
            throw new NullPointerException("Null mimeType");
        }
        throw new NullPointerException("Null uri");
    }

    /* renamed from: a */
    public final Uri mo39695a() {
        return this.f93642a;
    }

    /* renamed from: b */
    public final String mo39696b() {
        return this.f93643b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35545bd) {
            C35545bd bdVar = (C35545bd) obj;
            return this.f93642a.equals(bdVar.mo39695a()) && this.f93643b.equals(bdVar.mo39696b());
        }
    }

    public final int hashCode() {
        return ((this.f93642a.hashCode() ^ 1000003) * 1000003) ^ this.f93643b.hashCode();
    }

    public final String toString() {
        String obj = this.f93642a.toString();
        String str = this.f93643b;
        return "SharableContent{uri=" + obj + ", mimeType=" + str + "}";
    }
}
