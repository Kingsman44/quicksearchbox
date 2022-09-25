package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bx */
/* compiled from: PG */
public final class C56540bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56540bx f150983c;

    /* renamed from: d */
    private static volatile C63010eb f150984d;

    /* renamed from: a */
    public C56539bw f150985a;

    /* renamed from: b */
    public String f150986b = BuildConfig.FLAVOR;

    static {
        C56540bx bxVar = new C56540bx();
        f150983c = bxVar;
        C62942bv.registerDefaultInstance(C56540bx.class, bxVar);
    }

    private C56540bx() {
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
                return newMessageInfo(f150983c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C56540bx();
            case 4:
                return new C56535bs();
            case 5:
                return f150983c;
            case 6:
                C63010eb ebVar = f150984d;
                if (ebVar == null) {
                    synchronized (C56540bx.class) {
                        ebVar = f150984d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150983c);
                            f150984d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
