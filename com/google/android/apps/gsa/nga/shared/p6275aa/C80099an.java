package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.an */
/* compiled from: PG */
public final class C80099an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80099an f219802c;

    /* renamed from: d */
    private static volatile C63010eb f219803d;

    /* renamed from: a */
    public int f219804a;

    /* renamed from: b */
    public String f219805b = BuildConfig.FLAVOR;

    static {
        C80099an anVar = new C80099an();
        f219802c = anVar;
        C62942bv.registerDefaultInstance(C80099an.class, anVar);
    }

    private C80099an() {
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
                return newMessageInfo(f219802c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80099an();
            case 4:
                return new C80098am();
            case 5:
                return f219802c;
            case 6:
                C63010eb ebVar = f219803d;
                if (ebVar == null) {
                    synchronized (C80099an.class) {
                        ebVar = f219803d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219802c);
                            f219803d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
