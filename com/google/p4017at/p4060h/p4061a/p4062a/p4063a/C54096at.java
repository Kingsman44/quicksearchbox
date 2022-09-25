package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.at */
/* compiled from: PG */
public final class C54096at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54096at f141932a;

    /* renamed from: c */
    private static volatile C63010eb f141933c;

    /* renamed from: b */
    private byte f141934b = 2;

    static {
        C54096at atVar = new C54096at();
        f141932a = atVar;
        C62942bv.registerDefaultInstance(C54096at.class, atVar);
    }

    private C54096at() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141934b);
            case 1:
                this.f141934b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f141932a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54096at();
            case 4:
                return new C54095as();
            case 5:
                return f141932a;
            case 6:
                C63010eb ebVar = f141933c;
                if (ebVar == null) {
                    synchronized (C54096at.class) {
                        ebVar = f141933c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141932a);
                            f141933c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
