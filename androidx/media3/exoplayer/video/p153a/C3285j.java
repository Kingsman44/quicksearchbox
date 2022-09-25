package androidx.media3.exoplayer.video.p153a;

import androidx.media3.common.p136b.C2625m;
import java.nio.FloatBuffer;

/* renamed from: androidx.media3.exoplayer.video.a.j */
/* compiled from: PG */
final class C3285j {

    /* renamed from: a */
    public final int f9863a;

    /* renamed from: b */
    public final FloatBuffer f9864b;

    /* renamed from: c */
    public final FloatBuffer f9865c;

    /* renamed from: d */
    public final int f9866d;

    public C3285j(C3282g gVar) {
        float[] fArr = gVar.f9857c;
        this.f9863a = fArr.length / 3;
        this.f9864b = C2625m.m7024a(fArr);
        this.f9865c = C2625m.m7024a(gVar.f9858d);
        int i = gVar.f9856b;
        this.f9866d = i != 1 ? i != 2 ? 4 : 6 : 5;
    }
}
