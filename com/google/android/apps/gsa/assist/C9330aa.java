package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.aa */
/* compiled from: PG */
public final class C9330aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9330aa f32370e;

    /* renamed from: g */
    private static volatile C63010eb f32371g;

    /* renamed from: a */
    public int f32372a;

    /* renamed from: b */
    public int f32373b;

    /* renamed from: c */
    public C9422l f32374c;

    /* renamed from: d */
    public String f32375d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f32376f = 2;

    static {
        C9330aa aaVar = new C9330aa();
        f32370e = aaVar;
        C62942bv.registerDefaultInstance(C9330aa.class, aaVar);
    }

    private C9330aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32376f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32376f = b;
                return null;
            case 2:
                return newMessageInfo(f32370e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C9435y.f32764a, C45240c.f118157a, "d"});
            case 3:
                return new C9330aa();
            case 4:
                return new C9434x();
            case 5:
                return f32370e;
            case 6:
                C63010eb ebVar = f32371g;
                if (ebVar == null) {
                    synchronized (C9330aa.class) {
                        ebVar = f32371g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32370e);
                            f32371g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
