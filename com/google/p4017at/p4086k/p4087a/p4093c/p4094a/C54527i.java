package com.google.p4017at.p4086k.p4087a.p4093c.p4094a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.k.a.c.a.i */
/* compiled from: PG */
public final class C54527i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54527i f143162d;

    /* renamed from: e */
    private static volatile C63010eb f143163e;

    /* renamed from: a */
    public int f143164a;

    /* renamed from: b */
    public C63042fg f143165b;

    /* renamed from: c */
    public String f143166c = BuildConfig.FLAVOR;

    static {
        C54527i iVar = new C54527i();
        f143162d = iVar;
        C62942bv.registerDefaultInstance(C54527i.class, iVar);
    }

    private C54527i() {
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
                return newMessageInfo(f143162d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54527i();
            case 4:
                return new C54526h();
            case 5:
                return f143162d;
            case 6:
                C63010eb ebVar = f143163e;
                if (ebVar == null) {
                    synchronized (C54527i.class) {
                        ebVar = f143163e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143162d);
                            f143163e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
