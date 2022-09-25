package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.au */
/* compiled from: PG */
public final class C16347au extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C16347au f48122b;

    /* renamed from: d */
    private static volatile C63010eb f48123d;

    /* renamed from: a */
    public C62995dn f48124a = C62995dn.f170057a;

    /* renamed from: c */
    private byte f48125c = 2;

    static {
        C16347au auVar = new C16347au();
        f48122b = auVar;
        C62942bv.registerDefaultInstance(C16347au.class, auVar);
    }

    private C16347au() {
    }

    /* renamed from: a */
    public final C62995dn mo22889a() {
        C62995dn dnVar = this.f48124a;
        if (!dnVar.f170058b) {
            this.f48124a = dnVar.mo58980a();
        }
        return this.f48124a;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48125c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48125c = b;
                return null;
            case 2:
                return newMessageInfo(f48122b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C16346at.f48121a});
            case 3:
                return new C16347au();
            case 4:
                return new C16345as();
            case 5:
                return f48122b;
            case 6:
                C63010eb ebVar = f48123d;
                if (ebVar == null) {
                    synchronized (C16347au.class) {
                        ebVar = f48123d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48122b);
                            f48123d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
