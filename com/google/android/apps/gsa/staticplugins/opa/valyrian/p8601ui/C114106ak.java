package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114216d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ak */
/* compiled from: PG */
public final class C114106ak {

    /* renamed from: a */
    public View f316241a;

    /* renamed from: b */
    public View f316242b;

    /* renamed from: c */
    public C114132bj f316243c;

    /* renamed from: d */
    public C114754h f316244d;

    /* renamed from: e */
    public C114216d f316245e;

    /* renamed from: f */
    public C109037fg f316246f;

    /* renamed from: g */
    private final Context f316247g;

    /* renamed from: h */
    private final C86124t f316248h;

    public C114106ak(Context context, C86124t tVar) {
        this.f316247g = context;
        this.f316248h = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101149a() {
        /*
            r6 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r6.f316243c
            if (r0 == 0) goto L_0x00e0
            int r0 = r0.mo101172s()
            r1 = -1
            int r0 = r0 + r1
            r2 = 1
            if (r0 == r2) goto L_0x0051
            r3 = 2
            if (r0 == r3) goto L_0x0028
            r3 = 3
            r4 = 0
            if (r0 == r3) goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0068
        L_0x0016:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r6.f316244d
            if (r0 == 0) goto L_0x0014
            boolean r4 = r0.mo101416f(r2)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r6.f316244d
            r0.getClass()
            boolean r0 = r0.mo101416f(r1)
            goto L_0x0036
        L_0x0028:
            com.google.android.apps.gsa.staticplugins.opa.webview.b.d r0 = r6.f316245e
            if (r0 == 0) goto L_0x003a
            boolean r4 = r0.mo101231j()
            com.google.android.apps.gsa.staticplugins.opa.webview.b.d r0 = r6.f316245e
            boolean r0 = r0.mo101230i()
        L_0x0036:
            r5 = r4
            r4 = r0
            r0 = r5
            goto L_0x0068
        L_0x003a:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r6.f316243c
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r0.f316351m
            boolean r4 = r0.canScrollVertically(r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r6.f316243c
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r0.f316351m
            boolean r0 = r0.canScrollVertically(r1)
            goto L_0x0036
        L_0x0051:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r6.f316243c
            r0.getClass()
            android.support.v7.widget.RecyclerView r0 = r0.f316352n
            boolean r4 = r0.canScrollVertically(r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r6.f316243c
            r0.getClass()
            android.support.v7.widget.RecyclerView r0 = r0.f316352n
            boolean r0 = r0.canScrollVertically(r1)
            goto L_0x0036
        L_0x0068:
            if (r4 == 0) goto L_0x008e
            android.content.Context r1 = r6.f316247g
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131166593(0x7f070581, float:1.7947436E38)
            float r1 = r1.getDimension(r3)
            android.view.View r3 = r6.f316241a
            if (r3 == 0) goto L_0x007e
            r3.setElevation(r1)
        L_0x007e:
            android.view.View r3 = r6.f316242b
            if (r3 == 0) goto L_0x009d
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x009d
            android.view.View r3 = r6.f316242b
            r3.setElevation(r1)
            goto L_0x009d
        L_0x008e:
            android.view.View r1 = r6.f316241a
            r3 = 0
            if (r1 == 0) goto L_0x0096
            r1.setElevation(r3)
        L_0x0096:
            android.view.View r1 = r6.f316242b
            if (r1 == 0) goto L_0x009d
            r1.setElevation(r3)
        L_0x009d:
            com.google.android.apps.gsa.staticplugins.opa.fg r1 = r6.f316246f
            if (r1 == 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00d8
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r6.f316243c
            r0.getClass()
            int r0 = r0.f316355q
            if (r0 == r2) goto L_0x00d8
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f316248h
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247289eO
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00cb
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r6.f316243c
            r0.getClass()
            int r0 = r0.mo101172s()
            r1 = 4
            if (r0 != r1) goto L_0x00cb
            com.google.android.apps.gsa.staticplugins.opa.fg r0 = r6.f316246f
            r0.getClass()
            r0.mo97410c()
            return
        L_0x00cb:
            com.google.android.apps.gsa.staticplugins.opa.fg r0 = r6.f316246f
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r0.f303205a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r0.f303238X
            r0.mo96158aj()
            return
        L_0x00d8:
            com.google.android.apps.gsa.staticplugins.opa.fg r0 = r6.f316246f
            r0.getClass()
            r0.mo97410c()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114106ak.mo101149a():void");
    }
}
