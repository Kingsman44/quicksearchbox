package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.ai */
/* compiled from: PG */
public final class C54305ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54305ai f142667c;

    /* renamed from: d */
    private static volatile C63010eb f142668d;

    /* renamed from: a */
    public boolean f142669a;

    /* renamed from: b */
    public C62971cq f142670b = C62942bv.emptyProtobufList();

    static {
        C54305ai aiVar = new C54305ai();
        f142667c = aiVar;
        C62942bv.registerDefaultInstance(C54305ai.class, aiVar);
    }

    private C54305ai() {
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
                return newMessageInfo(f142667c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0007\u0003Ț", new Object[]{"a", "b"});
            case 3:
                return new C54305ai();
            case 4:
                return new C54304ah();
            case 5:
                return f142667c;
            case 6:
                C63010eb ebVar = f142668d;
                if (ebVar == null) {
                    synchronized (C54305ai.class) {
                        ebVar = f142668d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142667c);
                            f142668d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
