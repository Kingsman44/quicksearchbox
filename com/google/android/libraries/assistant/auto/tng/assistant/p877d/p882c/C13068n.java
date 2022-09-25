package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.n */
/* compiled from: PG */
public final class C13068n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C13068n f40556f;

    /* renamed from: g */
    private static volatile C63010eb f40557g;

    /* renamed from: a */
    public int f40558a;

    /* renamed from: b */
    public int f40559b;

    /* renamed from: c */
    public String f40560c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f40561d;

    /* renamed from: e */
    public C13063i f40562e;

    static {
        C13068n nVar = new C13068n();
        f40556f = nVar;
        C62942bv.registerDefaultInstance(C13068n.class, nVar);
    }

    private C13068n() {
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
                return newMessageInfo(f40556f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C13064j.f40554a, C45240c.f118157a, "d", C13066l.f40555a, "e"});
            case 3:
                return new C13068n();
            case 4:
                return new C13061g();
            case 5:
                return f40556f;
            case 6:
                C63010eb ebVar = f40557g;
                if (ebVar == null) {
                    synchronized (C13068n.class) {
                        ebVar = f40557g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40556f);
                            f40557g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
