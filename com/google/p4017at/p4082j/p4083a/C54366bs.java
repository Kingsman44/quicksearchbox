package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bs */
/* compiled from: PG */
public final class C54366bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54366bs f142811b;

    /* renamed from: c */
    private static volatile C63010eb f142812c;

    /* renamed from: a */
    public String f142813a = BuildConfig.FLAVOR;

    static {
        C54366bs bsVar = new C54366bs();
        f142811b = bsVar;
        C62942bv.registerDefaultInstance(C54366bs.class, bsVar);
    }

    private C54366bs() {
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
                return newMessageInfo(f142811b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C54366bs();
            case 4:
                return new C54365br();
            case 5:
                return f142811b;
            case 6:
                C63010eb ebVar = f142812c;
                if (ebVar == null) {
                    synchronized (C54366bs.class) {
                        ebVar = f142812c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142811b);
                            f142812c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
