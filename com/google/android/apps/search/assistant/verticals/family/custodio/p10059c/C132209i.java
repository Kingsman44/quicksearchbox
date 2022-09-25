package com.google.android.apps.search.assistant.verticals.family.custodio.p10059c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.c.i */
/* compiled from: PG */
public final class C132209i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C132209i f360853f;

    /* renamed from: g */
    private static volatile C63010eb f360854g;

    /* renamed from: a */
    public int f360855a;

    /* renamed from: b */
    public C62995dn f360856b = C62995dn.f170057a;

    /* renamed from: c */
    public C63042fg f360857c;

    /* renamed from: d */
    public C132203c f360858d;

    /* renamed from: e */
    public C132208h f360859e;

    static {
        C132209i iVar = new C132209i();
        f360853f = iVar;
        C62942bv.registerDefaultInstance(C132209i.class, iVar);
    }

    private C132209i() {
    }

    /* renamed from: a */
    public final C62995dn mo110538a() {
        C62995dn dnVar = this.f360856b;
        if (!dnVar.f170058b) {
            this.f360856b = dnVar.mo58980a();
        }
        return this.f360856b;
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
                return newMessageInfo(f360853f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C132206f.f360847a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C132209i();
            case 4:
                return new C132201a();
            case 5:
                return f360853f;
            case 6:
                C63010eb ebVar = f360854g;
                if (ebVar == null) {
                    synchronized (C132209i.class) {
                        ebVar = f360854g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360853f);
                            f360854g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
