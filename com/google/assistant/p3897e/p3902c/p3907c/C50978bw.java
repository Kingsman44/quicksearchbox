package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.bw */
/* compiled from: PG */
public final class C50978bw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50978bw f132713e;

    /* renamed from: g */
    private static volatile C63010eb f132714g;

    /* renamed from: a */
    public int f132715a;

    /* renamed from: b */
    public String f132716b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f132717c = emptyProtobufList();

    /* renamed from: d */
    public C50976bu f132718d;

    /* renamed from: f */
    private byte f132719f = 2;

    static {
        C50978bw bwVar = new C50978bw();
        f132713e = bwVar;
        C62942bv.registerDefaultInstance(C50978bw.class, bwVar);
    }

    private C50978bw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132719f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132719f = b;
                return null;
            case 2:
                return newMessageInfo(f132713e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C50976bu.class, "d"});
            case 3:
                return new C50978bw();
            case 4:
                return new C50977bv();
            case 5:
                return f132713e;
            case 6:
                C63010eb ebVar = f132714g;
                if (ebVar == null) {
                    synchronized (C50978bw.class) {
                        ebVar = f132714g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132713e);
                            f132714g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
