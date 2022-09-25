package com.google.android.libraries.lens.view.p2078at.p2079a.p2080a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.lens.view.at.a.a.d */
/* compiled from: PG */
public final class C25486d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C25486d f69437e;

    /* renamed from: f */
    public static final C62940bt f69438f;

    /* renamed from: g */
    private static volatile C63010eb f69439g;

    /* renamed from: a */
    public int f69440a;

    /* renamed from: b */
    public String f69441b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f69442c;

    /* renamed from: d */
    public int f69443d;

    static {
        C25486d dVar = new C25486d();
        f69437e = dVar;
        C62942bv.registerDefaultInstance(C25486d.class, dVar);
        f69438f = C62942bv.newSingularGeneratedExtension(C43323b.f113174a, dVar, dVar, (C62958ce) null, 428412778, C63066gd.MESSAGE, C25486d.class);
    }

    private C25486d() {
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
                return newMessageInfo(f69437e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C25484b.f69436a});
            case 3:
                return new C25486d();
            case 4:
                return new C25483a();
            case 5:
                return f69437e;
            case 6:
                C63010eb ebVar = f69439g;
                if (ebVar == null) {
                    synchronized (C25486d.class) {
                        ebVar = f69439g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f69437e);
                            f69439g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
