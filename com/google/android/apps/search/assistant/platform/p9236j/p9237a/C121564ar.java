package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ar */
/* compiled from: PG */
public final class C121564ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121564ar f337316c;

    /* renamed from: e */
    private static volatile C63010eb f337317e;

    /* renamed from: a */
    public C34053bp f337318a;

    /* renamed from: b */
    public String f337319b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f337320d = 2;

    static {
        C121564ar arVar = new C121564ar();
        f337316c = arVar;
        C62942bv.registerDefaultInstance(C121564ar.class, arVar);
    }

    private C121564ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f337320d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f337320d = b;
                return null;
            case 2:
                return newMessageInfo(f337316c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C121564ar();
            case 4:
                return new C121563aq();
            case 5:
                return f337316c;
            case 6:
                C63010eb ebVar = f337317e;
                if (ebVar == null) {
                    synchronized (C121564ar.class) {
                        ebVar = f337317e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337316c);
                            f337317e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
