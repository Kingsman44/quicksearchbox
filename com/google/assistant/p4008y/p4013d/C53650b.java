package com.google.assistant.p4008y.p4013d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.b */
/* compiled from: PG */
public final class C53650b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53650b f140812d;

    /* renamed from: e */
    private static volatile C63010eb f140813e;

    /* renamed from: a */
    public int f140814a;

    /* renamed from: b */
    public boolean f140815b;

    /* renamed from: c */
    public long f140816c;

    static {
        C53650b bVar = new C53650b();
        f140812d = bVar;
        C62942bv.registerDefaultInstance(C53650b.class, bVar);
    }

    private C53650b() {
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
                return newMessageInfo(f140812d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53650b();
            case 4:
                return new C53631a();
            case 5:
                return f140812d;
            case 6:
                C63010eb ebVar = f140813e;
                if (ebVar == null) {
                    synchronized (C53650b.class) {
                        ebVar = f140813e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140812d);
                            f140813e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
