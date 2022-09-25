package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bw */
/* compiled from: PG */
public final class C14239bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14239bw f43093c;

    /* renamed from: d */
    private static volatile C63010eb f43094d;

    /* renamed from: a */
    public C52686as f43095a;

    /* renamed from: b */
    public boolean f43096b;

    static {
        C14239bw bwVar = new C14239bw();
        f43093c = bwVar;
        C62942bv.registerDefaultInstance(C14239bw.class, bwVar);
    }

    private C14239bw() {
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
                return newMessageInfo(f43093c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14239bw();
            case 4:
                return new C14238bv();
            case 5:
                return f43093c;
            case 6:
                C63010eb ebVar = f43094d;
                if (ebVar == null) {
                    synchronized (C14239bw.class) {
                        ebVar = f43094d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43093c);
                            f43094d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
