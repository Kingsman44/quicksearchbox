package com.google.assistant.p3897e.p3929l.p3930a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.p381aj.p382a.p383a.p384a.C8240t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.d */
/* compiled from: PG */
public final class C52748d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52748d f138421e;

    /* renamed from: m */
    private static volatile C63010eb f138422m;

    /* renamed from: a */
    public int f138423a;

    /* renamed from: b */
    public C52428rj f138424b;

    /* renamed from: c */
    public String f138425c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C52432rn f138426d;

    /* renamed from: f */
    private int f138427f;

    /* renamed from: g */
    private C51715bm f138428g;

    /* renamed from: h */
    private C8240t f138429h;

    /* renamed from: i */
    private C52783k f138430i;

    /* renamed from: j */
    private C52778f f138431j;

    /* renamed from: k */
    private C52788p f138432k;

    /* renamed from: l */
    private byte f138433l = 2;

    static {
        C52748d dVar = new C52748d();
        f138421e = dVar;
        C62942bv.registerDefaultInstance(C52748d.class, dVar);
    }

    private C52748d() {
        emptyIntList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138433l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138433l = b;
                return null;
            case 2:
                return newMessageInfo(f138421e, "\u0001\b\u0000\u0002\u0001:\b\u0000\u0000\u0002\u0001ဉ\u0003\u0002ဈ\u0005\u0003ᐉ\u0006\u000bᐉ\u000e\u000eဉ\b\u001dဉ%'ဉ\u0018:ဉ8", new Object[]{"a", C10662f.f35572a, "b", C45240c.f118157a, C30325g.f82003a, C19618h.f54585a, "d", "j", "i", C19621k.f54601a});
            case 3:
                return new C52748d();
            case 4:
                return new C52721c();
            case 5:
                return f138421e;
            case 6:
                C63010eb ebVar = f138422m;
                if (ebVar == null) {
                    synchronized (C52748d.class) {
                        ebVar = f138422m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138421e);
                            f138422m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
