package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.j.a.eb */
/* compiled from: PG */
public final class C54430eb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54430eb f142940c;

    /* renamed from: d */
    private static volatile C63010eb f142941d;

    /* renamed from: a */
    public C63042fg f142942a;

    /* renamed from: b */
    public C54378cd f142943b;

    static {
        C54430eb ebVar = new C54430eb();
        f142940c = ebVar;
        C62942bv.registerDefaultInstance(C54430eb.class, ebVar);
    }

    private C54430eb() {
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
                return newMessageInfo(f142940c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54430eb();
            case 4:
                return new C54429ea();
            case 5:
                return f142940c;
            case 6:
                C63010eb ebVar = f142941d;
                if (ebVar == null) {
                    synchronized (C54430eb.class) {
                        ebVar = f142941d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142940c);
                            f142941d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
