package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.id */
/* compiled from: PG */
public final class C51450id extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51450id f133992h;

    /* renamed from: j */
    private static volatile C63010eb f133993j;

    /* renamed from: a */
    public int f133994a;

    /* renamed from: b */
    public C62971cq f133995b = emptyProtobufList();

    /* renamed from: c */
    public C51443hx f133996c;

    /* renamed from: d */
    public C51098gh f133997d;

    /* renamed from: e */
    public C51098gh f133998e;

    /* renamed from: f */
    public C62971cq f133999f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f134000g = emptyProtobufList();

    /* renamed from: i */
    private byte f134001i = 2;

    static {
        C51450id idVar = new C51450id();
        f133992h = idVar;
        C62942bv.registerDefaultInstance(C51450id.class, idVar);
    }

    private C51450id() {
    }

    /* renamed from: a */
    public final void mo53621a() {
        C62971cq cqVar = this.f133995b;
        if (!cqVar.mo58948c()) {
            this.f133995b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134001i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134001i = b;
                return null;
            case 2:
                return newMessageInfo(f133992h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0001\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006\u001b", new Object[]{"a", "b", C51447ia.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C51098gh.class, C30325g.f82003a, C51449ic.class});
            case 3:
                return new C51450id();
            case 4:
                return new C51444hy();
            case 5:
                return f133992h;
            case 6:
                C63010eb ebVar = f133993j;
                if (ebVar == null) {
                    synchronized (C51450id.class) {
                        ebVar = f133993j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133992h);
                            f133993j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
