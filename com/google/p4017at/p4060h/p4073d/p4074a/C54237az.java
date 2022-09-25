package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.az */
/* compiled from: PG */
public final class C54237az extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54237az f142392e;

    /* renamed from: g */
    private static volatile C63010eb f142393g;

    /* renamed from: a */
    public String f142394a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f142395b;

    /* renamed from: c */
    public int f142396c;

    /* renamed from: d */
    public String f142397d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f142398f;

    static {
        C54237az azVar = new C54237az();
        f142392e = azVar;
        C62942bv.registerDefaultInstance(C54237az.class, azVar);
    }

    private C54237az() {
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
                return newMessageInfo(f142392e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဍ\u0001\u0003ဍ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54237az();
            case 4:
                return new C54236ay();
            case 5:
                return f142392e;
            case 6:
                C63010eb ebVar = f142393g;
                if (ebVar == null) {
                    synchronized (C54237az.class) {
                        ebVar = f142393g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142392e);
                            f142393g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
