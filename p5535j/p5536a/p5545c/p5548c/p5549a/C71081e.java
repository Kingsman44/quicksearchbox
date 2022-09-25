package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.e */
/* compiled from: PG */
public final class C71081e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C71081e f189559b;

    /* renamed from: c */
    public static final C62940bt f189560c;

    /* renamed from: d */
    private static volatile C63010eb f189561d;

    /* renamed from: a */
    public C62971cq f189562a = emptyProtobufList();

    static {
        C71081e eVar = new C71081e();
        f189559b = eVar;
        C62942bv.registerDefaultInstance(C71081e.class, eVar);
        f189560c = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, eVar, eVar, (C62958ce) null, 467100634, C63066gd.MESSAGE, C71081e.class);
    }

    private C71081e() {
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
                return newMessageInfo(f189559b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C71054d.class});
            case 3:
                return new C71081e();
            case 4:
                return new C70973a();
            case 5:
                return f189559b;
            case 6:
                C63010eb ebVar = f189561d;
                if (ebVar == null) {
                    synchronized (C71081e.class) {
                        ebVar = f189561d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189559b);
                            f189561d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
