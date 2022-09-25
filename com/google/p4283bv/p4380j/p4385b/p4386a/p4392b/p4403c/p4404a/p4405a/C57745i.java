package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a;

import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.j.b.a.b.c.a.a.i */
/* compiled from: PG */
public final class C57745i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57745i f154274c;

    /* renamed from: d */
    public static final C62940bt f154275d;

    /* renamed from: f */
    private static volatile C63010eb f154276f;

    /* renamed from: a */
    public int f154277a;

    /* renamed from: b */
    public C62971cq f154278b = emptyProtobufList();

    /* renamed from: e */
    private int f154279e;

    static {
        C57745i iVar = new C57745i();
        f154274c = iVar;
        C62942bv.registerDefaultInstance(C57745i.class, iVar);
        f154275d = C62942bv.newSingularGeneratedExtension(C57780l.f154376c, iVar, iVar, (C62958ce) null, 4, C63066gd.MESSAGE, C57745i.class);
    }

    private C57745i() {
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
                return newMessageInfo(f154274c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"e", "a", C57746j.f154280a, "b", C51098gh.class});
            case 3:
                return new C57745i();
            case 4:
                return new C57744h();
            case 5:
                return f154274c;
            case 6:
                C63010eb ebVar = f154276f;
                if (ebVar == null) {
                    synchronized (C57745i.class) {
                        ebVar = f154276f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154274c);
                            f154276f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
