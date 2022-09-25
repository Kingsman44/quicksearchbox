package com.google.android.p10890h.p10891a.p10893b;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.p137a.C2711b;
import androidx.media3.exoplayer.p137a.C2725bn;
import androidx.media3.exoplayer.p137a.C2728bq;
import androidx.media3.exoplayer.p137a.C2729br;
import androidx.media3.exoplayer.p137a.C2732c;
import androidx.media3.exoplayer.p137a.C2733d;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import androidx.p060c.C0984n;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.h.a.b.h */
/* compiled from: PG */
public final class C146577h implements Handler.Callback, C2733d, C2728bq {

    /* renamed from: a */
    private final Context f395846a;

    /* renamed from: b */
    private final String f395847b = "https://s.youtube.com/api/stats/qoe";

    /* renamed from: c */
    private final C146581l f395848c;

    /* renamed from: d */
    private final C146578i f395849d;

    /* renamed from: e */
    private final Handler f395850e;

    /* renamed from: f */
    private final C0984n f395851f;

    /* renamed from: g */
    private final C2729br f395852g;

    /* renamed from: h */
    private boolean f395853h;

    /* renamed from: i */
    private boolean f395854i;

    /* renamed from: j */
    private int f395855j;

    /* renamed from: k */
    private int f395856k;

    /* renamed from: l */
    private C2640bb f395857l;

    /* renamed from: m */
    private boolean f395858m;

    /* renamed from: n */
    private long f395859n;

    /* renamed from: o */
    private final C146574e f395860o;

    public C146577h(Context context, C146574e eVar, C146581l lVar, C146578i iVar, C2729br brVar) {
        this.f395846a = context.getApplicationContext();
        this.f395860o = eVar;
        this.f395848c = lVar;
        this.f395849d = iVar;
        this.f395852g = brVar;
        this.f395851f = new C0984n(0);
        this.f395855j = 1;
        this.f395856k = 0;
        this.f395857l = C2640bb.f7312a;
        this.f395859n = -1;
        this.f395850e = new Handler(C2612ak.m6923F(), this);
        ((C2725bn) brVar).f7571c = this;
    }

    /* renamed from: E */
    private final void m238739E(C2711b bVar) {
        if (!this.f395853h) {
            this.f395852g.mo6417e(bVar);
        }
    }

    /* renamed from: F */
    private final void m238740F() {
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                if (gVar.f395844b.f395867d > 1000) {
                    m238741G(gVar, false);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: G */
    private final void m238741G(C146576g gVar, boolean z) {
        C146574e eVar = this.f395860o;
        C146580k kVar = gVar.f395844b;
        kVar.f395866c.setLength(0);
        kVar.f395866c.append(kVar.f395864a);
        for (Map.Entry entry : kVar.f395865b.entrySet()) {
            StringBuilder sb = kVar.f395866c;
            sb.append('&');
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((CharSequence) entry.getValue());
        }
        eVar.f395839b.mo95062a(0, new C146573d(eVar, Uri.parse(kVar.f395866c.toString()), gVar.f395843a, z));
        this.f395850e.removeMessages(0, gVar);
        if (!z) {
            for (C146579j c : gVar.f395845c) {
                c.mo95069c();
            }
            this.f395850e.sendMessageDelayed(Message.obtain(this.f395850e, 0, gVar), 600000);
        }
    }

    /* renamed from: A */
    public final void mo6421A(C2711b bVar, String str, String str2) {
        C146576g gVar = (C146576g) this.f395851f.get(str);
        C146576g gVar2 = (C146576g) this.f395851f.get(str2);
        if (gVar != null && gVar2 != null) {
            for (C146579j m : gVar.f395845c) {
                m.mo123367m(bVar);
            }
        }
    }

    /* renamed from: B */
    public final void mo6422B(C2711b bVar, String str) {
        C146576g gVar = (C146576g) this.f395851f.get(str);
        if (gVar != null) {
            for (C146579j a : gVar.f395845c) {
                a.mo95067a(bVar);
            }
        }
    }

    /* renamed from: C */
    public final void mo6423C(C2711b bVar, String str) {
        C146582m a = this.f395848c.mo95059a(bVar.f7528b, bVar.f7529c);
        C146580k kVar = new C146580k(this.f395847b, str, bVar.f7527a);
        C146579j[] a2 = this.f395849d.mo95060a(this.f395846a, a);
        for (C146579j jVar : a2) {
            jVar.f395862a = kVar;
            jVar.mo95070d();
        }
        C146576g gVar = new C146576g(str, kVar, a2);
        this.f395851f.put(str, gVar);
        for (C146579j jVar2 : a2) {
            int i = this.f395855j;
            if (!(i == 1 || i == 4)) {
                jVar2.mo123355k(bVar, this.f395854i, i, true);
            }
            int i2 = this.f395856k;
            if (i2 != 0) {
                jVar2.mo123364i(bVar, i2, true);
            }
            if (!this.f395857l.equals(C2640bb.f7312a)) {
                jVar2.mo123363h(bVar, this.f395857l, true);
            }
            if (this.f395858m) {
                jVar2.mo123365r(bVar, true);
            }
            long j = this.f395859n;
            if (j != -1) {
                jVar2.mo123351f(bVar, 0, 0, j, true);
            }
        }
        this.f395850e.sendMessageDelayed(Message.obtain(this.f395850e, 0, gVar), 600000);
    }

    /* renamed from: D */
    public final void mo6424D(C2711b bVar, String str, boolean z) {
        C146576g gVar = (C146576g) this.f395851f.remove(str);
        if (gVar != null) {
            for (C146579j g : gVar.f395845c) {
                g.mo123352g(bVar.f7527a, z);
            }
            m238741G(gVar, true);
        }
    }

    /* renamed from: a */
    public final void mo6425a(C2711b bVar, int i, long j, long j2) {
        m238739E(bVar);
        int i2 = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i2 < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i2);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j e : gVar.f395845c) {
                    e.mo123360e(bVar, i, j, j2, h);
                }
                i2++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo6426b(C2711b bVar, int i, long j, long j2) {
        m238739E(bVar);
        int i2 = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i2 < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i2);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j f : gVar.f395845c) {
                    f.mo123351f(bVar, i, j, j2, h);
                }
                i2++;
            } else {
                this.f395859n = j2;
                m238740F();
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo6427c(C2711b bVar, C3032ao aoVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j n : gVar.f395845c) {
                    n.mo123353n(bVar, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6428d(C2646bh bhVar, C2732c cVar) {
    }

    /* renamed from: e */
    public final void mo6429e(C2711b bVar, C2640bb bbVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j h2 : gVar.f395845c) {
                    h2.mo123363h(bVar, bbVar, h);
                }
                i++;
            } else {
                this.f395857l = bbVar;
                m238740F();
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo6430f(C2711b bVar, int i) {
        m238739E(bVar);
        int i2 = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i2 < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i2);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j i3 : gVar.f395845c) {
                    i3.mo123364i(bVar, i, h);
                }
                i2++;
            } else {
                this.f395856k = i;
                m238740F();
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo6431g(C2711b bVar, C2639ba baVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j j : gVar.f395845c) {
                    j.mo123361j(bVar, baVar, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo6432h(C2711b bVar, boolean z, int i) {
        m238739E(bVar);
        int i2 = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i2 >= nVar.f3122d) {
                break;
            }
            C146576g gVar = (C146576g) nVar.mo3708h(i2);
            boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
            for (C146579j k : gVar.f395845c) {
                k.mo123355k(bVar, z, i, h);
            }
            i2++;
        }
        this.f395854i = z;
        this.f395855j = i;
        if (i == 4 || i == 1) {
            int i3 = 0;
            while (true) {
                C0984n nVar2 = this.f395851f;
                if (i3 < nVar2.f3122d) {
                    m238741G((C146576g) nVar2.mo3708h(i3), false);
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            m238740F();
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            m238741G((C146576g) message.obj, false);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public final void mo6433i(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i) {
        C2711b bVar2 = bVar;
        C2729br brVar = this.f395852g;
        String b = brVar.mo6414b();
        if (!this.f395853h) {
            brVar.mo6418f(bVar2, i);
        } else {
            int i2 = i;
        }
        int i3 = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i3 < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i3);
                boolean equals = gVar.f395843a.equals(b);
                boolean h = this.f395852g.mo6420h(bVar2, gVar.f395843a);
                C146579j[] jVarArr = gVar.f395845c;
                int i4 = 0;
                for (int length = jVarArr.length; i4 < length; length = length) {
                    jVarArr[i4].mo123356l(bVar, bgVar, bgVar2, i, equals, h);
                    i4++;
                }
                i3++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo6434j(C2711b bVar, boolean z) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j r : gVar.f395845c) {
                    r.mo123365r(bVar, h);
                }
                i++;
            } else {
                this.f395858m = z;
                m238740F();
                return;
            }
        }
    }

    /* renamed from: k */
    public final void mo6435k(C2711b bVar, C2657bs bsVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j b : gVar.f395845c) {
                    b.mo95068b(bVar, bsVar, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6436l() {
    }

    /* renamed from: m */
    public final void mo6437m(C2711b bVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j jVar : gVar.f395845c) {
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6438n() {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6439o(C3004h hVar) {
    }

    /* renamed from: p */
    public final void mo6440p(C2711b bVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j jVar : gVar.f395845c) {
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6441q(C2658bt btVar) {
    }

    /* renamed from: r */
    public final void mo6442r(C2711b bVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j o : gVar.f395845c) {
                    o.mo123357o(bVar, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: s */
    public final void mo6443s(C2711b bVar, C3027aj ajVar, C3032ao aoVar, IOException iOException) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C2711b bVar2 = bVar;
                boolean h = this.f395852g.mo6420h(bVar, ((C146576g) nVar.mo3708h(i)).f395843a);
                for (C146579j p : ((C146576g) this.f395851f.mo3708h(i)).f395845c) {
                    p.mo123362p(bVar, ajVar, aoVar, iOException, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: t */
    public final void mo6444t(C2711b bVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j q : gVar.f395845c) {
                    q.mo123366q(bVar, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: u */
    public final void mo6445u(C2711b bVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j jVar : gVar.f395845c) {
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: v */
    public final void mo6446v(C2711b bVar) {
        if (!this.f395853h) {
            this.f395852g.mo6419g(bVar);
        }
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j s : gVar.f395845c) {
                    s.mo123359s(bVar, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: w */
    public final void mo6447w(C2711b bVar) {
        m238739E(bVar);
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                boolean h = this.f395852g.mo6420h(bVar, gVar.f395843a);
                for (C146579j t : gVar.f395845c) {
                    t.mo123358t(bVar, h);
                }
                i++;
            } else {
                m238740F();
                return;
            }
        }
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6448x(Metadata metadata) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6449y(int i, int i2) {
    }

    /* renamed from: z */
    public final void mo123371z() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        while (true) {
            C0984n nVar = this.f395851f;
            if (i < nVar.f3122d) {
                C146576g gVar = (C146576g) nVar.mo3708h(i);
                for (C146579j g : gVar.f395845c) {
                    g.mo123352g(elapsedRealtime, false);
                }
                m238741G(gVar, true);
                i++;
            } else {
                nVar.clear();
                this.f395850e.removeCallbacksAndMessages((Object) null);
                this.f395853h = true;
                return;
            }
        }
    }
}
