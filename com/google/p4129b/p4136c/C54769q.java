package com.google.p4129b.p4136c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.q */
/* compiled from: PG */
public final class C54769q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54769q f143694e;

    /* renamed from: f */
    private static volatile C63010eb f143695f;

    /* renamed from: a */
    public int f143696a = 0;

    /* renamed from: b */
    public Object f143697b;

    /* renamed from: c */
    public String f143698c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f143699d;

    static {
        C54769q qVar = new C54769q();
        f143694e = qVar;
        C62942bv.registerDefaultInstance(C54769q.class, qVar);
    }

    private C54769q() {
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
                return newMessageInfo(f143694e, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003<\u0000\u0004\u0007\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, C54768p.class, "d", C54763k.class});
            case 3:
                return new C54769q();
            case 4:
                return new C54766n();
            case 5:
                return f143694e;
            case 6:
                C63010eb ebVar = f143695f;
                if (ebVar == null) {
                    synchronized (C54769q.class) {
                        ebVar = f143695f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143694e);
                            f143695f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
