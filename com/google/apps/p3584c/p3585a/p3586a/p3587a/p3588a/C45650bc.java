package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.bc */
/* compiled from: PG */
public final class C45650bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f120093c = new C45648ba();

    /* renamed from: d */
    public static final C45650bc f120094d;

    /* renamed from: f */
    private static volatile C63010eb f120095f;

    /* renamed from: a */
    public String f120096a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62961ch f120097b = emptyIntList();

    /* renamed from: e */
    private int f120098e;

    static {
        C45650bc bcVar = new C45650bc();
        f120094d = bcVar;
        C62942bv.registerDefaultInstance(C45650bc.class, bcVar);
    }

    private C45650bc() {
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(f120094d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"e", "a", "b", C45637aq.m81350b()});
            case 3:
                return new C45650bc();
            case 4:
                return new C45649bb();
            case 5:
                return f120094d;
            case 6:
                C63010eb ebVar = f120095f;
                if (ebVar == null) {
                    synchronized (C45650bc.class) {
                        ebVar = f120095f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120094d);
                            f120095f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
