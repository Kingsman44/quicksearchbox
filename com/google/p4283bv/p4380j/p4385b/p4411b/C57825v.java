package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.v */
/* compiled from: PG */
public final class C57825v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57825v f154494c;

    /* renamed from: e */
    private static volatile C63010eb f154495e;

    /* renamed from: a */
    public int f154496a;

    /* renamed from: b */
    public C57823t f154497b;

    /* renamed from: d */
    private byte f154498d = 2;

    static {
        C57825v vVar = new C57825v();
        f154494c = vVar;
        C62942bv.registerDefaultInstance(C57825v.class, vVar);
    }

    private C57825v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154498d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154498d = b;
                return null;
            case 2:
                return newMessageInfo(f154494c, "\u0001\u0001\u0000\u0001￫놩￫놩\u0001\u0000\u0000\u0001￫놩ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57825v();
            case 4:
                return new C57824u();
            case 5:
                return f154494c;
            case 6:
                C63010eb ebVar = f154495e;
                if (ebVar == null) {
                    synchronized (C57825v.class) {
                        ebVar = f154495e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154494c);
                            f154495e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
