package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.p4361a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.a.b */
/* compiled from: PG */
public final class C57114b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57114b f152460c;

    /* renamed from: e */
    private static volatile C63010eb f152461e;

    /* renamed from: a */
    public String f152462a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f152463b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f152464d;

    static {
        C57114b bVar = new C57114b();
        f152460c = bVar;
        C62942bv.registerDefaultInstance(C57114b.class, bVar);
    }

    private C57114b() {
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
                return newMessageInfo(f152460c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57114b();
            case 4:
                return new C57113a();
            case 5:
                return f152460c;
            case 6:
                C63010eb ebVar = f152461e;
                if (ebVar == null) {
                    synchronized (C57114b.class) {
                        ebVar = f152461e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152460c);
                            f152461e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
