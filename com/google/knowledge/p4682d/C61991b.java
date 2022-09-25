package com.google.knowledge.p4682d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4250c.p4251a.C56178b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.d.b */
/* compiled from: PG */
public final class C61991b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61991b f167531a;

    /* renamed from: e */
    private static volatile C63010eb f167532e;

    /* renamed from: b */
    private int f167533b;

    /* renamed from: c */
    private C56178b f167534c;

    /* renamed from: d */
    private byte f167535d = 2;

    static {
        C61991b bVar = new C61991b();
        f167531a = bVar;
        C62942bv.registerDefaultInstance(C61991b.class, bVar);
    }

    private C61991b() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167535d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167535d = b;
                return null;
            case 2:
                return newMessageInfo(f167531a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C61991b();
            case 4:
                return new C61984a();
            case 5:
                return f167531a;
            case 6:
                C63010eb ebVar = f167532e;
                if (ebVar == null) {
                    synchronized (C61991b.class) {
                        ebVar = f167532e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167531a);
                            f167532e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
