package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.ag */
/* compiled from: PG */
public final class C48892ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48892ag f126518c;

    /* renamed from: e */
    private static volatile C63010eb f126519e;

    /* renamed from: a */
    public C62995dn f126520a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f126521b = C62995dn.f170057a;

    /* renamed from: d */
    private byte f126522d = 2;

    static {
        C48892ag agVar = new C48892ag();
        f126518c = agVar;
        C62942bv.registerDefaultInstance(C48892ag.class, agVar);
    }

    private C48892ag() {
    }

    /* renamed from: a */
    public final C62995dn mo53188a() {
        C62995dn dnVar = this.f126520a;
        if (!dnVar.f170058b) {
            this.f126520a = dnVar.mo58980a();
        }
        return this.f126520a;
    }

    /* renamed from: b */
    public final boolean mo53189b(String str) {
        str.getClass();
        return this.f126520a.containsKey(str);
    }

    /* renamed from: c */
    public final C62995dn mo53190c() {
        C62995dn dnVar = this.f126521b;
        if (!dnVar.f170058b) {
            this.f126521b = dnVar.mo58980a();
        }
        return this.f126521b;
    }

    /* renamed from: d */
    public final boolean mo53191d(String str) {
        str.getClass();
        return this.f126521b.containsKey(str);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126522d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126522d = b;
                return null;
            case 2:
                return newMessageInfo(f126518c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0001\u0001в\u00022", new Object[]{"a", C48891af.f126517a, "b", C48890ae.f126516a});
            case 3:
                return new C48892ag();
            case 4:
                return new C48889ad();
            case 5:
                return f126518c;
            case 6:
                C63010eb ebVar = f126519e;
                if (ebVar == null) {
                    synchronized (C48892ag.class) {
                        ebVar = f126519e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126518c);
                            f126519e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
