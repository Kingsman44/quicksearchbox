package com.google.p395al.p398b.p399a.p400a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.a.k */
/* compiled from: PG */
public final class C8427k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8427k f29308c;

    /* renamed from: d */
    private static volatile C63010eb f29309d;

    /* renamed from: a */
    public int f29310a;

    /* renamed from: b */
    public String f29311b = BuildConfig.FLAVOR;

    static {
        C8427k kVar = new C8427k();
        f29308c = kVar;
        C62942bv.registerDefaultInstance(C8427k.class, kVar);
    }

    private C8427k() {
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
                return newMessageInfo(f29308c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C8427k();
            case 4:
                return new C8426j();
            case 5:
                return f29308c;
            case 6:
                C63010eb ebVar = f29309d;
                if (ebVar == null) {
                    synchronized (C8427k.class) {
                        ebVar = f29309d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29308c);
                            f29309d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
