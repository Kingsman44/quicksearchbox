package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.al */
/* compiled from: PG */
public final class C54954al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54954al f144564d;

    /* renamed from: e */
    private static volatile C63010eb f144565e;

    /* renamed from: a */
    public int f144566a;

    /* renamed from: b */
    public String f144567b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144568c = BuildConfig.FLAVOR;

    static {
        C54954al alVar = new C54954al();
        f144564d = alVar;
        C62942bv.registerDefaultInstance(C54954al.class, alVar);
    }

    private C54954al() {
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
                return newMessageInfo(f144564d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C54954al();
            case 4:
                return new C54953ak();
            case 5:
                return f144564d;
            case 6:
                C63010eb ebVar = f144565e;
                if (ebVar == null) {
                    synchronized (C54954al.class) {
                        ebVar = f144565e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144564d);
                            f144565e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
