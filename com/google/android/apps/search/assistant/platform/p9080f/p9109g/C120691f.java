package com.google.android.apps.search.assistant.platform.p9080f.p9109g;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.f */
/* compiled from: PG */
public final class C120691f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C120691f f335673d;

    /* renamed from: f */
    private static volatile C63010eb f335674f;

    /* renamed from: a */
    public int f335675a;

    /* renamed from: b */
    public C34053bp f335676b;

    /* renamed from: c */
    public C32849cq f335677c;

    /* renamed from: e */
    private byte f335678e = 2;

    static {
        C120691f fVar = new C120691f();
        f335673d = fVar;
        C62942bv.registerDefaultInstance(C120691f.class, fVar);
    }

    private C120691f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f335678e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f335678e = b;
                return null;
            case 2:
                return newMessageInfo(f335673d, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C120691f();
            case 4:
                return new C120690e();
            case 5:
                return f335673d;
            case 6:
                C63010eb ebVar = f335674f;
                if (ebVar == null) {
                    synchronized (C120691f.class) {
                        ebVar = f335674f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f335673d);
                            f335674f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
