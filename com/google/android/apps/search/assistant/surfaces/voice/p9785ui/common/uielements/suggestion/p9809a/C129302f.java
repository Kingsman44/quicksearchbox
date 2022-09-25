package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.a.f */
/* compiled from: PG */
public final class C129302f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C129302f f355133f;

    /* renamed from: g */
    private static volatile C63010eb f355134g;

    /* renamed from: a */
    public int f355135a = 0;

    /* renamed from: b */
    public Object f355136b;

    /* renamed from: c */
    public boolean f355137c;

    /* renamed from: d */
    public C63088z f355138d = C63088z.f170246b;

    /* renamed from: e */
    public boolean f355139e;

    static {
        C129302f fVar = new C129302f();
        f355133f = fVar;
        C62942bv.registerDefaultInstance(C129302f.class, fVar);
    }

    private C129302f() {
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
                return newMessageInfo(f355133f, "\u0000\u0005\u0001\u0000\u0002\u0007\u0005\u0000\u0000\u0000\u0002Ȼ\u0000\u0003<\u0000\u0004\u0007\u0005\n\u0007\u0007", new Object[]{"b", "a", C129300d.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C129302f();
            case 4:
                return new C129301e();
            case 5:
                return f355133f;
            case 6:
                C63010eb ebVar = f355134g;
                if (ebVar == null) {
                    synchronized (C129302f.class) {
                        ebVar = f355134g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355133f);
                            f355134g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
