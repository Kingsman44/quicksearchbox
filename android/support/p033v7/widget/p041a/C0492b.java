package android.support.p033v7.widget.p041a;

import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* renamed from: android.support.v7.widget.a.b */
/* compiled from: PG */
final class C0492b implements C0657fs {

    /* renamed from: a */
    final /* synthetic */ C0502l f1977a;

    public C0492b(C0502l lVar) {
        this.f1977a = lVar;
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        this.f1977a.f2021q.f6015a.f6014a.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0499i iVar = null;
        if (actionMasked == 0) {
            this.f1977a.f2013i = motionEvent.getPointerId(0);
            this.f1977a.f2007c = motionEvent.getX();
            this.f1977a.f2008d = motionEvent.getY();
            this.f1977a.mo2465h();
            C0502l lVar = this.f1977a;
            if (lVar.f2006b == null) {
                if (!lVar.f2016l.isEmpty()) {
                    View c = lVar.mo2459c(motionEvent);
                    int size = lVar.f2016l.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C0499i iVar2 = (C0499i) lVar.f2016l.get(size);
                        if (iVar2.f1992h.itemView == c) {
                            iVar = iVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (iVar != null) {
                    C0502l lVar2 = this.f1977a;
                    lVar2.f2007c -= iVar.f1996l;
                    lVar2.f2008d -= iVar.f1997m;
                    lVar2.mo2462f(iVar.f1992h, true);
                    if (this.f1977a.f2005a.remove(iVar.f1992h.itemView)) {
                        C0502l lVar3 = this.f1977a;
                        lVar3.f2014j.mo2441d(lVar3.f2017m, iVar.f1992h);
                    }
                    this.f1977a.mo2467j(iVar.f1992h, iVar.f1993i);
                    C0502l lVar4 = this.f1977a;
                    lVar4.mo2469l(motionEvent, lVar4.f2015k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            C0502l lVar5 = this.f1977a;
            lVar5.f2013i = -1;
            lVar5.mo2467j((C0673gh) null, 0);
        } else {
            int i = this.f1977a.f2013i;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                this.f1977a.mo2461e(actionMasked, motionEvent, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker = this.f1977a.f2019o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.f1977a.f2006b != null;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            this.f1977a.mo2467j((C0673gh) null, 0);
        }
    }

    public final void onTouchEvent$ar$ds(MotionEvent motionEvent) {
        this.f1977a.f2021q.f6015a.f6014a.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = this.f1977a.f2019o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.f1977a.f2013i != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(this.f1977a.f2013i);
            if (findPointerIndex >= 0) {
                this.f1977a.mo2461e(actionMasked, motionEvent, findPointerIndex);
            }
            C0502l lVar = this.f1977a;
            C0673gh ghVar = lVar.f2006b;
            if (ghVar != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = lVar.f2019o;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            C0502l lVar2 = this.f1977a;
                            if (pointerId == lVar2.f2013i) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                lVar2.f2013i = motionEvent.getPointerId(i);
                                C0502l lVar3 = this.f1977a;
                                lVar3.mo2469l(motionEvent, lVar3.f2015k, actionIndex);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        lVar.mo2469l(motionEvent, lVar.f2015k, findPointerIndex);
                        this.f1977a.mo2463g(ghVar);
                        C0502l lVar4 = this.f1977a;
                        lVar4.f2017m.removeCallbacks(lVar4.f2018n);
                        this.f1977a.f2018n.run();
                        this.f1977a.f2017m.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                this.f1977a.mo2467j((C0673gh) null, 0);
                this.f1977a.f2013i = -1;
            }
        }
    }
}
