package com.google.android.apps.search.googleapp.search.p10418j;

import android.content.Context;
import android.os.UserManager;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.j.h */
/* compiled from: PG */
public final class C137534h {

    /* renamed from: a */
    public final UserManager f374071a;

    /* renamed from: b */
    public final Context f374072b;

    /* renamed from: c */
    private final C46723bg f374073c;

    /* renamed from: d */
    private final C71422aw f374074d;

    public C137534h(C46723bg bgVar, UserManager userManager, C71422aw awVar, Context context) {
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(context, "context");
        this.f374073c = bgVar;
        this.f374071a = userManager;
        this.f374074d = awVar;
        this.f374072b = context;
    }

    /* renamed from: a */
    public final C46689ag mo113800a() {
        return new C46719bc(this.f374073c, new C137532f(this), "enable_google_search");
    }

    /* renamed from: b */
    public final C60870cx mo113801b() {
        return C71663i.m104692e(this.f374074d, (C71424ay) null, new C137533g(this, (C69577g) null), 3);
    }
}
