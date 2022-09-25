package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.q */
/* compiled from: PG */
public final class C49626q extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62962ci f128068g = new C49624o();

    /* renamed from: h */
    public static final C49626q f128069h;

    /* renamed from: j */
    private static volatile C63010eb f128070j;

    /* renamed from: a */
    public C62971cq f128071a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f128072b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f128073c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f128074d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f128075e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62961ch f128076f = emptyIntList();

    /* renamed from: i */
    private byte f128077i = 2;

    static {
        C49626q qVar = new C49626q();
        f128069h = qVar;
        C62942bv.registerDefaultInstance(C49626q.class, qVar);
    }

    private C49626q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128077i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128077i = b;
                return null;
            case 2:
                return newMessageInfo(f128069h, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0004\u0001Л\u0002Л\u0003Л\u0004Л\u0005\u001a\u0006\u001e", new Object[]{"a", C49626q.class, "b", C49626q.class, C45240c.f118157a, C49626q.class, "d", C49621l.class, "e", C10662f.f35572a, C49632w.m85591b()});
            case 3:
                return new C49626q();
            case 4:
                return new C49625p();
            case 5:
                return f128069h;
            case 6:
                C63010eb ebVar = f128070j;
                if (ebVar == null) {
                    synchronized (C49626q.class) {
                        ebVar = f128070j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128069h);
                            f128070j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
