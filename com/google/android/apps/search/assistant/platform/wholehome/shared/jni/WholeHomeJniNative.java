package com.google.android.apps.search.assistant.platform.wholehome.shared.jni;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124205u;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b.C124310p;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b.C124311q;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b.C124313s;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b.C124314t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3741aa.C48168c;
import com.google.assistant.p3741aa.C48169d;
import com.google.assistant.p3741aa.C48170e;
import com.google.assistant.p3741aa.C48171f;
import com.google.assistant.p3741aa.C48172g;
import com.google.assistant.p3741aa.C48173h;
import com.google.assistant.p3741aa.C48175j;
import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3956k.C52968a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public final class WholeHomeJniNative {

    /* renamed from: a */
    public static final C59071e f343240a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.shared.jni.WholeHomeJniNative");

    /* renamed from: b */
    public final Executor f343241b;

    /* renamed from: c */
    public long f343242c = -1;

    /* renamed from: d */
    private final Context f343243d;

    /* renamed from: e */
    private final C21370a f343244e;

    /* renamed from: f */
    private final Executor f343245f;

    /* renamed from: g */
    private final C69464a f343246g;

    /* renamed from: h */
    private final C69464a f343247h;

    /* renamed from: i */
    private C124314t f343248i;

    public WholeHomeJniNative(Context context, C21370a aVar, Executor executor, Executor executor2, C69464a aVar2, C69464a aVar3) {
        Context context2 = C52968a.f138871a;
        if (context2 != null && context2 != context) {
            throw new RuntimeException("Attempting to set multiple global application contexts.");
        } else if (context != null) {
            C52968a.f138871a = context;
            this.f343243d = context;
            this.f343244e = aVar;
            this.f343245f = new C60904dr(executor);
            this.f343241b = executor2;
            this.f343246g = aVar2;
            this.f343247h = aVar3;
        } else {
            throw new RuntimeException("Global application context cannot be set to null.");
        }
    }

    private native long nativeCreateCrossDeviceService(String str, String str2, boolean z, boolean z2);

    private native void nativeDestroyCrossDeviceService(long j);

    private native void nativeEmulateOnRemoteExecution(long j, byte[] bArr);

    private native void nativeExecuteRemoteInteraction(long j, byte[] bArr);

    private native byte[] nativeGetAllRemoteDeviceStates(long j);

    private native void nativeRegisterTorusJniObject(long j, WholeHomeJniNative wholeHomeJniNative);

    private native void nativeStartCrossDeviceService(long j);

    private native void nativeStopCrossDeviceService(long j);

    private native void nativeUpdateDeviceState(long j, byte[] bArr);

    /* renamed from: a */
    public final synchronized C48160h mo106380a() {
        long j = this.f343242c;
        if (j != -1) {
            try {
                byte[] nativeGetAllRemoteDeviceStates = nativeGetAllRemoteDeviceStates(j);
                if (nativeGetAllRemoteDeviceStates == null) {
                    return C48160h.f124608d;
                }
                return (C48160h) C62942bv.parseFrom((C62942bv) C48160h.f124608d, nativeGetAllRemoteDeviceStates, C62921ba.m95368a());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36193)).mo56389s("Fail to parse GetRemoteDeviceStateResponse protobuf: %s.", e.getMessage());
                return C48160h.f124608d;
            }
        } else {
            ((C59052c) ((C59052c) f343240a.mo56226d()).mo56372aa(36194)).mo56386p("Torus native object is not initialized, this should never happen.");
            return C48160h.f124608d;
        }
    }

    /* renamed from: b */
    public final synchronized void mo106381b(C124204t tVar) {
        long j = this.f343242c;
        if (j == -1) {
            ((C59052c) ((C59052c) f343240a.mo56226d()).mo56372aa(36195)).mo56386p("Torus native object is not initialized, this should never happen.");
            C48169d dVar = tVar.f342963b;
            if (dVar == null) {
                dVar = C48169d.f124635g;
            }
            if (dVar.f124642f.size() != 0) {
                if (this.f343248i != null) {
                    C48169d dVar2 = tVar.f342963b;
                    if (dVar2 == null) {
                        dVar2 = C48169d.f124635g;
                    }
                    String str = ((C48168c) dVar2.f124642f.get(0)).f124632b;
                    long b = this.f343244e.mo26870b();
                    C124205u uVar = (C124205u) C124206v.f342964c.createBuilder();
                    String str2 = tVar.f342962a;
                    uVar.copyOnWrite();
                    str2.getClass();
                    ((C124206v) uVar.instance).f342966a = str2;
                    C48170e eVar = (C48170e) C48173h.f124650e.createBuilder();
                    C48171f fVar = (C48171f) C48172g.f124643f.createBuilder();
                    fVar.copyOnWrite();
                    C48172g gVar = (C48172g) fVar.instance;
                    str.getClass();
                    gVar.f124645a |= 1;
                    gVar.f124646b = str;
                    fVar.copyOnWrite();
                    C48172g gVar2 = (C48172g) fVar.instance;
                    gVar2.f124645a |= 2;
                    gVar2.f124649e = b * 1000;
                    C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                    C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
                    C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
                    C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
                    C52235kf kfVar = C52235kf.UNAVAILABLE;
                    kdVar.copyOnWrite();
                    C52236kg kgVar = (C52236kg) kdVar.instance;
                    kgVar.f137092b = kfVar.f137088t;
                    kgVar.f137091a |= 1;
                    dzVar.copyOnWrite();
                    C52070ec ecVar = (C52070ec) dzVar.instance;
                    C52236kg kgVar2 = (C52236kg) kdVar.build();
                    kgVar2.getClass();
                    ecVar.f136654b = kgVar2;
                    ecVar.f136653a |= 1;
                    ejVar.copyOnWrite();
                    C52078ek ekVar = (C52078ek) ejVar.instance;
                    C52070ec ecVar2 = (C52070ec) dzVar.build();
                    ecVar2.getClass();
                    ekVar.f136675c = ecVar2;
                    ekVar.f136674b = 3;
                    eoVar.copyOnWrite();
                    C52083ep epVar = (C52083ep) eoVar.instance;
                    C52078ek ekVar2 = (C52078ek) ejVar.build();
                    ekVar2.getClass();
                    epVar.f136693c = ekVar2;
                    epVar.f136692b = 3;
                    eoVar.copyOnWrite();
                    C52083ep epVar2 = (C52083ep) eoVar.instance;
                    epVar2.f136691a |= 2;
                    epVar2.f136695e = 0;
                    fVar.mo53144a(eoVar);
                    eVar.mo53143a(fVar);
                    uVar.copyOnWrite();
                    C48173h hVar = (C48173h) eVar.build();
                    hVar.getClass();
                    ((C124206v) uVar.instance).f342967b = hVar;
                    this.f343248i.mo106371a((C124206v) uVar.build());
                    return;
                }
                return;
            }
            return;
        }
        nativeExecuteRemoteInteraction(j, tVar.toByteArray());
    }

    /* renamed from: c */
    public final synchronized void mo106382c(String str) {
        long j = this.f343242c;
        if (j != -1) {
            nativeDestroyCrossDeviceService(j);
        }
        String packageName = this.f343243d.getPackageName();
        long nativeCreateCrossDeviceService = nativeCreateCrossDeviceService(str, "ondeviceserver:" + packageName + ":com.google.android.libraries.cast.usonia.adapter.service.UsoniaNativeToGmsAdapterService", ((Boolean) this.f343246g.mo17428b()).booleanValue(), ((Boolean) this.f343247h.mo17428b()).booleanValue());
        this.f343242c = nativeCreateCrossDeviceService;
        nativeRegisterTorusJniObject(nativeCreateCrossDeviceService, this);
        nativeStartCrossDeviceService(this.f343242c);
    }

    /* renamed from: d */
    public final synchronized void mo106383d() {
        long j = this.f343242c;
        if (j == -1) {
            ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36205)).mo56386p("Torus native object is not initialized, this should never happen.");
            return;
        }
        nativeStopCrossDeviceService(j);
        nativeDestroyCrossDeviceService(this.f343242c);
        this.f343242c = -1;
    }

    /* renamed from: e */
    public final synchronized void mo106384e(C48175j jVar) {
        long j = this.f343242c;
        if (j == -1) {
            ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36206)).mo56386p("Torus native object is not initialized, this should never happen.");
        } else {
            nativeUpdateDeviceState(j, jVar.toByteArray());
        }
    }

    /* renamed from: f */
    public final synchronized void mo106385f() {
        this.f343248i = null;
    }

    /* renamed from: g */
    public final synchronized void mo106386g(C124314t tVar) {
        this.f343248i = tVar;
    }

    public synchronized void handleEmulateOnRemoteExecutionResults(byte[] bArr) {
        if (bArr == null) {
            try {
                ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36198)).mo56386p("Response is null, native code fails to serialize the response.");
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36196)).mo56389s("Fail to parse RemoteExecutionResponse protobuf: %s.", e.getMessage());
            }
        } else {
            C124206v vVar = (C124206v) C62942bv.parseFrom((C62942bv) C124206v.f342964c, bArr, C62921ba.m95368a());
            C124314t tVar = this.f343248i;
            if (tVar == null) {
                ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36197)).mo56386p("Callbacks is null, this should never happen.");
                return;
            }
            C124311q qVar = new C124311q(tVar, vVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(qVar), tVar.f343163a.f343167d), "Failed to handle EmulateOnRemoteExecution results", new Object[0]);
        }
    }

    public synchronized void handleRemoteExecutionResults(byte[] bArr) {
        try {
            C124206v vVar = (C124206v) C62942bv.parseFrom((C62942bv) C124206v.f342964c, bArr, C62921ba.m95368a());
            C124314t tVar = this.f343248i;
            if (tVar == null) {
                ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36200)).mo56386p("Callbacks is null, this should never happen.");
            } else {
                tVar.mo106371a(vVar);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36199)).mo56389s("Fail to parse RemoteExecutionResponse protobuf: %s.", e.getMessage());
        }
    }

    public native void nativeHandleOnRemoteExecutionResponse(long j, byte[] bArr);

    public synchronized void onRemoteDeviceStateUpdate(byte[] bArr) {
        try {
            C48160h hVar = (C48160h) C62942bv.parseFrom((C62942bv) C48160h.f124608d, bArr, C62921ba.m95368a());
            C124314t tVar = this.f343248i;
            if (tVar == null) {
                ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36202)).mo56386p("Callbacks is null, this should never happen.");
                return;
            }
            C124310p pVar = new C124310p(tVar, hVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(pVar), tVar.f343163a.f343167d), "Usonia callbacks is not set", new Object[0]);
        } catch (Exception e) {
            ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36201)).mo56389s("Fail to parse RemoteDeviceStateUpdate protobuf: %s.", e.getMessage());
        }
    }

    public synchronized void onRemoteExecution(byte[] bArr) {
        try {
            C124204t tVar = (C124204t) C62942bv.parseFrom((C62942bv) C124204t.f342960c, bArr, C62921ba.m95368a());
            C124314t tVar2 = this.f343248i;
            if (tVar2 == null) {
                ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36204)).mo56386p("Callbacks is null, this should never happen.");
                return;
            }
            C124313s sVar = new C124313s(tVar2, tVar);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(sVar), tVar2.f343163a.f343167d);
            C124362n nVar = new C124362n(this, tVar.f342962a);
            C60856cj.m92911t(n, C47810es.m84974n(nVar), this.f343245f);
        } catch (Exception e) {
            ((C59052c) ((C59052c) f343240a.mo56225c()).mo56372aa(36203)).mo56389s("Fail to parse RemoteExecutionRequest protobuf: %s.", e.getMessage());
        }
    }
}
