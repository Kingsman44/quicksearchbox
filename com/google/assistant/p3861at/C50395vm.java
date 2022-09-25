package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.vm */
/* compiled from: PG */
public final class C50395vm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50395vm f131168c;

    /* renamed from: d */
    private static volatile C63010eb f131169d;

    /* renamed from: a */
    public int f131170a;

    /* renamed from: b */
    public int f131171b;

    static {
        C50395vm vmVar = new C50395vm();
        f131168c = vmVar;
        C62942bv.registerDefaultInstance(C50395vm.class, vmVar);
    }

    private C50395vm() {
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
                return newMessageInfo(f131168c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C50393vk.f131167a});
            case 3:
                return new C50395vm();
            case 4:
                return new C50392vj();
            case 5:
                return f131168c;
            case 6:
                C63010eb ebVar = f131169d;
                if (ebVar == null) {
                    synchronized (C50395vm.class) {
                        ebVar = f131169d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131168c);
                            f131169d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
