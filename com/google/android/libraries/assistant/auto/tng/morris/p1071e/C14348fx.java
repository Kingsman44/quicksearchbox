package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fx */
/* compiled from: PG */
public final class C14348fx extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C14348fx f43414h;

    /* renamed from: i */
    private static volatile C63010eb f43415i;

    /* renamed from: a */
    public String f43416a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f43417b;

    /* renamed from: c */
    public String f43418c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C14361gj f43419d;

    /* renamed from: e */
    public boolean f43420e;

    /* renamed from: f */
    public int f43421f;

    /* renamed from: g */
    public long f43422g;

    static {
        C14348fx fxVar = new C14348fx();
        f43414h = fxVar;
        C62942bv.registerDefaultInstance(C14348fx.class, fxVar);
    }

    private C14348fx() {
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
                return newMessageInfo(f43414h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\t\u0005\u0007\u0006\u000b\u0007\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C14348fx();
            case 4:
                return new C14347fw();
            case 5:
                return f43414h;
            case 6:
                C63010eb ebVar = f43415i;
                if (ebVar == null) {
                    synchronized (C14348fx.class) {
                        ebVar = f43415i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43414h);
                            f43415i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
