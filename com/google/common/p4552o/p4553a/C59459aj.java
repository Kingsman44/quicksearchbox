package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.aj */
/* compiled from: PG */
public final class C59459aj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59459aj f157725g;

    /* renamed from: h */
    private static volatile C63010eb f157726h;

    /* renamed from: a */
    public int f157727a;

    /* renamed from: b */
    public String f157728b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f157729c;

    /* renamed from: d */
    public int f157730d;

    /* renamed from: e */
    public int f157731e;

    /* renamed from: f */
    public long f157732f;

    static {
        C59459aj ajVar = new C59459aj();
        f157725g = ajVar;
        C62942bv.registerDefaultInstance(C59459aj.class, ajVar);
    }

    private C59459aj() {
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
                return newMessageInfo(f157725g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C59459aj();
            case 4:
                return new C59458ai();
            case 5:
                return f157725g;
            case 6:
                C63010eb ebVar = f157726h;
                if (ebVar == null) {
                    synchronized (C59459aj.class) {
                        ebVar = f157726h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157725g);
                            f157726h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
