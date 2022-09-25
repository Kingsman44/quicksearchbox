package p5535j.p5536a.p5545c.p5553d;

import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139080be;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.d.d */
/* compiled from: PG */
public final class C71163d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71163d f189848d;

    /* renamed from: e */
    public static final C62940bt f189849e;

    /* renamed from: f */
    private static volatile C63010eb f189850f;

    /* renamed from: a */
    public int f189851a;

    /* renamed from: b */
    public C71162c f189852b;

    /* renamed from: c */
    public C139080be f189853c;

    static {
        C71163d dVar = new C71163d();
        f189848d = dVar;
        C62942bv.registerDefaultInstance(C71163d.class, dVar);
        f189849e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, dVar, dVar, (C62958ce) null, 463923742, C63066gd.MESSAGE, C71163d.class);
    }

    private C71163d() {
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
                return newMessageInfo(f189848d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71163d();
            case 4:
                return new C71160a();
            case 5:
                return f189848d;
            case 6:
                C63010eb ebVar = f189850f;
                if (ebVar == null) {
                    synchronized (C71163d.class) {
                        ebVar = f189850f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189848d);
                            f189850f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
