package com.google.android.libraries.lens.view.filters.translation;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.i */
/* compiled from: PG */
public final class C26126i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C26126i f70993c;

    /* renamed from: d */
    private static volatile C63010eb f70994d;

    /* renamed from: a */
    public String f70995a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f70996b;

    static {
        C26126i iVar = new C26126i();
        f70993c = iVar;
        C62942bv.registerDefaultInstance(C26126i.class, iVar);
    }

    private C26126i() {
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
                return newMessageInfo(f70993c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C26126i();
            case 4:
                return new C26125h();
            case 5:
                return f70993c;
            case 6:
                C63010eb ebVar = f70994d;
                if (ebVar == null) {
                    synchronized (C26126i.class) {
                        ebVar = f70994d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f70993c);
                            f70994d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
