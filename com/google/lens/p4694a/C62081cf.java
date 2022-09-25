package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cf */
/* compiled from: PG */
public final class C62081cf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62081cf f167684a;

    /* renamed from: b */
    private static volatile C63010eb f167685b;

    static {
        C62081cf cfVar = new C62081cf();
        f167684a = cfVar;
        C62942bv.registerDefaultInstance(C62081cf.class, cfVar);
    }

    private C62081cf() {
        emptyProtobufList();
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
                return newMessageInfo(f167684a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62081cf();
            case 4:
                return new C62080ce();
            case 5:
                return f167684a;
            case 6:
                C63010eb ebVar = f167685b;
                if (ebVar == null) {
                    synchronized (C62081cf.class) {
                        ebVar = f167685b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167684a);
                            f167685b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
