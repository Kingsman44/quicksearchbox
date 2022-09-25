package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dt */
/* compiled from: PG */
public final class C62122dt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62122dt f167749a;

    /* renamed from: c */
    private static volatile C63010eb f167750c;

    /* renamed from: b */
    private byte f167751b = 2;

    static {
        C62122dt dtVar = new C62122dt();
        f167749a = dtVar;
        C62942bv.registerDefaultInstance(C62122dt.class, dtVar);
    }

    private C62122dt() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167751b);
            case 1:
                this.f167751b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167749a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62122dt();
            case 4:
                return new C62121ds();
            case 5:
                return f167749a;
            case 6:
                C63010eb ebVar = f167750c;
                if (ebVar == null) {
                    synchronized (C62122dt.class) {
                        ebVar = f167750c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167749a);
                            f167750c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
