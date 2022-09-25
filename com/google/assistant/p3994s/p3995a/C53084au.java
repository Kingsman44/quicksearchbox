package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.au */
/* compiled from: PG */
public final class C53084au extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53084au f139107a;

    /* renamed from: c */
    private static volatile C63010eb f139108c;

    /* renamed from: b */
    private byte f139109b = 2;

    static {
        C53084au auVar = new C53084au();
        f139107a = auVar;
        C62942bv.registerDefaultInstance(C53084au.class, auVar);
    }

    private C53084au() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139109b);
            case 1:
                this.f139109b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139107a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53084au();
            case 4:
                return new C53083at();
            case 5:
                return f139107a;
            case 6:
                C63010eb ebVar = f139108c;
                if (ebVar == null) {
                    synchronized (C53084au.class) {
                        ebVar = f139108c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139107a);
                            f139108c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
