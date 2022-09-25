package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3863av.p3871d.p3872a.C50564f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.aw */
/* compiled from: PG */
public final class C64304aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64304aw f173865b;

    /* renamed from: f */
    private static volatile C63010eb f173866f;

    /* renamed from: a */
    public C62971cq f173867a = emptyProtobufList();

    /* renamed from: c */
    private int f173868c;

    /* renamed from: d */
    private C50564f f173869d;

    /* renamed from: e */
    private byte f173870e = 2;

    static {
        C64304aw awVar = new C64304aw();
        f173865b = awVar;
        C62942bv.registerDefaultInstance(C64304aw.class, awVar);
    }

    private C64304aw() {
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173870e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173870e = b;
                return null;
            case 2:
                return newMessageInfo(f173865b, "\u0001\u0002\u0000\u0001\u0002\n\u0002\u0000\u0001\u0001\u0002\u001b\nᐉ\u0005", new Object[]{C45240c.f118157a, "a", C64291aj.class, "d"});
            case 3:
                return new C64304aw();
            case 4:
                return new C64303av();
            case 5:
                return f173865b;
            case 6:
                C63010eb ebVar = f173866f;
                if (ebVar == null) {
                    synchronized (C64304aw.class) {
                        ebVar = f173866f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173865b);
                            f173866f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
