package com.google.p4017at.p4027c.p4028a.p4029a;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.d */
/* compiled from: PG */
public final class C53844d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53844d f141326c;

    /* renamed from: e */
    private static volatile C63010eb f141327e;

    /* renamed from: a */
    public C57246ba f141328a;

    /* renamed from: b */
    public C57246ba f141329b;

    /* renamed from: d */
    private byte f141330d = 2;

    static {
        C53844d dVar = new C53844d();
        f141326c = dVar;
        C62942bv.registerDefaultInstance(C53844d.class, dVar);
    }

    private C53844d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141330d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141330d = b;
                return null;
            case 2:
                return newMessageInfo(f141326c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001Љ\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C53844d();
            case 4:
                return new C53843c();
            case 5:
                return f141326c;
            case 6:
                C63010eb ebVar = f141327e;
                if (ebVar == null) {
                    synchronized (C53844d.class) {
                        ebVar = f141327e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141326c);
                            f141327e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
