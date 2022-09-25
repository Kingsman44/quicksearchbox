package com.google.android.apps.search.googleapp.stampviewer.webview.p10504e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.e.b */
/* compiled from: PG */
public final class C139551b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C139551b f379396f;

    /* renamed from: g */
    private static volatile C63010eb f379397g;

    /* renamed from: a */
    public int f379398a;

    /* renamed from: b */
    public boolean f379399b;

    /* renamed from: c */
    public boolean f379400c;

    /* renamed from: d */
    public boolean f379401d;

    /* renamed from: e */
    public boolean f379402e;

    static {
        C139551b bVar = new C139551b();
        f379396f = bVar;
        C62942bv.registerDefaultInstance(C139551b.class, bVar);
    }

    private C139551b() {
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
                return newMessageInfo(f379396f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C139551b();
            case 4:
                return new C139550a();
            case 5:
                return f379396f;
            case 6:
                C63010eb ebVar = f379397g;
                if (ebVar == null) {
                    synchronized (C139551b.class) {
                        ebVar = f379397g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379396f);
                            f379397g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
