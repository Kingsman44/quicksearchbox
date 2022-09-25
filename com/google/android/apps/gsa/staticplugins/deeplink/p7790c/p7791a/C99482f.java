package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.f */
/* compiled from: PG */
public final class C99482f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C99482f f278385g;

    /* renamed from: h */
    private static volatile C63010eb f278386h;

    /* renamed from: a */
    public int f278387a;

    /* renamed from: b */
    public String f278388b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C58072d f278389c;

    /* renamed from: d */
    public C58081m f278390d;

    /* renamed from: e */
    public C99481e f278391e;

    /* renamed from: f */
    public String f278392f = BuildConfig.FLAVOR;

    static {
        C99482f fVar = new C99482f();
        f278385g = fVar;
        C62942bv.registerDefaultInstance(C99482f.class, fVar);
    }

    private C99482f() {
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
                return newMessageInfo(f278385g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a});
            case 3:
                return new C99482f();
            case 4:
                return new C99477a();
            case 5:
                return f278385g;
            case 6:
                C63010eb ebVar = f278386h;
                if (ebVar == null) {
                    synchronized (C99482f.class) {
                        ebVar = f278386h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278385g);
                            f278386h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
