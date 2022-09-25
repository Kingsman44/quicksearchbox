package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.r */
/* compiled from: PG */
public final class C134658r {

    /* renamed from: a */
    public final C134659s f366693a;

    /* renamed from: b */
    public final String f366694b;

    /* renamed from: c */
    public final String f366695c;

    /* renamed from: d */
    public boolean f366696d;

    public /* synthetic */ C134658r(C134659s sVar, String str, String str2, int i) {
        str2 = (i & 4) != 0 ? BuildConfig.FLAVOR : str2;
        C69664n.m101061g(sVar, "itemType");
        C69664n.m101061g(str, "displayName");
        C69664n.m101061g(str2, "languageCode");
        this.f366693a = sVar;
        this.f366694b = str;
        this.f366695c = str2;
        this.f366696d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134658r)) {
            return false;
        }
        C134658r rVar = (C134658r) obj;
        return this.f366693a == rVar.f366693a && C69664n.m101066l(this.f366694b, rVar.f366694b) && C69664n.m101066l(this.f366695c, rVar.f366695c) && this.f366696d == rVar.f366696d;
    }

    public final int hashCode() {
        return (((((this.f366693a.hashCode() * 31) + this.f366694b.hashCode()) * 31) + this.f366695c.hashCode()) * 31) + (this.f366696d ? 1 : 0);
    }

    public final String toString() {
        C134659s sVar = this.f366693a;
        String str = this.f366694b;
        String str2 = this.f366695c;
        boolean z = this.f366696d;
        return "LanguageListEntry(itemType=" + sVar + ", displayName=" + str + ", languageCode=" + str2 + ", isSelected=" + z + ")";
    }
}
