package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48678am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.da */
/* compiled from: PG */
public final class C65824da extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65824da f178945c;

    /* renamed from: d */
    private static volatile C63010eb f178946d;

    /* renamed from: a */
    public int f178947a;

    /* renamed from: b */
    public C48678am f178948b;

    static {
        C65824da daVar = new C65824da();
        f178945c = daVar;
        C62942bv.registerDefaultInstance(C65824da.class, daVar);
    }

    private C65824da() {
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
                return newMessageInfo(f178945c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65824da();
            case 4:
                return new C65822cz();
            case 5:
                return f178945c;
            case 6:
                C63010eb ebVar = f178946d;
                if (ebVar == null) {
                    synchronized (C65824da.class) {
                        ebVar = f178946d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178945c);
                            f178946d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
