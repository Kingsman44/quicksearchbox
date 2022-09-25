package com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a;

import com.facebook.litho.widget.C6535em;
import com.facebook.litho.widget.C6536en;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.a.k */
/* compiled from: PG */
public final class C134791k {

    /* renamed from: a */
    public final boolean f367011a;

    /* renamed from: b */
    public final boolean f367012b;

    /* renamed from: c */
    public final C47770dh f367013c;

    /* renamed from: d */
    public final boolean f367014d;

    /* renamed from: e */
    public final boolean f367015e;

    public C134791k(boolean z, boolean z2, C47770dh dhVar, boolean z3, boolean z4) {
        C69664n.m101061g(dhVar, "traceCreation");
        this.f367011a = z;
        this.f367012b = z2;
        this.f367013c = dhVar;
        this.f367014d = z3;
        this.f367015e = z4;
    }

    /* renamed from: a */
    public static /* synthetic */ C6536en m218632a(C134791k kVar, C134785e eVar, Throwable th, String str, C69626l lVar, C69626l lVar2, C69626l lVar3, C69626l lVar4, int i) {
        C134785e eVar2 = eVar;
        Throwable th2 = (i & 2) != 0 ? null : th;
        String str2 = (i & 4) != 0 ? null : str;
        C69626l lVar5 = (i & 8) != 0 ? null : lVar;
        C69626l lVar6 = (i & 16) != 0 ? null : lVar2;
        C69626l lVar7 = (i & 32) != 0 ? null : lVar3;
        C69626l lVar8 = (i & 64) != 0 ? null : lVar4;
        C69664n.m101061g(eVar, "renderData");
        int i2 = true != eVar2.f366990a ? R.layout.googleapp_discover_duplo_system_ui_error_card : R.layout.googleapp_discover_full_feed_error_card;
        C6535em emVar = new C6535em();
        C134791k kVar2 = kVar;
        emVar.f19457c = new C134786f(i2, kVar);
        emVar.f19456b = new C134789i(lVar7, eVar, kVar, str2, th2, lVar5, lVar6, lVar8);
        emVar.mo13618f(i2);
        return emVar.mo13617e();
    }
}
