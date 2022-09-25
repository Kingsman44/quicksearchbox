package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.ah */
/* compiled from: PG */
public final class C54664ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54664ah f143502b;

    /* renamed from: c */
    private static volatile C63010eb f143503c;

    /* renamed from: a */
    public String f143504a = BuildConfig.FLAVOR;

    static {
        C54664ah ahVar = new C54664ah();
        f143502b = ahVar;
        C62942bv.registerDefaultInstance(C54664ah.class, ahVar);
    }

    private C54664ah() {
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
                return newMessageInfo(f143502b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C54664ah();
            case 4:
                return new C54663ag();
            case 5:
                return f143502b;
            case 6:
                C63010eb ebVar = f143503c;
                if (ebVar == null) {
                    synchronized (C54664ah.class) {
                        ebVar = f143503c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143502b);
                            f143503c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
