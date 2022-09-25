package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ou */
/* compiled from: PG */
public final class C50214ou extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50214ou f130568d;

    /* renamed from: e */
    private static volatile C63010eb f130569e;

    /* renamed from: a */
    public int f130570a;

    /* renamed from: b */
    public boolean f130571b;

    /* renamed from: c */
    public C62971cq f130572c = C62942bv.emptyProtobufList();

    static {
        C50214ou ouVar = new C50214ou();
        f130568d = ouVar;
        C62942bv.registerDefaultInstance(C50214ou.class, ouVar);
    }

    private C50214ou() {
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
                return newMessageInfo(f130568d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50214ou();
            case 4:
                return new C50213ot();
            case 5:
                return f130568d;
            case 6:
                C63010eb ebVar = f130569e;
                if (ebVar == null) {
                    synchronized (C50214ou.class) {
                        ebVar = f130569e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130568d);
                            f130569e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
