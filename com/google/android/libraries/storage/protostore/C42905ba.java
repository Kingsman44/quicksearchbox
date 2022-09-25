package com.google.android.libraries.storage.protostore;

import android.util.Log;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63134b;
import com.google.protos.p4874ap.p4877b.p4878a.C63691b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.ba */
/* compiled from: PG */
public final class C42905ba implements C43001eh {

    /* renamed from: a */
    public final C43001eh f112246a;

    /* renamed from: b */
    public final C63691b f112247b;

    /* renamed from: c */
    public final C42882ah f112248c;

    /* renamed from: d */
    public final TimeUnit f112249d;

    /* renamed from: e */
    public final C21370a f112250e;

    /* renamed from: f */
    public final C58833ax f112251f;

    /* renamed from: g */
    public final C58833ax f112252g;

    /* renamed from: h */
    public final Object f112253h = new Object();

    /* renamed from: i */
    public C60870cx f112254i;

    /* renamed from: j */
    public final C42900az f112255j;

    /* renamed from: k */
    public final int f112256k;

    /* renamed from: l */
    private final C60888db f112257l;

    /* renamed from: m */
    private final C60836bq f112258m = new C60836bq();

    /* renamed from: n */
    private final TimeUnit f112259n;

    /* renamed from: o */
    private final C62921ba f112260o;

    public C42905ba(C42897aw awVar) {
        C43001eh ehVar = awVar.f112221a;
        this.f112246a = ehVar;
        this.f112247b = awVar.f112222b;
        this.f112248c = awVar.f112223c;
        this.f112257l = awVar.f112224d;
        this.f112259n = awVar.f112229i;
        this.f112249d = awVar.f112230j;
        this.f112250e = awVar.f112225e;
        this.f112256k = awVar.f112231k;
        this.f112260o = awVar.f112226f;
        this.f112255j = ehVar instanceof C42966db ? new C42900az(this) : null;
        this.f112251f = awVar.f112227g;
        this.f112252g = awVar.f112228h;
    }

    /* renamed from: c */
    public static C60870cx m75775c(C42876ab abVar) {
        Log.v("ProtoDataStoreWithLams", "syncNow()");
        C43001eh ehVar = abVar.f112450b;
        if (ehVar instanceof C42905ba) {
            return C60922j.m93045h(abVar.mo46042d(), C47810es.m84966f(new C42883ai((C42905ba) ehVar)), C60826bg.f164896a);
        }
        throw new UnsupportedOperationException("Given protoDataStore does not have a Lams variant");
    }

    /* renamed from: a */
    public final C60930r mo45986a() {
        return new C42893as(this);
    }

    /* renamed from: b */
    public final C60870cx mo45987b() {
        Log.v("ProtoDataStoreWithLams", "performRpcSyncAndSaveResult()");
        return this.f112258m.mo57305b(C47810es.m84965e(new C42886al(this)), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C63134b mo45988d(MessageLite messageLite) {
        return (C63134b) C62942bv.parseFrom((C62942bv) C63134b.f170483h, this.f112248c.mo41368c(messageLite), this.f112260o);
    }

    /* renamed from: e */
    public final String mo45989e() {
        return this.f112246a.mo45989e();
    }

    /* renamed from: f */
    public final C60870cx mo45990f(C42954cv cvVar) {
        Log.v("ProtoDataStoreWithLams", "read()");
        return this.f112246a.mo45990f((C42954cv) null);
    }

    /* renamed from: g */
    public final C60870cx mo45991g(C60931s sVar, Executor executor, C42955cw cwVar) {
        Log.v("ProtoDataStoreWithLams", "update()");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cwVar != null) {
            return C60856cj.m92899h(new IllegalArgumentException("ProtoDataStoreWithLams::update does not support delegate UpdateParams"));
        }
        return C60922j.m93044g(this.f112246a.mo45991g(C47810es.m84966f(new C42891aq(this, sVar, atomicBoolean)), executor, C42966db.f112377o), C47810es.m84963c(new C42892ar(this, atomicBoolean)), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final void mo45992h() {
        synchronized (this.f112253h) {
            C60870cx cxVar = this.f112254i;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            this.f112254i = C60856cj.m92902k(C47810es.m84965e(new C42894at(this)), 1, this.f112259n, this.f112257l);
        }
    }
}
