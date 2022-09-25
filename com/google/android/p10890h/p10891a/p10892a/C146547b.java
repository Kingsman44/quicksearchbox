package com.google.android.p10890h.p10891a.p10892a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0324z;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2672p;
import androidx.media3.common.Metadata;
import androidx.media3.common.p135a.C2568d;
import com.google.android.apps.search.podcasts.player.impl.C140806an;
import com.google.android.apps.search.podcasts.player.impl.C140813au;
import com.google.android.apps.search.podcasts.player.impl.C140814av;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.h.a.a.b */
/* compiled from: PG */
final class C146547b extends C0324z implements C2644bf {

    /* renamed from: e */
    final /* synthetic */ C146555j f395770e;

    /* renamed from: f */
    private int f395771f;

    /* renamed from: g */
    private int f395772g;

    public C146547b(C146555j jVar) {
        this.f395770e = jVar;
    }

    /* renamed from: A */
    public final /* synthetic */ void mo6220A(boolean z) {
    }

    /* renamed from: B */
    public final /* synthetic */ void mo6221B(int i, int i2) {
    }

    /* renamed from: C */
    public final /* synthetic */ void mo6222C(C2651bm bmVar, int i) {
    }

    /* renamed from: D */
    public final /* synthetic */ void mo6223D(C2657bs bsVar) {
    }

    /* renamed from: E */
    public final /* synthetic */ void mo6224E(C2658bt btVar) {
    }

    /* renamed from: F */
    public final /* synthetic */ void mo6225F(float f) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6226a(C2664h hVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6227b(C2642bd bdVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6228c(C2568d dVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6229d(List list) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6230e(C2672p pVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6231f(int i, boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r6.f395771f == r4) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (r7 != false) goto L_0x0084;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6232g(androidx.media3.common.C2646bh r7, androidx.media3.common.C2643be r8) {
        /*
            r6 = this;
            androidx.media3.common.u r0 = r8.f7318a
            android.util.SparseBooleanArray r0 = r0.f7443a
            r1 = 11
            boolean r0 = r0.get(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0024
            int r0 = r6.f395771f
            int r3 = r7.mo5996c()
            if (r0 == r3) goto L_0x0021
            com.google.android.h.a.a.j r0 = r6.f395770e
            com.google.android.h.a.a.i r0 = r0.f395783i
            if (r0 == 0) goto L_0x001f
            r0.mo123337d(r7)
        L_0x001f:
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r3 = 1
            goto L_0x0026
        L_0x0024:
            r0 = 0
            r3 = 0
        L_0x0026:
            androidx.media3.common.u r4 = r8.f7318a
            android.util.SparseBooleanArray r4 = r4.f7443a
            boolean r4 = r4.get(r1)
            if (r4 == 0) goto L_0x0053
            androidx.media3.common.bm r0 = r7.mo6014u()
            int r0 = r0.mo6022c()
            int r4 = r7.mo5996c()
            com.google.android.h.a.a.j r5 = r6.f395770e
            com.google.android.h.a.a.i r5 = r5.f395783i
            if (r5 == 0) goto L_0x0047
            r5.mo123340g(r7)
        L_0x0045:
            r3 = 1
            goto L_0x0050
        L_0x0047:
            int r5 = r6.f395772g
            if (r5 != r0) goto L_0x0045
            int r5 = r6.f395771f
            if (r5 == r4) goto L_0x0050
            goto L_0x0045
        L_0x0050:
            r6.f395772g = r0
            r0 = 1
        L_0x0053:
            int r7 = r7.mo5996c()
            r6.f395771f = r7
            r7 = 5
            int[] r7 = new int[r7]
            r7 = {4, 5, 7, 8, 12} // fill-array
            androidx.media3.common.u r4 = r8.f7318a
            boolean r7 = r4.mo6353b(r7)
            r7 = r7 | r3
            int[] r2 = new int[r2]
            r3 = 9
            r2[r1] = r3
            androidx.media3.common.u r8 = r8.f7318a
            boolean r8 = r8.mo6353b(r2)
            if (r8 == 0) goto L_0x0082
            com.google.android.h.a.a.j r7 = r6.f395770e
            com.google.android.h.a.a.i r8 = r7.f395783i
            if (r8 == 0) goto L_0x0084
            androidx.media3.common.bh r7 = r7.f395781g
            if (r7 == 0) goto L_0x0084
            r8.mo123340g(r7)
            goto L_0x0084
        L_0x0082:
            if (r7 == 0) goto L_0x0089
        L_0x0084:
            com.google.android.h.a.a.j r7 = r6.f395770e
            r7.mo123343b()
        L_0x0089:
            if (r0 == 0) goto L_0x0090
            com.google.android.h.a.a.j r7 = r6.f395770e
            r7.mo123342a()
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10890h.p10891a.p10892a.C146547b.mo6232g(androidx.media3.common.bh, androidx.media3.common.be):void");
    }

    /* renamed from: h */
    public final /* synthetic */ void mo6233h(boolean z) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo6234i(boolean z) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo6235j(boolean z) {
    }

    /* renamed from: jU */
    public final void mo1064jU(String str, Bundle bundle) {
        C146555j jVar = this.f395770e;
        if (jVar.f395781g != null && jVar.f395779e.containsKey(str)) {
            ((C146548c) this.f395770e.f395779e.get(str)).mo115923b(this.f395770e.f395781g, str);
            this.f395770e.mo123343b();
        }
    }

    /* renamed from: jV */
    public final void mo1065jV() {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(64)) {
            jVar.f395781g.mo6262ag();
        }
    }

    /* renamed from: jW */
    public final void mo1066jW() {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(2)) {
            jVar.f395781g.mo6259ad();
        }
    }

    /* renamed from: jX */
    public final void mo1067jX() {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(4)) {
            if (jVar.f395781g.mo5998e() == 1) {
                C146555j jVar2 = this.f395770e;
                C146553h hVar = jVar2.f395782h;
                if (hVar != null) {
                    hVar.mo23147b(true);
                } else {
                    jVar2.f395781g.mo6017x();
                }
            } else if (this.f395770e.f395781g.mo5998e() == 4) {
                C2646bh bhVar = this.f395770e.f395781g;
                bhVar.mo5973A(bhVar.mo5996c(), -9223372036854775807L);
            }
            C2646bh bhVar2 = this.f395770e.f395781g;
            bhVar2.getClass();
            bhVar2.mo6260ae();
        }
    }

    /* renamed from: jY */
    public final void mo1068jY(String str, Bundle bundle) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123349h(1024)) {
            jVar.f395782h.mo23149e(str, true);
        }
    }

    /* renamed from: jZ */
    public final void mo1069jZ(String str, Bundle bundle) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123349h(2048)) {
            jVar.f395782h.mo23150f(str, true);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo6236k(C2590aq aqVar, int i) {
    }

    /* renamed from: ka */
    public final void mo1070ka(Uri uri, Bundle bundle) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123349h(8192)) {
            jVar.f395782h.mo23148d(uri, true);
        }
    }

    /* renamed from: kb */
    public final void mo1071kb() {
        C146555j jVar = this.f395770e;
        if (jVar.mo123349h(16384)) {
            jVar.f395782h.mo23147b(false);
        }
    }

    /* renamed from: kc */
    public final void mo1072kc(String str, Bundle bundle) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123349h(32768)) {
            jVar.f395782h.mo23149e(str, false);
        }
    }

    /* renamed from: kd */
    public final void mo1073kd(String str, Bundle bundle) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123349h(65536)) {
            jVar.f395782h.mo23150f(str, false);
        }
    }

    /* renamed from: ke */
    public final void mo1074ke(Uri uri, Bundle bundle) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123349h(131072)) {
            jVar.f395782h.mo23148d(uri, false);
        }
    }

    /* renamed from: kf */
    public final void mo1075kf() {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(8)) {
            jVar.f395781g.mo6261af();
        }
    }

    /* renamed from: kg */
    public final void mo1076kg(long j) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(256)) {
            C2646bh bhVar = jVar.f395781g;
            bhVar.mo5973A(bhVar.mo5996c(), j);
        }
    }

    /* renamed from: kh */
    public final void mo1077kh(float f) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(4194304) && f > 0.0f) {
            C2646bh bhVar = jVar.f395781g;
            bhVar.mo5975C(bhVar.mo6012s().mo6212a(f));
        }
    }

    /* renamed from: ki */
    public final void mo1078ki(int i) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(262144)) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (!(i == 2 || i == 3)) {
                    i2 = 0;
                }
            }
            jVar.f395781g.mo5977E(i2);
        }
    }

    /* renamed from: kj */
    public final void mo1079kj(int i) {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(2097152)) {
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                z = false;
            }
            jVar.f395781g.mo5978F(z);
        }
    }

    /* renamed from: kk */
    public final void mo1080kk() {
        if (this.f395770e.mo123350i(32)) {
            C146555j jVar = this.f395770e;
            jVar.f395783i.mo115934c(jVar.f395781g);
        }
    }

    /* renamed from: kl */
    public final void mo1081kl() {
        if (this.f395770e.mo123350i(16)) {
            C146555j jVar = this.f395770e;
            jVar.f395783i.mo123338e(jVar.f395781g);
        }
    }

    /* renamed from: km */
    public final void mo1082km(long j) {
        if (this.f395770e.mo123350i(4096)) {
            C146555j jVar = this.f395770e;
            jVar.f395783i.mo123339f(jVar.f395781g, j);
        }
    }

    /* renamed from: kn */
    public final void mo1083kn() {
        C146555j jVar = this.f395770e;
        if (jVar.mo123348g(1)) {
            jVar.f395781g.mo5981I();
            C146555j jVar2 = this.f395770e;
            if (jVar2.f395787m) {
                jVar2.f395781g.mo6258ac();
            }
        }
    }

    /* renamed from: ko */
    public final boolean mo1084ko(Intent intent) {
        C146550e eVar;
        C146555j jVar = this.f395770e;
        if (!(jVar.f395781g == null || (eVar = jVar.f395784j) == null)) {
            C69664n.m101061g(intent, "mediaButtonEvent");
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent != null) {
                int keyCode = keyEvent.getKeyCode();
                int action = keyEvent.getAction();
                ((C58970a) C140814av.f382411a.mo56224b()).mo56393w("onMediaButtonEvent keyCode:%d, action%d", keyCode, action);
                C140814av avVar = (C140814av) eVar;
                if (avVar.f382416f && ((C140806an) avVar.f382413c).f382388z == null) {
                    ((C58970a) C140814av.f382411a.mo56226d()).mo56386p("No episode was set - ignoring event.");
                } else if (keyCode == 79 || keyCode == 85) {
                    Instant ofEpochMilli = Instant.ofEpochMilli(avVar.f382415e.mo26870b());
                    if (action == 0) {
                        if (ofEpochMilli.isAfter(avVar.f382417g.f382408b.plus(C140814av.f382412b))) {
                            C140813au auVar = avVar.f382417g;
                            auVar.f382407a++;
                            C46459k.m82829b(avVar.f382414d.mo29164d(auVar, (long) ViewConfiguration.getDoubleTapTimeout(), TimeUnit.MILLISECONDS), "Failed to execute media button runner", new Object[0]);
                        }
                    } else if (action == 1) {
                        C140813au auVar2 = avVar.f382417g;
                        C69664n.m101060f(ofEpochMilli, "currentTime");
                        C69664n.m101061g(ofEpochMilli, "<set-?>");
                        auVar2.f382408b = ofEpochMilli;
                    }
                } else if (action == 0) {
                    if (keyCode == 87) {
                        avVar.f382413c.mo115886h();
                    } else if (keyCode == 88) {
                        avVar.f382413c.mo115890l();
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: kp */
    public final void mo1085kp(String str) {
        if (this.f395770e.f395781g != null) {
            int i = 0;
            int i2 = 0;
            while (i2 < this.f395770e.f395777c.size()) {
                if (!((C146546a) this.f395770e.f395777c.get(i2)).mo23151j(this.f395770e.f395781g, str)) {
                    i2++;
                } else {
                    return;
                }
            }
            while (i < this.f395770e.f395778d.size() && !((C146546a) this.f395770e.f395778d.get(i)).mo23151j(this.f395770e.f395781g, str)) {
                i++;
            }
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6237l(C2593at atVar) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6238m(Metadata metadata) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6239n(boolean z, int i) {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6240o(C2640bb bbVar) {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo6241p(int i) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6242q(int i) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo6243r(C2639ba baVar) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6244s(C2639ba baVar) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6245t(boolean z, int i) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6246u(int i) {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo6247v(C2645bg bgVar, C2645bg bgVar2, int i) {
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6248w() {
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6249x(int i) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6250y() {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo6251z(boolean z) {
    }
}
