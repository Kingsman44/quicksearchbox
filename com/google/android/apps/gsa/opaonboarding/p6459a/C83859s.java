package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.s */
/* compiled from: PG */
public final class C83859s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83859s f228499b;

    /* renamed from: c */
    private static volatile C63010eb f228500c;

    /* renamed from: a */
    public C62971cq f228501a = C62942bv.emptyProtobufList();

    static {
        C83859s sVar = new C83859s();
        f228499b = sVar;
        C62942bv.registerDefaultInstance(C83859s.class, sVar);
    }

    private C83859s() {
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
                return newMessageInfo(f228499b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C83859s();
            case 4:
                return new C83858r();
            case 5:
                return f228499b;
            case 6:
                C63010eb ebVar = f228500c;
                if (ebVar == null) {
                    synchronized (C83859s.class) {
                        ebVar = f228500c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228499b);
                            f228500c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
