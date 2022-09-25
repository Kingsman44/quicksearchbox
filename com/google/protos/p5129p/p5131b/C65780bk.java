package com.google.protos.p5129p.p5131b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.bk */
/* compiled from: PG */
public final class C65780bk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C65780bk f178819g;

    /* renamed from: i */
    private static volatile C63010eb f178820i;

    /* renamed from: a */
    public int f178821a;

    /* renamed from: b */
    public C65768az f178822b;

    /* renamed from: c */
    public int f178823c;

    /* renamed from: d */
    public int f178824d;

    /* renamed from: e */
    public int f178825e;

    /* renamed from: f */
    public long f178826f;

    /* renamed from: h */
    private byte f178827h = 2;

    static {
        C65780bk bkVar = new C65780bk();
        f178819g = bkVar;
        C62942bv.registerDefaultInstance(C65780bk.class, bkVar);
    }

    private C65780bk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178827h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178827h = b;
                return null;
            case 2:
                Object[] objArr = new Object[9];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                C62959cf cfVar = C65784bo.f178833a;
                objArr[7] = cfVar;
                objArr[3] = cfVar;
                objArr[4] = "d";
                objArr[5] = C65777bh.f178818a;
                objArr[6] = "e";
                objArr[8] = C10662f.f35572a;
                return newMessageInfo(f178819g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဂ\u0004", objArr);
            case 3:
                return new C65780bk();
            case 4:
                return new C65779bj();
            case 5:
                return f178819g;
            case 6:
                C63010eb ebVar = f178820i;
                if (ebVar == null) {
                    synchronized (C65780bk.class) {
                        ebVar = f178820i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178819g);
                            f178820i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
