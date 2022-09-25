package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.du */
/* compiled from: PG */
public final class C53165du extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53165du f139338g;

    /* renamed from: i */
    private static volatile C63010eb f139339i;

    /* renamed from: a */
    public String f139340a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f139341b;

    /* renamed from: c */
    public long f139342c;

    /* renamed from: d */
    public long f139343d;

    /* renamed from: e */
    public String f139344e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f139345f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private int f139346h;

    static {
        C53165du duVar = new C53165du();
        f139338g = duVar;
        C62942bv.registerDefaultInstance(C53165du.class, duVar);
    }

    private C53165du() {
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
                return newMessageInfo(f139338g, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0000\u0003ဂ\u0003\u0004ဈ\u0004\u0005ဈ\u0000\u0006ဇ\u0001\u0007တ\u0002\bဈ\u0005", new Object[]{C19618h.f54585a, "d", "e", "a", "b", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new C53165du();
            case 4:
                return new C53164dt();
            case 5:
                return f139338g;
            case 6:
                C63010eb ebVar = f139339i;
                if (ebVar == null) {
                    synchronized (C53165du.class) {
                        ebVar = f139339i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139338g);
                            f139339i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
