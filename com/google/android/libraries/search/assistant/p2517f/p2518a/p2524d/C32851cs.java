package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.cs */
/* compiled from: PG */
public final class C32851cs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32851cs f88063c;

    /* renamed from: d */
    private static volatile C63010eb f88064d;

    /* renamed from: a */
    public C34793g f88065a;

    /* renamed from: b */
    public String f88066b = BuildConfig.FLAVOR;

    static {
        C32851cs csVar = new C32851cs();
        f88063c = csVar;
        C62942bv.registerDefaultInstance(C32851cs.class, csVar);
    }

    private C32851cs() {
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
                return newMessageInfo(f88063c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C32851cs();
            case 4:
                return new C32850cr();
            case 5:
                return f88063c;
            case 6:
                C63010eb ebVar = f88064d;
                if (ebVar == null) {
                    synchronized (C32851cs.class) {
                        ebVar = f88064d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88063c);
                            f88064d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
