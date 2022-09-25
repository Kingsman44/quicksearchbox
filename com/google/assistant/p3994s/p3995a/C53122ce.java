package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ce */
/* compiled from: PG */
public final class C53122ce extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C53122ce f139215b;

    /* renamed from: d */
    private static volatile C63010eb f139216d;

    /* renamed from: a */
    public C62961ch f139217a = emptyIntList();

    /* renamed from: c */
    private byte f139218c = 2;

    static {
        C53122ce ceVar = new C53122ce();
        f139215b = ceVar;
        C62942bv.registerDefaultInstance(C53122ce.class, ceVar);
    }

    private C53122ce() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139218c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139218c = b;
                return null;
            case 2:
                return newMessageInfo(f139215b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C53121cd.m86779b()});
            case 3:
                return new C53122ce();
            case 4:
                return new C53119cb();
            case 5:
                return f139215b;
            case 6:
                C63010eb ebVar = f139216d;
                if (ebVar == null) {
                    synchronized (C53122ce.class) {
                        ebVar = f139216d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139215b);
                            f139216d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
