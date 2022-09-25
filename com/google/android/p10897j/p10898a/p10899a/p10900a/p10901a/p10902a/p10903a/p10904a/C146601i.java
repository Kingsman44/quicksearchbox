package com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a;

import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.j.a.a.a.a.a.a.a.i */
/* compiled from: PG */
public final class C146601i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C146601i f395962a;

    /* renamed from: b */
    public static final C62940bt f395963b;

    /* renamed from: c */
    private static volatile C63010eb f395964c;

    static {
        C146601i iVar = new C146601i();
        f395962a = iVar;
        C62942bv.registerDefaultInstance(C146601i.class, iVar);
        f395963b = C62942bv.newSingularGeneratedExtension(C33423r.f89502a, iVar, iVar, (C62958ce) null, 393308312, C63066gd.MESSAGE, C146601i.class);
    }

    private C146601i() {
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
                return newMessageInfo(f395962a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C146601i();
            case 4:
                return new C146600h();
            case 5:
                return f395962a;
            case 6:
                C63010eb ebVar = f395964c;
                if (ebVar == null) {
                    synchronized (C146601i.class) {
                        ebVar = f395964c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395962a);
                            f395964c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
