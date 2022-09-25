package com.google.p3562ao.p3563a.p3567c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.c.d */
/* compiled from: PG */
public final class C45526d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C45526d f118995f;

    /* renamed from: h */
    private static volatile C63010eb f118996h;

    /* renamed from: a */
    public int f118997a = 0;

    /* renamed from: b */
    public Object f118998b;

    /* renamed from: c */
    public String f118999c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f119000d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f119001e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f119002g;

    static {
        C45526d dVar = new C45526d();
        f118995f = dVar;
        C62942bv.registerDefaultInstance(C45526d.class, dVar);
    }

    private C45526d() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f118995f, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ျ\u0000\u0004ဈ\u0004\u0006ြ\u0000", new Object[]{"b", "a", C30325g.f82003a, C45240c.f118157a, "d", "e", C45524b.class});
            case 3:
                return new C45526d();
            case 4:
                return new C45525c();
            case 5:
                return f118995f;
            case 6:
                C63010eb ebVar = f118996h;
                if (ebVar == null) {
                    synchronized (C45526d.class) {
                        ebVar = f118996h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f118995f);
                            f118996h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
