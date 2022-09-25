package com.google.android.apps.search.podcasts.settings.p10612a;

import android.net.Uri;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.a */
/* compiled from: PG */
public final class C141048a {

    /* renamed from: a */
    public final CharSequence f382927a;

    /* renamed from: b */
    public final String f382928b;

    /* renamed from: c */
    public final Uri f382929c;

    public C141048a(CharSequence charSequence, String str, Uri uri) {
        C69664n.m101061g(charSequence, "applicationLabel");
        C69664n.m101061g(str, "versionName");
        C69664n.m101061g(uri, "launchUri");
        this.f382927a = charSequence;
        this.f382928b = str;
        this.f382929c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141048a)) {
            return false;
        }
        C141048a aVar = (C141048a) obj;
        return C69664n.m101066l(this.f382927a, aVar.f382927a) && C69664n.m101066l(this.f382928b, aVar.f382928b) && C69664n.m101066l(this.f382929c, aVar.f382929c);
    }

    public final int hashCode() {
        return (((this.f382927a.hashCode() * 31) + this.f382928b.hashCode()) * 31) + this.f382929c.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.f382927a;
        String str = this.f382928b;
        Uri uri = this.f382929c;
        return "ApplicationInfo(applicationLabel=" + charSequence + ", versionName=" + str + ", launchUri=" + uri + ")";
    }
}
