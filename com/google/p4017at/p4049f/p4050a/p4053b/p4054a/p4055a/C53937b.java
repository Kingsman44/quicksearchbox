package com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4049f.p4050a.p4051a.p4052a.C53935d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.f.a.b.a.a.b */
/* compiled from: PG */
public final class C53937b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53937b f141525b;

    /* renamed from: d */
    private static volatile C63010eb f141526d;

    /* renamed from: a */
    public C53935d f141527a;

    /* renamed from: c */
    private int f141528c;

    static {
        C53937b bVar = new C53937b();
        f141525b = bVar;
        C62942bv.registerDefaultInstance(C53937b.class, bVar);
    }

    private C53937b() {
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
                return newMessageInfo(f141525b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53937b();
            case 4:
                return new C53936a();
            case 5:
                return f141525b;
            case 6:
                C63010eb ebVar = f141526d;
                if (ebVar == null) {
                    synchronized (C53937b.class) {
                        ebVar = f141526d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141525b);
                            f141526d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
