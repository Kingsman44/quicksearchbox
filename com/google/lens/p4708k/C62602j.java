package com.google.lens.p4708k;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.j */
/* compiled from: PG */
public final class C62602j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62602j f169017d;

    /* renamed from: e */
    private static volatile C63010eb f169018e;

    /* renamed from: a */
    public int f169019a;

    /* renamed from: b */
    public String f169020b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169021c = BuildConfig.FLAVOR;

    static {
        C62602j jVar = new C62602j();
        f169017d = jVar;
        C62942bv.registerDefaultInstance(C62602j.class, jVar);
    }

    private C62602j() {
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
                return newMessageInfo(f169017d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62602j();
            case 4:
                return new C62601i();
            case 5:
                return f169017d;
            case 6:
                C63010eb ebVar = f169018e;
                if (ebVar == null) {
                    synchronized (C62602j.class) {
                        ebVar = f169018e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169017d);
                            f169018e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
