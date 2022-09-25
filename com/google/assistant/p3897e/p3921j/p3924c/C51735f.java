package com.google.assistant.p3897e.p3921j.p3924c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.f */
/* compiled from: PG */
public final class C51735f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51735f f135718e;

    /* renamed from: g */
    private static volatile C63010eb f135719g;

    /* renamed from: a */
    public double f135720a;

    /* renamed from: b */
    public double f135721b;

    /* renamed from: c */
    public double f135722c;

    /* renamed from: d */
    public String f135723d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f135724f;

    static {
        C51735f fVar = new C51735f();
        f135718e = fVar;
        C62942bv.registerDefaultInstance(C51735f.class, fVar);
    }

    private C51735f() {
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
                return newMessageInfo(f135718e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51735f();
            case 4:
                return new C51734e();
            case 5:
                return f135718e;
            case 6:
                C63010eb ebVar = f135719g;
                if (ebVar == null) {
                    synchronized (C51735f.class) {
                        ebVar = f135719g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135718e);
                            f135719g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
