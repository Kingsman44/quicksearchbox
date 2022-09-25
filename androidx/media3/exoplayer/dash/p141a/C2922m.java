package androidx.media3.exoplayer.dash.p141a;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.dash.C2947p;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.a.m */
/* compiled from: PG */
public abstract class C2922m {

    /* renamed from: b */
    public final C2680x f8366b;

    /* renamed from: c */
    public final C58485gu f8367c;

    /* renamed from: d */
    public final long f8368d;

    /* renamed from: e */
    public final List f8369e;

    /* renamed from: f */
    public final C2919j f8370f;

    public C2922m(C2680x xVar, List list, C2928s sVar, List list2) {
        C2601a.m6830b(!list.isEmpty());
        this.f8366b = xVar;
        this.f8367c = C58485gu.m89842j(list);
        this.f8369e = Collections.unmodifiableList(list2);
        this.f8370f = sVar.mo6800i(this);
        this.f8368d = C2612ak.m7000y(sVar.f8387j, 1000000, sVar.f8386i);
    }

    /* renamed from: k */
    public abstract C2947p mo6789k();

    /* renamed from: l */
    public abstract C2919j mo6790l();

    /* renamed from: m */
    public abstract String mo6791m();
}
