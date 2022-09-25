package com.google.android.libraries.lens.view.main;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26750b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.aae;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.lens.view.main.bh */
/* compiled from: PG */
public final /* synthetic */ class C27318bh implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C27321bk f74740a;

    /* renamed from: b */
    public final /* synthetic */ C26750b f74741b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f74742c;

    /* renamed from: d */
    public final /* synthetic */ RectF f74743d;

    /* renamed from: e */
    public final /* synthetic */ C26733ab f74744e;

    /* renamed from: f */
    public final /* synthetic */ aae f74745f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f74746g;

    public /* synthetic */ C27318bh(C27321bk bkVar, C26750b bVar, Bitmap bitmap, RectF rectF, C26733ab abVar, aae aae, C58833ax axVar) {
        this.f74740a = bkVar;
        this.f74741b = bVar;
        this.f74742c = bitmap;
        this.f74743d = rectF;
        this.f74744e = abVar;
        this.f74745f = aae;
        this.f74746g = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C27321bk bkVar = this.f74740a;
        C26750b bVar = this.f74741b;
        Bitmap bitmap = this.f74742c;
        RectF rectF = this.f74743d;
        C26733ab abVar = this.f74744e;
        aae aae = this.f74745f;
        C58833ax axVar = this.f74746g;
        SettableFuture d = bVar.mo32083d();
        C58838bb.m90866a(d, "Each frame sent for prefetch has to be sent to tracker.");
        C27316bf bfVar = new C27316bf(bkVar, bVar, bitmap, rectF, abVar, aae, axVar);
        return C60922j.m93044g(d, C47810es.m84963c(bfVar), bkVar.f74748a.f74799d);
    }
}
