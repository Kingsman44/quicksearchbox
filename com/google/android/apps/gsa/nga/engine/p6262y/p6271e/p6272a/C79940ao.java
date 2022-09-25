package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ao */
/* compiled from: PG */
public final class C79940ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79940ao f219208d;

    /* renamed from: e */
    private static volatile C63010eb f219209e;

    /* renamed from: a */
    public int f219210a;

    /* renamed from: b */
    public String f219211b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f219212c = BuildConfig.FLAVOR;

    static {
        C79940ao aoVar = new C79940ao();
        f219208d = aoVar;
        C62942bv.registerDefaultInstance(C79940ao.class, aoVar);
    }

    private C79940ao() {
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
                return newMessageInfo(f219208d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C79940ao();
            case 4:
                return new C79939an();
            case 5:
                return f219208d;
            case 6:
                C63010eb ebVar = f219209e;
                if (ebVar == null) {
                    synchronized (C79940ao.class) {
                        ebVar = f219209e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219208d);
                            f219209e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
