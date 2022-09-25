package com.google.audio.p4107b.p4108a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.b.a.v */
/* compiled from: PG */
public final class C54599v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54599v f143344c;

    /* renamed from: e */
    private static volatile C63010eb f143345e;

    /* renamed from: a */
    public String f143346a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f143347b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f143348d;

    static {
        C54599v vVar = new C54599v();
        f143344c = vVar;
        C62942bv.registerDefaultInstance(C54599v.class, vVar);
    }

    private C54599v() {
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
                return newMessageInfo(f143344c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C54599v();
            case 4:
                return new C54598u();
            case 5:
                return f143344c;
            case 6:
                C63010eb ebVar = f143345e;
                if (ebVar == null) {
                    synchronized (C54599v.class) {
                        ebVar = f143345e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143344c);
                            f143345e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
