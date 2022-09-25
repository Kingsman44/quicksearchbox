package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.tn */
/* compiled from: PG */
public final class C8046tn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8046tn f28256g;

    /* renamed from: i */
    private static volatile C63010eb f28257i;

    /* renamed from: a */
    public int f28258a;

    /* renamed from: b */
    public C8150xj f28259b;

    /* renamed from: c */
    public C8150xj f28260c;

    /* renamed from: d */
    public C62971cq f28261d = emptyProtobufList();

    /* renamed from: e */
    public C7536ax f28262e;

    /* renamed from: f */
    public boolean f28263f;

    /* renamed from: h */
    private byte f28264h = 2;

    static {
        C8046tn tnVar = new C8046tn();
        f28256g = tnVar;
        C62942bv.registerDefaultInstance(C8046tn.class, tnVar);
    }

    private C8046tn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28264h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28264h = b;
                return null;
            case 2:
                return newMessageInfo(f28256g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d", C7818lb.class});
            case 3:
                return new C8046tn();
            case 4:
                return new C8045tm();
            case 5:
                return f28256g;
            case 6:
                C63010eb ebVar = f28257i;
                if (ebVar == null) {
                    synchronized (C8046tn.class) {
                        ebVar = f28257i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28256g);
                            f28257i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
