package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.f */
/* compiled from: PG */
public final class C13530f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C13530f f41474g;

    /* renamed from: h */
    private static volatile C63010eb f41475h;

    /* renamed from: a */
    public int f41476a = 0;

    /* renamed from: b */
    public Object f41477b;

    /* renamed from: c */
    public int f41478c;

    /* renamed from: d */
    public int f41479d;

    /* renamed from: e */
    public String f41480e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public float f41481f;

    static {
        C13530f fVar = new C13530f();
        f41474g = fVar;
        C62942bv.registerDefaultInstance(C13530f.class, fVar);
    }

    private C13530f() {
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
                return newMessageInfo(f41474g, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004\u0001\u0005<\u0000\u0006Ȼ\u0000\u0007Ȼ\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C10662f.f35572a, C51805du.class});
            case 3:
                return new C13530f();
            case 4:
                return new C13441b();
            case 5:
                return f41474g;
            case 6:
                C63010eb ebVar = f41475h;
                if (ebVar == null) {
                    synchronized (C13530f.class) {
                        ebVar = f41475h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41474g);
                            f41475h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
