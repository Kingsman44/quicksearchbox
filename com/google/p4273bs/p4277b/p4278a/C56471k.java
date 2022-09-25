package com.google.p4273bs.p4277b.p4278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.k */
/* compiled from: PG */
public final class C56471k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56471k f150847a;

    /* renamed from: c */
    private static volatile C63010eb f150848c;

    /* renamed from: b */
    private byte f150849b = 2;

    static {
        C56471k kVar = new C56471k();
        f150847a = kVar;
        C62942bv.registerDefaultInstance(C56471k.class, kVar);
    }

    private C56471k() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150849b);
            case 1:
                this.f150849b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f150847a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56471k();
            case 4:
                return new C56470j();
            case 5:
                return f150847a;
            case 6:
                C63010eb ebVar = f150848c;
                if (ebVar == null) {
                    synchronized (C56471k.class) {
                        ebVar = f150848c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150847a);
                            f150848c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
