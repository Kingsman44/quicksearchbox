package com.google.android.apps.gsa.staticplugins.nga.p8091u;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.p5888e.C74747a;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C103908ah;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a.C103823ac;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.u.f */
/* compiled from: PG */
public final class C104135f extends C74747a {

    /* renamed from: a */
    public static final C58974d f289675a = C58974d.m91136j();

    /* renamed from: b */
    public final C103908ah f289676b;

    /* renamed from: c */
    public final Map f289677c = new ConcurrentHashMap();

    /* renamed from: d */
    private final C74720bx f289678d;

    /* renamed from: e */
    private final C29409fd f289679e;

    /* renamed from: f */
    private final C22871g f289680f;

    /* renamed from: g */
    private final C103335ap f289681g;

    /* renamed from: h */
    private final ae f289682h;

    /* renamed from: i */
    private final Random f289683i;

    /* renamed from: j */
    private final C103823ac f289684j;

    public C104135f(C74720bx bxVar, C29409fd fdVar, C22871g gVar, C103908ah ahVar, C103335ap apVar, C103823ac acVar, ae aeVar) {
        this.f289678d = bxVar;
        this.f289679e = fdVar;
        this.f289680f = gVar;
        this.f289676b = ahVar;
        this.f289681g = apVar;
        this.f289684j = acVar;
        this.f289682h = aeVar;
        this.f289683i = new Random();
    }

    /* renamed from: a */
    public final long mo93951a() {
        C58974d dVar = f289675a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21801)).mo56386p("Invoking mddBreakdownGenerator");
        C60870cx e = C90877ak.m148471e(this.f289684j.mo93864a(), 2, TimeUnit.MINUTES, this.f289680f);
        long nextLong = this.f289683i.nextLong() | 1;
        this.f289677c.put(Long.valueOf(nextLong), e);
        C90875ai.m148465b(new C104133d(this, nextLong), e, this.f289680f, "[NGA] cleanup").mo85223a(new C104134e(this, nextLong));
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21800)).mo56388r("Created pollable future with id %d", nextLong);
        return nextLong;
    }

    /* renamed from: b */
    public final Bundle mo93952b(long j) {
        C58974d dVar = f289675a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21802)).mo56388r("Polling future id = %d", j);
        Bundle bundle = new Bundle();
        Map map = this.f289677c;
        Long valueOf = Long.valueOf(j);
        C60870cx cxVar = (C60870cx) map.get(valueOf);
        if (cxVar == null) {
            bundle.putBoolean("isFound", false);
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(21808)).mo56388r("Future %d not known!", j);
            return bundle;
        }
        bundle.putBoolean("isFound", true);
        if (!cxVar.isDone()) {
            bundle.putBoolean("isDone", false);
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21807)).mo56388r("Future %d not yet done.", j);
            return bundle;
        }
        bundle.putBoolean("isDone", true);
        this.f289677c.remove(valueOf);
        if (cxVar.isCancelled()) {
            bundle.putBoolean("isCancelled", true);
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21806)).mo56388r("Future %d is cancelled", j);
            return bundle;
        }
        bundle.putBoolean("isCancelled", false);
        bundle.putBoolean("hasException", C90877ak.m148479m(cxVar, Throwable.class));
        if (C90877ak.m148479m(cxVar, Throwable.class)) {
            Throwable k = C90877ak.m148477k(cxVar, Throwable.class);
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21805)).mo56351D("Future %d encountered an exception: %s", j, k);
            bundle.putString("exception", k.toString());
            bundle.putSerializable("stacktrace", C58485gu.m89844l(k.getStackTrace()));
            return bundle;
        }
        if (C90877ak.m148480n(cxVar)) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21804)).mo56388r("Future %d succeeded, reporting result.", j);
            bundle.putByteArray("proto", ((MessageLite) C90877ak.m148474h(cxVar)).toByteArray());
        }
        ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(21803)).mo56388r("Future %d in unknown state!", j);
        return bundle;
    }

    /* renamed from: c */
    public final NgaState mo93953c() {
        return this.f289678d.mo71089f();
    }

    /* renamed from: d */
    public final String mo93954d() {
        return this.f289679e.mo34724m();
    }

    /* renamed from: e */
    public final void mo93955e() {
        C90875ai.m148465b(new C104131b(this), this.f289679e.mo34713b(), this.f289680f, "[NGA] NgaTestBinder.clearMddDownloads").mo85223a(C104132c.f289670a);
    }

    /* renamed from: f */
    public final void mo93956f(int i) {
        this.f289681g.mo93759r(i);
    }

    /* renamed from: g */
    public final void mo93957g(String str, String str2) {
        Locale forLanguageTag = Locale.forLanguageTag(str2);
        this.f289682h.f(str, forLanguageTag);
        this.f289682h.e(str, C58485gu.m89846n(forLanguageTag));
    }

    /* renamed from: h */
    public final void mo93958h(long j) {
        this.f289680f.mo28213m("[NGA] scheduleCleanup", Duration.ofMinutes(2).toMillis(), new C104130a(this, j));
    }
}
