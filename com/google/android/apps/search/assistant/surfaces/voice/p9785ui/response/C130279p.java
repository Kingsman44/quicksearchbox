package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.p */
/* compiled from: PG */
public final class C130279p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C130279p f357128c;

    /* renamed from: d */
    public static final C62940bt f357129d;

    /* renamed from: e */
    private static volatile C63010eb f357130e;

    /* renamed from: a */
    public int f357131a;

    /* renamed from: b */
    public boolean f357132b;

    static {
        C130279p pVar = new C130279p();
        f357128c = pVar;
        C62942bv.registerDefaultInstance(C130279p.class, pVar);
        f357129d = C62942bv.newSingularGeneratedExtension(C129676j.f355890c, pVar, pVar, (C62958ce) null, 435379488, C63066gd.MESSAGE, C130279p.class);
    }

    private C130279p() {
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
                return newMessageInfo(f357128c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C130279p();
            case 4:
                return new C130278o();
            case 5:
                return f357128c;
            case 6:
                C63010eb ebVar = f357130e;
                if (ebVar == null) {
                    synchronized (C130279p.class) {
                        ebVar = f357130e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357128c);
                            f357130e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
