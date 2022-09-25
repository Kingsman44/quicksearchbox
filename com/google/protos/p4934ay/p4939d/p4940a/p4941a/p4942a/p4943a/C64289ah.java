package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.ah */
/* compiled from: PG */
public final class C64289ah extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64289ah f173826f;

    /* renamed from: g */
    private static volatile C63010eb f173827g;

    /* renamed from: a */
    public int f173828a;

    /* renamed from: b */
    public C62971cq f173829b = emptyProtobufList();

    /* renamed from: c */
    public int f173830c;

    /* renamed from: d */
    public String f173831d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f173832e = emptyProtobufList();

    static {
        C64289ah ahVar = new C64289ah();
        f173826f = ahVar;
        C62942bv.registerDefaultInstance(C64289ah.class, ahVar);
    }

    private C64289ah() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59269a() {
        C62971cq cqVar = this.f173829b;
        if (!cqVar.mo58948c()) {
            this.f173829b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f173826f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဈ\u0001\u0004\u001b", new Object[]{"a", "b", C64285ad.class, C45240c.f118157a, C64288ag.m96377b(), "d", "e", C52023hv.class});
            case 3:
                return new C64289ah();
            case 4:
                return new C64286ae();
            case 5:
                return f173826f;
            case 6:
                C63010eb ebVar = f173827g;
                if (ebVar == null) {
                    synchronized (C64289ah.class) {
                        ebVar = f173827g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173826f);
                            f173827g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
