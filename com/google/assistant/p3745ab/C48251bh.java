package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.bh */
/* compiled from: PG */
public final class C48251bh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48251bh f124813a;

    /* renamed from: b */
    private static volatile C63010eb f124814b;

    static {
        C48251bh bhVar = new C48251bh();
        f124813a = bhVar;
        C62942bv.registerDefaultInstance(C48251bh.class, bhVar);
    }

    private C48251bh() {
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
                return newMessageInfo(f124813a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48251bh();
            case 4:
                return new C48250bg();
            case 5:
                return f124813a;
            case 6:
                C63010eb ebVar = f124814b;
                if (ebVar == null) {
                    synchronized (C48251bh.class) {
                        ebVar = f124814b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124813a);
                            f124814b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
