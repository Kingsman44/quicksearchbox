package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.q */
/* compiled from: PG */
public final class C57509q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57509q f153616c;

    /* renamed from: e */
    private static volatile C63010eb f153617e;

    /* renamed from: a */
    public String f153618a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f153619b;

    /* renamed from: d */
    private int f153620d;

    static {
        C57509q qVar = new C57509q();
        f153616c = qVar;
        C62942bv.registerDefaultInstance(C57509q.class, qVar);
    }

    private C57509q() {
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
                return newMessageInfo(f153616c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57509q();
            case 4:
                return new C57508p();
            case 5:
                return f153616c;
            case 6:
                C63010eb ebVar = f153617e;
                if (ebVar == null) {
                    synchronized (C57509q.class) {
                        ebVar = f153617e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153616c);
                            f153617e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
