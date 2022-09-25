package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p883a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51475jb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p001a.p007b.p011b.p012a.C0031g;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.a.b */
/* compiled from: PG */
public final class C13012b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13012b f40422e;

    /* renamed from: f */
    public static final C62940bt f40423f;

    /* renamed from: g */
    private static volatile C63010eb f40424g;

    /* renamed from: a */
    public int f40425a;

    /* renamed from: b */
    public C0031g f40426b;

    /* renamed from: c */
    public C51475jb f40427c;

    /* renamed from: d */
    public C12113b f40428d;

    static {
        C13012b bVar = new C13012b();
        f40422e = bVar;
        C62942bv.registerDefaultInstance(C13012b.class, bVar);
        f40423f = C62942bv.newSingularGeneratedExtension(C12991i.f40380k, bVar, bVar, (C62958ce) null, 359613208, C63066gd.MESSAGE, C13012b.class);
    }

    private C13012b() {
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
                return newMessageInfo(f40422e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C13012b();
            case 4:
                return new C13011a();
            case 5:
                return f40422e;
            case 6:
                C63010eb ebVar = f40424g;
                if (ebVar == null) {
                    synchronized (C13012b.class) {
                        ebVar = f40424g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40422e);
                            f40424g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
