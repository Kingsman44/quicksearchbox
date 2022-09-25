package com.google.common.p4552o.p4553a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.u */
/* compiled from: PG */
public final class C59565u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59565u f158051f;

    /* renamed from: g */
    private static volatile C63010eb f158052g;

    /* renamed from: a */
    public int f158053a;

    /* renamed from: b */
    public int f158054b;

    /* renamed from: c */
    public int f158055c;

    /* renamed from: d */
    public long f158056d;

    /* renamed from: e */
    public int f158057e;

    static {
        C59565u uVar = new C59565u();
        f158051f = uVar;
        C62942bv.registerDefaultInstance(C59565u.class, uVar);
    }

    private C59565u() {
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
                return newMessageInfo(f158051f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဂ\u0003\u0004ဌ\u0004\u0005ဌ\u0002", new Object[]{"a", "b", e.b(), "d", "e", C59563s.f158050a, C45240c.f118157a, C59562r.m92366b()});
            case 3:
                return new C59565u();
            case 4:
                return new C59560p();
            case 5:
                return f158051f;
            case 6:
                C63010eb ebVar = f158052g;
                if (ebVar == null) {
                    synchronized (C59565u.class) {
                        ebVar = f158052g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158051f);
                            f158052g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
