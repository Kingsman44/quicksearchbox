package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.bu */
/* compiled from: PG */
public final class C51723bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51723bu f135696d;

    /* renamed from: e */
    private static volatile C63010eb f135697e;

    /* renamed from: a */
    public int f135698a;

    /* renamed from: b */
    public boolean f135699b;

    /* renamed from: c */
    public C62995dn f135700c = C62995dn.f170057a;

    static {
        C51723bu buVar = new C51723bu();
        f135696d = buVar;
        C62942bv.registerDefaultInstance(C51723bu.class, buVar);
    }

    private C51723bu() {
        emptyIntList();
    }

    /* renamed from: a */
    public final C62995dn mo53716a() {
        C62995dn dnVar = this.f135700c;
        if (!dnVar.f170058b) {
            this.f135700c = dnVar.mo58980a();
        }
        return this.f135700c;
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
                return newMessageInfo(f135696d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"a", "b", C45240c.f118157a, C51722bt.f135695a});
            case 3:
                return new C51723bu();
            case 4:
                return new C51721bs();
            case 5:
                return f135696d;
            case 6:
                C63010eb ebVar = f135697e;
                if (ebVar == null) {
                    synchronized (C51723bu.class) {
                        ebVar = f135697e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135696d);
                            f135697e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
