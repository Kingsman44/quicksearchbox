package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.ah */
/* compiled from: PG */
public final class C83827ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83827ah f228451c;

    /* renamed from: d */
    private static volatile C63010eb f228452d;

    /* renamed from: a */
    public int f228453a;

    /* renamed from: b */
    public String f228454b = BuildConfig.FLAVOR;

    static {
        C83827ah ahVar = new C83827ah();
        f228451c = ahVar;
        C62942bv.registerDefaultInstance(C83827ah.class, ahVar);
    }

    private C83827ah() {
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
                return newMessageInfo(f228451c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83827ah();
            case 4:
                return new C83826ag();
            case 5:
                return f228451c;
            case 6:
                C63010eb ebVar = f228452d;
                if (ebVar == null) {
                    synchronized (C83827ah.class) {
                        ebVar = f228452d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228451c);
                            f228452d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
