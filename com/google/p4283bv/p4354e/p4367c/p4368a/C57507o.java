package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.o */
/* compiled from: PG */
public final class C57507o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57507o f153611c;

    /* renamed from: e */
    private static volatile C63010eb f153612e;

    /* renamed from: a */
    public String f153613a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f153614b;

    /* renamed from: d */
    private int f153615d;

    static {
        C57507o oVar = new C57507o();
        f153611c = oVar;
        C62942bv.registerDefaultInstance(C57507o.class, oVar);
    }

    private C57507o() {
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
                return newMessageInfo(f153611c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57507o();
            case 4:
                return new C57506n();
            case 5:
                return f153611c;
            case 6:
                C63010eb ebVar = f153612e;
                if (ebVar == null) {
                    synchronized (C57507o.class) {
                        ebVar = f153612e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153611c);
                            f153612e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
