package com.google.p4017at.p4060h.p4068b.p4069a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p395al.p417d.C8600b;
import com.google.p395al.p417d.p418a.C8580g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.b.a.u */
/* compiled from: PG */
public final class C54204u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f142251e = new C54202s();

    /* renamed from: i */
    public static final C54204u f142252i;

    /* renamed from: l */
    private static volatile C63010eb f142253l;

    /* renamed from: a */
    public int f142254a;

    /* renamed from: b */
    public String f142255b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f142256c;

    /* renamed from: d */
    public C62961ch f142257d = emptyIntList();

    /* renamed from: f */
    public long f142258f;

    /* renamed from: g */
    public boolean f142259g;

    /* renamed from: h */
    public C60220t f142260h;

    /* renamed from: j */
    private C8580g f142261j;

    /* renamed from: k */
    private byte f142262k = 2;

    static {
        C54204u uVar = new C54204u();
        f142252i = uVar;
        C62942bv.registerDefaultInstance(C54204u.class, uVar);
    }

    private C54204u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142262k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142262k = b;
                return null;
            case 2:
                return newMessageInfo(f142252i, "\u0001\u0007\u0000\u0001\u0003\n\u0007\u0000\u0001\u0001\u0003ဈ\u0001\u0005ဇ\u0003\u0006\u001e\u0007ဂ\u0004\bဉ\u0005\tဇ\u0006\nᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C8600b.m23280b(), C10662f.f35572a, "j", C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C54204u();
            case 4:
                return new C54203t();
            case 5:
                return f142252i;
            case 6:
                C63010eb ebVar = f142253l;
                if (ebVar == null) {
                    synchronized (C54204u.class) {
                        ebVar = f142253l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142252i);
                            f142253l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
