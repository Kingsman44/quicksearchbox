package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lz */
/* compiled from: PG */
public final class C53386lz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53386lz f140088a;

    /* renamed from: b */
    private static volatile C63010eb f140089b;

    static {
        C53386lz lzVar = new C53386lz();
        f140088a = lzVar;
        C62942bv.registerDefaultInstance(C53386lz.class, lzVar);
    }

    private C53386lz() {
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
                return newMessageInfo(f140088a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53386lz();
            case 4:
                return new C53385ly();
            case 5:
                return f140088a;
            case 6:
                C63010eb ebVar = f140089b;
                if (ebVar == null) {
                    synchronized (C53386lz.class) {
                        ebVar = f140089b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140088a);
                            f140089b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
