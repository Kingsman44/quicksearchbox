package com.google.android.apps.search.googleapp.silkpane.p10486b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.b.b */
/* compiled from: PG */
public final class C139280b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C139280b f378830g;

    /* renamed from: h */
    private static volatile C63010eb f378831h;

    /* renamed from: a */
    public int f378832a;

    /* renamed from: b */
    public String f378833b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f378834c;

    /* renamed from: d */
    public boolean f378835d;

    /* renamed from: e */
    public boolean f378836e;

    /* renamed from: f */
    public boolean f378837f;

    static {
        C139280b bVar = new C139280b();
        f378830g = bVar;
        C62942bv.registerDefaultInstance(C139280b.class, bVar);
    }

    private C139280b() {
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
                return newMessageInfo(f378830g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C139280b();
            case 4:
                return new C139279a();
            case 5:
                return f378830g;
            case 6:
                C63010eb ebVar = f378831h;
                if (ebVar == null) {
                    synchronized (C139280b.class) {
                        ebVar = f378831h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378830g);
                            f378831h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
