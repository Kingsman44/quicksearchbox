package com.google.p337aa.p338a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aa.a.d */
/* compiled from: PG */
public final class C6602d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C6602d f19622c;

    /* renamed from: e */
    private static volatile C63010eb f19623e;

    /* renamed from: a */
    public String f19624a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f19625b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f19626d;

    static {
        C6602d dVar = new C6602d();
        f19622c = dVar;
        C62942bv.registerDefaultInstance(C6602d.class, dVar);
    }

    private C6602d() {
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
                return newMessageInfo(f19622c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C6602d();
            case 4:
                return new C6601c();
            case 5:
                return f19622c;
            case 6:
                C63010eb ebVar = f19623e;
                if (ebVar == null) {
                    synchronized (C6602d.class) {
                        ebVar = f19623e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19622c);
                            f19623e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
