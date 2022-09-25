package com.google.android.apps.search.googleapp.stampviewer.p10499j;

import android.net.Uri;
import com.google.android.apps.search.googleapp.amp.p10138a.C133459h;
import com.google.android.apps.search.googleapp.amp.p10138a.C133460i;
import com.google.common.base.C58827ar;
import com.google.protobuf.C62910ar;
import java.util.TreeSet;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.j.a */
/* compiled from: PG */
public final class C139434a {

    /* renamed from: a */
    public final C62910ar f379137a;

    /* renamed from: b */
    public final long f379138b;

    /* renamed from: c */
    public final long f379139c;

    /* renamed from: d */
    private final String f379140d;

    /* renamed from: e */
    private final long f379141e;

    /* renamed from: f */
    private final C139436c f379142f;

    public C139434a(String str, long j, C62910ar arVar, long j2, long j3, C139436c cVar) {
        this.f379140d = str;
        this.f379141e = j;
        this.f379137a = arVar;
        this.f379142f = cVar;
        this.f379138b = j2;
        this.f379139c = j3;
    }

    /* renamed from: a */
    public final C133459h mo114961a(String str, boolean z, boolean z2, boolean z3) {
        C133459h a = C133460i.m216626a(Uri.parse(str));
        a.mo111166d("amp_js_v", this.f379140d);
        a.mo111165c("webview", "1");
        a.f363658a.remove("amp_gsa");
        if (z) {
            a.mo111165c("prerenderSize", "1");
            a.mo111165c("visibilityState", "prerender");
        } else {
            a.mo111164b("prerenderSize");
            a.mo111165c("visibilityState", "visible");
        }
        TreeSet treeSet = new TreeSet();
        if (!z && !z3) {
            treeSet.add("education");
        }
        if (z2) {
            treeSet.add("swipe");
        }
        if (treeSet.isEmpty()) {
            a.mo111164b("cap");
        } else {
            a.mo111165c("cap", new C58827ar(",").mo56097d(treeSet));
        }
        long j = this.f379141e;
        if (j > 0) {
            a.mo111165c("storyNextUp", j + "ms");
        }
        a.mo111165c("embedMode", "4");
        a.mo111165c("lang", this.f379142f.mo114963a().getLanguage());
        a.mo111165c("showStoryUrlInfo", "0");
        a.mo111164b("paddingTop");
        return a;
    }

    /* renamed from: b */
    public final String mo114962b(String str, boolean z, boolean z2) {
        return mo114961a(str, z, z2, false).mo111163a().toString();
    }
}
