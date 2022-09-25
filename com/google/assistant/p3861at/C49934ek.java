package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5036r.C65318d;

/* renamed from: com.google.assistant.at.ek */
/* compiled from: PG */
public final class C49934ek extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49934ek f129784c;

    /* renamed from: e */
    private static volatile C63010eb f129785e;

    /* renamed from: a */
    public int f129786a;

    /* renamed from: b */
    public String f129787b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f129788d;

    static {
        C49934ek ekVar = new C49934ek();
        f129784c = ekVar;
        C62942bv.registerDefaultInstance(C49934ek.class, ekVar);
    }

    private C49934ek() {
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
                return newMessageInfo(f129784c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", C65318d.f176653a, "b"});
            case 3:
                return new C49934ek();
            case 4:
                return new C49933ej();
            case 5:
                return f129784c;
            case 6:
                C63010eb ebVar = f129785e;
                if (ebVar == null) {
                    synchronized (C49934ek.class) {
                        ebVar = f129785e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129784c);
                            f129785e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
