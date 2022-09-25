package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mw */
/* compiled from: PG */
public final class C14536mw extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C14536mw f43962l;

    /* renamed from: n */
    private static volatile C63010eb f43963n;

    /* renamed from: a */
    public int f43964a;

    /* renamed from: b */
    public String f43965b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51805du f43966c;

    /* renamed from: d */
    public boolean f43967d;

    /* renamed from: e */
    public String f43968e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f43969f;

    /* renamed from: g */
    public C60214n f43970g;

    /* renamed from: h */
    public String f43971h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f43972i;

    /* renamed from: j */
    public C13901e f43973j;

    /* renamed from: k */
    public String f43974k = BuildConfig.FLAVOR;

    /* renamed from: m */
    private byte f43975m = 2;

    static {
        C14536mw mwVar = new C14536mw();
        f43962l = mwVar;
        C62942bv.registerDefaultInstance(C14536mw.class, mwVar);
    }

    private C14536mw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43975m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43975m = b;
                return null;
            case 2:
                return newMessageInfo(f43962l, "\u0000\u000b\u0000\u0000\u0001\u000e\u000b\u0000\u0000\u0001\u0001\f\u0002Ȉ\u0003\t\u0005\u0007\bȈ\t\u0010\nЉ\u000bȈ\f\f\r\t\u000eȈ", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C14536mw();
            case 4:
                return new C14534mu();
            case 5:
                return f43962l;
            case 6:
                C63010eb ebVar = f43963n;
                if (ebVar == null) {
                    synchronized (C14536mw.class) {
                        ebVar = f43963n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43962l);
                            f43963n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
