package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.j */
/* compiled from: PG */
public final class C80462j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80462j f220829e;

    /* renamed from: f */
    private static volatile C63010eb f220830f;

    /* renamed from: a */
    public int f220831a;

    /* renamed from: b */
    public String f220832b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f220833c;

    /* renamed from: d */
    public int f220834d;

    static {
        C80462j jVar = new C80462j();
        f220829e = jVar;
        C62942bv.registerDefaultInstance(C80462j.class, jVar);
    }

    private C80462j() {
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
                return newMessageInfo(f220829e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80462j();
            case 4:
                return new C80461i();
            case 5:
                return f220829e;
            case 6:
                C63010eb ebVar = f220830f;
                if (ebVar == null) {
                    synchronized (C80462j.class) {
                        ebVar = f220830f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220829e);
                            f220830f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
