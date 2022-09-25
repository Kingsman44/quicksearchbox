package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C66948fk;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.c.b.g */
/* compiled from: PG */
public final class C34680g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f92075c = new C34676c();

    /* renamed from: g */
    public static final C34680g f92076g;

    /* renamed from: h */
    public static final C62940bt f92077h;

    /* renamed from: i */
    private static volatile C63010eb f92078i;

    /* renamed from: a */
    public int f92079a;

    /* renamed from: b */
    public C62961ch f92080b = emptyIntList();

    /* renamed from: d */
    public C62971cq f92081d = emptyProtobufList();

    /* renamed from: e */
    public int f92082e;

    /* renamed from: f */
    public int f92083f;

    static {
        C34680g gVar = new C34680g();
        f92076g = gVar;
        C62942bv.registerDefaultInstance(C34680g.class, gVar);
        f92077h = C62942bv.newSingularGeneratedExtension(C34049bl.f90749a, gVar, gVar, (C62958ce) null, 2, C63066gd.MESSAGE, C34680g.class);
    }

    private C34680g() {
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
                return newMessageInfo(f92076g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001,\u0002\u001b\u0003ဌ\u0000\u0004ဌ\u0001", new Object[]{"a", "b", C66948fk.m97390b(), "d", C34675b.class, "e", C34679f.m63415b(), C10662f.f35572a, C34037b.m62691b()});
            case 3:
                return new C34680g();
            case 4:
                return new C34677d();
            case 5:
                return f92076g;
            case 6:
                C63010eb ebVar = f92078i;
                if (ebVar == null) {
                    synchronized (C34680g.class) {
                        ebVar = f92078i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92076g);
                            f92078i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
