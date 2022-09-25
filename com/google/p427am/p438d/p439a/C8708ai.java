package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.ai */
/* compiled from: PG */
public final class C8708ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8708ai f30037b;

    /* renamed from: c */
    private static volatile C63010eb f30038c;

    /* renamed from: a */
    public String f30039a = BuildConfig.FLAVOR;

    static {
        C8708ai aiVar = new C8708ai();
        f30037b = aiVar;
        C62942bv.registerDefaultInstance(C8708ai.class, aiVar);
    }

    private C8708ai() {
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
                return newMessageInfo(f30037b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C8708ai();
            case 4:
                return new C8707ah();
            case 5:
                return f30037b;
            case 6:
                C63010eb ebVar = f30038c;
                if (ebVar == null) {
                    synchronized (C8708ai.class) {
                        ebVar = f30038c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30037b);
                            f30038c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
