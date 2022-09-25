package com.google.android.libraries.search.assistant.proactive.p2774f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.ajz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.proactive.f.f */
/* compiled from: PG */
public final class C36267f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C36267f f94725g;

    /* renamed from: h */
    private static volatile C63010eb f94726h;

    /* renamed from: a */
    public int f94727a;

    /* renamed from: b */
    public long f94728b;

    /* renamed from: c */
    public String f94729c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f94730d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public ajz f94731e;

    /* renamed from: f */
    public boolean f94732f;

    static {
        C36267f fVar = new C36267f();
        f94725g = fVar;
        C62942bv.registerDefaultInstance(C36267f.class, fVar);
    }

    private C36267f() {
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
                return newMessageInfo(f94725g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C36267f();
            case 4:
                return new C36266e();
            case 5:
                return f94725g;
            case 6:
                C63010eb ebVar = f94726h;
                if (ebVar == null) {
                    synchronized (C36267f.class) {
                        ebVar = f94726h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94725g);
                            f94726h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
