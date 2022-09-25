package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.by */
/* compiled from: PG */
public final class C50980by extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50980by f132720e;

    /* renamed from: g */
    private static volatile C63010eb f132721g;

    /* renamed from: a */
    public String f132722a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f132723b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132724c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f132725d;

    /* renamed from: f */
    private int f132726f;

    static {
        C50980by byVar = new C50980by();
        f132720e = byVar;
        C62942bv.registerDefaultInstance(C50980by.class, byVar);
    }

    private C50980by() {
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
                return newMessageInfo(f132720e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50980by();
            case 4:
                return new C50979bx();
            case 5:
                return f132720e;
            case 6:
                C63010eb ebVar = f132721g;
                if (ebVar == null) {
                    synchronized (C50980by.class) {
                        ebVar = f132721g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132720e);
                            f132721g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
