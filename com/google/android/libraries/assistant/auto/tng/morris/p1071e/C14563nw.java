package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nw */
/* compiled from: PG */
public final class C14563nw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14563nw f44030b;

    /* renamed from: d */
    private static volatile C63010eb f44031d;

    /* renamed from: a */
    public C62971cq f44032a = emptyProtobufList();

    /* renamed from: c */
    private byte f44033c = 2;

    static {
        C14563nw nwVar = new C14563nw();
        f44030b = nwVar;
        C62942bv.registerDefaultInstance(C14563nw.class, nwVar);
    }

    private C14563nw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44033c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44033c = b;
                return null;
            case 2:
                return newMessageInfo(f44030b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C14561nu.class});
            case 3:
                return new C14563nw();
            case 4:
                return new C14562nv();
            case 5:
                return f44030b;
            case 6:
                C63010eb ebVar = f44031d;
                if (ebVar == null) {
                    synchronized (C14563nw.class) {
                        ebVar = f44031d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44030b);
                            f44031d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
