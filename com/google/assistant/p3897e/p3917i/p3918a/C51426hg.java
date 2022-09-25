package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.hg */
/* compiled from: PG */
public final class C51426hg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51426hg f133947a;

    /* renamed from: b */
    private static volatile C63010eb f133948b;

    static {
        C51426hg hgVar = new C51426hg();
        f133947a = hgVar;
        C62942bv.registerDefaultInstance(C51426hg.class, hgVar);
    }

    private C51426hg() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f133947a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51426hg();
            case 4:
                return new C51425hf();
            case 5:
                return f133947a;
            case 6:
                C63010eb ebVar = f133948b;
                if (ebVar == null) {
                    synchronized (C51426hg.class) {
                        ebVar = f133948b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133947a);
                            f133948b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
