package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3996t.p3997a.C53481h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.ab */
/* compiled from: PG */
public final class C48041ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48041ab f124355c;

    /* renamed from: d */
    private static volatile C63010eb f124356d;

    /* renamed from: a */
    public C53481h f124357a;

    /* renamed from: b */
    public String f124358b = BuildConfig.FLAVOR;

    static {
        C48041ab abVar = new C48041ab();
        f124355c = abVar;
        C62942bv.registerDefaultInstance(C48041ab.class, abVar);
    }

    private C48041ab() {
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
                return newMessageInfo(f124355c, "\u0000\u0002\u0000\u0000\u0004\n\u0002\u0000\u0000\u0000\u0004Ȉ\n\t", new Object[]{"b", "a"});
            case 3:
                return new C48041ab();
            case 4:
                return new C48040aa();
            case 5:
                return f124355c;
            case 6:
                C63010eb ebVar = f124356d;
                if (ebVar == null) {
                    synchronized (C48041ab.class) {
                        ebVar = f124356d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124355c);
                            f124356d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
