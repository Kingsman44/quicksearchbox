package com.google.assistant.p3803ag.p3804a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3927k.p3928a.C52666f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;

/* renamed from: com.google.assistant.ag.a.bn */
/* compiled from: PG */
public final class C48847bn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48847bn f126397e;

    /* renamed from: h */
    private static volatile C63010eb f126398h;

    /* renamed from: a */
    public int f126399a;

    /* renamed from: b */
    public C62971cq f126400b = emptyProtobufList();

    /* renamed from: c */
    public C51334dw f126401c;

    /* renamed from: d */
    public C48867j f126402d;

    /* renamed from: f */
    private C63171d f126403f;

    /* renamed from: g */
    private byte f126404g = 2;

    static {
        C48847bn bnVar = new C48847bn();
        f126397e = bnVar;
        C62942bv.registerDefaultInstance(C48847bn.class, bnVar);
    }

    private C48847bn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126404g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126404g = b;
                return null;
            case 2:
                return newMessageInfo(f126397e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C52666f.class, C45240c.f118157a, C10662f.f35572a, "d"});
            case 3:
                return new C48847bn();
            case 4:
                return new C48846bm();
            case 5:
                return f126397e;
            case 6:
                C63010eb ebVar = f126398h;
                if (ebVar == null) {
                    synchronized (C48847bn.class) {
                        ebVar = f126398h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126397e);
                            f126398h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
