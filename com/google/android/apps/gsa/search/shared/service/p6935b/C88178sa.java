package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.sa */
/* compiled from: PG */
public final class C88178sa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88178sa f238368e;

    /* renamed from: f */
    public static final C62940bt f238369f;

    /* renamed from: h */
    private static volatile C63010eb f238370h;

    /* renamed from: a */
    public String f238371a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f238372b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f238373c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f238374d;

    /* renamed from: g */
    private int f238375g;

    static {
        C88178sa saVar = new C88178sa();
        f238368e = saVar;
        C62942bv.registerDefaultInstance(C88178sa.class, saVar);
        f238369f = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, saVar, saVar, (C62958ce) null, 127323612, C63066gd.MESSAGE, C88178sa.class);
    }

    private C88178sa() {
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
                return newMessageInfo(f238368e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001\u0005ဇ\u0003", new Object[]{C30325g.f82003a, "b", "a", C45240c.f118157a, "d"});
            case 3:
                return new C88178sa();
            case 4:
                return new C88176rz();
            case 5:
                return f238368e;
            case 6:
                C63010eb ebVar = f238370h;
                if (ebVar == null) {
                    synchronized (C88178sa.class) {
                        ebVar = f238370h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238368e);
                            f238370h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
