package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.h */
/* compiled from: PG */
public final class C16372h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16372h f48194b;

    /* renamed from: d */
    private static volatile C63010eb f48195d;

    /* renamed from: a */
    public C62971cq f48196a = emptyProtobufList();

    /* renamed from: c */
    private byte f48197c = 2;

    static {
        C16372h hVar = new C16372h();
        f48194b = hVar;
        C62942bv.registerDefaultInstance(C16372h.class, hVar);
    }

    private C16372h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48197c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48197c = b;
                return null;
            case 2:
                return newMessageInfo(f48194b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C16353b.class});
            case 3:
                return new C16372h();
            case 4:
                return new C16371g();
            case 5:
                return f48194b;
            case 6:
                C63010eb ebVar = f48195d;
                if (ebVar == null) {
                    synchronized (C16372h.class) {
                        ebVar = f48195d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48194b);
                            f48195d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
