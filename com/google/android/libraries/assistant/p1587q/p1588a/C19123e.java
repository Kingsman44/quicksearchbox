package com.google.android.libraries.assistant.p1587q.p1588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.q.a.e */
/* compiled from: PG */
public final class C19123e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19123e f53587d;

    /* renamed from: e */
    private static volatile C63010eb f53588e;

    /* renamed from: a */
    public int f53589a;

    /* renamed from: b */
    public String f53590b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62995dn f53591c = C62995dn.f170057a;

    static {
        C19123e eVar = new C19123e();
        f53587d = eVar;
        C62942bv.registerDefaultInstance(C19123e.class, eVar);
    }

    private C19123e() {
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
                return newMessageInfo(f53587d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဈ\u0000", new Object[]{"a", C45240c.f118157a, C19122d.f53586a, "b"});
            case 3:
                return new C19123e();
            case 4:
                return new C19121c();
            case 5:
                return f53587d;
            case 6:
                C63010eb ebVar = f53588e;
                if (ebVar == null) {
                    synchronized (C19123e.class) {
                        ebVar = f53588e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53587d);
                            f53588e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
