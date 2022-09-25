package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.db */
/* compiled from: PG */
public final class C54048db extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54048db f141804c;

    /* renamed from: d */
    private static volatile C63010eb f141805d;

    /* renamed from: a */
    public String f141806a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f141807b = BuildConfig.FLAVOR;

    static {
        C54048db dbVar = new C54048db();
        f141804c = dbVar;
        C62942bv.registerDefaultInstance(C54048db.class, dbVar);
    }

    private C54048db() {
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
                return newMessageInfo(f141804c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54048db();
            case 4:
                return new C54047da();
            case 5:
                return f141804c;
            case 6:
                C63010eb ebVar = f141805d;
                if (ebVar == null) {
                    synchronized (C54048db.class) {
                        ebVar = f141805d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141804c);
                            f141805d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
