package com.google.speech.p5228m.p5229a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.a.b */
/* compiled from: PG */
public final class C67253b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67253b f182812c;

    /* renamed from: e */
    private static volatile C63010eb f182813e;

    /* renamed from: a */
    public String f182814a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f182815b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f182816d;

    static {
        C67253b bVar = new C67253b();
        f182812c = bVar;
        C62942bv.registerDefaultInstance(C67253b.class, bVar);
    }

    private C67253b() {
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
                return newMessageInfo(f182812c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C67253b();
            case 4:
                return new C67252a();
            case 5:
                return f182812c;
            case 6:
                C63010eb ebVar = f182813e;
                if (ebVar == null) {
                    synchronized (C67253b.class) {
                        ebVar = f182813e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182812c);
                            f182813e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
