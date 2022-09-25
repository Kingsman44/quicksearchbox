package com.google.android.libraries.lens.view.p2057ag.p2058a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ag.a.b */
/* compiled from: PG */
public final class C25099b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25099b f68365c;

    /* renamed from: d */
    private static volatile C63010eb f68366d;

    /* renamed from: a */
    public String f68367a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f68368b;

    static {
        C25099b bVar = new C25099b();
        f68365c = bVar;
        C62942bv.registerDefaultInstance(C25099b.class, bVar);
    }

    private C25099b() {
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
                return newMessageInfo(f68365c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C25099b();
            case 4:
                return new C25098a();
            case 5:
                return f68365c;
            case 6:
                C63010eb ebVar = f68366d;
                if (ebVar == null) {
                    synchronized (C25099b.class) {
                        ebVar = f68366d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68365c);
                            f68366d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
