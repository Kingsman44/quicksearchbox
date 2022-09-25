package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bb */
/* compiled from: PG */
public final class C54349bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54349bb f142779b;

    /* renamed from: c */
    private static volatile C63010eb f142780c;

    /* renamed from: a */
    public String f142781a = BuildConfig.FLAVOR;

    static {
        C54349bb bbVar = new C54349bb();
        f142779b = bbVar;
        C62942bv.registerDefaultInstance(C54349bb.class, bbVar);
    }

    private C54349bb() {
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
                return newMessageInfo(f142779b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C54349bb();
            case 4:
                return new C54348ba();
            case 5:
                return f142779b;
            case 6:
                C63010eb ebVar = f142780c;
                if (ebVar == null) {
                    synchronized (C54349bb.class) {
                        ebVar = f142780c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142779b);
                            f142780c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
