package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.rj */
/* compiled from: PG */
public final class C50284rj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50284rj f130766f;

    /* renamed from: g */
    private static volatile C63010eb f130767g;

    /* renamed from: a */
    public int f130768a;

    /* renamed from: b */
    public C62961ch f130769b = emptyIntList();

    /* renamed from: c */
    public boolean f130770c;

    /* renamed from: d */
    public C62961ch f130771d = emptyIntList();

    /* renamed from: e */
    public boolean f130772e;

    static {
        C50284rj rjVar = new C50284rj();
        f130766f = rjVar;
        C62942bv.registerDefaultInstance(C50284rj.class, rjVar);
    }

    private C50284rj() {
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
                return newMessageInfo(f130766f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001e\u0002ဇ\u0000\u0003\u001e\u0004ဇ\u0001", new Object[]{"a", "b", C50286rl.m85799b(), C45240c.f118157a, "d", C49875cf.m85756b(), "e"});
            case 3:
                return new C50284rj();
            case 4:
                return new C50283ri();
            case 5:
                return f130766f;
            case 6:
                C63010eb ebVar = f130767g;
                if (ebVar == null) {
                    synchronized (C50284rj.class) {
                        ebVar = f130767g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130766f);
                            f130767g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
