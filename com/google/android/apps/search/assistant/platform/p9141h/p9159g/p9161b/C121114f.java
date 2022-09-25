package com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9161b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.g.b.f */
/* compiled from: PG */
public final class C121114f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f336542e = new C121111c();

    /* renamed from: g */
    public static final C62962ci f336543g = new C121112d();

    /* renamed from: h */
    public static final C121114f f336544h;

    /* renamed from: i */
    private static volatile C63010eb f336545i;

    /* renamed from: a */
    public int f336546a;

    /* renamed from: b */
    public long f336547b;

    /* renamed from: c */
    public boolean f336548c;

    /* renamed from: d */
    public C62961ch f336549d = emptyIntList();

    /* renamed from: f */
    public C62961ch f336550f = emptyIntList();

    static {
        C121114f fVar = new C121114f();
        f336544h = fVar;
        C62942bv.registerDefaultInstance(C121114f.class, fVar);
    }

    private C121114f() {
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
                return newMessageInfo(f336544h, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003,\u0004,", new Object[]{"a", "b", C45240c.f118157a, "d", C121110b.m200404b(), C10662f.f35572a, C121110b.m200404b()});
            case 3:
                return new C121114f();
            case 4:
                return new C121113e();
            case 5:
                return f336544h;
            case 6:
                C63010eb ebVar = f336545i;
                if (ebVar == null) {
                    synchronized (C121114f.class) {
                        ebVar = f336545i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336544h);
                            f336545i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
