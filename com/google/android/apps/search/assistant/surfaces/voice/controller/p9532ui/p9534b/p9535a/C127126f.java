package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.f */
/* compiled from: PG */
public final class C127126f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C127126f f350033d;

    /* renamed from: e */
    private static volatile C63010eb f350034e;

    /* renamed from: a */
    public int f350035a;

    /* renamed from: b */
    public C52070ec f350036b;

    /* renamed from: c */
    public long f350037c;

    static {
        C127126f fVar = new C127126f();
        f350033d = fVar;
        C62942bv.registerDefaultInstance(C127126f.class, fVar);
    }

    private C127126f() {
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
                return newMessageInfo(f350033d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127126f();
            case 4:
                return new C127125e();
            case 5:
                return f350033d;
            case 6:
                C63010eb ebVar = f350034e;
                if (ebVar == null) {
                    synchronized (C127126f.class) {
                        ebVar = f350034e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350033d);
                            f350034e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
