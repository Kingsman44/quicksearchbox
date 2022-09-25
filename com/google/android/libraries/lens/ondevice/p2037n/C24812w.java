package com.google.android.libraries.lens.ondevice.p2037n;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.w */
/* compiled from: PG */
public final class C24812w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24812w f67822c;

    /* renamed from: d */
    private static volatile C63010eb f67823d;

    /* renamed from: a */
    public int f67824a;

    /* renamed from: b */
    public String f67825b = BuildConfig.FLAVOR;

    static {
        C24812w wVar = new C24812w();
        f67822c = wVar;
        C62942bv.registerDefaultInstance(C24812w.class, wVar);
    }

    private C24812w() {
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
                return newMessageInfo(f67822c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C24812w();
            case 4:
                return new C24811v();
            case 5:
                return f67822c;
            case 6:
                C63010eb ebVar = f67823d;
                if (ebVar == null) {
                    synchronized (C24812w.class) {
                        ebVar = f67823d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67822c);
                            f67823d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
