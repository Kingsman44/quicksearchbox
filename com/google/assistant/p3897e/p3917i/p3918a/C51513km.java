package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.e.i.a.km */
/* compiled from: PG */
public final class C51513km extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51513km f134204e;

    /* renamed from: h */
    private static volatile C63010eb f134205h;

    /* renamed from: a */
    public int f134206a;

    /* renamed from: b */
    public C62971cq f134207b = emptyProtobufList();

    /* renamed from: c */
    public boolean f134208c;

    /* renamed from: d */
    public boolean f134209d;

    /* renamed from: f */
    private C63042fg f134210f;

    /* renamed from: g */
    private byte f134211g = 2;

    static {
        C51513km kmVar = new C51513km();
        f134204e = kmVar;
        C62942bv.registerDefaultInstance(C51513km.class, kmVar);
    }

    private C51513km() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134211g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134211g = b;
                return null;
            case 2:
                return newMessageInfo(f134204e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001Л\u0003ဉ\u0000\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"a", "b", C51509ki.class, C10662f.f35572a, C45240c.f118157a, "d"});
            case 3:
                return new C51513km();
            case 4:
                return new C51512kl();
            case 5:
                return f134204e;
            case 6:
                C63010eb ebVar = f134205h;
                if (ebVar == null) {
                    synchronized (C51513km.class) {
                        ebVar = f134205h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134204e);
                            f134205h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
