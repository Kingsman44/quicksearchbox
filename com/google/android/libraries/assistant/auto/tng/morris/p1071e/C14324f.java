package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.f */
/* compiled from: PG */
public final class C14324f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14324f f43330f;

    /* renamed from: g */
    private static volatile C63010eb f43331g;

    /* renamed from: a */
    public int f43332a;

    /* renamed from: b */
    public int f43333b;

    /* renamed from: c */
    public String f43334c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f43335d;

    /* renamed from: e */
    public int f43336e;

    static {
        C14324f fVar = new C14324f();
        f43330f = fVar;
        C62942bv.registerDefaultInstance(C14324f.class, fVar);
    }

    private C14324f() {
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
                return newMessageInfo(f43330f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0005Ȉ\u0006\f\u0007\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C14324f();
            case 4:
                return new C14297e();
            case 5:
                return f43330f;
            case 6:
                C63010eb ebVar = f43331g;
                if (ebVar == null) {
                    synchronized (C14324f.class) {
                        ebVar = f43331g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43330f);
                            f43331g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
