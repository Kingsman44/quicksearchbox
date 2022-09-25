package com.google.p4481ch.p4482a.p4483a.p4484a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.ch.a.a.a.b */
/* compiled from: PG */
public final class C58085b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C58085b f155263a;

    /* renamed from: e */
    private static volatile C63010eb f155264e;

    /* renamed from: b */
    private int f155265b;

    /* renamed from: c */
    private C63771b f155266c;

    /* renamed from: d */
    private byte f155267d = 2;

    static {
        C58085b bVar = new C58085b();
        f155263a = bVar;
        C62942bv.registerDefaultInstance(C58085b.class, bVar);
    }

    private C58085b() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155267d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155267d = b;
                return null;
            case 2:
                return newMessageInfo(f155263a, "\u0001\u0001\u0000\u0001%%\u0001\u0000\u0000\u0001%ᐉ\n", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C58085b();
            case 4:
                return new C58084a();
            case 5:
                return f155263a;
            case 6:
                C63010eb ebVar = f155264e;
                if (ebVar == null) {
                    synchronized (C58085b.class) {
                        ebVar = f155264e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155263a);
                            f155264e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
