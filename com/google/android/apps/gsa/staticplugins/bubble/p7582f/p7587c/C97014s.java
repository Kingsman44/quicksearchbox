package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.c.s */
/* compiled from: PG */
public final class C97014s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97014s f271107e;

    /* renamed from: g */
    private static volatile C63010eb f271108g;

    /* renamed from: a */
    public String f271109a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f271110b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f271111c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f271112d;

    /* renamed from: f */
    private int f271113f;

    static {
        C97014s sVar = new C97014s();
        f271107e = sVar;
        C62942bv.registerDefaultInstance(C97014s.class, sVar);
    }

    private C97014s() {
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
                return newMessageInfo(f271107e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဌ\u0003\u0004ဈ\u0001", new Object[]{C10662f.f35572a, "a", C45240c.f118157a, "d", C97012q.f271106a, "b"});
            case 3:
                return new C97014s();
            case 4:
                return new C97011p();
            case 5:
                return f271107e;
            case 6:
                C63010eb ebVar = f271108g;
                if (ebVar == null) {
                    synchronized (C97014s.class) {
                        ebVar = f271108g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271107e);
                            f271108g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
