package com.google.protos.p4966bg.p4967a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58133d;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58136g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bg.a.b */
/* compiled from: PG */
public final class C64623b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64623b f175171e;

    /* renamed from: f */
    private static volatile C63010eb f175172f;

    /* renamed from: a */
    public int f175173a;

    /* renamed from: b */
    public C58133d f175174b;

    /* renamed from: c */
    public C58135f f175175c;

    /* renamed from: d */
    public C62961ch f175176d = emptyIntList();

    static {
        C64623b bVar = new C64623b();
        f175171e = bVar;
        C62942bv.registerDefaultInstance(C64623b.class, bVar);
    }

    private C64623b() {
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f175171e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0001\u0000\u0002ဉ\u0000\u0005ဉ\u0002\u0006\u001e", new Object[]{"a", "b", C45240c.f118157a, "d", C58136g.f155424a});
            case 3:
                return new C64623b();
            case 4:
                return new C64622a();
            case 5:
                return f175171e;
            case 6:
                C63010eb ebVar = f175172f;
                if (ebVar == null) {
                    synchronized (C64623b.class) {
                        ebVar = f175172f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175171e);
                            f175172f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
