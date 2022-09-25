package com.google.android.libraries.search.assistant.performer.p2729b.p2730a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3917i.p3918a.C51411gs;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.b.a.c */
/* compiled from: PG */
public final class C35476c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C35476c f93160f;

    /* renamed from: g */
    private static volatile C63010eb f93161g;

    /* renamed from: a */
    public int f93162a;

    /* renamed from: b */
    public C62971cq f93163b = emptyProtobufList();

    /* renamed from: c */
    public C51274bq f93164c;

    /* renamed from: d */
    public C51411gs f93165d;

    /* renamed from: e */
    public C52428rj f93166e;

    static {
        C35476c cVar = new C35476c();
        f93160f = cVar;
        C62942bv.registerDefaultInstance(C35476c.class, cVar);
    }

    private C35476c() {
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
                return newMessageInfo(f93160f, "\u0000\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C52083ep.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C35476c();
            case 4:
                return new C35475b();
            case 5:
                return f93160f;
            case 6:
                C63010eb ebVar = f93161g;
                if (ebVar == null) {
                    synchronized (C35476c.class) {
                        ebVar = f93161g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f93160f);
                            f93161g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
