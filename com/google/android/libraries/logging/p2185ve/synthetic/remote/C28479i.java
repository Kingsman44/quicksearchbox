package com.google.android.libraries.logging.p2185ve.synthetic.remote;

import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.remote.i */
/* compiled from: PG */
public final class C28479i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28479i f77281c;

    /* renamed from: e */
    private static volatile C63010eb f77282e;

    /* renamed from: a */
    public C62971cq f77283a = emptyProtobufList();

    /* renamed from: b */
    public C62961ch f77284b = emptyIntList();

    /* renamed from: d */
    private byte f77285d = 2;

    static {
        C28479i iVar = new C28479i();
        f77281c = iVar;
        C62942bv.registerDefaultInstance(C28479i.class, iVar);
    }

    private C28479i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f77285d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f77285d = b;
                return null;
            case 2:
                return newMessageInfo(f77281c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u0016", new Object[]{"a", C28481u.class, "b"});
            case 3:
                return new C28479i();
            case 4:
                return new C28478h();
            case 5:
                return f77281c;
            case 6:
                C63010eb ebVar = f77282e;
                if (ebVar == null) {
                    synchronized (C28479i.class) {
                        ebVar = f77282e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77281c);
                            f77282e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
