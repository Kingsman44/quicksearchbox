package com.google.p4281bu.p4282a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bp */
/* compiled from: PG */
public final class C56532bp extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56532bp f150963g;

    /* renamed from: h */
    private static volatile C63010eb f150964h;

    /* renamed from: a */
    public C56526bj f150965a;

    /* renamed from: b */
    public C56493ad f150966b;

    /* renamed from: c */
    public C56499aj f150967c;

    /* renamed from: d */
    public C56534br f150968d;

    /* renamed from: e */
    public C62971cq f150969e = emptyProtobufList();

    /* renamed from: f */
    public C62961ch f150970f = emptyIntList();

    static {
        C56532bp bpVar = new C56532bp();
        f150963g = bpVar;
        C62942bv.registerDefaultInstance(C56532bp.class, bpVar);
    }

    private C56532bp() {
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
                return newMessageInfo(f150963g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0007,", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C56546cc.class, C10662f.f35572a});
            case 3:
                return new C56532bp();
            case 4:
                return new C56531bo();
            case 5:
                return f150963g;
            case 6:
                C63010eb ebVar = f150964h;
                if (ebVar == null) {
                    synchronized (C56532bp.class) {
                        ebVar = f150964h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150963g);
                            f150964h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
