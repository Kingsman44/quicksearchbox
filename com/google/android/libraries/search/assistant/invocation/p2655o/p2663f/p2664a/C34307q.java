package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.q */
/* compiled from: PG */
public final class C34307q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34307q f91233c;

    /* renamed from: d */
    private static volatile C63010eb f91234d;

    /* renamed from: a */
    public String f91235a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f91236b;

    static {
        C34307q qVar = new C34307q();
        f91233c = qVar;
        C62942bv.registerDefaultInstance(C34307q.class, qVar);
    }

    private C34307q() {
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
                return newMessageInfo(f91233c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C34307q();
            case 4:
                return new C34306p();
            case 5:
                return f91233c;
            case 6:
                C63010eb ebVar = f91234d;
                if (ebVar == null) {
                    synchronized (C34307q.class) {
                        ebVar = f91234d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91233c);
                            f91234d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
