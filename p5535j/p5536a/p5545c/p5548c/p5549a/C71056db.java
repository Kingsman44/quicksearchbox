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

/* renamed from: j.a.c.c.a.db */
/* compiled from: PG */
public final class C71056db extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71056db f189507c;

    /* renamed from: d */
    public static final C62940bt f189508d;

    /* renamed from: e */
    private static volatile C63010eb f189509e;

    /* renamed from: a */
    public C62971cq f189510a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f189511b = emptyProtobufList();

    static {
        C71056db dbVar = new C71056db();
        f189507c = dbVar;
        C62942bv.registerDefaultInstance(C71056db.class, dbVar);
        f189508d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, dbVar, dbVar, (C62958ce) null, 389175522, C63066gd.MESSAGE, C71056db.class);
    }

    private C71056db() {
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
                return newMessageInfo(f189507c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C71051cx.class, "b", C71055da.class});
            case 3:
                return new C71056db();
            case 4:
                return new C71045cr();
            case 5:
                return f189507c;
            case 6:
                C63010eb ebVar = f189509e;
                if (ebVar == null) {
                    synchronized (C71056db.class) {
                        ebVar = f189509e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189507c);
                            f189509e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
