package com.google.assistant.p3897e.p3921j.p3922a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.f */
/* compiled from: PG */
public final class C51648f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51648f f134580f;

    /* renamed from: g */
    private static volatile C63010eb f134581g;

    /* renamed from: a */
    public int f134582a;

    /* renamed from: b */
    public String f134583b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f134584c;

    /* renamed from: d */
    public String f134585d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public alf f134586e;

    static {
        C51648f fVar = new C51648f();
        f134580f = fVar;
        C62942bv.registerDefaultInstance(C51648f.class, fVar);
    }

    private C51648f() {
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
                return newMessageInfo(f134580f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဌ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C51646d.f134579a, "d", "e"});
            case 3:
                return new C51648f();
            case 4:
                return new C51645c();
            case 5:
                return f134580f;
            case 6:
                C63010eb ebVar = f134581g;
                if (ebVar == null) {
                    synchronized (C51648f.class) {
                        ebVar = f134581g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134580f);
                            f134581g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
