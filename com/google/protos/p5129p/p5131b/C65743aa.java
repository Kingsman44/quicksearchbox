package com.google.protos.p5129p.p5131b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4280bt.C56488d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.aa */
/* compiled from: PG */
public final class C65743aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65743aa f178597e;

    /* renamed from: h */
    private static volatile C63010eb f178598h;

    /* renamed from: a */
    public int f178599a = 0;

    /* renamed from: b */
    public Object f178600b;

    /* renamed from: c */
    public int f178601c;

    /* renamed from: d */
    public C65821cy f178602d;

    /* renamed from: f */
    private int f178603f;

    /* renamed from: g */
    private byte f178604g = 2;

    static {
        C65743aa aaVar = new C65743aa();
        f178597e = aaVar;
        C62942bv.registerDefaultInstance(C65743aa.class, aaVar);
    }

    private C65743aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178604g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178604g = b;
                return null;
            case 2:
                return newMessageInfo(f178597e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003ဌ\u0000\u0004ဉ\u0003", new Object[]{"b", "a", C10662f.f35572a, C56488d.class, C65819cw.class, C45240c.f118157a, C65753ak.m96798c(), "d"});
            case 3:
                return new C65743aa();
            case 4:
                return new C65857z();
            case 5:
                return f178597e;
            case 6:
                C63010eb ebVar = f178598h;
                if (ebVar == null) {
                    synchronized (C65743aa.class) {
                        ebVar = f178598h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178597e);
                            f178598h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
