package com.google.android.apps.gsa.staticplugins.settings.p8758a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49891cv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.a.f */
/* compiled from: PG */
public final class C117302f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C117302f f325630f;

    /* renamed from: g */
    private static volatile C63010eb f325631g;

    /* renamed from: a */
    public int f325632a;

    /* renamed from: b */
    public C49891cv f325633b;

    /* renamed from: c */
    public C117301e f325634c;

    /* renamed from: d */
    public String f325635d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C117299c f325636e;

    static {
        C117302f fVar = new C117302f();
        f325630f = fVar;
        C62942bv.registerDefaultInstance(C117302f.class, fVar);
    }

    private C117302f() {
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
                return newMessageInfo(f325630f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C117302f();
            case 4:
                return new C117297a();
            case 5:
                return f325630f;
            case 6:
                C63010eb ebVar = f325631g;
                if (ebVar == null) {
                    synchronized (C117302f.class) {
                        ebVar = f325631g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f325630f);
                            f325631g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
