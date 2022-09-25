package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.ba */
/* compiled from: PG */
public final class C55618ba extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55618ba f146749g;

    /* renamed from: h */
    private static volatile C63010eb f146750h;

    /* renamed from: a */
    public int f146751a;

    /* renamed from: b */
    public String f146752b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55657cm f146753c;

    /* renamed from: d */
    public C55640bw f146754d;

    /* renamed from: e */
    public C55543aw f146755e;

    /* renamed from: f */
    public String f146756f = BuildConfig.FLAVOR;

    static {
        C55618ba baVar = new C55618ba();
        f146749g = baVar;
        C62942bv.registerDefaultInstance(C55618ba.class, baVar);
    }

    private C55618ba() {
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
                return newMessageInfo(f146749g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C55618ba();
            case 4:
                return new C55616az();
            case 5:
                return f146749g;
            case 6:
                C63010eb ebVar = f146750h;
                if (ebVar == null) {
                    synchronized (C55618ba.class) {
                        ebVar = f146750h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146749g);
                            f146750h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
