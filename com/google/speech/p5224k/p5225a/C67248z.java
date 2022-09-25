package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.audio.p4107b.p4108a.C54584g;
import com.google.audio.p4107b.p4108a.C54595r;
import com.google.audio.p4107b.p4108a.C54597t;
import com.google.p3728as.p3737c.C48038b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.speech.k.a.z */
/* compiled from: PG */
public final class C67248z extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C67248z f182795j;

    /* renamed from: k */
    public static final C62940bt f182796k;

    /* renamed from: n */
    private static volatile C63010eb f182797n;

    /* renamed from: a */
    public int f182798a;

    /* renamed from: b */
    public C54584g f182799b;

    /* renamed from: c */
    public C54595r f182800c;

    /* renamed from: d */
    public boolean f182801d;

    /* renamed from: e */
    public String f182802e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f182803f;

    /* renamed from: g */
    public C54597t f182804g;

    /* renamed from: h */
    public C48038b f182805h;

    /* renamed from: i */
    public boolean f182806i;

    /* renamed from: l */
    private C63771b f182807l;

    /* renamed from: m */
    private byte f182808m = 2;

    static {
        C67248z zVar = new C67248z();
        f182795j = zVar;
        C62942bv.registerDefaultInstance(C67248z.class, zVar);
        f182796k = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, zVar, zVar, (C62958ce) null, 35351945, C63066gd.MESSAGE, C67248z.class);
    }

    private C67248z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182808m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182808m = b;
                return null;
            case 2:
                return newMessageInfo(f182795j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007\tᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "l"});
            case 3:
                return new C67248z();
            case 4:
                return new C67247y();
            case 5:
                return f182795j;
            case 6:
                C63010eb ebVar = f182797n;
                if (ebVar == null) {
                    synchronized (C67248z.class) {
                        ebVar = f182797n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182795j);
                            f182797n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
