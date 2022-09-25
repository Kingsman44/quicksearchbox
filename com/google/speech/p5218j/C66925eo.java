package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.eo */
/* compiled from: PG */
public final class C66925eo extends C62942bv implements C66926ep {

    /* renamed from: c */
    public static final C66925eo f181918c;

    /* renamed from: e */
    private static volatile C63010eb f181919e;

    /* renamed from: a */
    public String f181920a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f181921b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f181922d;

    static {
        C66925eo eoVar = new C66925eo();
        f181918c = eoVar;
        C62942bv.registerDefaultInstance(C66925eo.class, eoVar);
    }

    private C66925eo() {
    }

    /* renamed from: a */
    public final String mo59749a() {
        return this.f181920a;
    }

    /* renamed from: b */
    public final String mo59750b() {
        return this.f181921b;
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
                return newMessageInfo(f181918c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66925eo();
            case 4:
                return new C66924en();
            case 5:
                return f181918c;
            case 6:
                C63010eb ebVar = f181919e;
                if (ebVar == null) {
                    synchronized (C66925eo.class) {
                        ebVar = f181919e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181918c);
                            f181919e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
