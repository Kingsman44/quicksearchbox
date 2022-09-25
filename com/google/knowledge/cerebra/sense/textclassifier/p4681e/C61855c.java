package com.google.knowledge.cerebra.sense.textclassifier.p4681e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.e.c */
/* compiled from: PG */
public final class C61855c extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C61855c f167149g;

    /* renamed from: h */
    private static volatile C63010eb f167150h;

    /* renamed from: a */
    public int f167151a;

    /* renamed from: b */
    public String f167152b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167153c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f167154d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f167155e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f167156f = BuildConfig.FLAVOR;

    static {
        C61855c cVar = new C61855c();
        f167149g = cVar;
        C62942bv.registerDefaultInstance(C61855c.class, cVar);
    }

    private C61855c() {
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
                return newMessageInfo(f167149g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C61855c();
            case 4:
                return new C61854b();
            case 5:
                return f167149g;
            case 6:
                C63010eb ebVar = f167150h;
                if (ebVar == null) {
                    synchronized (C61855c.class) {
                        ebVar = f167150h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167149g);
                            f167150h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
