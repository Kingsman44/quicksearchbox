package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.du */
/* compiled from: PG */
public final class C71075du extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f189548b = new C71071dq();

    /* renamed from: c */
    public static final C71075du f189549c;

    /* renamed from: d */
    public static final C62940bt f189550d;

    /* renamed from: e */
    private static volatile C63010eb f189551e;

    /* renamed from: a */
    public C62961ch f189552a = emptyIntList();

    static {
        C71075du duVar = new C71075du();
        f189549c = duVar;
        C62942bv.registerDefaultInstance(C71075du.class, duVar);
        f189550d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, duVar, duVar, (C62958ce) null, 470140297, C63066gd.MESSAGE, C71075du.class);
    }

    private C71075du() {
    }

    /* renamed from: a */
    public final void mo62610a() {
        C62961ch chVar = this.f189552a;
        if (!chVar.mo58948c()) {
            this.f189552a = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f189549c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a", C71074dt.m103877b()});
            case 3:
                return new C71075du();
            case 4:
                return new C71072dr();
            case 5:
                return f189549c;
            case 6:
                C63010eb ebVar = f189551e;
                if (ebVar == null) {
                    synchronized (C71075du.class) {
                        ebVar = f189551e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189549c);
                            f189551e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
