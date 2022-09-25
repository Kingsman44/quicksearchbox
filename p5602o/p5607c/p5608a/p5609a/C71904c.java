package p5602o.p5607c.p5608a.p5609a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.social.p3269d.p3270a.C41929d;
import com.google.android.libraries.social.p3269d.p3270a.C41937l;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4420by.p4421a.p4422a.C57868e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.a.a.c */
/* compiled from: PG */
public final class C71904c extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C71904c f191501h;

    /* renamed from: i */
    private static volatile C63010eb f191502i;

    /* renamed from: a */
    public int f191503a;

    /* renamed from: b */
    public int f191504b;

    /* renamed from: c */
    public int f191505c;

    /* renamed from: d */
    public C57868e f191506d;

    /* renamed from: e */
    public String f191507e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f191508f;

    /* renamed from: g */
    public int f191509g;

    static {
        C71904c cVar = new C71904c();
        f191501h = cVar;
        C62942bv.registerDefaultInstance(C71904c.class, cVar);
    }

    private C71904c() {
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
                return newMessageInfo(f191501h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0004ဂ\u0004\u0005ဌ\u0001\u0007ဌ\u0005", new Object[]{"a", "b", C41929d.f109389a, "d", "e", C10662f.f35572a, C45240c.f118157a, C41937l.m73461b(), C30325g.f82003a, C71905d.f191510a});
            case 3:
                return new C71904c();
            case 4:
                return new C71903b();
            case 5:
                return f191501h;
            case 6:
                C63010eb ebVar = f191502i;
                if (ebVar == null) {
                    synchronized (C71904c.class) {
                        ebVar = f191502i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191501h);
                            f191502i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
