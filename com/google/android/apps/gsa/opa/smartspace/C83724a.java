package com.google.android.apps.gsa.opa.smartspace;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.a */
/* compiled from: PG */
public final class C83724a extends C83798n {

    /* renamed from: a */
    public C58495hd f228190a;

    /* renamed from: b */
    public C58833ax f228191b;

    /* renamed from: c */
    public C58485gu f228192c;

    /* renamed from: d */
    public C58495hd f228193d;

    /* renamed from: e */
    public C58485gu f228194e;

    /* renamed from: f */
    public C58833ax f228195f;

    /* renamed from: g */
    public byte f228196g;

    /* renamed from: h */
    private C83741am f228197h;

    /* renamed from: i */
    private C58485gu f228198i;

    public C83724a() {
        C58836b bVar = C58836b.f156633a;
        this.f228191b = bVar;
        this.f228195f = bVar;
    }

    public C83724a(C83800p pVar) {
        C58836b bVar = C58836b.f156633a;
        this.f228191b = bVar;
        this.f228195f = bVar;
        C83742b bVar2 = (C83742b) pVar;
        this.f228190a = bVar2.f228255a;
        this.f228191b = bVar2.f228256b;
        this.f228197h = bVar2.f228257c;
        this.f228192c = bVar2.f228258d;
        this.f228198i = bVar2.f228259e;
        this.f228193d = bVar2.f228260f;
        this.f228194e = bVar2.f228261g;
        this.f228195f = bVar2.f228262h;
        this.f228196g = 1;
    }

    /* renamed from: a */
    public final C83800p mo77042a() {
        C58495hd hdVar;
        C83741am amVar;
        C58485gu guVar;
        C58485gu guVar2;
        C58495hd hdVar2;
        C58485gu guVar3;
        if (this.f228196g == 1 && (hdVar = this.f228190a) != null && (amVar = this.f228197h) != null && (guVar = this.f228192c) != null && (guVar2 = this.f228198i) != null && (hdVar2 = this.f228193d) != null && (guVar3 = this.f228194e) != null) {
            return new C83742b(hdVar, this.f228191b, amVar, guVar, guVar2, hdVar2, guVar3, this.f228195f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f228190a == null) {
            sb.append(" primaryCardsMapInCache");
        }
        if (this.f228197h == null) {
            sb.append(" newUpdateCard");
        }
        if (this.f228192c == null) {
            sb.append(" newUpdateCardIcon");
        }
        if (this.f228198i == null) {
            sb.append(" smartspaceChipsList");
        }
        if (this.f228193d == null) {
            sb.append(" primaryCardCachedIconMap");
        }
        if (this.f228194e == null) {
            sb.append(" weatherCardInCacheIcon");
        }
        if (this.f228196g == 0) {
            sb.append(" isTriggeringCardPresent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77043b(C83741am amVar) {
        if (amVar != null) {
            this.f228197h = amVar;
            return;
        }
        throw new NullPointerException("Null newUpdateCard");
    }

    /* renamed from: c */
    public final void mo77044c(List list) {
        this.f228192c = C58485gu.m89842j(list);
    }

    /* renamed from: d */
    public final void mo77045d(C58495hd hdVar) {
        this.f228190a = hdVar;
    }

    /* renamed from: e */
    public final void mo77046e(C58485gu guVar) {
        if (guVar != null) {
            this.f228198i = guVar;
            return;
        }
        throw new NullPointerException("Null smartspaceChipsList");
    }

    /* renamed from: f */
    public final void mo77047f(C58833ax axVar) {
        if (axVar != null) {
            this.f228191b = axVar;
            return;
        }
        throw new NullPointerException("Null weatherCardInCache");
    }

    /* renamed from: g */
    public final void mo77048g(List list) {
        this.f228194e = C58485gu.m89842j(list);
    }
}
