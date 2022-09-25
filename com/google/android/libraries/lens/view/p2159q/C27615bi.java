package com.google.android.libraries.lens.view.p2159q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.q.bi */
/* compiled from: PG */
public final class C27615bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C27615bi f75449c;

    /* renamed from: d */
    private static volatile C63010eb f75450d;

    /* renamed from: a */
    public C62995dn f75451a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f75452b = C62995dn.f170057a;

    static {
        C27615bi biVar = new C27615bi();
        f75449c = biVar;
        C62942bv.registerDefaultInstance(C27615bi.class, biVar);
    }

    private C27615bi() {
    }

    /* renamed from: a */
    public final C62995dn mo33137a() {
        C62995dn dnVar = this.f75452b;
        if (!dnVar.f170058b) {
            this.f75452b = dnVar.mo58980a();
        }
        return this.f75452b;
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
                return newMessageInfo(f75449c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"a", C27613bg.f75447a, "b", C27614bh.f75448a});
            case 3:
                return new C27615bi();
            case 4:
                return new C27612bf();
            case 5:
                return f75449c;
            case 6:
                C63010eb ebVar = f75450d;
                if (ebVar == null) {
                    synchronized (C27615bi.class) {
                        ebVar = f75450d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f75449c);
                            f75450d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
