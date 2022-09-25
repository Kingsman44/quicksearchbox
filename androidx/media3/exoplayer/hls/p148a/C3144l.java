package androidx.media3.exoplayer.hls.p148a;

import androidx.media3.common.DrmInitData;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.hls.a.l */
/* compiled from: PG */
public final class C3144l extends C3148p {

    /* renamed from: a */
    public final int f9275a;

    /* renamed from: b */
    public final long f9276b;

    /* renamed from: c */
    public final boolean f9277c;

    /* renamed from: d */
    public final boolean f9278d;

    /* renamed from: e */
    public final long f9279e;

    /* renamed from: f */
    public final boolean f9280f;

    /* renamed from: g */
    public final int f9281g;

    /* renamed from: h */
    public final long f9282h;

    /* renamed from: i */
    public final int f9283i;

    /* renamed from: j */
    public final long f9284j;

    /* renamed from: k */
    public final long f9285k;

    /* renamed from: l */
    public final boolean f9286l;

    /* renamed from: m */
    public final boolean f9287m;

    /* renamed from: n */
    public final DrmInitData f9288n;

    /* renamed from: o */
    public final List f9289o;

    /* renamed from: p */
    public final List f9290p;

    /* renamed from: q */
    public final Map f9291q;

    /* renamed from: r */
    public final long f9292r;

    /* renamed from: s */
    public final C3143k f9293s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3144l(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, C3143k kVar, Map map) {
        super(str, list, z3);
        long j6;
        long j7 = j;
        String str2 = str;
        List list4 = list;
        this.f9275a = i;
        this.f9279e = j2;
        this.f9278d = z;
        this.f9280f = z2;
        this.f9281g = i2;
        this.f9282h = j3;
        this.f9283i = i3;
        this.f9284j = j4;
        this.f9285k = j5;
        this.f9286l = z4;
        this.f9287m = z5;
        this.f9288n = drmInitData;
        this.f9289o = C58485gu.m89842j(list2);
        this.f9290p = C58485gu.m89842j(list3);
        this.f9291q = C58495hd.m89898l(map);
        if (!list3.isEmpty()) {
            C3139g gVar = (C3139g) C58557jl.m90131l(list3);
            j6 = gVar.f9263g + gVar.f9261e;
            this.f9292r = j6;
        } else if (!list2.isEmpty()) {
            C3141i iVar = (C3141i) C58557jl.m90131l(list2);
            j6 = iVar.f9263g + iVar.f9261e;
            this.f9292r = j6;
        } else {
            this.f9292r = 0;
            j6 = 0;
        }
        long j8 = j6;
        long j9 = -9223372036854775807L;
        if (j7 != -9223372036854775807L) {
            if (j7 >= 0) {
                j9 = Math.min(j8, j7);
            } else {
                j9 = Math.max(0, j6 + j7);
            }
        }
        this.f9276b = j9;
        this.f9277c = j7 >= 0;
        this.f9293s = kVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo6767d(List list) {
        return this;
    }
}
