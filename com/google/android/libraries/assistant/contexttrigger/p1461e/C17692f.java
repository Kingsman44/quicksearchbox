package com.google.android.libraries.assistant.contexttrigger.p1461e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.e.f */
/* compiled from: PG */
public final class C17692f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C17692f f50858f;

    /* renamed from: g */
    private static volatile C63010eb f50859g;

    /* renamed from: a */
    public int f50860a;

    /* renamed from: b */
    public int f50861b;

    /* renamed from: c */
    public int f50862c;

    /* renamed from: d */
    public String f50863d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f50864e;

    static {
        C17692f fVar = new C17692f();
        f50858f = fVar;
        C62942bv.registerDefaultInstance(C17692f.class, fVar);
    }

    private C17692f() {
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
                return newMessageInfo(f50858f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C17689c.m34969b(), C45240c.f118157a, C17691e.m34971b(), "d", "e"});
            case 3:
                return new C17692f();
            case 4:
                return new C17687a();
            case 5:
                return f50858f;
            case 6:
                C63010eb ebVar = f50859g;
                if (ebVar == null) {
                    synchronized (C17692f.class) {
                        ebVar = f50859g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50858f);
                            f50859g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
