package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.C33588c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.m */
/* compiled from: PG */
public final class C33619m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33619m f89848b;

    /* renamed from: c */
    private static volatile C63010eb f89849c;

    /* renamed from: a */
    public C33588c f89850a;

    static {
        C33619m mVar = new C33619m();
        f89848b = mVar;
        C62942bv.registerDefaultInstance(C33619m.class, mVar);
    }

    private C33619m() {
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
                return newMessageInfo(f89848b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C33619m();
            case 4:
                return new C33618l();
            case 5:
                return f89848b;
            case 6:
                C63010eb ebVar = f89849c;
                if (ebVar == null) {
                    synchronized (C33619m.class) {
                        ebVar = f89849c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89848b);
                            f89849c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
