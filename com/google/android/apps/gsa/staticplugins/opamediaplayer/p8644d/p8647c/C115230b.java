package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.b */
/* compiled from: PG */
public final class C115230b extends C115216am {

    /* renamed from: a */
    public final String f319771a = "oauth2:https://www.googleapis.com/auth/speakr";

    /* renamed from: a */
    public final String mo101899a() {
        return this.f319771a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C115216am) {
            return this.f319771a.equals(((C115216am) obj).mo101899a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f319771a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f319771a;
        return "SpeakrCredentials{oauthScope=" + str + "}";
    }
}
