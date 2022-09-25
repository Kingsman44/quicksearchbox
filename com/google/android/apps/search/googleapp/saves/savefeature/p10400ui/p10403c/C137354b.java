package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10403c;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.c.b */
/* compiled from: PG */
public final class C137354b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137354b f373619c;

    /* renamed from: d */
    private static volatile C63010eb f373620d;

    /* renamed from: a */
    public int f373621a;

    /* renamed from: b */
    public C57648i f373622b;

    static {
        C137354b bVar = new C137354b();
        f373619c = bVar;
        C62942bv.registerDefaultInstance(C137354b.class, bVar);
    }

    private C137354b() {
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
                return newMessageInfo(f373619c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C137354b();
            case 4:
                return new C137353a();
            case 5:
                return f373619c;
            case 6:
                C63010eb ebVar = f373620d;
                if (ebVar == null) {
                    synchronized (C137354b.class) {
                        ebVar = f373620d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373619c);
                            f373620d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
