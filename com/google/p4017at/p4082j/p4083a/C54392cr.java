package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63113l;

/* renamed from: com.google.at.j.a.cr */
/* compiled from: PG */
public final class C54392cr extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54392cr f142859f;

    /* renamed from: g */
    private static volatile C63010eb f142860g;

    /* renamed from: a */
    public int f142861a;

    /* renamed from: b */
    public int f142862b;

    /* renamed from: c */
    public String f142863c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f142864d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f142865e = emptyProtobufList();

    static {
        C54392cr crVar = new C54392cr();
        f142859f = crVar;
        C62942bv.registerDefaultInstance(C54392cr.class, crVar);
    }

    private C54392cr() {
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
                return newMessageInfo(f142859f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0003\u001b\u0005ဈ\u0003", new Object[]{"a", "b", C54390cp.f142858a, C45240c.f118157a, "e", C63113l.class, "d"});
            case 3:
                return new C54392cr();
            case 4:
                return new C54389co();
            case 5:
                return f142859f;
            case 6:
                C63010eb ebVar = f142860g;
                if (ebVar == null) {
                    synchronized (C54392cr.class) {
                        ebVar = f142860g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142859f);
                            f142860g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
