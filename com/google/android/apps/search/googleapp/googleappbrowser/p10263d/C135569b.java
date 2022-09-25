package com.google.android.apps.search.googleapp.googleappbrowser.p10263d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.d.b */
/* compiled from: PG */
public final class C135569b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C135569b f369275f;

    /* renamed from: g */
    public static final C62940bt f369276g;

    /* renamed from: h */
    private static volatile C63010eb f369277h;

    /* renamed from: a */
    public int f369278a;

    /* renamed from: b */
    public int f369279b;

    /* renamed from: c */
    public String f369280c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C139789b f369281d;

    /* renamed from: e */
    public boolean f369282e;

    static {
        C135569b bVar = new C135569b();
        f369275f = bVar;
        C62942bv.registerDefaultInstance(C135569b.class, bVar);
        f369276g = C62942bv.newSingularGeneratedExtension(C43323b.f113174a, bVar, bVar, (C62958ce) null, 329867047, C63066gd.MESSAGE, C135569b.class);
    }

    private C135569b() {
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
                return newMessageInfo(f369275f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C135461g.m219651b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C135569b();
            case 4:
                return new C135568a();
            case 5:
                return f369275f;
            case 6:
                C63010eb ebVar = f369277h;
                if (ebVar == null) {
                    synchronized (C135569b.class) {
                        ebVar = f369277h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369275f);
                            f369277h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
