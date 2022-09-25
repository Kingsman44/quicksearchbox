package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49348y;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ag */
/* compiled from: PG */
public final class C49821ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49821ag f129197d;

    /* renamed from: e */
    private static volatile C63010eb f129198e;

    /* renamed from: a */
    public int f129199a;

    /* renamed from: b */
    public int f129200b;

    /* renamed from: c */
    public long f129201c;

    static {
        C49821ag agVar = new C49821ag();
        f129197d = agVar;
        C62942bv.registerDefaultInstance(C49821ag.class, agVar);
    }

    private C49821ag() {
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
                return newMessageInfo(f129197d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C49348y.m85418b(), C45240c.f118157a});
            case 3:
                return new C49821ag();
            case 4:
                return new C49820af();
            case 5:
                return f129197d;
            case 6:
                C63010eb ebVar = f129198e;
                if (ebVar == null) {
                    synchronized (C49821ag.class) {
                        ebVar = f129198e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129197d);
                            f129198e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
