package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Base64;
import android.util.Log;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119084i;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119086k;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119091p;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119113e;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8926d.C119120b;
import com.google.android.libraries.p1963i.C23828ac;
import com.google.apps.tiktok.tracing.C47575bz;
import com.google.apps.tiktok.tracing.C47587ck;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.h.a.a.a.ac */
/* compiled from: PG */
public final class C119094ac {

    /* renamed from: a */
    public int f332205a = 0;

    /* renamed from: b */
    final MediaPlayer f332206b = new MediaPlayer();

    /* renamed from: c */
    public int f332207c;

    /* renamed from: d */
    public boolean f332208d;

    /* renamed from: e */
    public int f332209e;

    /* renamed from: f */
    public final ScheduledExecutorService f332210f;

    /* renamed from: g */
    public final List f332211g = new ArrayList();

    /* renamed from: h */
    public boolean f332212h = true;

    /* renamed from: i */
    public float f332213i = 1.0f;

    /* renamed from: j */
    public C119103al f332214j;

    /* renamed from: k */
    public C119093ab f332215k;

    /* renamed from: l */
    public int f332216l;

    /* renamed from: m */
    private final Map f332217m = new HashMap();

    /* renamed from: n */
    private Integer f332218n = null;

    /* renamed from: o */
    private final C119120b f332219o;

    public C119094ac(ScheduledExecutorService scheduledExecutorService, C119120b bVar) {
        this.f332210f = scheduledExecutorService;
        this.f332219o = bVar;
        mo104178e();
    }

    /* renamed from: l */
    private final void m197763l(int i) {
        if (this.f332217m.containsKey(Integer.valueOf(this.f332209e)) && !((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b().isEmpty() && m197770s() && this.f332218n.intValue() < ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b().size() - 1) {
            this.f332218n = Integer.valueOf(this.f332218n.intValue() + 1);
            m197767p(Math.round(((float) (((C119091p) ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b().get(this.f332218n.intValue() + 1)).mo104167f() - ((long) i))) / this.f332213i));
        }
    }

    /* renamed from: m */
    private final void m197764m() {
        for (C119095ad k : this.f332211g) {
            k.mo30723k(2);
        }
    }

    /* renamed from: n */
    private final void m197765n() {
        for (C119095ad g : this.f332211g) {
            g.mo30719g(2);
        }
    }

    /* renamed from: o */
    private final void m197766o(C119091p pVar) {
        C119104am amVar = (C119104am) C119107ap.f332237e.createBuilder();
        int intValue = this.f332218n.intValue();
        amVar.copyOnWrite();
        ((C119107ap) amVar.instance).f332240b = intValue;
        int i = this.f332209e;
        amVar.copyOnWrite();
        ((C119107ap) amVar.instance).f332239a = i;
        C119105an anVar = (C119105an) C119106ao.f332233c.createBuilder();
        int c = pVar.mo104163c();
        anVar.copyOnWrite();
        ((C119106ao) anVar.instance).f332235a = c;
        int a = pVar.mo104161a();
        anVar.copyOnWrite();
        ((C119106ao) anVar.instance).f332236b = a;
        amVar.copyOnWrite();
        C119106ao aoVar = (C119106ao) anVar.build();
        aoVar.getClass();
        ((C119107ap) amVar.instance).f332241c = aoVar;
        C119105an anVar2 = (C119105an) C119106ao.f332233c.createBuilder();
        int d = pVar.mo104164d();
        anVar2.copyOnWrite();
        ((C119106ao) anVar2.instance).f332235a = d;
        int b = pVar.mo104162b();
        anVar2.copyOnWrite();
        ((C119106ao) anVar2.instance).f332236b = b;
        amVar.copyOnWrite();
        C119106ao aoVar2 = (C119106ao) anVar2.build();
        aoVar2.getClass();
        ((C119107ap) amVar.instance).f332242d = aoVar2;
        C119107ap apVar = (C119107ap) amVar.build();
        for (C119095ad e : this.f332211g) {
            e.mo30717e(apVar);
        }
    }

    /* renamed from: p */
    private final void m197767p(int i) {
        Log.d("Player", "#scheduleNotifyHighlightChanged: " + i + "ms");
        ((C23828ac) this.f332210f).schedule(new C119141w(this), (long) i, TimeUnit.MILLISECONDS);
    }

    /* renamed from: q */
    private final synchronized void m197768q() {
        Log.d("Player", "startPlaying");
        if (this.f332217m.isEmpty()) {
            Log.e("Player", "startPlaying() was called while paragraphsAudios=null");
            return;
        }
        C119084i a = ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104140a();
        try {
            MediaPlayer mediaPlayer = this.f332206b;
            mediaPlayer.reset();
            mediaPlayer.setDataSource(String.format("data:audio/%s;base64,%s", new Object[]{a.mo104132c(), Base64.encodeToString(a.mo104130a().mo59174N(), 0)}));
            int i = this.f332205a;
            C119120b bVar = this.f332219o;
            mediaPlayer.setOnCompletionListener(new C47587ck(bVar.f332258a, new C119135q(this, i)));
            C119120b bVar2 = this.f332219o;
            mediaPlayer.setOnErrorListener(new C47575bz(bVar2.f332258a, new C119136r(this, i)));
            mediaPlayer.prepare();
            mediaPlayer.seekTo(0);
            this.f332206b.start();
            this.f332208d = true;
            this.f332216l = 1;
            mo104175b();
            mo104181h();
        } catch (Exception e) {
            Log.e("Player", "startPlaying: ", e);
            this.f332216l = 2;
            for (C119095ad adVar : this.f332211g) {
                adVar.mo30723k(3);
                adVar.mo30718f(new C119113e("Could not start playing", e), 2);
            }
        }
    }

    /* renamed from: r */
    private final synchronized void m197769r() {
        Log.d("Player", "waitingForDownloadPause");
        if (this.f332216l == 1) {
            this.f332206b.pause();
        }
        this.f332216l = 3;
        for (C119095ad k : this.f332211g) {
            k.mo30723k(1);
        }
    }

    /* renamed from: s */
    private final boolean m197770s() {
        Integer num = this.f332218n;
        return (num == null || num.intValue() == Integer.MAX_VALUE || this.f332218n.intValue() == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: t */
    private final synchronized boolean m197771t() {
        boolean z;
        z = true;
        if (this.f332216l == 1) {
            this.f332206b.pause();
        } else {
            z = false;
        }
        this.f332216l = 2;
        return z;
    }

    /* renamed from: u */
    private final void m197772u(int i, boolean z) {
        if (this.f332215k != null) {
            if (z) {
                m197769r();
            }
            C119103al alVar = this.f332214j;
            if (alVar == null) {
                Log.i("Player", "Unable to request buffering since the player isn't fully initialized.");
            } else {
                this.f332215k.mo104173s(alVar, i);
            }
        } else {
            throw new RuntimeException("Buffering isn't supported for player. Have you called setbufferingProvider?");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo104174a(C119095ad adVar) {
        this.f332211g.add(adVar);
    }

    /* renamed from: b */
    public final void mo104175b() {
        PlaybackParams playbackParams = new PlaybackParams();
        playbackParams.allowDefaults();
        playbackParams.setSpeed(this.f332213i);
        try {
            this.f332206b.setPlaybackParams(playbackParams);
        } catch (IllegalStateException e) {
            Log.w("Player", "Could not set play speed on MediaPlayer", e);
        }
    }

    /* renamed from: c */
    public final synchronized void mo104176c() {
        Log.d("Player", "doExplicitPause");
        if (m197771t()) {
            m197764m();
        }
    }

    /* renamed from: d */
    public final synchronized void mo104177d() {
        Log.d("Player", "doPlay");
        if (this.f332216l == 2) {
            if (this.f332208d) {
                this.f332206b.start();
                this.f332216l = 1;
                mo104175b();
                m197765n();
                mo104181h();
            } else if (this.f332217m.containsKey(Integer.valueOf(this.f332209e))) {
                m197768q();
                m197765n();
            } else {
                int i = this.f332209e;
                Log.d("Player", "No audio for paragraph " + i + ". buffering...");
                m197772u(this.f332209e, true);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo104178e() {
        Log.d("Player", "doReset");
        mo104180g();
        this.f332207c = 0;
        this.f332218n = null;
        this.f332217m.clear();
        this.f332205a++;
        this.f332206b.reset();
        Log.d("Player", "doReset done");
    }

    /* renamed from: f */
    public final synchronized void mo104179f(Map map) {
        this.f332217m.putAll(map);
        if (this.f332216l == 3 && this.f332217m.containsKey(Integer.valueOf(this.f332209e))) {
            mo104182i();
            m197768q();
            for (C119095ad g : this.f332211g) {
                g.mo30719g(1);
            }
        }
    }

    /* renamed from: g */
    public final void mo104180g() {
        if (this.f332206b.isPlaying()) {
            this.f332206b.stop();
        }
        this.f332209e = 0;
        this.f332218n = 0;
        this.f332208d = false;
        if (this.f332216l != 2) {
            m197764m();
        }
        this.f332216l = 2;
    }

    /* renamed from: h */
    public final void mo104181h() {
        if (!this.f332212h || this.f332211g.isEmpty() || this.f332216l != 1 || !this.f332217m.containsKey(Integer.valueOf(this.f332209e)) || ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b().isEmpty()) {
            Log.d("Player", "notifyHighlightChanged skipped");
            return;
        }
        int currentPosition = this.f332206b.getCurrentPosition();
        Log.d("Player", "notifyHighlightChanged: currentMediaPlayerPosition= " + currentPosition);
        if (!m197770s()) {
            Integer num = null;
            if (this.f332217m.containsKey(Integer.valueOf(this.f332209e))) {
                C58485gu b = ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b();
                if (!b.isEmpty()) {
                    long j = (long) currentPosition;
                    if (j <= ((C119091p) C58557jl.m90131l(b)).mo104165e()) {
                        if (j >= ((C119091p) b.get(0)).mo104167f()) {
                            int size = b.size() - 1;
                            int i = 0;
                            while (true) {
                                if (size < i) {
                                    Log.w("Player", "#findWordTimepointIndex = null (should never happen)");
                                    break;
                                }
                                int i2 = (i + size) / 2;
                                int i3 = ((C119091p) b.get(i2)).mo104171i(j) - 1;
                                if (i3 == 0) {
                                    num = Integer.valueOf(i2);
                                    break;
                                } else if (i3 != 2) {
                                    i = i2 + 1;
                                } else {
                                    size = i2 - 1;
                                }
                            }
                        } else {
                            num = Integer.valueOf(LinearLayoutManager.INVALID_OFFSET);
                        }
                    } else {
                        num = Integer.MAX_VALUE;
                    }
                }
            }
            this.f332218n = num;
            if (num != null && num.intValue() != Integer.MAX_VALUE) {
                if (this.f332218n.intValue() == Integer.MIN_VALUE) {
                    int round = Math.round(((float) (((C119091p) ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b().get(0)).mo104167f() - ((long) currentPosition))) / this.f332213i);
                    Log.d("Player", "#notifyHighlightChanged: before word");
                    m197767p(round);
                    return;
                }
            } else {
                return;
            }
        }
        C119091p pVar = (C119091p) ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b().get(this.f332218n.intValue());
        if (this.f332218n == null || pVar == null) {
            Log.d("Player", "#notifyHighlightChanged: next word or index null");
            m197767p(50);
        } else if (pVar.mo104171i((long) currentPosition) == 1) {
            m197766o(pVar);
            m197763l(currentPosition);
        } else if (m197770s()) {
            m197766o((C119091p) ((C119086k) this.f332217m.get(Integer.valueOf(this.f332209e))).mo104141b().get(this.f332218n.intValue()));
            m197763l(currentPosition);
        } else {
            Log.d("Player", "#notifyHighlightChanged: no word");
            m197767p(50);
        }
    }

    /* renamed from: i */
    public final void mo104182i() {
        if (this.f332217m.containsKey(Integer.valueOf(this.f332209e))) {
            for (C119095ad b : this.f332211g) {
                b.mo30714b(this.f332209e);
            }
        }
    }

    /* renamed from: j */
    public final synchronized void mo104183j(int i) {
        int i2;
        Log.d("Player", "onParagraphFinished");
        if (i != this.f332205a) {
            Log.w("Player", "onParagraphFinished for the wrong session. Ignoring.");
            return;
        }
        this.f332208d = false;
        int i3 = this.f332209e + 1;
        this.f332209e = i3;
        this.f332218n = null;
        if (i3 == this.f332207c) {
            Log.i("Player", "Done reading article");
            this.f332216l = 2;
            for (C119095ad a : this.f332211g) {
                a.mo30713a();
            }
            return;
        }
        long j = 0;
        if (!this.f332217m.isEmpty()) {
            int i4 = this.f332209e + 1;
            while (true) {
                Map map = this.f332217m;
                Integer valueOf = Integer.valueOf(i4);
                if (!map.containsKey(valueOf)) {
                    break;
                }
                i4++;
                C58485gu b = ((C119086k) this.f332217m.get(valueOf)).mo104141b();
                if (!b.isEmpty()) {
                    j += ((C119091p) C58557jl.m90131l(b)).mo104165e();
                }
            }
        }
        if (j <= 30000) {
            if (this.f332217m.isEmpty()) {
                i2 = 0;
            } else {
                i2 = this.f332209e;
                while (i2 < this.f332207c && this.f332217m.containsKey(Integer.valueOf(i2))) {
                    i2++;
                }
                if (i2 == this.f332207c) {
                    i2 = -1;
                }
            }
            if (i2 != -1) {
                m197772u(i2, false);
            }
        }
        mo104182i();
        if (this.f332217m.containsKey(Integer.valueOf(this.f332209e))) {
            if (this.f332216l != 2) {
                m197768q();
                return;
            }
        }
        Log.d("Player", "onParagraphFinished: Waiting");
        if (this.f332216l != 2) {
            m197769r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized void mo104184k(C119095ad adVar) {
        this.f332211g.remove(adVar);
    }
}
