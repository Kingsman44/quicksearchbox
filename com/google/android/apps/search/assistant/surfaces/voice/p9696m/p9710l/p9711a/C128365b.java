package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.a.b */
/* compiled from: PG */
public final class C128365b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128365b f353033d;

    /* renamed from: e */
    private static volatile C63010eb f353034e;

    /* renamed from: a */
    public int f353035a;

    /* renamed from: b */
    public String f353036b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63042fg f353037c;

    static {
        C128365b bVar = new C128365b();
        f353033d = bVar;
        C62942bv.registerDefaultInstance(C128365b.class, bVar);
    }

    private C128365b() {
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
                return newMessageInfo(f353033d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C128365b();
            case 4:
                return new C128364a();
            case 5:
                return f353033d;
            case 6:
                C63010eb ebVar = f353034e;
                if (ebVar == null) {
                    synchronized (C128365b.class) {
                        ebVar = f353034e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f353033d);
                            f353034e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
