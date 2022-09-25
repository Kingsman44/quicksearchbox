package com.google.assistant.p3745ab.p3754f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.f.b */
/* compiled from: PG */
public final class C48324b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48324b f124967f;

    /* renamed from: g */
    private static volatile C63010eb f124968g;

    /* renamed from: a */
    public int f124969a;

    /* renamed from: b */
    public String f124970b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f124971c;

    /* renamed from: d */
    public long f124972d;

    /* renamed from: e */
    public long f124973e;

    static {
        C48324b bVar = new C48324b();
        f124967f = bVar;
        C62942bv.registerDefaultInstance(C48324b.class, bVar);
    }

    private C48324b() {
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
                return newMessageInfo(f124967f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48324b();
            case 4:
                return new C48323a();
            case 5:
                return f124967f;
            case 6:
                C63010eb ebVar = f124968g;
                if (ebVar == null) {
                    synchronized (C48324b.class) {
                        ebVar = f124968g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124967f);
                            f124968g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
