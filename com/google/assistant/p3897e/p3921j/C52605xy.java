package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.xy */
/* compiled from: PG */
public final class C52605xy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52605xy f138123d;

    /* renamed from: f */
    private static volatile C63010eb f138124f;

    /* renamed from: a */
    public int f138125a;

    /* renamed from: b */
    public C51098gh f138126b;

    /* renamed from: c */
    public C62971cq f138127c;

    /* renamed from: e */
    private byte f138128e = 2;

    static {
        C52605xy xyVar = new C52605xy();
        f138123d = xyVar;
        C62942bv.registerDefaultInstance(C52605xy.class, xyVar);
    }

    private C52605xy() {
        emptyProtobufList();
        this.f138127c = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138128e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138128e = b;
                return null;
            case 2:
                return newMessageInfo(f138123d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0003Л", new Object[]{"a", "b", C45240c.f118157a, C52603xw.class});
            case 3:
                return new C52605xy();
            case 4:
                return new C52604xx();
            case 5:
                return f138123d;
            case 6:
                C63010eb ebVar = f138124f;
                if (ebVar == null) {
                    synchronized (C52605xy.class) {
                        ebVar = f138124f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138123d);
                            f138124f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
