package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yc */
/* compiled from: PG */
public final class C50466yc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50466yc f131339f;

    /* renamed from: g */
    private static volatile C63010eb f131340g;

    /* renamed from: a */
    public int f131341a;

    /* renamed from: b */
    public String f131342b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131343c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C50139m f131344d;

    /* renamed from: e */
    public String f131345e = BuildConfig.FLAVOR;

    static {
        C50466yc ycVar = new C50466yc();
        f131339f = ycVar;
        C62942bv.registerDefaultInstance(C50466yc.class, ycVar);
    }

    private C50466yc() {
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
                return newMessageInfo(f131339f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50466yc();
            case 4:
                return new C50465yb();
            case 5:
                return f131339f;
            case 6:
                C63010eb ebVar = f131340g;
                if (ebVar == null) {
                    synchronized (C50466yc.class) {
                        ebVar = f131340g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131339f);
                            f131340g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
