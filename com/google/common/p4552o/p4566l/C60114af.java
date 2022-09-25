package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.af */
/* compiled from: PG */
public final class C60114af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60114af f162573f;

    /* renamed from: h */
    private static volatile C63010eb f162574h;

    /* renamed from: a */
    public int f162575a;

    /* renamed from: b */
    public String f162576b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f162577c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f162578d;

    /* renamed from: e */
    public C62971cq f162579e = emptyProtobufList();

    /* renamed from: g */
    private byte f162580g = 2;

    static {
        C60114af afVar = new C60114af();
        f162573f = afVar;
        C62942bv.registerDefaultInstance(C60114af.class, afVar);
    }

    private C60114af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162580g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162580g = b;
                return null;
            case 2:
                return newMessageInfo(f162573f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C60113ae.class});
            case 3:
                return new C60114af();
            case 4:
                return new C60111ac();
            case 5:
                return f162573f;
            case 6:
                C63010eb ebVar = f162574h;
                if (ebVar == null) {
                    synchronized (C60114af.class) {
                        ebVar = f162574h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162573f);
                            f162574h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
