package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.hk */
/* compiled from: PG */
public final class C51430hk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51430hk f133950c;

    /* renamed from: e */
    private static volatile C63010eb f133951e;

    /* renamed from: a */
    public int f133952a;

    /* renamed from: b */
    public C62971cq f133953b = emptyProtobufList();

    /* renamed from: d */
    private int f133954d;

    static {
        C51430hk hkVar = new C51430hk();
        f133950c = hkVar;
        C62942bv.registerDefaultInstance(C51430hk.class, hkVar);
    }

    private C51430hk() {
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
                return newMessageInfo(f133950c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", C51428hi.f133949a, "b", C51432hm.class});
            case 3:
                return new C51430hk();
            case 4:
                return new C51427hh();
            case 5:
                return f133950c;
            case 6:
                C63010eb ebVar = f133951e;
                if (ebVar == null) {
                    synchronized (C51430hk.class) {
                        ebVar = f133951e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133950c);
                            f133951e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
