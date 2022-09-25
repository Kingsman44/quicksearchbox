package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.ca */
/* compiled from: PG */
public final class C56544ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56544ca f150987c;

    /* renamed from: d */
    private static volatile C63010eb f150988d;

    /* renamed from: a */
    public String f150989a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C56590p f150990b;

    static {
        C56544ca caVar = new C56544ca();
        f150987c = caVar;
        C62942bv.registerDefaultInstance(C56544ca.class, caVar);
    }

    private C56544ca() {
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
                return newMessageInfo(f150987c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C56544ca();
            case 4:
                return new C56542bz();
            case 5:
                return f150987c;
            case 6:
                C63010eb ebVar = f150988d;
                if (ebVar == null) {
                    synchronized (C56544ca.class) {
                        ebVar = f150988d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150987c);
                            f150988d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
