package com.google.nlp.p4730a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.g */
/* compiled from: PG */
public final class C62787g extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C62787g f169549i;

    /* renamed from: j */
    private static volatile C63010eb f169550j;

    /* renamed from: a */
    public int f169551a;

    /* renamed from: b */
    public long f169552b;

    /* renamed from: c */
    public int f169553c = 1;

    /* renamed from: d */
    public int f169554d = 1;

    /* renamed from: e */
    public int f169555e;

    /* renamed from: f */
    public int f169556f;

    /* renamed from: g */
    public int f169557g;

    /* renamed from: h */
    public String f169558h = BuildConfig.FLAVOR;

    static {
        C62787g gVar = new C62787g();
        f169549i = gVar;
        C62942bv.registerDefaultInstance(C62787g.class, gVar);
    }

    private C62787g() {
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
                return newMessageInfo(f169549i, "\u0001\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u000fဈ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C62787g();
            case 4:
                return new C62786f();
            case 5:
                return f169549i;
            case 6:
                C63010eb ebVar = f169550j;
                if (ebVar == null) {
                    synchronized (C62787g.class) {
                        ebVar = f169550j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169549i);
                            f169550j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
