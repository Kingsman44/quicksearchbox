package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.b.d */
/* compiled from: PG */
public final class C136074d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136074d f370596d;

    /* renamed from: e */
    private static volatile C63010eb f370597e;

    /* renamed from: a */
    public int f370598a;

    /* renamed from: b */
    public String f370599b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f370600c = BuildConfig.FLAVOR;

    static {
        C136074d dVar = new C136074d();
        f370596d = dVar;
        C62942bv.registerDefaultInstance(C136074d.class, dVar);
    }

    private C136074d() {
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
                return newMessageInfo(f370596d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136074d();
            case 4:
                return new C136073c();
            case 5:
                return f370596d;
            case 6:
                C63010eb ebVar = f370597e;
                if (ebVar == null) {
                    synchronized (C136074d.class) {
                        ebVar = f370597e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370596d);
                            f370597e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
