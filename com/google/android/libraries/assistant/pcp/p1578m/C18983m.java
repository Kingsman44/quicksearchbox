package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.assistant.p3803ag.p3809c.C49118hc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.m */
/* compiled from: PG */
public final class C18983m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C18983m f53340e;

    /* renamed from: g */
    private static volatile C63010eb f53341g;

    /* renamed from: a */
    public int f53342a;

    /* renamed from: b */
    public C18989s f53343b;

    /* renamed from: c */
    public C49118hc f53344c;

    /* renamed from: d */
    public C49111gw f53345d;

    /* renamed from: f */
    private byte f53346f = 2;

    static {
        C18983m mVar = new C18983m();
        f53340e = mVar;
        C62942bv.registerDefaultInstance(C18983m.class, mVar);
    }

    private C18983m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53346f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53346f = b;
                return null;
            case 2:
                return newMessageInfo(f53340e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0002\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ဉ\u0000", new Object[]{"a", C45240c.f118157a, "d", "b"});
            case 3:
                return new C18983m();
            case 4:
                return new C18982l();
            case 5:
                return f53340e;
            case 6:
                C63010eb ebVar = f53341g;
                if (ebVar == null) {
                    synchronized (C18983m.class) {
                        ebVar = f53341g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53340e);
                            f53341g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
