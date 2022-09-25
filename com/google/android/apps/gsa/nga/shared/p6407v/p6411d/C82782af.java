package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.af */
/* compiled from: PG */
public final class C82782af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82782af f225556c;

    /* renamed from: d */
    private static volatile C63010eb f225557d;

    /* renamed from: a */
    public int f225558a;

    /* renamed from: b */
    public String f225559b = BuildConfig.FLAVOR;

    static {
        C82782af afVar = new C82782af();
        f225556c = afVar;
        C62942bv.registerDefaultInstance(C82782af.class, afVar);
    }

    private C82782af() {
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
                return newMessageInfo(f225556c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C82782af();
            case 4:
                return new C82781ae();
            case 5:
                return f225556c;
            case 6:
                C63010eb ebVar = f225557d;
                if (ebVar == null) {
                    synchronized (C82782af.class) {
                        ebVar = f225557d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225556c);
                            f225557d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
