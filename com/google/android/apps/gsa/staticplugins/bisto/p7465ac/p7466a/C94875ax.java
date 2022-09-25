package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.os.Looper;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.ax */
/* compiled from: PG */
final class C94875ax {

    /* renamed from: a */
    public static final C59071e f265344a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.ax");

    /* renamed from: b */
    static final Duration f265345b = Duration.ofSeconds(5);

    /* renamed from: c */
    static final Duration f265346c = Duration.ofSeconds(1);

    /* renamed from: d */
    public final C94867ap f265347d;

    /* renamed from: e */
    private C94874aw f265348e;

    /* renamed from: f */
    private final Looper f265349f;

    private C94875ax(Looper looper, C94867ap apVar) {
        this.f265349f = looper;
        this.f265347d = apVar;
    }

    /* renamed from: d */
    static C94875ax m156548d(Looper looper, C94867ap apVar) {
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        return new C94875ax(looper, apVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo88728a() {
        C94874aw awVar = this.f265348e;
        if (awVar == null) {
            C59104x d = f265344a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GattConnObserver");
            ((C59052c) ((C59052c) d).mo56372aa(17443)).mo56386p("The connection was completed before it was started, ignoring...");
        } else if (awVar.mo19488d()) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            awVar.mo19487c();
            C59104x b = f265344a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GattConnObserver");
            ((C59052c) ((C59052c) b).mo56372aa(17441)).mo56386p("Ending timer, connection attempt resolved");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo88729b() {
        C94874aw awVar = this.f265348e;
        if (awVar != null && !awVar.mo19488d()) {
            awVar.mo19487c();
        }
        C59104x b = f265344a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GattConnObserver");
        ((C59052c) ((C59052c) b).mo56372aa(17444)).mo56386p("GATT connect started, beginning countdown timer");
        C94874aw awVar2 = new C94874aw(this, this.f265349f, f265345b, f265346c);
        this.f265348e = awVar2;
        awVar2.mo19489e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo88730c() {
        C58976aa aaVar = C58975e.f156826a;
        C94874aw awVar = this.f265348e;
        if (awVar != null) {
            awVar.mo19487c();
            C59071e eVar = C94868aq.f265285a;
        }
        this.f265348e = null;
    }
}
