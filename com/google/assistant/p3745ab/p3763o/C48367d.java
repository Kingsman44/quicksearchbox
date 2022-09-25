package com.google.assistant.p3745ab.p3763o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.o.d */
/* compiled from: PG */
public final class C48367d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48367d f125038a;

    /* renamed from: c */
    private static volatile C63010eb f125039c;

    /* renamed from: b */
    private byte f125040b = 2;

    static {
        C48367d dVar = new C48367d();
        f125038a = dVar;
        C62942bv.registerDefaultInstance(C48367d.class, dVar);
    }

    private C48367d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125040b);
            case 1:
                this.f125040b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f125038a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48367d();
            case 4:
                return new C48366c();
            case 5:
                return f125038a;
            case 6:
                C63010eb ebVar = f125039c;
                if (ebVar == null) {
                    synchronized (C48367d.class) {
                        ebVar = f125039c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125038a);
                            f125039c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
