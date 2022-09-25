package com.google.protos.p4985f.p4988b.p4990b.p4991a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.a.d */
/* compiled from: PG */
public final class C64725d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64725d f175446b;

    /* renamed from: c */
    private static volatile C63010eb f175447c;

    /* renamed from: a */
    public String f175448a = BuildConfig.FLAVOR;

    static {
        C64725d dVar = new C64725d();
        f175446b = dVar;
        C62942bv.registerDefaultInstance(C64725d.class, dVar);
    }

    private C64725d() {
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
                return newMessageInfo(f175446b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C64725d();
            case 4:
                return new C64724c();
            case 5:
                return f175446b;
            case 6:
                C63010eb ebVar = f175447c;
                if (ebVar == null) {
                    synchronized (C64725d.class) {
                        ebVar = f175447c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175446b);
                            f175447c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
