package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.av */
/* compiled from: PG */
public final class C55458av extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55458av f146310g;

    /* renamed from: h */
    private static volatile C63010eb f146311h;

    /* renamed from: a */
    public int f146312a;

    /* renamed from: b */
    public int f146313b;

    /* renamed from: c */
    public int f146314c;

    /* renamed from: d */
    public int f146315d;

    /* renamed from: e */
    public C55474bk f146316e;

    /* renamed from: f */
    public String f146317f = BuildConfig.FLAVOR;

    static {
        C55458av avVar = new C55458av();
        f146310g = avVar;
        C62942bv.registerDefaultInstance(C55458av.class, avVar);
    }

    private C55458av() {
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
                return newMessageInfo(f146310g, "\u0001\u0005\u0000\u0001\u0001%\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003\u0004ဉ\u0004\u0005ဈ\u0005%ဌ\u0001", new Object[]{"a", "b", C55456at.f146309a, "d", C55455as.f146308a, "e", C10662f.f35572a, C45240c.f118157a, C55506n.f146479a});
            case 3:
                return new C55458av();
            case 4:
                return new C55454ar();
            case 5:
                return f146310g;
            case 6:
                C63010eb ebVar = f146311h;
                if (ebVar == null) {
                    synchronized (C55458av.class) {
                        ebVar = f146311h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146310g);
                            f146311h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
