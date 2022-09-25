package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.df */
/* compiled from: PG */
public final class C124694df extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124694df f344004d;

    /* renamed from: e */
    private static volatile C63010eb f344005e;

    /* renamed from: a */
    public int f344006a;

    /* renamed from: b */
    public String f344007b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f344008c;

    static {
        C124694df dfVar = new C124694df();
        f344004d = dfVar;
        C62942bv.registerDefaultInstance(C124694df.class, dfVar);
    }

    private C124694df() {
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
                return newMessageInfo(f344004d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C124633az.m204300b()});
            case 3:
                return new C124694df();
            case 4:
                return new C124693de();
            case 5:
                return f344004d;
            case 6:
                C63010eb ebVar = f344005e;
                if (ebVar == null) {
                    synchronized (C124694df.class) {
                        ebVar = f344005e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344004d);
                            f344005e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
