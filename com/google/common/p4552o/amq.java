package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.amq */
/* compiled from: PG */
public final class amq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final amq f159235g;

    /* renamed from: h */
    private static volatile C63010eb f159236h;

    /* renamed from: a */
    public int f159237a;

    /* renamed from: b */
    public int f159238b;

    /* renamed from: c */
    public int f159239c;

    /* renamed from: d */
    public int f159240d;

    /* renamed from: e */
    public int f159241e;

    /* renamed from: f */
    public int f159242f;

    static {
        amq amq = new amq();
        f159235g = amq;
        C62942bv.registerDefaultInstance(amq.class, amq);
    }

    private amq() {
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
                return newMessageInfo(f159235g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new amq();
            case 4:
                return new C59586amp();
            case 5:
                return f159235g;
            case 6:
                C63010eb ebVar = f159236h;
                if (ebVar == null) {
                    synchronized (amq.class) {
                        ebVar = f159236h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159235g);
                            f159236h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
