package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.cj */
/* compiled from: PG */
public final class C52731cj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52731cj f138396a;

    /* renamed from: d */
    private static volatile C63010eb f138397d;

    /* renamed from: b */
    private C62995dn f138398b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f138399c = C62995dn.f170057a;

    static {
        C52731cj cjVar = new C52731cj();
        f138396a = cjVar;
        C62942bv.registerDefaultInstance(C52731cj.class, cjVar);
    }

    private C52731cj() {
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
                return newMessageInfo(f138396a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"b", C52730ci.f138395a, C45240c.f118157a, C52729ch.f138394a});
            case 3:
                return new C52731cj();
            case 4:
                return new C52728cg();
            case 5:
                return f138396a;
            case 6:
                C63010eb ebVar = f138397d;
                if (ebVar == null) {
                    synchronized (C52731cj.class) {
                        ebVar = f138397d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138396a);
                            f138397d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
