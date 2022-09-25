package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gi */
/* compiled from: PG */
public final class C82947gi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82947gi f226310c;

    /* renamed from: d */
    private static volatile C63010eb f226311d;

    /* renamed from: a */
    public int f226312a;

    /* renamed from: b */
    public String f226313b = BuildConfig.FLAVOR;

    static {
        C82947gi giVar = new C82947gi();
        f226310c = giVar;
        C62942bv.registerDefaultInstance(C82947gi.class, giVar);
    }

    private C82947gi() {
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
                return newMessageInfo(f226310c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C82947gi();
            case 4:
                return new C82946gh();
            case 5:
                return f226310c;
            case 6:
                C63010eb ebVar = f226311d;
                if (ebVar == null) {
                    synchronized (C82947gi.class) {
                        ebVar = f226311d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226310c);
                            f226311d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
