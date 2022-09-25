package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kr */
/* compiled from: PG */
public final class C14477kr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14477kr f43756c;

    /* renamed from: d */
    private static volatile C63010eb f43757d;

    /* renamed from: a */
    public int f43758a = 0;

    /* renamed from: b */
    public Object f43759b;

    static {
        C14477kr krVar = new C14477kr();
        f43756c = krVar;
        C62942bv.registerDefaultInstance(C14477kr.class, krVar);
    }

    private C14477kr() {
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
                return newMessageInfo(f43756c, "\u0000\u0016\u0001\u0000\u0001\u0016\u0016\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000", new Object[]{"b", "a", C14438jf.class, C14433ja.class, C14447jo.class, C14453ju.class, C14462kc.class, C14455jw.class, C14474ko.class, C14476kq.class, C14468ki.class, C14457jy.class, C14472km.class, C14436jd.class, C14429ix.class, C14451js.class, C14464ke.class, C14440jh.class, C14445jm.class, C14443jk.class, C14449jq.class, C14460ka.class, C14466kg.class, C14470kk.class});
            case 3:
                return new C14477kr();
            case 4:
                return new C14430iy();
            case 5:
                return f43756c;
            case 6:
                C63010eb ebVar = f43757d;
                if (ebVar == null) {
                    synchronized (C14477kr.class) {
                        ebVar = f43757d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43756c);
                            f43757d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
