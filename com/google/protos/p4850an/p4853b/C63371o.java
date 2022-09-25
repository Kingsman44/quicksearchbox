package com.google.protos.p4850an.p4853b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.b.o */
/* compiled from: PG */
public final class C63371o extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63371o f171261g;

    /* renamed from: i */
    private static volatile C63010eb f171262i;

    /* renamed from: a */
    public int f171263a;

    /* renamed from: b */
    public int f171264b;

    /* renamed from: c */
    public C63360d f171265c;

    /* renamed from: d */
    public int f171266d;

    /* renamed from: e */
    public C62971cq f171267e;

    /* renamed from: f */
    public int f171268f;

    /* renamed from: h */
    private byte f171269h = 2;

    static {
        C63371o oVar = new C63371o();
        f171261g = oVar;
        C62942bv.registerDefaultInstance(C63371o.class, oVar);
    }

    private C63371o() {
        emptyProtobufList();
        emptyProtobufList();
        this.f171267e = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171269h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171269h = b;
                return null;
            case 2:
                return newMessageInfo(f171261g, "\u0001\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0001\u0002\u0001Л\u0003ဋ\u0000\u0004ဌ\u0007\u0007င\u0005\u000fᐉ\u0004", new Object[]{"a", "e", C63358b.class, "b", C10662f.f35572a, C63381y.f171281a, "d", C45240c.f118157a});
            case 3:
                return new C63371o();
            case 4:
                return new C63370n();
            case 5:
                return f171261g;
            case 6:
                C63010eb ebVar = f171262i;
                if (ebVar == null) {
                    synchronized (C63371o.class) {
                        ebVar = f171262i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171261g);
                            f171262i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
