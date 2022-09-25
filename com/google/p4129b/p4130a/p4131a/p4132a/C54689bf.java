package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bf */
/* compiled from: PG */
public final class C54689bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54689bf f143551c;

    /* renamed from: d */
    private static volatile C63010eb f143552d;

    /* renamed from: a */
    public String f143553a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f143554b = BuildConfig.FLAVOR;

    static {
        C54689bf bfVar = new C54689bf();
        f143551c = bfVar;
        C62942bv.registerDefaultInstance(C54689bf.class, bfVar);
    }

    private C54689bf() {
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
                return newMessageInfo(f143551c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54689bf();
            case 4:
                return new C54688be();
            case 5:
                return f143551c;
            case 6:
                C63010eb ebVar = f143552d;
                if (ebVar == null) {
                    synchronized (C54689bf.class) {
                        ebVar = f143552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143551c);
                            f143552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
