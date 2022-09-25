package com.google.android.libraries.search.assistant.appactions.p2502b.p2503a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.appactions.b.a.c */
/* compiled from: PG */
public final class C32490c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C32490c f87059b;

    /* renamed from: c */
    private static volatile C63010eb f87060c;

    /* renamed from: a */
    public C62971cq f87061a = C62942bv.emptyProtobufList();

    static {
        C32490c cVar = new C32490c();
        f87059b = cVar;
        C62942bv.registerDefaultInstance(C32490c.class, cVar);
    }

    private C32490c() {
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
                return newMessageInfo(f87059b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C32490c();
            case 4:
                return new C32489b();
            case 5:
                return f87059b;
            case 6:
                C63010eb ebVar = f87060c;
                if (ebVar == null) {
                    synchronized (C32490c.class) {
                        ebVar = f87060c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87059b);
                            f87060c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
