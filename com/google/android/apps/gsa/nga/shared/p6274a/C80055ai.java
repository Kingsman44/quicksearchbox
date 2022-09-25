package com.google.android.apps.gsa.nga.shared.p6274a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.ai */
/* compiled from: PG */
public final class C80055ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80055ai f219682c;

    /* renamed from: d */
    private static volatile C63010eb f219683d;

    /* renamed from: a */
    public String f219684a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f219685b = BuildConfig.FLAVOR;

    static {
        C80055ai aiVar = new C80055ai();
        f219682c = aiVar;
        C62942bv.registerDefaultInstance(C80055ai.class, aiVar);
    }

    private C80055ai() {
        emptyIntList();
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
                return newMessageInfo(f219682c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C80055ai();
            case 4:
                return new C80054ah();
            case 5:
                return f219682c;
            case 6:
                C63010eb ebVar = f219683d;
                if (ebVar == null) {
                    synchronized (C80055ai.class) {
                        ebVar = f219683d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219682c);
                            f219683d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
