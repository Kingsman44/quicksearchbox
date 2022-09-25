package com.google.android.apps.search.podcasts.p10560d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.search.p2998g.C38334a;
import com.google.android.libraries.search.p2998g.C38389e;
import com.google.android.libraries.search.p2998g.C38392h;
import com.google.android.libraries.search.p2998g.C38393i;
import com.google.android.libraries.search.p2998g.C38395k;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.d.a */
/* compiled from: PG */
public final class C140194a implements C38393i {

    /* renamed from: a */
    private final Context f380888a;

    /* renamed from: b */
    private final boolean f380889b;

    public C140194a(Context context, boolean z) {
        C69664n.m101061g(context, "context");
        this.f380888a = context;
        this.f380889b = z;
    }

    /* renamed from: a */
    public final C38392h mo41409a(C38395k kVar) {
        C69664n.m101061g(kVar, "deeplinkRedirectorData");
        if (!this.f380889b) {
            return C38334a.f101514a;
        }
        return C38389e.m67663a(C69540x.m100944b(new Intent("android.intent.action.VIEW", Uri.parse("https://podcasts.google.com/?ep=10")).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT").setPackage(this.f380888a.getPackageName())));
    }
}
