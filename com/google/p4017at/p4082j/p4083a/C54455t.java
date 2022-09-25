package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.t */
/* compiled from: PG */
public final class C54455t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54455t f142988c;

    /* renamed from: d */
    private static volatile C63010eb f142989d;

    /* renamed from: a */
    public C54394ct f142990a;

    /* renamed from: b */
    public String f142991b = BuildConfig.FLAVOR;

    static {
        C54455t tVar = new C54455t();
        f142988c = tVar;
        C62942bv.registerDefaultInstance(C54455t.class, tVar);
    }

    private C54455t() {
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
                return newMessageInfo(f142988c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54455t();
            case 4:
                return new C54454s();
            case 5:
                return f142988c;
            case 6:
                C63010eb ebVar = f142989d;
                if (ebVar == null) {
                    synchronized (C54455t.class) {
                        ebVar = f142989d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142988c);
                            f142989d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
