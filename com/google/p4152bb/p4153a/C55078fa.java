package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.fa */
/* compiled from: PG */
public final class C55078fa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55078fa f144901d;

    /* renamed from: e */
    private static volatile C63010eb f144902e;

    /* renamed from: a */
    public int f144903a;

    /* renamed from: b */
    public String f144904b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144905c = BuildConfig.FLAVOR;

    static {
        C55078fa faVar = new C55078fa();
        f144901d = faVar;
        C62942bv.registerDefaultInstance(C55078fa.class, faVar);
    }

    private C55078fa() {
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
                return newMessageInfo(f144901d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55078fa();
            case 4:
                return new C55076ez();
            case 5:
                return f144901d;
            case 6:
                C63010eb ebVar = f144902e;
                if (ebVar == null) {
                    synchronized (C55078fa.class) {
                        ebVar = f144902e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144901d);
                            f144902e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
