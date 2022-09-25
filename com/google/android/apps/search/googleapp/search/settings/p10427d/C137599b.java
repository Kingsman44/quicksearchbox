package com.google.android.apps.search.googleapp.search.settings.p10427d;

import com.evernote.android.state.BuildConfig;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d.b */
/* compiled from: PG */
public final class C137599b {

    /* renamed from: a */
    public final C137598a f374275a;

    /* renamed from: b */
    public final String f374276b;

    /* renamed from: c */
    public final String f374277c;

    /* renamed from: d */
    public final C8506p f374278d;

    /* renamed from: e */
    public boolean f374279e;

    public /* synthetic */ C137599b(C137598a aVar, String str, String str2, C8506p pVar, int i) {
        str2 = (i & 4) != 0 ? BuildConfig.FLAVOR : str2;
        if ((i & 8) != 0) {
            pVar = C8506p.f29511d;
            C69664n.m101060f(pVar, "getDefaultInstance()");
        }
        C69664n.m101061g(aVar, "itemType");
        C69664n.m101061g(str, "displayName");
        C69664n.m101061g(str2, "languageCode");
        C69664n.m101061g(pVar, "searchLanguageProto");
        this.f374275a = aVar;
        this.f374276b = str;
        this.f374277c = str2;
        this.f374278d = pVar;
        this.f374279e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137599b)) {
            return false;
        }
        C137599b bVar = (C137599b) obj;
        return this.f374275a == bVar.f374275a && C69664n.m101066l(this.f374276b, bVar.f374276b) && C69664n.m101066l(this.f374277c, bVar.f374277c) && C69664n.m101066l(this.f374278d, bVar.f374278d) && this.f374279e == bVar.f374279e;
    }

    public final int hashCode() {
        return (((((((this.f374275a.hashCode() * 31) + this.f374276b.hashCode()) * 31) + this.f374277c.hashCode()) * 31) + this.f374278d.hashCode()) * 31) + (this.f374279e ? 1 : 0);
    }

    public final String toString() {
        C137598a aVar = this.f374275a;
        String str = this.f374276b;
        String str2 = this.f374277c;
        C8506p pVar = this.f374278d;
        boolean z = this.f374279e;
        return "LanguageListEntry(itemType=" + aVar + ", displayName=" + str + ", languageCode=" + str2 + ", searchLanguageProto=" + pVar + ", isSelected=" + z + ")";
    }
}
