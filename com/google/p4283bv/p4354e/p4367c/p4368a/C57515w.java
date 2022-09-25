package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.w */
/* compiled from: PG */
public final class C57515w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57515w f153630c;

    /* renamed from: e */
    private static volatile C63010eb f153631e;

    /* renamed from: a */
    public String f153632a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f153633b;

    /* renamed from: d */
    private int f153634d;

    static {
        C57515w wVar = new C57515w();
        f153630c = wVar;
        C62942bv.registerDefaultInstance(C57515w.class, wVar);
    }

    private C57515w() {
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
                return newMessageInfo(f153630c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57515w();
            case 4:
                return new C57514v();
            case 5:
                return f153630c;
            case 6:
                C63010eb ebVar = f153631e;
                if (ebVar == null) {
                    synchronized (C57515w.class) {
                        ebVar = f153631e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153630c);
                            f153631e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
