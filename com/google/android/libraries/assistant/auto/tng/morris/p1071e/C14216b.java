package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.b */
/* compiled from: PG */
public final class C14216b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14216b f43007f;

    /* renamed from: g */
    private static volatile C63010eb f43008g;

    /* renamed from: a */
    public int f43009a = 0;

    /* renamed from: b */
    public Object f43010b;

    /* renamed from: c */
    public String f43011c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f43012d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f43013e = BuildConfig.FLAVOR;

    static {
        C14216b bVar = new C14216b();
        f43007f = bVar;
        C62942bv.registerDefaultInstance(C14216b.class, bVar);
    }

    private C14216b() {
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
                return newMessageInfo(f43007f, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004Ȼ\u0000\u0005Ȉ", new Object[]{"b", "a", C45240c.f118157a, "e", C14361gj.class, "d"});
            case 3:
                return new C14216b();
            case 4:
                return new C14189a();
            case 5:
                return f43007f;
            case 6:
                C63010eb ebVar = f43008g;
                if (ebVar == null) {
                    synchronized (C14216b.class) {
                        ebVar = f43008g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43007f);
                            f43008g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
