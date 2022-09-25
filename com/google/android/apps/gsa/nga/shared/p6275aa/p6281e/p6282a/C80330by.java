package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.by */
/* compiled from: PG */
public final class C80330by extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80330by f220427d;

    /* renamed from: e */
    private static volatile C63010eb f220428e;

    /* renamed from: a */
    public C80321bp f220429a;

    /* renamed from: b */
    public String f220430b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f220431c;

    static {
        C80330by byVar = new C80330by();
        f220427d = byVar;
        C62942bv.registerDefaultInstance(C80330by.class, byVar);
    }

    private C80330by() {
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
                return newMessageInfo(f220427d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80330by();
            case 4:
                return new C80329bx();
            case 5:
                return f220427d;
            case 6:
                C63010eb ebVar = f220428e;
                if (ebVar == null) {
                    synchronized (C80330by.class) {
                        ebVar = f220428e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220427d);
                            f220428e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
