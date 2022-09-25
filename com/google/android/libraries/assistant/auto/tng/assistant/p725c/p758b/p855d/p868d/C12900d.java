package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.d.d */
/* compiled from: PG */
public final class C12900d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C12900d f40164b;

    /* renamed from: c */
    private static volatile C63010eb f40165c;

    /* renamed from: a */
    public C62971cq f40166a = emptyProtobufList();

    static {
        C12900d dVar = new C12900d();
        f40164b = dVar;
        C62942bv.registerDefaultInstance(C12900d.class, dVar);
    }

    private C12900d() {
    }

    /* renamed from: a */
    public final void mo20840a() {
        C62971cq cqVar = this.f40166a;
        if (!cqVar.mo58948c()) {
            this.f40166a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f40164b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C12899c.class});
            case 3:
                return new C12900d();
            case 4:
                return new C12897a();
            case 5:
                return f40164b;
            case 6:
                C63010eb ebVar = f40165c;
                if (ebVar == null) {
                    synchronized (C12900d.class) {
                        ebVar = f40165c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40164b);
                            f40165c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
