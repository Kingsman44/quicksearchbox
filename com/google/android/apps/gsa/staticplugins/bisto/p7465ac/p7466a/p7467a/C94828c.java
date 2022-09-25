package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95010a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95012c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.android.libraries.assistant.accessory.gmutls.C11022e;
import com.google.android.libraries.assistant.accessory.p617a.C10992c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.c */
/* compiled from: PG */
public final class C94828c {

    /* renamed from: a */
    public static final C59071e f265160a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.c");

    /* renamed from: b */
    public final C95010a f265161b;

    /* renamed from: c */
    public volatile C58833ax f265162c = C58836b.f156633a;

    /* renamed from: d */
    public final Context f265163d;

    /* renamed from: e */
    public final C94837l f265164e;

    /* renamed from: f */
    public final C94821ai f265165f;

    /* renamed from: g */
    public final C11022e f265166g = new C11022e();

    /* renamed from: h */
    public volatile int f265167h = 608;

    /* renamed from: i */
    public volatile C10992c f265168i;

    /* renamed from: j */
    public volatile C10992c f265169j;

    /* renamed from: k */
    public volatile C10992c f265170k;

    /* renamed from: l */
    public final AtomicInteger f265171l = new AtomicInteger(20);

    /* renamed from: m */
    public volatile C10992c f265172m = new C10992c(608);

    /* renamed from: n */
    public final ConcurrentLinkedQueue f265173n = new ConcurrentLinkedQueue();

    /* renamed from: o */
    public final AtomicBoolean f265174o = new AtomicBoolean(true);

    /* renamed from: p */
    private final C89656k f265175p;

    public C94828c(C95010a aVar, Context context, C94837l lVar, C94821ai aiVar, C89656k kVar) {
        this.f265161b = aVar;
        this.f265163d = context;
        this.f265164e = lVar;
        this.f265165f = aiVar;
        this.f265175p = kVar;
    }

    /* renamed from: a */
    public final C58833ax mo88645a(String str) {
        C95012c cVar = (C95012c) mo88646b().mo56111f();
        if (cVar == null) {
            C59104x d = f265160a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GacsBleConnection");
            ((C59052c) ((C59052c) d).mo56372aa(17447)).mo56386p("Failed to get characteristic with invalid service");
            return C58836b.f156633a;
        }
        BluetoothGattCharacteristic characteristic = cVar.f265821a.getCharacteristic(UUID.fromString(str));
        if (characteristic != null) {
            return C58833ax.m90834k(characteristic);
        }
        C59104x b = f265160a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnection");
        ((C59052c) ((C59052c) b).mo56372aa(17446)).mo56386p("Failed to get characteristic");
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C58833ax mo88646b() {
        return this.f265162c.mo56113h() ? C58833ax.m90833j(((C95013d) this.f265162c.mo56107c()).mo88920b(C94842q.f265234a)) : C58836b.f156633a;
    }

    /* renamed from: c */
    public final boolean mo88647c() {
        return !this.f265175p.mo83553h("disableEncryption");
    }
}
