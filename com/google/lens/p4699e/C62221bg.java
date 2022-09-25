package com.google.lens.p4699e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.bg */
/* compiled from: PG */
public final class C62221bg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62221bg f167998f;

    /* renamed from: g */
    private static volatile C63010eb f167999g;

    /* renamed from: a */
    public int f168000a;

    /* renamed from: b */
    public String f168001b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f168002c;

    /* renamed from: d */
    public boolean f168003d;

    /* renamed from: e */
    public String f168004e = BuildConfig.FLAVOR;

    static {
        C62221bg bgVar = new C62221bg();
        f167998f = bgVar;
        C62942bv.registerDefaultInstance(C62221bg.class, bgVar);
    }

    private C62221bg() {
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
                return newMessageInfo(f167998f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62221bg();
            case 4:
                return new C62220bf();
            case 5:
                return f167998f;
            case 6:
                C63010eb ebVar = f167999g;
                if (ebVar == null) {
                    synchronized (C62221bg.class) {
                        ebVar = f167999g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167998f);
                            f167999g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
