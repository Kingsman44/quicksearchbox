package com.google.assistant.p3879aw.p3881b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.ab */
/* compiled from: PG */
public final class C50596ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50596ab f131646c;

    /* renamed from: f */
    private static volatile C63010eb f131647f;

    /* renamed from: a */
    public C62971cq f131648a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f131649b;

    /* renamed from: d */
    private int f131650d;

    /* renamed from: e */
    private C50617t f131651e;

    static {
        C50596ab abVar = new C50596ab();
        f131646c = abVar;
        C62942bv.registerDefaultInstance(C50596ab.class, abVar);
    }

    private C50596ab() {
        emptyProtobufList();
        emptyProtobufList();
        this.f131649b = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f131646c, "\u0001\u0003\u0000\u0001\u0001\u0017\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0017ဉ\f", new Object[]{"d", "a", C50621x.class, "b", C50619v.class, "e"});
            case 3:
                return new C50596ab();
            case 4:
                return new C50595aa();
            case 5:
                return f131646c;
            case 6:
                C63010eb ebVar = f131647f;
                if (ebVar == null) {
                    synchronized (C50596ab.class) {
                        ebVar = f131647f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131646c);
                            f131647f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
