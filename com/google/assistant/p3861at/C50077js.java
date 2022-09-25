package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.js */
/* compiled from: PG */
public final class C50077js extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50077js f130196b;

    /* renamed from: c */
    private static volatile C63010eb f130197c;

    /* renamed from: a */
    public C62971cq f130198a = emptyProtobufList();

    static {
        C50077js jsVar = new C50077js();
        f130196b = jsVar;
        C62942bv.registerDefaultInstance(C50077js.class, jsVar);
    }

    private C50077js() {
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
                return newMessageInfo(f130196b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50073jo.class});
            case 3:
                return new C50077js();
            case 4:
                return new C50076jr();
            case 5:
                return f130196b;
            case 6:
                C63010eb ebVar = f130197c;
                if (ebVar == null) {
                    synchronized (C50077js.class) {
                        ebVar = f130197c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130196b);
                            f130197c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
