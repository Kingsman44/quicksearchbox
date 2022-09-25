package com.google.android.gms.p10747b.p10748a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.l */
/* compiled from: PG */
public final class C142964l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142964l f387907f;

    /* renamed from: g */
    private static volatile C63010eb f387908g;

    /* renamed from: a */
    public int f387909a;

    /* renamed from: b */
    public String f387910b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f387911c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f387912d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f387913e = emptyProtobufList();

    static {
        C142964l lVar = new C142964l();
        f387907f = lVar;
        C62942bv.registerDefaultInstance(C142964l.class, lVar);
    }

    private C142964l() {
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
                return newMessageInfo(f387907f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C142963k.class});
            case 3:
                return new C142964l();
            case 4:
                return new C142961i();
            case 5:
                return f387907f;
            case 6:
                C63010eb ebVar = f387908g;
                if (ebVar == null) {
                    synchronized (C142964l.class) {
                        ebVar = f387908g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387907f);
                            f387908g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
