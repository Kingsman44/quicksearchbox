package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cd */
/* compiled from: PG */
public final class C138248cd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C138248cd f376136e;

    /* renamed from: g */
    private static volatile C63010eb f376137g;

    /* renamed from: a */
    public String f376138a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f376139b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f376140c;

    /* renamed from: d */
    public C138246cb f376141d;

    /* renamed from: f */
    private int f376142f;

    static {
        C138248cd cdVar = new C138248cd();
        f376136e = cdVar;
        C62942bv.registerDefaultInstance(C138248cd.class, cdVar);
    }

    private C138248cd() {
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
                return newMessageInfo(f376136e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဃ\u0002\u0003ဈ\u0000\u0004ဉ\u0003\u0005ဈ\u0001", new Object[]{C10662f.f35572a, C45240c.f118157a, "a", "d", "b"});
            case 3:
                return new C138248cd();
            case 4:
                return new C138247cc();
            case 5:
                return f376136e;
            case 6:
                C63010eb ebVar = f376137g;
                if (ebVar == null) {
                    synchronized (C138248cd.class) {
                        ebVar = f376137g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376136e);
                            f376137g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
