package com.google.assistant.p4016z;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.z.ak */
/* compiled from: PG */
public final class C53686ak extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53686ak f140913f;

    /* renamed from: h */
    private static volatile C63010eb f140914h;

    /* renamed from: a */
    public int f140915a;

    /* renamed from: b */
    public int f140916b = 0;

    /* renamed from: c */
    public Object f140917c;

    /* renamed from: d */
    public C63042fg f140918d;

    /* renamed from: e */
    public long f140919e;

    /* renamed from: g */
    private byte f140920g = 2;

    static {
        C53686ak akVar = new C53686ak();
        f140913f = akVar;
        C62942bv.registerDefaultInstance(C53686ak.class, akVar);
    }

    private C53686ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140920g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140920g = b;
                return null;
            case 2:
                return newMessageInfo(f140913f, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0005\u0001ဉ\u0000\u0002ᐼ\u0000\u0003ဂ\u0001\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000\bᐼ\u0000\tᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C53734s.class, "e", C53715bm.class, C53710bh.class, C53731p.class, C53717bo.class, C106596h.class, C53703ba.class});
            case 3:
                return new C53686ak();
            case 4:
                return new C53685aj();
            case 5:
                return f140913f;
            case 6:
                C63010eb ebVar = f140914h;
                if (ebVar == null) {
                    synchronized (C53686ak.class) {
                        ebVar = f140914h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140913f);
                            f140914h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
