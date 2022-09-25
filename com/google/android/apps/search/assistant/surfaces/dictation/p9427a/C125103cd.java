package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cd */
/* compiled from: PG */
public final class C125103cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125103cd f345111c;

    /* renamed from: d */
    private static volatile C63010eb f345112d;

    /* renamed from: a */
    public af f345113a;

    /* renamed from: b */
    public int f345114b;

    static {
        C125103cd cdVar = new C125103cd();
        f345111c = cdVar;
        C62942bv.registerDefaultInstance(C125103cd.class, cdVar);
    }

    private C125103cd() {
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
                return newMessageInfo(f345111c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\f", new Object[]{"a", "b"});
            case 3:
                return new C125103cd();
            case 4:
                return new C125102cc();
            case 5:
                return f345111c;
            case 6:
                C63010eb ebVar = f345112d;
                if (ebVar == null) {
                    synchronized (C125103cd.class) {
                        ebVar = f345112d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345111c);
                            f345112d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
