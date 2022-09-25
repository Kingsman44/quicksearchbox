package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62558g;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56247ba;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56249bc;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.p */
/* compiled from: PG */
public final class C54064p extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C54064p f141850n;

    /* renamed from: p */
    private static volatile C63010eb f141851p;

    /* renamed from: a */
    public int f141852a;

    /* renamed from: b */
    public int f141853b;

    /* renamed from: c */
    public C53978am f141854c;

    /* renamed from: d */
    public C54017by f141855d;

    /* renamed from: e */
    public C54020ca f141856e;

    /* renamed from: f */
    public String f141857f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C56249bc f141858g;

    /* renamed from: h */
    public C56247ba f141859h;

    /* renamed from: i */
    public C56280cg f141860i;

    /* renamed from: j */
    public C62558g f141861j;

    /* renamed from: k */
    public int f141862k;

    /* renamed from: l */
    public C54063o f141863l;

    /* renamed from: m */
    public C54068t f141864m;

    /* renamed from: o */
    private byte f141865o = 2;

    static {
        C54064p pVar = new C54064p();
        f141850n = pVar;
        C62942bv.registerDefaultInstance(C54064p.class, pVar);
    }

    private C54064p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141865o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141865o = b;
                return null;
            case 2:
                return newMessageInfo(f141850n, "\u0000\r\u0000\u0000\u0005\u0017\r\u0000\u0000\u0001\u0005\f\u0006\t\u0007\t\bȈ\t\t\n\t\u000b\t\f\t\u000f\f\u0011\f\u0013\t\u0015\t\u0017Љ", new Object[]{"a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", "b", C19621k.f54601a, "l", C45240c.f118157a, "m"});
            case 3:
                return new C54064p();
            case 4:
                return new C54061m();
            case 5:
                return f141850n;
            case 6:
                C63010eb ebVar = f141851p;
                if (ebVar == null) {
                    synchronized (C54064p.class) {
                        ebVar = f141851p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141850n);
                            f141851p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
