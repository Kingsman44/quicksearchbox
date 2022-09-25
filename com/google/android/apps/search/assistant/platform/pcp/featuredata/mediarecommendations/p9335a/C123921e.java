package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a;

import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.e */
/* compiled from: PG */
public final class C123921e implements C123923g {

    /* renamed from: a */
    private final C123918b f342282a;

    public C123921e(C123918b bVar) {
        C69664n.m101061g(bVar, "appHeadphoneContext");
        this.f342282a = bVar;
    }

    /* renamed from: a */
    public final C123918b mo106181a() {
        return this.f342282a;
    }

    /* renamed from: b */
    public final C18913ab mo106185b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C123921e) && C69664n.m101066l(this.f342282a, ((C123921e) obj).f342282a) && C69664n.m101066l((Object) null, (Object) null);
    }

    public final int hashCode() {
        return this.f342282a.hashCode() * 31;
    }

    public final String toString() {
        C123918b bVar = this.f342282a;
        return "FromCache(appHeadphoneContext=" + bVar + ", onDeviceMediaItems=null)";
    }
}
