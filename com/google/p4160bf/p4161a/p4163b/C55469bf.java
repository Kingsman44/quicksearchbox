package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4160bf.p4161a.p4162a.C55435d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.bf.a.b.bf */
/* compiled from: PG */
public final class C55469bf extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C55469bf f146328q;

    /* renamed from: r */
    private static volatile C63010eb f146329r;

    /* renamed from: a */
    public int f146330a;

    /* renamed from: b */
    public float f146331b;

    /* renamed from: c */
    public int f146332c;

    /* renamed from: d */
    public String f146333d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f146334e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f146335f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f146336g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f146337h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f146338i;

    /* renamed from: j */
    public String f146339j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C62971cq f146340k = emptyProtobufList();

    /* renamed from: l */
    public C62971cq f146341l = emptyProtobufList();

    /* renamed from: m */
    public int f146342m;

    /* renamed from: n */
    public String f146343n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public C55467bd f146344o;

    /* renamed from: p */
    public int f146345p;

    static {
        C55469bf bfVar = new C55469bf();
        f146328q = bfVar;
        C62942bv.registerDefaultInstance(C55469bf.class, bfVar);
    }

    private C55469bf() {
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
                return newMessageInfo(f146328q, "\u0001\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0002\u0000\u0002ခ\u0000\u0003ဌ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\u0007\nဈ\b\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f\u0011ဌ\r", new Object[]{"a", "b", C45240c.f118157a, C55435d.f146263a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C55500h.class, "l", C55497e.class, "m", C55462az.f146319a, C48004n.f124238a, C66412o.f180592a, "p", C55468be.f146327a});
            case 3:
                return new C55469bf();
            case 4:
                return new C55464ba();
            case 5:
                return f146328q;
            case 6:
                C63010eb ebVar = f146329r;
                if (ebVar == null) {
                    synchronized (C55469bf.class) {
                        ebVar = f146329r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146328q);
                            f146329r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
