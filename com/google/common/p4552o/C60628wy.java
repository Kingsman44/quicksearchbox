package com.google.common.p4552o;

import com.google.android.apps.gsa.p8852u.C118571d;
import com.google.android.apps.gsa.p8852u.C118572e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.wy */
/* compiled from: PG */
public final class C60628wy extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60628wy f164485f;

    /* renamed from: g */
    private static volatile C63010eb f164486g;

    /* renamed from: a */
    public int f164487a;

    /* renamed from: b */
    public int f164488b;

    /* renamed from: c */
    public C62961ch f164489c = emptyIntList();

    /* renamed from: d */
    public C62971cq f164490d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f164491e = C62942bv.emptyProtobufList();

    static {
        C60628wy wyVar = new C60628wy();
        f164485f = wyVar;
        C62942bv.registerDefaultInstance(C60628wy.class, wyVar);
    }

    private C60628wy() {
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
                return newMessageInfo(f164485f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u001e\u0003\u001b\u0004\u001a", new Object[]{"a", "b", C118572e.f329811a, C45240c.f118157a, C118571d.m196863b(), "d", C60631xa.class, "e"});
            case 3:
                return new C60628wy();
            case 4:
                return new C60627wx();
            case 5:
                return f164485f;
            case 6:
                C63010eb ebVar = f164486g;
                if (ebVar == null) {
                    synchronized (C60628wy.class) {
                        ebVar = f164486g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164485f);
                            f164486g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
