package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jf */
/* compiled from: PG */
public final class C14438jf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14438jf f43674e;

    /* renamed from: f */
    private static volatile C63010eb f43675f;

    /* renamed from: a */
    public int f43676a;

    /* renamed from: b */
    public int f43677b;

    /* renamed from: c */
    public long f43678c;

    /* renamed from: d */
    public String f43679d = BuildConfig.FLAVOR;

    static {
        C14438jf jfVar = new C14438jf();
        f43674e = jfVar;
        C62942bv.registerDefaultInstance(C14438jf.class, jfVar);
    }

    private C14438jf() {
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
                return newMessageInfo(f43674e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\u0002\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14438jf();
            case 4:
                return new C14437je();
            case 5:
                return f43674e;
            case 6:
                C63010eb ebVar = f43675f;
                if (ebVar == null) {
                    synchronized (C14438jf.class) {
                        ebVar = f43675f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43674e);
                            f43675f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
