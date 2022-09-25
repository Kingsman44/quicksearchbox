package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10643a.C141472a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10643a.C141473b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10643a.C141474c;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141478c;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10645c.C141481b;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.c */
/* compiled from: PG */
public final class C141479c implements TimeAnimator.TimeListener, C141493o {

    /* renamed from: a */
    public final LogoView f384035a;

    /* renamed from: b */
    public final C141477b f384036b;

    /* renamed from: c */
    public final C141481b f384037c;

    /* renamed from: d */
    public final Paint f384038d;

    /* renamed from: e */
    public final C141494p f384039e;

    /* renamed from: f */
    public int f384040f = 0;

    /* renamed from: g */
    public int f384041g = PrivateKeyType.INVALID;

    /* renamed from: h */
    public float f384042h;

    /* renamed from: i */
    private final TimeAnimator f384043i;

    /* renamed from: j */
    private final AnimatorSet f384044j;

    /* renamed from: k */
    private final Paint f384045k;

    /* renamed from: l */
    private boolean f384046l = true;

    public C141479c(LogoView logoView) {
        this.f384035a = logoView;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f384044j = animatorSet;
        this.f384037c = new C141481b();
        Paint paint = new Paint();
        this.f384038d = paint;
        Paint paint2 = new Paint();
        this.f384045k = paint2;
        C141477b bVar = new C141477b(m229614g(), m229614g(), m229614g(), m229614g(), m229614g(), m229614g(), new C141478c(new C141472a(), new C141473b(80.0f, 0.0f, 0.0f)), new C141473b(1000.0f, 0.0f, 0.0f));
        this.f384036b = bVar;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f384043i = timeAnimator;
        this.f384039e = new C141494p(bVar, new TimeAnimator(), this, new C141495q());
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, PrivateKeyType.INVALID});
        ofInt.setDuration(100);
        ofInt.addUpdateListener(new C141471a(this, ofInt));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{PrivateKeyType.INVALID, 0});
        ofInt2.setDuration(100);
        ofInt2.addUpdateListener(new C141475b(this, ofInt2));
        animatorSet.playSequentially(new Animator[]{ofInt, ofInt2});
        paint.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        timeAnimator.setTimeListener(this);
    }

    /* renamed from: g */
    private static C141476a m229614g() {
        C141474c cVar = new C141474c(80.0f, 0.0f, 0.0f);
        C141474c cVar2 = new C141474c(320.0f, 0.0f, 0.0f);
        return new C141476a(cVar, new C141472a(), new C141474c(80.0f, 0.0f, 0.0f), cVar2, new C141474c(160.0f, 0.0f, 0.0f), new C141473b(1000.0f, 0.0f, 0.0f), new C141473b(160.0f, 0.0f, 0.0f), new C141473b(160.0f, 0.0f, 0.0f), new C141473b(320.0f, 0.0f, 0.0f));
    }

    /* renamed from: a */
    public final float mo116491a() {
        return (float) ((this.f384035a.getHeight() - this.f384035a.getPaddingTop()) - this.f384035a.getPaddingBottom());
    }

    /* renamed from: b */
    public final float mo116492b() {
        return (float) ((this.f384035a.getWidth() - this.f384035a.getPaddingLeft()) - this.f384035a.getPaddingRight());
    }

    /* renamed from: c */
    public final void mo116493c() {
        if (!this.f384043i.isStarted() && this.f384046l) {
            this.f384043i.start();
        }
    }

    /* renamed from: d */
    public final void mo116494d(boolean z) {
        if (this.f384046l != z) {
            this.f384046l = z;
            if (z) {
                if (!(this.f384040f == 255 && this.f384041g == 0)) {
                    this.f384039e.mo116506b();
                }
                this.f384043i.setTimeListener(this);
                return;
            }
            this.f384044j.cancel();
            this.f384043i.setTimeListener((TimeAnimator.TimeListener) null);
            this.f384043i.end();
            this.f384039e.f384070a.pause();
        }
    }

    /* renamed from: e */
    public final void mo116495e() {
        C141477b bVar = this.f384036b;
        this.f384042h = Math.min(mo116492b() / bVar.f384028h, mo116491a() / bVar.f384029i);
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        for (long min = Math.min(100, j2); min > 0; min -= 10) {
            C141477b bVar = this.f384036b;
            long min2 = Math.min(min, 10);
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C141476a aVar = (C141476a) it.next();
                aVar.f384010a.f384006a.mo116479d(min2);
                aVar.f384011b.f383996a.f384006a.mo116479d(min2);
                aVar.f384012c.f384006a.mo116479d(min2);
                aVar.f384013d.f384006a.mo116479d(min2);
                aVar.f384014e.f384006a.mo116479d(min2);
                aVar.f384015f.mo116479d(min2);
                aVar.f384017h.mo116479d(min2);
                aVar.f384018i.mo116479d(min2);
                aVar.f384016g.mo116479d(min2);
            }
            C141478c cVar = bVar.f384026f;
            if (cVar.f384034c) {
                cVar.f384033b.mo116479d(min2);
                cVar.f384032a.f383996a.f384006a.mo116477b(cVar.f384032a.f383996a.f384006a.f383998b + (cVar.f384033b.f383998b * (Math.min((float) min2, 50.0f) / 1000.0f)));
            } else {
                cVar.f384032a.f383996a.f384006a.mo116479d(min2);
            }
            bVar.f384027g.mo116479d(min2);
        }
        C141477b bVar2 = this.f384036b;
        Iterator it2 = bVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                C141476a aVar2 = (C141476a) it2.next();
                if (aVar2.f384010a.f384006a.f384000d) {
                    if (aVar2.f384011b.f383996a.f384006a.f384000d) {
                        if (aVar2.f384012c.f384006a.f384000d) {
                            if (aVar2.f384013d.f384006a.f384000d) {
                                if (aVar2.f384014e.f384006a.f384000d) {
                                    if (aVar2.f384015f.f384000d) {
                                        if (aVar2.f384017h.f384000d) {
                                            if (aVar2.f384018i.f384000d) {
                                                if (!aVar2.f384016g.f384000d) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                C141478c cVar2 = bVar2.f384026f;
                if (!cVar2.f384034c && cVar2.f384032a.f383996a.f384006a.f384000d && bVar2.f384027g.f384000d) {
                    this.f384043i.end();
                }
            }
        }
        this.f384044j.cancel();
        this.f384041g = PrivateKeyType.INVALID;
        this.f384040f = 0;
        this.f384035a.invalidate();
    }

    /* renamed from: f */
    public final void mo116496f(int i) {
        C141492n nVar;
        C141494p pVar = this.f384039e;
        if (!((i == pVar.f384079j && pVar.f384080k == 0) || i == pVar.f384080k)) {
            pVar.f384080k = i;
            pVar.f384073d.clear();
            C141495q qVar = pVar.f384072c;
            int c = C141495q.m229666c(pVar.f384079j);
            int c2 = C141495q.m229666c(pVar.f384080k);
            if (c != c2) {
                Deque a = pVar.mo116505a(c);
                Deque<Integer> a2 = pVar.mo116505a(c2);
                while (!a.isEmpty() && !a2.isEmpty() && ((Integer) a.getFirst()).equals(a2.getFirst())) {
                    a.removeFirst();
                    a2.removeFirst();
                }
                Iterator descendingIterator = a.descendingIterator();
                while (descendingIterator.hasNext()) {
                    int intValue = ((Integer) descendingIterator.next()).intValue();
                    ArrayDeque arrayDeque = pVar.f384073d;
                    C141495q qVar2 = pVar.f384072c;
                    if (intValue != 0) {
                        if (intValue == 1) {
                            nVar = C141492n.f384064d;
                        } else if (intValue == 2) {
                            nVar = C141492n.f384067g;
                        } else if (intValue != 3) {
                            throw new IllegalArgumentException("bad state group: " + intValue);
                        }
                        arrayDeque.addLast(nVar);
                    }
                    nVar = C141492n.f384061a;
                    arrayDeque.addLast(nVar);
                }
                for (Integer intValue2 : a2) {
                    int intValue3 = intValue2.intValue();
                    ArrayDeque arrayDeque2 = pVar.f384073d;
                    C141495q qVar3 = pVar.f384072c;
                    arrayDeque2.addLast(C141495q.m229664a(intValue3));
                }
                if (pVar.f384078i == pVar.f384073d.getFirst()) {
                    pVar.f384073d.pollFirst();
                }
            }
            ArrayDeque arrayDeque3 = pVar.f384073d;
            C141495q qVar4 = pVar.f384072c;
            arrayDeque3.addLast(C141495q.m229665b(pVar.f384080k));
            while (!pVar.f384073d.isEmpty()) {
                pVar.mo116507c((C141492n) pVar.f384073d.removeFirst());
                pVar.f384077h = 0;
                pVar.f384076g = 0;
                pVar.f384078i.mo116503c(0, Long.MAX_VALUE, pVar.f384071b);
                C141477b bVar = pVar.f384071b;
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    C141476a aVar = (C141476a) it.next();
                    C141473b bVar2 = aVar.f384010a.f384006a;
                    bVar2.mo116477b(bVar2.f383997a);
                    C141473b bVar3 = aVar.f384011b.f383996a.f384006a;
                    bVar3.mo116477b(bVar3.f383997a);
                    C141473b bVar4 = aVar.f384012c.f384006a;
                    bVar4.mo116477b(bVar4.f383997a);
                    C141473b bVar5 = aVar.f384013d.f384006a;
                    bVar5.mo116477b(bVar5.f383997a);
                    C141473b bVar6 = aVar.f384014e.f384006a;
                    bVar6.mo116477b(bVar6.f383997a);
                    C141473b bVar7 = aVar.f384015f;
                    bVar7.mo116477b(bVar7.f383997a);
                    C141473b bVar8 = aVar.f384017h;
                    bVar8.mo116477b(bVar8.f383997a);
                    C141473b bVar9 = aVar.f384018i;
                    bVar9.mo116477b(bVar9.f383997a);
                    C141473b bVar10 = aVar.f384016g;
                    bVar10.mo116477b(bVar10.f383997a);
                }
                C141478c cVar = bVar.f384026f;
                C141473b bVar11 = cVar.f384033b;
                bVar11.mo116477b(bVar11.f383997a);
                C141473b bVar12 = cVar.f384032a.f383996a.f384006a;
                bVar12.mo116477b(bVar12.f383997a);
                C141473b bVar13 = bVar.f384027g;
                bVar13.mo116477b(bVar13.f383997a);
            }
            pVar.f384081l = false;
        }
        if (this.f384046l) {
            this.f384039e.mo116506b();
        } else {
            this.f384039e.f384070a.pause();
        }
    }
}
