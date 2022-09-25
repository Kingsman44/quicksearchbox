package com.google.p4283bv.p4287b.p4288a.p4322b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.apk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.b.b */
/* compiled from: PG */
public final class C56846b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56846b f151664d;

    /* renamed from: e */
    private static volatile C63010eb f151665e;

    /* renamed from: a */
    public int f151666a;

    /* renamed from: b */
    public int f151667b;

    /* renamed from: c */
    public C62971cq f151668c = emptyProtobufList();

    static {
        C56846b bVar = new C56846b();
        f151664d = bVar;
        C62942bv.registerDefaultInstance(C56846b.class, bVar);
    }

    private C56846b() {
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
                return newMessageInfo(f151664d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", apk.m92454b(), C45240c.f118157a, C56852h.class});
            case 3:
                return new C56846b();
            case 4:
                return new C56845a();
            case 5:
                return f151664d;
            case 6:
                C63010eb ebVar = f151665e;
                if (ebVar == null) {
                    synchronized (C56846b.class) {
                        ebVar = f151665e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151664d);
                            f151665e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
