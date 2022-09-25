package com.google.android.libraries.web.weblayer.contrib.p3453b.p3454a;

import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.C43314j;
import com.google.android.libraries.web.browser.internal.C43308t;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.browser.internal.p3352a.C43282a;
import com.google.android.libraries.web.browser.internal.p3352a.C43289h;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3420k.p3421a.C43854a;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.weblayer.p3450c.p3451a.C44142m;
import java.util.HashSet;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.b.a.d */
/* compiled from: PG */
public final class C44167d implements C44107h {

    /* renamed from: a */
    public final Set f114915a = new HashSet();

    /* renamed from: b */
    private final C43854a f114916b;

    public C44167d(WebModelProvider webModelProvider) {
        C44166c cVar = new C44166c(this);
        this.f114916b = cVar;
        C43308t a = C43309u.m76408a(((C44142m) webModelProvider.mo47072a(C44142m.class)).f114865c);
        C69664n.m101061g(cVar, "browserBarsOffsetCallback");
        C43272a aVar = a.f113152b;
        C69664n.m101061g(aVar, "<this>");
        C43891f d = aVar.mo46411d(C43289h.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43314j jVar = (C43314j) d;
        C69664n.m101059e(jVar, "null cannot be cast to non-null type com.google.android.libraries.web.browser.internal.api.BrowserBarsApi");
        ((C43282a) jVar).mo46393a(cVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }
}
