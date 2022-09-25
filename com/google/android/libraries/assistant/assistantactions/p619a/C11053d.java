package com.google.android.libraries.assistant.assistantactions.p619a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.assistantactions.a.d */
/* compiled from: PG */
public final class C11053d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11053d f36295b;

    /* renamed from: c */
    private static volatile C63010eb f36296c;

    /* renamed from: a */
    public C62971cq f36297a = emptyProtobufList();

    static {
        C11053d dVar = new C11053d();
        f36295b = dVar;
        C62942bv.registerDefaultInstance(C11053d.class, dVar);
    }

    private C11053d() {
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
                return newMessageInfo(f36295b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C11051b.class});
            case 3:
                return new C11053d();
            case 4:
                return new C11052c();
            case 5:
                return f36295b;
            case 6:
                C63010eb ebVar = f36296c;
                if (ebVar == null) {
                    synchronized (C11053d.class) {
                        ebVar = f36296c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36295b);
                            f36296c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
