package com.google.nlp.p4735b.p4736a.p4738b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.i */
/* compiled from: PG */
public final class C62827i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62827i f169658b;

    /* renamed from: d */
    private static volatile C63010eb f169659d;

    /* renamed from: a */
    public String f169660a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f169661c;

    static {
        C62827i iVar = new C62827i();
        f169658b = iVar;
        C62942bv.registerDefaultInstance(C62827i.class, iVar);
    }

    private C62827i() {
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
                return newMessageInfo(f169658b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62827i();
            case 4:
                return new C62826h();
            case 5:
                return f169658b;
            case 6:
                C63010eb ebVar = f169659d;
                if (ebVar == null) {
                    synchronized (C62827i.class) {
                        ebVar = f169659d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169658b);
                            f169659d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
