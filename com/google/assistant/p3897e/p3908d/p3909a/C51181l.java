package com.google.assistant.p3897e.p3908d.p3909a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.d.a.l */
/* compiled from: PG */
public final class C51181l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51181l f133221d;

    /* renamed from: e */
    private static volatile C63010eb f133222e;

    /* renamed from: a */
    public int f133223a;

    /* renamed from: b */
    public int f133224b;

    /* renamed from: c */
    public C62961ch f133225c = emptyIntList();

    static {
        C51181l lVar = new C51181l();
        f133221d = lVar;
        C62942bv.registerDefaultInstance(C51181l.class, lVar);
    }

    private C51181l() {
    }

    /* renamed from: a */
    public final void mo53545a() {
        C62961ch chVar = this.f133225c;
        if (!chVar.mo58948c()) {
            this.f133225c = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f133221d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"a", "b", C51180k.m86073b(), C45240c.f118157a});
            case 3:
                return new C51181l();
            case 4:
                return new C51178i();
            case 5:
                return f133221d;
            case 6:
                C63010eb ebVar = f133222e;
                if (ebVar == null) {
                    synchronized (C51181l.class) {
                        ebVar = f133222e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133221d);
                            f133222e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
