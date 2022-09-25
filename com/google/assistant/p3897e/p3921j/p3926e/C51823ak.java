package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ak */
/* compiled from: PG */
public final class C51823ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51823ak f135960d;

    /* renamed from: e */
    private static volatile C63010eb f135961e;

    /* renamed from: a */
    public int f135962a;

    /* renamed from: b */
    public C62971cq f135963b = emptyProtobufList();

    /* renamed from: c */
    public C51098gh f135964c;

    static {
        C51823ak akVar = new C51823ak();
        f135960d = akVar;
        C62942bv.registerDefaultInstance(C51823ak.class, akVar);
    }

    private C51823ak() {
    }

    /* renamed from: a */
    public final boolean mo53738a() {
        return (this.f135962a & 1) != 0;
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
                return newMessageInfo(f135960d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C51822aj.class, C45240c.f118157a});
            case 3:
                return new C51823ak();
            case 4:
                return new C51820ah();
            case 5:
                return f135960d;
            case 6:
                C63010eb ebVar = f135961e;
                if (ebVar == null) {
                    synchronized (C51823ak.class) {
                        ebVar = f135961e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135960d);
                            f135961e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
