package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.ab */
/* compiled from: PG */
public final class C124609ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f343725d = new C124728z();

    /* renamed from: f */
    public static final C124609ab f343726f;

    /* renamed from: g */
    private static volatile C63010eb f343727g;

    /* renamed from: a */
    public int f343728a;

    /* renamed from: b */
    public int f343729b;

    /* renamed from: c */
    public C62961ch f343730c = emptyIntList();

    /* renamed from: e */
    public int f343731e;

    static {
        C124609ab abVar = new C124609ab();
        f343726f = abVar;
        C62942bv.registerDefaultInstance(C124609ab.class, abVar);
    }

    private C124609ab() {
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
                return newMessageInfo(f343726f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e\u0003ဌ\u0001", new Object[]{"a", "b", C124653bs.f343908a, C45240c.f118157a, C124707e.m204373b(), "e", C124610ac.f343732a});
            case 3:
                return new C124609ab();
            case 4:
                return new C124608aa();
            case 5:
                return f343726f;
            case 6:
                C63010eb ebVar = f343727g;
                if (ebVar == null) {
                    synchronized (C124609ab.class) {
                        ebVar = f343727g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343726f);
                            f343727g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
