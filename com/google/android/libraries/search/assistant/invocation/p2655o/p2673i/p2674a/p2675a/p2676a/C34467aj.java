package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import android.content.Context;
import com.google.android.libraries.search.assistant.p2697j.p2698a.p2699a.C34733h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d.C39493h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39506k;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71553dc;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.aj */
/* compiled from: PG */
public final class C34467aj {

    /* renamed from: a */
    public static final C59071e f91580a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f91581b;

    /* renamed from: c */
    public final C39506k f91582c;

    /* renamed from: d */
    public final C47770dh f91583d;

    /* renamed from: e */
    public final C71553dc f91584e;

    /* renamed from: f */
    public final C39493h f91585f;

    /* renamed from: g */
    private final C71422aw f91586g;

    public C34467aj(Context context, C39506k kVar, C39493h hVar, C71422aw awVar, C47770dh dhVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(kVar, "hotwordService");
        C69664n.m101061g(hVar, "hotwordInformationProvider");
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f91581b = context;
        this.f91582c = kVar;
        this.f91585f = hVar;
        this.f91586g = awVar;
        this.f91583d = dhVar;
        this.f91584e = C34733h.m63473a("VOICE_MATCH_SETTINGS", new C34463af(this, (C69577g) null), new C34465ah(this), awVar);
    }
}
