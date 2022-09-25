package com.google.p343ac.p361f.p362a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.f.a.b */
/* compiled from: PG */
public final class C6667b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C6667b f19924a;

    /* renamed from: b */
    private static volatile C63010eb f19925b;

    static {
        C6667b bVar = new C6667b();
        f19924a = bVar;
        C62942bv.registerDefaultInstance(C6667b.class, bVar);
    }

    private C6667b() {
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
                return newMessageInfo(f19924a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C6667b();
            case 4:
                return new C6666a();
            case 5:
                return f19924a;
            case 6:
                C63010eb ebVar = f19925b;
                if (ebVar == null) {
                    synchronized (C6667b.class) {
                        ebVar = f19925b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19924a);
                            f19925b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
