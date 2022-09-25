package com.google.protos.p4895aw.p4902b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dj */
/* compiled from: PG */
public final class C64054dj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C64054dj f173187h;

    /* renamed from: i */
    private static volatile C63010eb f173188i;

    /* renamed from: a */
    public int f173189a;

    /* renamed from: b */
    public int f173190b;

    /* renamed from: c */
    public C62971cq f173191c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f173192d = emptyProtobufList();

    /* renamed from: e */
    public int f173193e = -1;

    /* renamed from: f */
    public boolean f173194f;

    /* renamed from: g */
    public boolean f173195g;

    static {
        C64054dj djVar = new C64054dj();
        f173187h = djVar;
        C62942bv.registerDefaultInstance(C64054dj.class, djVar);
    }

    private C64054dj() {
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
                return newMessageInfo(f173187h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"a", "b", C64052dh.f173186a, C45240c.f118157a, C64051dg.class, "d", C64051dg.class, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C64054dj();
            case 4:
                return new C64047dc();
            case 5:
                return f173187h;
            case 6:
                C63010eb ebVar = f173188i;
                if (ebVar == null) {
                    synchronized (C64054dj.class) {
                        ebVar = f173188i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173187h);
                            f173188i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
