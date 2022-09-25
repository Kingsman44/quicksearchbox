package com.google.android.libraries.lens.sdk.avs.data;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.u */
/* compiled from: PG */
public final class C24886u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C24886u f67966f;

    /* renamed from: g */
    private static volatile C63010eb f67967g;

    /* renamed from: a */
    public int f67968a;

    /* renamed from: b */
    public int f67969b;

    /* renamed from: c */
    public String f67970c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f67971d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C59898bg f67972e;

    static {
        C24886u uVar = new C24886u();
        f67966f = uVar;
        C62942bv.registerDefaultInstance(C24886u.class, uVar);
    }

    private C24886u() {
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
                return newMessageInfo(f67966f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C24886u();
            case 4:
                return new C24885t();
            case 5:
                return f67966f;
            case 6:
                C63010eb ebVar = f67967g;
                if (ebVar == null) {
                    synchronized (C24886u.class) {
                        ebVar = f67967g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67966f);
                            f67967g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
