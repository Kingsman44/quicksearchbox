package com.google.p4222bl.p4223a.p4224a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.af */
/* compiled from: PG */
public final class C56062af extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56062af f149372e;

    /* renamed from: g */
    private static volatile C63010eb f149373g;

    /* renamed from: a */
    public String f149374a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f149375b;

    /* renamed from: c */
    public int f149376c;

    /* renamed from: d */
    public boolean f149377d;

    /* renamed from: f */
    private int f149378f;

    static {
        C56062af afVar = new C56062af();
        f149372e = afVar;
        C62942bv.registerDefaultInstance(C56062af.class, afVar);
    }

    private C56062af() {
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
                return newMessageInfo(f149372e, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဋ\u0000\u0003ဋ\u0001\u0004ဇ\u0002", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56062af();
            case 4:
                return new C56061ae();
            case 5:
                return f149372e;
            case 6:
                C63010eb ebVar = f149373g;
                if (ebVar == null) {
                    synchronized (C56062af.class) {
                        ebVar = f149373g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149372e);
                            f149373g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
