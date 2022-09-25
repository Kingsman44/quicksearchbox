package androidx.media3.exoplayer.p145h;

import androidx.media3.exoplayer.C2874cc;
import androidx.media3.p134c.C2529g;

/* renamed from: androidx.media3.exoplayer.h.br */
/* compiled from: PG */
final class C3080br implements C3095cf {

    /* renamed from: a */
    public final int f8952a;

    /* renamed from: b */
    final /* synthetic */ C3083bu f8953b;

    public C3080br(C3083bu buVar, int i) {
        this.f8953b = buVar;
        this.f8952a = i;
    }

    /* renamed from: a */
    public final int mo6843a(C2874cc ccVar, C2529g gVar, int i) {
        C3083bu buVar = this.f8953b;
        int i2 = this.f8952a;
        if (buVar.mo7059w()) {
            return -3;
        }
        buVar.mo7055s(i2);
        int j = buVar.f8981j[i2].mo7074j(ccVar, gVar, i, buVar.f8988q);
        if (j != -3) {
            return j;
        }
        buVar.mo7056t(i2);
        return -3;
    }

    /* renamed from: b */
    public final int mo6844b(long j) {
        C3083bu buVar = this.f8953b;
        int i = this.f8952a;
        if (buVar.mo7059w()) {
            return 0;
        }
        buVar.mo7055s(i);
        C3094ce ceVar = buVar.f8981j[i];
        int h = ceVar.mo7072h(j, buVar.f8988q);
        ceVar.mo7088y(h);
        if (h != 0) {
            return h;
        }
        buVar.mo7056t(i);
        return 0;
    }

    /* renamed from: f */
    public final boolean mo6847f() {
        C3083bu buVar = this.f8953b;
        return !buVar.mo7059w() && buVar.f8981j[this.f8952a].mo7068A(buVar.f8988q);
    }

    /* renamed from: fd */
    public final void mo6848fd() {
        C3083bu buVar = this.f8953b;
        buVar.f8981j[this.f8952a].mo7083t();
        buVar.mo7058v();
    }
}
