package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.d */
/* compiled from: PG */
public final class C57147d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57147d f152560c;

    /* renamed from: e */
    private static volatile C63010eb f152561e;

    /* renamed from: a */
    public String f152562a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f152563b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f152564d;

    static {
        C57147d dVar = new C57147d();
        f152560c = dVar;
        C62942bv.registerDefaultInstance(C57147d.class, dVar);
    }

    private C57147d() {
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
                return newMessageInfo(f152560c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57147d();
            case 4:
                return new C57146c();
            case 5:
                return f152560c;
            case 6:
                C63010eb ebVar = f152561e;
                if (ebVar == null) {
                    synchronized (C57147d.class) {
                        ebVar = f152561e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152560c);
                            f152561e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
