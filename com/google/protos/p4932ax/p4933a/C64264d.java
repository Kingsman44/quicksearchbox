package com.google.protos.p4932ax.p4933a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ax.a.d */
/* compiled from: PG */
public final class C64264d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64264d f173749f;

    /* renamed from: g */
    private static volatile C63010eb f173750g;

    /* renamed from: a */
    public int f173751a;

    /* renamed from: b */
    public int f173752b;

    /* renamed from: c */
    public C62961ch f173753c = emptyIntList();

    /* renamed from: d */
    public String f173754d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62995dn f173755e = C62995dn.f170057a;

    static {
        C64264d dVar = new C64264d();
        f173749f = dVar;
        C62942bv.registerDefaultInstance(C64264d.class, dVar);
    }

    private C64264d() {
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
                return newMessageInfo(f173749f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0001\u0000\u0001ဋ\u0000\u0002\u001d\u0003ဈ\u0001\u00042", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C64263c.f173748a});
            case 3:
                return new C64264d();
            case 4:
                return new C64262b();
            case 5:
                return f173749f;
            case 6:
                C63010eb ebVar = f173750g;
                if (ebVar == null) {
                    synchronized (C64264d.class) {
                        ebVar = f173750g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173749f);
                            f173750g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
