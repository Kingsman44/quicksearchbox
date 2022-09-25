package com.google.speech.p5230n.p5232b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.ab */
/* compiled from: PG */
public final class C67386ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67386ab f183160a;

    /* renamed from: f */
    private static volatile C63010eb f183161f;

    /* renamed from: b */
    private int f183162b;

    /* renamed from: c */
    private C67421r f183163c;

    /* renamed from: d */
    private String f183164d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f183165e = 2;

    static {
        C67386ab abVar = new C67386ab();
        f183160a = abVar;
        C62942bv.registerDefaultInstance(C67386ab.class, abVar);
    }

    private C67386ab() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183165e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183165e = b;
                return null;
            case 2:
                return newMessageInfo(f183160a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0003ᔈ\u0003", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C67386ab();
            case 4:
                return new C67385aa();
            case 5:
                return f183160a;
            case 6:
                C63010eb ebVar = f183161f;
                if (ebVar == null) {
                    synchronized (C67386ab.class) {
                        ebVar = f183161f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183160a);
                            f183161f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
