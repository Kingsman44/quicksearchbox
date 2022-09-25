package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.aa */
/* compiled from: PG */
public final class C57349aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57349aa f153211c;

    /* renamed from: e */
    private static volatile C63010eb f153212e;

    /* renamed from: a */
    public String f153213a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f153214b;

    /* renamed from: d */
    private int f153215d;

    static {
        C57349aa aaVar = new C57349aa();
        f153211c = aaVar;
        C62942bv.registerDefaultInstance(C57349aa.class, aaVar);
    }

    private C57349aa() {
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
                return newMessageInfo(f153211c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57349aa();
            case 4:
                return new C57518z();
            case 5:
                return f153211c;
            case 6:
                C63010eb ebVar = f153212e;
                if (ebVar == null) {
                    synchronized (C57349aa.class) {
                        ebVar = f153212e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153211c);
                            f153212e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
