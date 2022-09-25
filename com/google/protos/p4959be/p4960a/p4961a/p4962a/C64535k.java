package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.k */
/* compiled from: PG */
public final class C64535k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64535k f175017e;

    /* renamed from: f */
    private static volatile C63010eb f175018f;

    /* renamed from: a */
    public int f175019a;

    /* renamed from: b */
    public String f175020b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62961ch f175021c = emptyIntList();

    /* renamed from: d */
    public int f175022d;

    static {
        C64535k kVar = new C64535k();
        f175017e = kVar;
        C62942bv.registerDefaultInstance(C64535k.class, kVar);
    }

    private C64535k() {
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
                return newMessageInfo(f175017e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64535k();
            case 4:
                return new C64534j();
            case 5:
                return f175017e;
            case 6:
                C63010eb ebVar = f175018f;
                if (ebVar == null) {
                    synchronized (C64535k.class) {
                        ebVar = f175018f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175017e);
                            f175018f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
