package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.sj */
/* compiled from: PG */
public final class C60505sj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60505sj f163791d;

    /* renamed from: e */
    private static volatile C63010eb f163792e;

    /* renamed from: a */
    public int f163793a;

    /* renamed from: b */
    public String f163794b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f163795c = BuildConfig.FLAVOR;

    static {
        C60505sj sjVar = new C60505sj();
        f163791d = sjVar;
        C62942bv.registerDefaultInstance(C60505sj.class, sjVar);
    }

    private C60505sj() {
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
                return newMessageInfo(f163791d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60505sj();
            case 4:
                return new C60504si();
            case 5:
                return f163791d;
            case 6:
                C63010eb ebVar = f163792e;
                if (ebVar == null) {
                    synchronized (C60505sj.class) {
                        ebVar = f163792e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163791d);
                            f163792e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
