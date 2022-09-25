package com.google.android.libraries.search.assistant.performer.p2729b.p2730a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.b.a.i */
/* compiled from: PG */
public final class C35482i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C35482i f93181d;

    /* renamed from: e */
    private static volatile C63010eb f93182e;

    /* renamed from: a */
    public int f93183a;

    /* renamed from: b */
    public C62971cq f93184b = emptyProtobufList();

    /* renamed from: c */
    public C52428rj f93185c;

    static {
        C35482i iVar = new C35482i();
        f93181d = iVar;
        C62942bv.registerDefaultInstance(C35482i.class, iVar);
    }

    private C35482i() {
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
                return newMessageInfo(f93181d, "\u0000\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"a", "b", C35481h.class, C45240c.f118157a});
            case 3:
                return new C35482i();
            case 4:
                return new C35479f();
            case 5:
                return f93181d;
            case 6:
                C63010eb ebVar = f93182e;
                if (ebVar == null) {
                    synchronized (C35482i.class) {
                        ebVar = f93182e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f93181d);
                            f93182e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
