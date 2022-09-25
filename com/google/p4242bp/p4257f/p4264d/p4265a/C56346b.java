package com.google.p4242bp.p4257f.p4264d.p4265a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.d.a.b */
/* compiled from: PG */
public final class C56346b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56346b f150280c;

    /* renamed from: d */
    private static volatile C63010eb f150281d;

    /* renamed from: a */
    public int f150282a;

    /* renamed from: b */
    public String f150283b = BuildConfig.FLAVOR;

    static {
        C56346b bVar = new C56346b();
        f150280c = bVar;
        C62942bv.registerDefaultInstance(C56346b.class, bVar);
    }

    private C56346b() {
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
                return newMessageInfo(f150280c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56346b();
            case 4:
                return new C56345a();
            case 5:
                return f150280c;
            case 6:
                C63010eb ebVar = f150281d;
                if (ebVar == null) {
                    synchronized (C56346b.class) {
                        ebVar = f150281d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150280c);
                            f150281d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
