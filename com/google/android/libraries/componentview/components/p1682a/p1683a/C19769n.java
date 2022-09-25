package com.google.android.libraries.componentview.components.p1682a.p1683a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.a.a.n */
/* compiled from: PG */
public final class C19769n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19769n f55231e;

    /* renamed from: f */
    public static final C62940bt f55232f;

    /* renamed from: g */
    private static volatile C63010eb f55233g;

    /* renamed from: a */
    public int f55234a;

    /* renamed from: b */
    public C19995r f55235b;

    /* renamed from: c */
    public String f55236c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C19916aq f55237d;

    static {
        C19769n nVar = new C19769n();
        f55231e = nVar;
        C62942bv.registerDefaultInstance(C19769n.class, nVar);
        f55232f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, nVar, nVar, (C62958ce) null, 126687453, C63066gd.MESSAGE, C19769n.class);
    }

    private C19769n() {
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
                return newMessageInfo(f55231e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19769n();
            case 4:
                return new C19768m();
            case 5:
                return f55231e;
            case 6:
                C63010eb ebVar = f55233g;
                if (ebVar == null) {
                    synchronized (C19769n.class) {
                        ebVar = f55233g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55231e);
                            f55233g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
