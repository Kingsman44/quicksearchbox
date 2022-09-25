package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.h */
/* compiled from: PG */
public final class C54499h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54499h f143090e;

    /* renamed from: f */
    private static volatile C63010eb f143091f;

    /* renamed from: a */
    public String f143092a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f143093b;

    /* renamed from: c */
    public String f143094c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f143095d;

    static {
        C54499h hVar = new C54499h();
        f143090e = hVar;
        C62942bv.registerDefaultInstance(C54499h.class, hVar);
    }

    private C54499h() {
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
                return newMessageInfo(f143090e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003Ȉ\u0004\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54499h();
            case 4:
                return new C54498g();
            case 5:
                return f143090e;
            case 6:
                C63010eb ebVar = f143091f;
                if (ebVar == null) {
                    synchronized (C54499h.class) {
                        ebVar = f143091f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143090e);
                            f143091f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
