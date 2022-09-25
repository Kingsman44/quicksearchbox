package com.google.android.apps.gsa.shared.speech.dumper;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.g */
/* compiled from: PG */
public final class C90554g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C90554g f253148e;

    /* renamed from: f */
    private static volatile C63010eb f253149f;

    /* renamed from: a */
    public int f253150a;

    /* renamed from: b */
    public long f253151b;

    /* renamed from: c */
    public String f253152c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f253153d = BuildConfig.FLAVOR;

    static {
        C90554g gVar = new C90554g();
        f253148e = gVar;
        C62942bv.registerDefaultInstance(C90554g.class, gVar);
    }

    private C90554g() {
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
                return newMessageInfo(f253148e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C90554g();
            case 4:
                return new C90553f();
            case 5:
                return f253148e;
            case 6:
                C63010eb ebVar = f253149f;
                if (ebVar == null) {
                    synchronized (C90554g.class) {
                        ebVar = f253149f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f253148e);
                            f253149f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
