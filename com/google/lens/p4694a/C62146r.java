package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.r */
/* compiled from: PG */
public final class C62146r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62146r f167780a;

    /* renamed from: c */
    private static volatile C63010eb f167781c;

    /* renamed from: b */
    private byte f167782b = 2;

    static {
        C62146r rVar = new C62146r();
        f167780a = rVar;
        C62942bv.registerDefaultInstance(C62146r.class, rVar);
    }

    private C62146r() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167782b);
            case 1:
                this.f167782b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167780a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62146r();
            case 4:
                return new C62145q();
            case 5:
                return f167780a;
            case 6:
                C63010eb ebVar = f167781c;
                if (ebVar == null) {
                    synchronized (C62146r.class) {
                        ebVar = f167781c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167780a);
                            f167781c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
