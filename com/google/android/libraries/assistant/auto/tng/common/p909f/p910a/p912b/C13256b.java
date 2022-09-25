package com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.a.b.b */
/* compiled from: PG */
public final class C13256b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C13256b f40927g;

    /* renamed from: h */
    private static volatile C63010eb f40928h;

    /* renamed from: a */
    public int f40929a;

    /* renamed from: b */
    public String f40930b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f40931c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f40932d;

    /* renamed from: e */
    public String f40933e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f40934f = BuildConfig.FLAVOR;

    static {
        C13256b bVar = new C13256b();
        f40927g = bVar;
        C62942bv.registerDefaultInstance(C13256b.class, bVar);
    }

    private C13256b() {
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
                return newMessageInfo(f40927g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C13256b();
            case 4:
                return new C13255a();
            case 5:
                return f40927g;
            case 6:
                C63010eb ebVar = f40928h;
                if (ebVar == null) {
                    synchronized (C13256b.class) {
                        ebVar = f40928h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40927g);
                            f40928h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
