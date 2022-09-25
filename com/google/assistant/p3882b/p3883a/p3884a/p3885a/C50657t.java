package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.assistant.b.a.a.a.t */
/* compiled from: PG */
public final class C50657t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50657t f131767e;

    /* renamed from: g */
    private static volatile C63010eb f131768g;

    /* renamed from: a */
    public int f131769a = 0;

    /* renamed from: b */
    public Object f131770b;

    /* renamed from: c */
    public String f131771c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63070h f131772d;

    /* renamed from: f */
    private int f131773f;

    static {
        C50657t tVar = new C50657t();
        f131767e = tVar;
        C62942bv.registerDefaultInstance(C50657t.class, tVar);
    }

    private C50657t() {
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
                return newMessageInfo(f131767e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ဈ\u0002\u0005ဉ\u0003", new Object[]{"b", "a", C10662f.f35572a, C51805du.class, C45240c.f118157a, "d"});
            case 3:
                return new C50657t();
            case 4:
                return new C50656s();
            case 5:
                return f131767e;
            case 6:
                C63010eb ebVar = f131768g;
                if (ebVar == null) {
                    synchronized (C50657t.class) {
                        ebVar = f131768g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131767e);
                            f131768g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
