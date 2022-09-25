package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hd */
/* compiled from: PG */
public final class C142487hd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142487hd f386669c;

    /* renamed from: d */
    private static volatile C63010eb f386670d;

    /* renamed from: a */
    public String f386671a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f386672b;

    static {
        C142487hd hdVar = new C142487hd();
        f386669c = hdVar;
        C62942bv.registerDefaultInstance(C142487hd.class, hdVar);
    }

    private C142487hd() {
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
                return newMessageInfo(f386669c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C142487hd();
            case 4:
                return new C142486hc();
            case 5:
                return f386669c;
            case 6:
                C63010eb ebVar = f386670d;
                if (ebVar == null) {
                    synchronized (C142487hd.class) {
                        ebVar = f386670d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386669c);
                            f386670d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
