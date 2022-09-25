package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ba */
/* compiled from: PG */
public final class C59647ba extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59647ba f159921e;

    /* renamed from: f */
    private static volatile C63010eb f159922f;

    /* renamed from: a */
    public int f159923a;

    /* renamed from: b */
    public String f159924b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f159925c;

    /* renamed from: d */
    public int f159926d;

    static {
        C59647ba baVar = new C59647ba();
        f159921e = baVar;
        C62942bv.registerDefaultInstance(C59647ba.class, baVar);
    }

    private C59647ba() {
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
                return newMessageInfo(f159921e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59647ba();
            case 4:
                return new C59602az();
            case 5:
                return f159921e;
            case 6:
                C63010eb ebVar = f159922f;
                if (ebVar == null) {
                    synchronized (C59647ba.class) {
                        ebVar = f159922f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159921e);
                            f159922f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
