package com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9904b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.b.b.e */
/* compiled from: PG */
public final class C130550e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C130550e f357604b;

    /* renamed from: c */
    private static volatile C63010eb f357605c;

    /* renamed from: a */
    public C62995dn f357606a = C62995dn.f170057a;

    static {
        C130550e eVar = new C130550e();
        f357604b = eVar;
        C62942bv.registerDefaultInstance(C130550e.class, eVar);
    }

    private C130550e() {
    }

    /* renamed from: a */
    public final C62995dn mo109723a() {
        C62995dn dnVar = this.f357606a;
        if (!dnVar.f170058b) {
            this.f357606a = dnVar.mo58980a();
        }
        return this.f357606a;
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
                return newMessageInfo(f357604b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C130549d.f357603a});
            case 3:
                return new C130550e();
            case 4:
                return new C130548c();
            case 5:
                return f357604b;
            case 6:
                C63010eb ebVar = f357605c;
                if (ebVar == null) {
                    synchronized (C130550e.class) {
                        ebVar = f357605c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357604b);
                            f357605c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
