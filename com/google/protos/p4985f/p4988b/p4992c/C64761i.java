package com.google.protos.p4985f.p4988b.p4992c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.c.i */
/* compiled from: PG */
public final class C64761i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64761i f175546e;

    /* renamed from: f */
    private static volatile C63010eb f175547f;

    /* renamed from: a */
    public int f175548a;

    /* renamed from: b */
    public String f175549b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f175550c;

    /* renamed from: d */
    public C64763k f175551d;

    static {
        C64761i iVar = new C64761i();
        f175546e = iVar;
        C62942bv.registerDefaultInstance(C64761i.class, iVar);
    }

    private C64761i() {
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
                return newMessageInfo(f175546e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C64759g.f175545a, "d"});
            case 3:
                return new C64761i();
            case 4:
                return new C64758f();
            case 5:
                return f175546e;
            case 6:
                C63010eb ebVar = f175547f;
                if (ebVar == null) {
                    synchronized (C64761i.class) {
                        ebVar = f175547f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175546e);
                            f175547f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
