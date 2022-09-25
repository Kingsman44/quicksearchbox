package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yz */
/* compiled from: PG */
public final class C52633yz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52633yz f138192f;

    /* renamed from: g */
    private static volatile C63010eb f138193g;

    /* renamed from: a */
    public int f138194a;

    /* renamed from: b */
    public String f138195b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138196c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C52613yf f138197d;

    /* renamed from: e */
    public long f138198e;

    static {
        C52633yz yzVar = new C52633yz();
        f138192f = yzVar;
        C62942bv.registerDefaultInstance(C52633yz.class, yzVar);
    }

    private C52633yz() {
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
                return newMessageInfo(f138192f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C52633yz();
            case 4:
                return new C52632yy();
            case 5:
                return f138192f;
            case 6:
                C63010eb ebVar = f138193g;
                if (ebVar == null) {
                    synchronized (C52633yz.class) {
                        ebVar = f138193g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138192f);
                            f138193g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
