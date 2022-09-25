package com.google.assistant.p4008y.p4013d.p4014a;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83936w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.a.l */
/* compiled from: PG */
public final class C53643l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53643l f140794c;

    /* renamed from: d */
    private static volatile C63010eb f140795d;

    /* renamed from: a */
    public int f140796a = 0;

    /* renamed from: b */
    public Object f140797b;

    static {
        C53643l lVar = new C53643l();
        f140794c = lVar;
        C62942bv.registerDefaultInstance(C53643l.class, lVar);
    }

    private C53643l() {
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
                return newMessageInfo(f140794c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000", new Object[]{"b", "a", C83936w.f228597a});
            case 3:
                return new C53643l();
            case 4:
                return new C53642k();
            case 5:
                return f140794c;
            case 6:
                C63010eb ebVar = f140795d;
                if (ebVar == null) {
                    synchronized (C53643l.class) {
                        ebVar = f140795d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140794c);
                            f140795d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
