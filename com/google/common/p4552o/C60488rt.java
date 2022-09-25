package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.rt */
/* compiled from: PG */
public final class C60488rt extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C60488rt f163701i;

    /* renamed from: j */
    private static volatile C63010eb f163702j;

    /* renamed from: a */
    public int f163703a;

    /* renamed from: b */
    public long f163704b;

    /* renamed from: c */
    public long f163705c;

    /* renamed from: d */
    public long f163706d;

    /* renamed from: e */
    public long f163707e;

    /* renamed from: f */
    public long f163708f;

    /* renamed from: g */
    public long f163709g;

    /* renamed from: h */
    public long f163710h;

    static {
        C60488rt rtVar = new C60488rt();
        f163701i = rtVar;
        C62942bv.registerDefaultInstance(C60488rt.class, rtVar);
    }

    private C60488rt() {
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
                return newMessageInfo(f163701i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C60488rt();
            case 4:
                return new C60487rs();
            case 5:
                return f163701i;
            case 6:
                C63010eb ebVar = f163702j;
                if (ebVar == null) {
                    synchronized (C60488rt.class) {
                        ebVar = f163702j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163701i);
                            f163702j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
