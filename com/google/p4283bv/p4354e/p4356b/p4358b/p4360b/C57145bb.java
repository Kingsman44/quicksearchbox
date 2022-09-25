package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66226em;
import com.google.protos.youtube.elements.C66244fd;

/* renamed from: com.google.bv.e.b.b.b.bb */
/* compiled from: PG */
public final class C57145bb extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C57145bb f152546k;

    /* renamed from: l */
    public static final C62940bt f152547l;

    /* renamed from: n */
    private static volatile C63010eb f152548n;

    /* renamed from: a */
    public int f152549a;

    /* renamed from: b */
    public float f152550b;

    /* renamed from: c */
    public C66226em f152551c;

    /* renamed from: d */
    public String f152552d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f152553e;

    /* renamed from: f */
    public C57128al f152554f;

    /* renamed from: g */
    public C57696b f152555g;

    /* renamed from: h */
    public String f152556h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f152557i;

    /* renamed from: j */
    public C57144ba f152558j;

    /* renamed from: m */
    private byte f152559m = 2;

    static {
        C57145bb bbVar = new C57145bb();
        f152546k = bbVar;
        C62942bv.registerDefaultInstance(C57145bb.class, bbVar);
        f152547l = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, bbVar, bbVar, (C62958ce) null, 284091084, C63066gd.MESSAGE, C57145bb.class);
    }

    private C57145bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152559m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152559m = b;
                return null;
            case 2:
                return newMessageInfo(f152546k, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0000\u0002\u0002ခ\u0000\u0003ဉ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\u0007ဉ\u0004\bᐉ\u0005\tဈ\u0006\nဇ\u0007\u000bᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C57145bb();
            case 4:
                return new C57141ay();
            case 5:
                return f152546k;
            case 6:
                C63010eb ebVar = f152548n;
                if (ebVar == null) {
                    synchronized (C57145bb.class) {
                        ebVar = f152548n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152546k);
                            f152548n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
