package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f */
/* compiled from: PG */
public final class C115169f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C115169f f319625h;

    /* renamed from: j */
    private static volatile C63010eb f319626j;

    /* renamed from: a */
    public int f319627a;

    /* renamed from: b */
    public C52176ia f319628b;

    /* renamed from: c */
    public int f319629c;

    /* renamed from: d */
    public float f319630d;

    /* renamed from: e */
    public float f319631e;

    /* renamed from: f */
    public C115168e f319632f;

    /* renamed from: g */
    public String f319633g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f319634i = 2;

    static {
        C115169f fVar = new C115169f();
        f319625h = fVar;
        C62942bv.registerDefaultInstance(C115169f.class, fVar);
    }

    private C115169f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f319634i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f319634i = b;
                return null;
            case 2:
                return newMessageInfo(f319625h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ခ\u0002\u0004ᐉ\u0004\u0005ဈ\u0005\u0006ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, "e"});
            case 3:
                return new C115169f();
            case 4:
                return new C115164a();
            case 5:
                return f319625h;
            case 6:
                C63010eb ebVar = f319626j;
                if (ebVar == null) {
                    synchronized (C115169f.class) {
                        ebVar = f319626j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f319625h);
                            f319626j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
