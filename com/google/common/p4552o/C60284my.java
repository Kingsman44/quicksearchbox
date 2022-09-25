package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.my */
/* compiled from: PG */
public final class C60284my extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60284my f163089f;

    /* renamed from: g */
    private static volatile C63010eb f163090g;

    /* renamed from: a */
    public int f163091a;

    /* renamed from: b */
    public int f163092b;

    /* renamed from: c */
    public String f163093c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f163094d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f163095e;

    static {
        C60284my myVar = new C60284my();
        f163089f = myVar;
        C62942bv.registerDefaultInstance(C60284my.class, myVar);
    }

    private C60284my() {
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
                return newMessageInfo(f163089f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဋ\u0006", new Object[]{"a", "b", C60283mx.f163088a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C60284my();
            case 4:
                return new C60282mw();
            case 5:
                return f163089f;
            case 6:
                C63010eb ebVar = f163090g;
                if (ebVar == null) {
                    synchronized (C60284my.class) {
                        ebVar = f163090g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163089f);
                            f163090g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
