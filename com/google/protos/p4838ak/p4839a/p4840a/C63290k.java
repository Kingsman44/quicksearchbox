package com.google.protos.p4838ak.p4839a.p4840a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.ak.a.a.k */
/* compiled from: PG */
public final class C63290k extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C63290k f171034p;

    /* renamed from: q */
    private static volatile C63010eb f171035q;

    /* renamed from: a */
    public int f171036a;

    /* renamed from: b */
    public int f171037b = 0;

    /* renamed from: c */
    public Object f171038c;

    /* renamed from: d */
    public String f171039d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f171040e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f171041f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f171042g;

    /* renamed from: h */
    public int f171043h;

    /* renamed from: i */
    public C62910ar f171044i;

    /* renamed from: j */
    public int f171045j;

    /* renamed from: k */
    public C52432rn f171046k;

    /* renamed from: l */
    public long f171047l;

    /* renamed from: m */
    public String f171048m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public C62910ar f171049n;

    /* renamed from: o */
    public int f171050o;

    static {
        C63290k kVar = new C63290k();
        f171034p = kVar;
        C62942bv.registerDefaultInstance(C63290k.class, kVar);
    }

    private C63290k() {
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
                return newMessageInfo(f171034p, "\u0001\u0010\u0001\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0003\u0004င\u0004\u0005ဉ\u0005\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nဌ\n\u000bဉ\u000b\fဃ\f\rဈ\u0002\u000eဈ\r\u000fဉ\u000e\u0010ဌ\u000f", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C30325g.f82003a, C63286g.f171032a, C19618h.f54585a, "i", C63285f.class, C63283d.class, C63295p.class, C63292m.class, "j", C63280a.f171027a, C19621k.f54601a, "l", C10662f.f35572a, "m", C48004n.f124238a, C66412o.f180592a, C63289j.f171033a});
            case 3:
                return new C63290k();
            case 4:
                return new C63288i();
            case 5:
                return f171034p;
            case 6:
                C63010eb ebVar = f171035q;
                if (ebVar == null) {
                    synchronized (C63290k.class) {
                        ebVar = f171035q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171034p);
                            f171035q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
