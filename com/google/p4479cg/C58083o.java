package com.google.p4479cg;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cg.o */
/* compiled from: PG */
public final class C58083o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C58083o f155260b;

    /* renamed from: c */
    private static volatile C63010eb f155261c;

    /* renamed from: a */
    public String f155262a = BuildConfig.FLAVOR;

    static {
        C58083o oVar = new C58083o();
        f155260b = oVar;
        C62942bv.registerDefaultInstance(C58083o.class, oVar);
    }

    private C58083o() {
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
                return newMessageInfo(f155260b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C58083o();
            case 4:
                return new C58082n();
            case 5:
                return f155260b;
            case 6:
                C63010eb ebVar = f155261c;
                if (ebVar == null) {
                    synchronized (C58083o.class) {
                        ebVar = f155261c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155260b);
                            f155261c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
