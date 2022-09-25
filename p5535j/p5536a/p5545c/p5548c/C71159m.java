package p5535j.p5536a.p5545c.p5548c;

import com.google.android.apps.search.googleapp.search.p10409e.C137412a;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137539a;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
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
import p5535j.p5536a.p5545c.p5548c.p5550b.C71142b;

/* renamed from: j.a.c.c.m */
/* compiled from: PG */
public final class C71159m extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C71159m f189831i;

    /* renamed from: j */
    public static final C62940bt f189832j;

    /* renamed from: l */
    private static volatile C63010eb f189833l;

    /* renamed from: a */
    public int f189834a;

    /* renamed from: b */
    public int f189835b;

    /* renamed from: c */
    public int f189836c;

    /* renamed from: d */
    public boolean f189837d;

    /* renamed from: e */
    public C71156j f189838e;

    /* renamed from: f */
    public C71142b f189839f;

    /* renamed from: g */
    public int f189840g;

    /* renamed from: h */
    public boolean f189841h;

    /* renamed from: k */
    private byte f189842k = 2;

    static {
        C71159m mVar = new C71159m();
        f189831i = mVar;
        C62942bv.registerDefaultInstance(C71159m.class, mVar);
        f189832j = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, mVar, mVar, (C62958ce) null, 331631669, C63066gd.MESSAGE, C71159m.class);
    }

    private C71159m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f189842k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f189842k = b;
                return null;
            case 2:
                return newMessageInfo(f189831i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C71157k.f189830a, C45240c.f118157a, C137412a.f373764a, "d", "e", C10662f.f35572a, C30325g.f82003a, C137539a.f374084a, C19618h.f54585a});
            case 3:
                return new C71159m();
            case 4:
                return new C71153g();
            case 5:
                return f189831i;
            case 6:
                C63010eb ebVar = f189833l;
                if (ebVar == null) {
                    synchronized (C71159m.class) {
                        ebVar = f189833l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189831i);
                            f189833l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
