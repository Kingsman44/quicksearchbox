package com.google.android.libraries.search.assistant.p2497ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.ab.ai */
/* compiled from: PG */
public final class C32367ai extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C32367ai f86767h;

    /* renamed from: i */
    private static volatile C63010eb f86768i;

    /* renamed from: a */
    public int f86769a;

    /* renamed from: b */
    public String f86770b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f86771c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C32398bm f86772d;

    /* renamed from: e */
    public double f86773e;

    /* renamed from: f */
    public double f86774f;

    /* renamed from: g */
    public C32361ac f86775g;

    static {
        C32367ai aiVar = new C32367ai();
        f86767h = aiVar;
        C62942bv.registerDefaultInstance(C32367ai.class, aiVar);
    }

    private C32367ai() {
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
                return newMessageInfo(f86767h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005က\u0004\u0006က\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C32367ai();
            case 4:
                return new C32366ah();
            case 5:
                return f86767h;
            case 6:
                C63010eb ebVar = f86768i;
                if (ebVar == null) {
                    synchronized (C32367ai.class) {
                        ebVar = f86768i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86767h);
                            f86768i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
