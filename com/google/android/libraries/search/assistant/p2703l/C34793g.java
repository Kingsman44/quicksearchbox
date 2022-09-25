package com.google.android.libraries.search.assistant.p2703l;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.l.g */
/* compiled from: PG */
public final class C34793g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34793g f92320c;

    /* renamed from: d */
    private static volatile C63010eb f92321d;

    /* renamed from: a */
    public C63088z f92322a = C63088z.f170246b;

    /* renamed from: b */
    public String f92323b = BuildConfig.FLAVOR;

    static {
        C34793g gVar = new C34793g();
        f92320c = gVar;
        C62942bv.registerDefaultInstance(C34793g.class, gVar);
    }

    private C34793g() {
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
                return newMessageInfo(f92320c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C34793g();
            case 4:
                return new C34792f();
            case 5:
                return f92320c;
            case 6:
                C63010eb ebVar = f92321d;
                if (ebVar == null) {
                    synchronized (C34793g.class) {
                        ebVar = f92321d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92320c);
                            f92321d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
