package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.j */
/* compiled from: PG */
public final class C99486j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C99486j f278398b;

    /* renamed from: c */
    public static final C62940bt f278399c;

    /* renamed from: e */
    private static volatile C63010eb f278400e;

    /* renamed from: a */
    public String f278401a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f278402d;

    static {
        C99486j jVar = new C99486j();
        f278398b = jVar;
        C62942bv.registerDefaultInstance(C99486j.class, jVar);
        f278399c = C62942bv.newSingularGeneratedExtension(C38348c.f101533a, jVar, jVar, (C62958ce) null, 228908424, C63066gd.MESSAGE, C99486j.class);
    }

    private C99486j() {
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
                return newMessageInfo(f278398b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C99486j();
            case 4:
                return new C99485i();
            case 5:
                return f278398b;
            case 6:
                C63010eb ebVar = f278400e;
                if (ebVar == null) {
                    synchronized (C99486j.class) {
                        ebVar = f278400e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278398b);
                            f278400e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
