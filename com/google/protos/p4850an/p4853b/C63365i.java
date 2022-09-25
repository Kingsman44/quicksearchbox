package com.google.protos.p4850an.p4853b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.b.i */
/* compiled from: PG */
public final class C63365i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63365i f171246d;

    /* renamed from: f */
    private static volatile C63010eb f171247f;

    /* renamed from: a */
    public int f171248a;

    /* renamed from: b */
    public int f171249b;

    /* renamed from: c */
    public int f171250c;

    /* renamed from: e */
    private byte f171251e = 2;

    static {
        C63365i iVar = new C63365i();
        f171246d = iVar;
        C62942bv.registerDefaultInstance(C63365i.class, iVar);
    }

    private C63365i() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171251e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171251e = b;
                return null;
            case 2:
                return newMessageInfo(f171246d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C63364h.f171245a, C45240c.f118157a, C63363g.m96229b()});
            case 3:
                return new C63365i();
            case 4:
                return new C63361e();
            case 5:
                return f171246d;
            case 6:
                C63010eb ebVar = f171247f;
                if (ebVar == null) {
                    synchronized (C63365i.class) {
                        ebVar = f171247f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171246d);
                            f171247f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
