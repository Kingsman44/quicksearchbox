package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.as */
/* compiled from: PG */
public final class C56508as extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56508as f150916b;

    /* renamed from: c */
    private static volatile C63010eb f150917c;

    /* renamed from: a */
    public String f150918a = BuildConfig.FLAVOR;

    static {
        C56508as asVar = new C56508as();
        f150916b = asVar;
        C62942bv.registerDefaultInstance(C56508as.class, asVar);
    }

    private C56508as() {
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
                return newMessageInfo(f150916b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C56508as();
            case 4:
                return new C56507ar();
            case 5:
                return f150916b;
            case 6:
                C63010eb ebVar = f150917c;
                if (ebVar == null) {
                    synchronized (C56508as.class) {
                        ebVar = f150917c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150916b);
                            f150917c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
