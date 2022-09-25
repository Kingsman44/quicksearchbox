package com.google.assistant.p3745ab.p3755g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.g.b */
/* compiled from: PG */
public final class C48327b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48327b f124974a;

    /* renamed from: b */
    private static volatile C63010eb f124975b;

    static {
        C48327b bVar = new C48327b();
        f124974a = bVar;
        C62942bv.registerDefaultInstance(C48327b.class, bVar);
    }

    private C48327b() {
        emptyIntList();
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
                return newMessageInfo(f124974a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48327b();
            case 4:
                return new C48326a();
            case 5:
                return f124974a;
            case 6:
                C63010eb ebVar = f124975b;
                if (ebVar == null) {
                    synchronized (C48327b.class) {
                        ebVar = f124975b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124974a);
                            f124975b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
