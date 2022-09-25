package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.cf */
/* compiled from: PG */
public final class C59509cf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59509cf f157898d;

    /* renamed from: e */
    private static volatile C63010eb f157899e;

    /* renamed from: a */
    public int f157900a;

    /* renamed from: b */
    public C62961ch f157901b = emptyIntList();

    /* renamed from: c */
    public int f157902c;

    static {
        C59509cf cfVar = new C59509cf();
        f157898d = cfVar;
        C62942bv.registerDefaultInstance(C59509cf.class, cfVar);
    }

    private C59509cf() {
    }

    /* renamed from: a */
    public final void mo56971a() {
        C62961ch chVar = this.f157901b;
        if (!chVar.mo58948c()) {
            this.f157901b = C62942bv.mutableCopy(chVar);
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
                return newMessageInfo(f157898d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0016\u0002ဌ\u0000", new Object[]{"a", "b", C45240c.f118157a, C59508ce.m92363b()});
            case 3:
                return new C59509cf();
            case 4:
                return new C59506cc();
            case 5:
                return f157898d;
            case 6:
                C63010eb ebVar = f157899e;
                if (ebVar == null) {
                    synchronized (C59509cf.class) {
                        ebVar = f157899e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157898d);
                            f157899e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
