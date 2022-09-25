package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
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
import p5535j.p5536a.p5537a.p5539b.p5540a.C70921f;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70929n;

/* renamed from: j.a.c.c.a.al */
/* compiled from: PG */
public final class C70985al extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C70985al f189287g;

    /* renamed from: h */
    public static final C62940bt f189288h;

    /* renamed from: i */
    private static volatile C63010eb f189289i;

    /* renamed from: a */
    public int f189290a;

    /* renamed from: b */
    public String f189291b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f189292c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C70929n f189293d;

    /* renamed from: e */
    public int f189294e;

    /* renamed from: f */
    public C70921f f189295f;

    static {
        C70985al alVar = new C70985al();
        f189287g = alVar;
        C62942bv.registerDefaultInstance(C70985al.class, alVar);
        f189288h = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, alVar, alVar, (C62958ce) null, 408538967, C63066gd.MESSAGE, C70985al.class);
    }

    private C70985al() {
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
                return newMessageInfo(f189287g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C70984ak.m103856b(), C10662f.f35572a});
            case 3:
                return new C70985al();
            case 4:
                return new C70982ai();
            case 5:
                return f189287g;
            case 6:
                C63010eb ebVar = f189289i;
                if (ebVar == null) {
                    synchronized (C70985al.class) {
                        ebVar = f189289i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189287g);
                            f189289i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
