package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bw */
/* compiled from: PG */
public final class C54370bw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54370bw f142816b;

    /* renamed from: c */
    private static volatile C63010eb f142817c;

    /* renamed from: a */
    public String f142818a = BuildConfig.FLAVOR;

    static {
        C54370bw bwVar = new C54370bw();
        f142816b = bwVar;
        C62942bv.registerDefaultInstance(C54370bw.class, bwVar);
    }

    private C54370bw() {
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
                return newMessageInfo(f142816b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"a"});
            case 3:
                return new C54370bw();
            case 4:
                return new C54369bv();
            case 5:
                return f142816b;
            case 6:
                C63010eb ebVar = f142817c;
                if (ebVar == null) {
                    synchronized (C54370bw.class) {
                        ebVar = f142817c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142816b);
                            f142817c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
