package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.cj */
/* compiled from: PG */
public final class C28795cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28795cj f78251c;

    /* renamed from: d */
    private static volatile C63010eb f78252d;

    /* renamed from: a */
    public int f78253a = 0;

    /* renamed from: b */
    public Object f78254b;

    static {
        C28795cj cjVar = new C28795cj();
        f78251c = cjVar;
        C62942bv.registerDefaultInstance(C28795cj.class, cjVar);
    }

    private C28795cj() {
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
                return newMessageInfo(f78251c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C28791cf.class, C28793ch.class});
            case 3:
                return new C28795cj();
            case 4:
                return new C28794ci();
            case 5:
                return f78251c;
            case 6:
                C63010eb ebVar = f78252d;
                if (ebVar == null) {
                    synchronized (C28795cj.class) {
                        ebVar = f78252d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78251c);
                            f78252d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
