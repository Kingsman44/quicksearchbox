package com.google.android.apps.gsa.shared.monet.p7070b.p7079af;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.af.l */
/* compiled from: PG */
public final class C90206l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f251979d = new C90202h();

    /* renamed from: f */
    public static final C90206l f251980f;

    /* renamed from: g */
    private static volatile C63010eb f251981g;

    /* renamed from: a */
    public int f251982a;

    /* renamed from: b */
    public int f251983b;

    /* renamed from: c */
    public C62961ch f251984c = emptyIntList();

    /* renamed from: e */
    public C90205k f251985e;

    static {
        C90206l lVar = new C90206l();
        f251980f = lVar;
        C62942bv.registerDefaultInstance(C90206l.class, lVar);
    }

    private C90206l() {
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
                return newMessageInfo(f251980f, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0000\u0003ဌ\u0000\u0004ဉ\u0001\u0005\u001e", new Object[]{"a", "b", C90208n.m146768b(), "e", C45240c.f118157a, C90208n.m146768b()});
            case 3:
                return new C90206l();
            case 4:
                return new C90203i();
            case 5:
                return f251980f;
            case 6:
                C63010eb ebVar = f251981g;
                if (ebVar == null) {
                    synchronized (C90206l.class) {
                        ebVar = f251981g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f251980f);
                            f251981g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
