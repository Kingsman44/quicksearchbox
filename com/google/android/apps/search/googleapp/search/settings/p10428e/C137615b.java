package com.google.android.apps.search.googleapp.search.settings.p10428e;

import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.b */
/* compiled from: PG */
public final class C137615b {

    /* renamed from: a */
    public static final C59071e f374325a = C59071e.m91331h();

    /* renamed from: b */
    public static final C46440f f374326b = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C137615b.f374325a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41014));
            cVar.mo56386p("Failed to update search region setting");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59052c cVar = (C59052c) C137615b.f374325a.mo56224b();
            cVar.mo56379ah(new C59094n(41015));
            cVar.mo56386p("Search region was updated");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: c */
    public final C137612a f374327c;

    /* renamed from: d */
    public final String f374328d;

    /* renamed from: e */
    public final String f374329e;

    /* renamed from: f */
    public boolean f374330f = false;

    public C137615b(C137612a aVar, String str, String str2) {
        C69664n.m101061g(aVar, "itemType");
        C69664n.m101061g(str, "displayName");
        C69664n.m101061g(str2, "regionCode");
        this.f374327c = aVar;
        this.f374328d = str;
        this.f374329e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137615b)) {
            return false;
        }
        C137615b bVar = (C137615b) obj;
        return this.f374327c == bVar.f374327c && C69664n.m101066l(this.f374328d, bVar.f374328d) && C69664n.m101066l(this.f374329e, bVar.f374329e) && this.f374330f == bVar.f374330f;
    }

    public final int hashCode() {
        return (((((this.f374327c.hashCode() * 31) + this.f374328d.hashCode()) * 31) + this.f374329e.hashCode()) * 31) + (this.f374330f ? 1 : 0);
    }

    public final String toString() {
        C137612a aVar = this.f374327c;
        String str = this.f374328d;
        String str2 = this.f374329e;
        boolean z = this.f374330f;
        return "RegionListEntry(itemType=" + aVar + ", displayName=" + str + ", regionCode=" + str2 + ", isSelected=" + z + ")";
    }
}
