package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a;

import com.google.p395al.p422e.p423a.p424a.p425a.p426a.C8602b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.b.c.a.a.b */
/* compiled from: PG */
public final class C57738b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57738b f154252b;

    /* renamed from: d */
    private static volatile C63010eb f154253d;

    /* renamed from: a */
    public C62971cq f154254a = emptyProtobufList();

    /* renamed from: c */
    private byte f154255c = 2;

    static {
        C57738b bVar = new C57738b();
        f154252b = bVar;
        C62942bv.registerDefaultInstance(C57738b.class, bVar);
    }

    private C57738b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154255c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154255c = b;
                return null;
            case 2:
                return newMessageInfo(f154252b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C8602b.class});
            case 3:
                return new C57738b();
            case 4:
                return new C57737a();
            case 5:
                return f154252b;
            case 6:
                C63010eb ebVar = f154253d;
                if (ebVar == null) {
                    synchronized (C57738b.class) {
                        ebVar = f154253d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154252b);
                            f154253d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
