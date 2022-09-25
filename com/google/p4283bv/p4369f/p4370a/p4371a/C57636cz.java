package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.cz */
/* compiled from: PG */
public final class C57636cz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57636cz f153933b;

    /* renamed from: c */
    private static volatile C63010eb f153934c;

    /* renamed from: a */
    public String f153935a = BuildConfig.FLAVOR;

    static {
        C57636cz czVar = new C57636cz();
        f153933b = czVar;
        C62942bv.registerDefaultInstance(C57636cz.class, czVar);
    }

    private C57636cz() {
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
                return newMessageInfo(f153933b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C57636cz();
            case 4:
                return new C57635cy();
            case 5:
                return f153933b;
            case 6:
                C63010eb ebVar = f153934c;
                if (ebVar == null) {
                    synchronized (C57636cz.class) {
                        ebVar = f153934c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153933b);
                            f153934c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
