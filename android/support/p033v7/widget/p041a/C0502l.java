package android.support.p033v7.widget.p041a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0655fq;
import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.p098j.C2100o;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: android.support.v7.widget.a.l */
/* compiled from: PG */
public class C0502l extends C0648fj implements C0655fq {

    /* renamed from: A */
    private C0497g f2003A;

    /* renamed from: B */
    private final C0657fs f2004B = new C0492b(this);

    /* renamed from: a */
    final List f2005a = new ArrayList();

    /* renamed from: b */
    C0673gh f2006b = null;

    /* renamed from: c */
    float f2007c;

    /* renamed from: d */
    float f2008d;

    /* renamed from: e */
    float f2009e;

    /* renamed from: f */
    float f2010f;

    /* renamed from: g */
    public float f2011g;

    /* renamed from: h */
    public float f2012h;

    /* renamed from: i */
    int f2013i = -1;

    /* renamed from: j */
    final C0496f f2014j;

    /* renamed from: k */
    int f2015k;

    /* renamed from: l */
    final List f2016l = new ArrayList();

    /* renamed from: m */
    RecyclerView f2017m;

    /* renamed from: n */
    final Runnable f2018n = new C0491a(this);

    /* renamed from: o */
    VelocityTracker f2019o;

    /* renamed from: p */
    View f2020p = null;

    /* renamed from: q */
    C2100o f2021q;

    /* renamed from: r */
    public Rect f2022r;

    /* renamed from: s */
    public long f2023s;

    /* renamed from: t */
    private final float[] f2024t = new float[2];

    /* renamed from: u */
    private float f2025u;

    /* renamed from: v */
    private float f2026v;

    /* renamed from: w */
    private int f2027w = 0;

    /* renamed from: x */
    private int f2028x;

    /* renamed from: y */
    private List f2029y;

    /* renamed from: z */
    private List f2030z;

    public C0502l(C0496f fVar) {
        this.f2014j = fVar;
    }

    /* renamed from: m */
    private final void m1869m(float[] fArr) {
        if ((this.f2015k & 12) != 0) {
            fArr[0] = (this.f2011g + this.f2009e) - ((float) this.f2006b.itemView.getLeft());
        } else {
            fArr[0] = this.f2006b.itemView.getTranslationX();
        }
        if ((this.f2015k & 3) != 0) {
            fArr[1] = (this.f2012h + this.f2010f) - ((float) this.f2006b.itemView.getTop());
        } else {
            fArr[1] = this.f2006b.itemView.getTranslationY();
        }
    }

    /* renamed from: n */
    private final void m1870n() {
        VelocityTracker velocityTracker = this.f2019o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2019o = null;
        }
    }

    /* renamed from: o */
    private static boolean m1871o(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: p */
    private final int m1872p(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = this.f2009e > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f2019o;
        if (velocityTracker != null && this.f2013i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f2026v);
            float xVelocity = this.f2019o.getXVelocity(this.f2013i);
            float yVelocity = this.f2019o.getYVelocity(this.f2013i);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.f2025u && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float width = ((float) this.f2017m.getWidth()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.f2009e) <= width) {
            return 0;
        }
        return i3;
    }

    /* renamed from: q */
    private final int m1873q(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = this.f2010f > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f2019o;
        if (velocityTracker != null && this.f2013i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f2026v);
            float xVelocity = this.f2019o.getXVelocity(this.f2013i);
            float yVelocity = this.f2019o.getYVelocity(this.f2013i);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.f2025u && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float height = ((float) this.f2017m.getHeight()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.f2010f) <= height) {
            return 0;
        }
        return i3;
    }

    /* renamed from: a */
    public final void mo2457a(View view) {
    }

    /* renamed from: b */
    public final void mo2458b(View view) {
        mo2466i(view);
        C0673gh childViewHolder = this.f2017m.getChildViewHolder(view);
        if (childViewHolder != null) {
            C0673gh ghVar = this.f2006b;
            if (ghVar == null || childViewHolder != ghVar) {
                mo2462f(childViewHolder, false);
                if (this.f2005a.remove(childViewHolder.itemView)) {
                    this.f2014j.mo2441d(this.f2017m, childViewHolder);
                    return;
                }
                return;
            }
            mo2467j((C0673gh) null, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final View mo2459c(MotionEvent motionEvent) {
        C0499i iVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C0673gh ghVar = this.f2006b;
        if (ghVar != null) {
            View view2 = ghVar.itemView;
            if (m1871o(view2, x, y, this.f2011g + this.f2009e, this.f2012h + this.f2010f)) {
                return view2;
            }
        }
        int size = this.f2016l.size();
        do {
            size--;
            if (size < 0) {
                return this.f2017m.findChildViewUnder(x, y);
            }
            iVar = (C0499i) this.f2016l.get(size);
            view = iVar.f1992h.itemView;
        } while (!m1871o(view, x, y, iVar.f1996l, iVar.f1997m));
        return view;
    }

    /* renamed from: d */
    public final void mo2460d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2017m;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f2017m.removeOnItemTouchListener(this.f2004B);
                this.f2017m.removeOnChildAttachStateChangeListener(this);
                int size = this.f2016l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C0499i iVar = (C0499i) this.f2016l.get(0);
                    iVar.f1994j.cancel();
                    this.f2014j.mo2441d(this.f2017m, iVar.f1992h);
                }
                this.f2016l.clear();
                this.f2020p = null;
                m1870n();
                C0497g gVar = this.f2003A;
                if (gVar != null) {
                    gVar.f1985a = false;
                    this.f2003A = null;
                }
                if (this.f2021q != null) {
                    this.f2021q = null;
                }
            }
            this.f2017m = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f2025u = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.f2026v = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.f2028x = ViewConfiguration.get(this.f2017m.getContext()).getScaledTouchSlop();
                this.f2017m.addItemDecoration$ar$ds(this);
                this.f2017m.mOnItemTouchListeners.add(this.f2004B);
                this.f2017m.addOnChildAttachStateChangeListener(this);
                this.f2003A = new C0497g(this);
                this.f2021q = new C2100o(this.f2017m.getContext(), this.f2003A, (Handler) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo2461e(int i, MotionEvent motionEvent, int i2) {
        int l;
        View c;
        if (this.f2006b == null && i == 2 && this.f2027w != 2 && this.f2014j.mo2442e()) {
            RecyclerView recyclerView = this.f2017m;
            if (recyclerView.mScrollState != 1) {
                C0653fo foVar = recyclerView.mLayout;
                int i3 = this.f2013i;
                C0673gh ghVar = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex);
                    float f = this.f2007c;
                    float y = motionEvent.getY(findPointerIndex);
                    float f2 = this.f2008d;
                    float abs = Math.abs(x - f);
                    float abs2 = Math.abs(y - f2);
                    float f3 = (float) this.f2028x;
                    if ((abs >= f3 || abs2 >= f3) && ((abs <= abs2 || !foVar.canScrollHorizontally()) && ((abs2 <= abs || !foVar.canScrollVertically()) && (c = mo2459c(motionEvent)) != null))) {
                        ghVar = this.f2017m.getChildViewHolder(c);
                    }
                }
                if (ghVar != null && (l = (this.f2014j.mo2449l(this.f2017m) >> 8) & PrivateKeyType.INVALID) != 0) {
                    float x2 = motionEvent.getX(i2);
                    float y2 = motionEvent.getY(i2);
                    float f4 = x2 - this.f2007c;
                    float f5 = y2 - this.f2008d;
                    float abs3 = Math.abs(f4);
                    float abs4 = Math.abs(f5);
                    float f6 = (float) this.f2028x;
                    if (abs3 >= f6 || abs4 >= f6) {
                        if (abs3 > abs4) {
                            if (f4 < 0.0f && (l & 4) == 0) {
                                return;
                            }
                            if (f4 > 0.0f && (l & 8) == 0) {
                                return;
                            }
                        } else if (f5 < 0.0f && (l & 1) == 0) {
                            return;
                        } else {
                            if (f5 > 0.0f && (l & 2) == 0) {
                                return;
                            }
                        }
                        this.f2010f = 0.0f;
                        this.f2009e = 0.0f;
                        this.f2013i = motionEvent.getPointerId(0);
                        mo2467j(ghVar, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo2462f(C0673gh ghVar, boolean z) {
        C0499i iVar;
        int size = this.f2016l.size();
        do {
            size--;
            if (size >= 0) {
                iVar = (C0499i) this.f2016l.get(size);
            } else {
                return;
            }
        } while (iVar.f1992h != ghVar);
        iVar.f1998n |= z;
        if (!iVar.f1999o) {
            iVar.f1994j.cancel();
        }
        this.f2016l.remove(size);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo2463g(C0673gh ghVar) {
        List list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        C0673gh ghVar2 = ghVar;
        if (!this.f2017m.isLayoutRequested() && this.f2027w == 2) {
            int i3 = (int) (this.f2011g + this.f2009e);
            int i4 = (int) (this.f2012h + this.f2010f);
            if (((float) Math.abs(i4 - ghVar2.itemView.getTop())) >= ((float) ghVar2.itemView.getHeight()) * 0.5f || ((float) Math.abs(i3 - ghVar2.itemView.getLeft())) >= ((float) ghVar2.itemView.getWidth()) * 0.5f) {
                List list2 = this.f2029y;
                if (list2 == null) {
                    this.f2029y = new ArrayList();
                    this.f2030z = new ArrayList();
                } else {
                    list2.clear();
                    this.f2030z.clear();
                }
                int round = Math.round(this.f2011g + this.f2009e);
                int round2 = Math.round(this.f2012h + this.f2010f);
                int width = ghVar2.itemView.getWidth() + round;
                int height = ghVar2.itemView.getHeight() + round2;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                C0653fo foVar = this.f2017m.mLayout;
                int childCount = foVar.getChildCount();
                int i7 = 0;
                while (i7 < childCount) {
                    View childAt = foVar.getChildAt(i7);
                    if (childAt != ghVar2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                        C0673gh childViewHolder = this.f2017m.getChildViewHolder(childAt);
                        int abs5 = Math.abs(i5 - ((childAt.getLeft() + childAt.getRight()) / 2));
                        int abs6 = Math.abs(i6 - ((childAt.getTop() + childAt.getBottom()) / 2));
                        int i8 = (abs5 * abs5) + (abs6 * abs6);
                        int size = this.f2029y.size();
                        i2 = round;
                        i = round2;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size) {
                            int i11 = size;
                            if (i8 <= ((Integer) this.f2030z.get(i9)).intValue()) {
                                break;
                            }
                            i10++;
                            i9++;
                            size = i11;
                        }
                        this.f2029y.add(i10, childViewHolder);
                        this.f2030z.add(i10, Integer.valueOf(i8));
                    } else {
                        i2 = round;
                        i = round2;
                    }
                    i7++;
                    round = i2;
                    round2 = i;
                }
                List list3 = this.f2029y;
                if (list3.size() != 0) {
                    int width2 = ghVar2.itemView.getWidth() + i3;
                    int height2 = ghVar2.itemView.getHeight() + i4;
                    int left2 = i3 - ghVar2.itemView.getLeft();
                    int top2 = i4 - ghVar2.itemView.getTop();
                    int size2 = list3.size();
                    C0673gh ghVar3 = null;
                    int i12 = -1;
                    int i13 = 0;
                    while (i13 < size2) {
                        C0673gh ghVar4 = (C0673gh) list3.get(i13);
                        if (left2 <= 0 || (right = ghVar4.itemView.getRight() - width2) >= 0) {
                            list = list3;
                        } else {
                            list = list3;
                            if (ghVar4.itemView.getRight() > ghVar2.itemView.getRight() && (abs4 = Math.abs(right)) > i12) {
                                i12 = abs4;
                                ghVar3 = ghVar4;
                            }
                        }
                        if (left2 < 0 && (left = ghVar4.itemView.getLeft() - i3) > 0 && ghVar4.itemView.getLeft() < ghVar2.itemView.getLeft() && (abs3 = Math.abs(left)) > i12) {
                            i12 = abs3;
                            ghVar3 = ghVar4;
                        }
                        if (top2 < 0 && (top = ghVar4.itemView.getTop() - i4) > 0 && ghVar4.itemView.getTop() < ghVar2.itemView.getTop() && (abs2 = Math.abs(top)) > i12) {
                            i12 = abs2;
                            ghVar3 = ghVar4;
                        }
                        if (top2 > 0 && (bottom = ghVar4.itemView.getBottom() - height2) < 0 && ghVar4.itemView.getBottom() > ghVar2.itemView.getBottom() && (abs = Math.abs(bottom)) > i12) {
                            i12 = abs;
                            ghVar3 = ghVar4;
                        }
                        i13++;
                        list3 = list;
                    }
                    if (ghVar3 == null) {
                        this.f2029y.clear();
                        this.f2030z.clear();
                        return;
                    }
                    int absoluteAdapterPosition = ghVar3.getAbsoluteAdapterPosition();
                    ghVar.getAbsoluteAdapterPosition();
                    if (this.f2014j.mo2444g(this.f2017m, ghVar2, ghVar3)) {
                        RecyclerView recyclerView = this.f2017m;
                        C0653fo foVar2 = recyclerView.mLayout;
                        if (foVar2 instanceof C0501k) {
                            ((C0501k) foVar2).prepareForDrop(ghVar2.itemView, ghVar3.itemView, i3, i4);
                            return;
                        }
                        if (foVar2.canScrollHorizontally()) {
                            if (foVar2.getDecoratedLeft(ghVar3.itemView) <= recyclerView.getPaddingLeft()) {
                                recyclerView.scrollToPosition(absoluteAdapterPosition);
                            }
                            if (foVar2.getDecoratedRight(ghVar3.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.scrollToPosition(absoluteAdapterPosition);
                            }
                        }
                        if (foVar2.canScrollVertically()) {
                            if (foVar2.getDecoratedTop(ghVar3.itemView) <= recyclerView.getPaddingTop()) {
                                recyclerView.scrollToPosition(absoluteAdapterPosition);
                            }
                            if (foVar2.getDecoratedBottom(ghVar3.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.scrollToPosition(absoluteAdapterPosition);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        rect.setEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo2465h() {
        VelocityTracker velocityTracker = this.f2019o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f2019o = VelocityTracker.obtain();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo2466i(View view) {
        if (view == this.f2020p) {
            this.f2020p = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r0 <= 0) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0125  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2467j(android.support.p033v7.widget.C0673gh r20, int r21) {
        /*
            r19 = this;
            r10 = r19
            r11 = r20
            r12 = r21
            android.support.v7.widget.gh r0 = r10.f2006b
            if (r11 != r0) goto L_0x0010
            int r0 = r10.f2027w
            if (r12 == r0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            return
        L_0x0010:
            r0 = -9223372036854775808
            r10.f2023s = r0
            int r3 = r10.f2027w
            r13 = 1
            r10.mo2462f(r11, r13)
            r10.f2027w = r12
            r14 = 2
            if (r12 != r14) goto L_0x002e
            if (r11 == 0) goto L_0x0026
            android.view.View r0 = r11.itemView
            r10.f2020p = r0
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            int r0 = r12 * 8
            r15 = 8
            int r0 = r0 + r15
            int r0 = r13 << r0
            int r16 = r0 + -1
            android.support.v7.widget.gh r9 = r10.f2006b
            r8 = 0
            if (r9 == 0) goto L_0x0155
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0143
            if (r3 != r14) goto L_0x0049
        L_0x0046:
            r7 = 0
            goto L_0x00b3
        L_0x0049:
            int r0 = r10.f2027w
            if (r0 != r14) goto L_0x004e
            goto L_0x0046
        L_0x004e:
            android.support.v7.widget.a.f r0 = r10.f2014j
            int r0 = r0.mo2445h()
            android.support.v7.widget.a.f r1 = r10.f2014j
            android.support.v7.widget.RecyclerView r2 = r10.f2017m
            int r2 = androidx.core.p098j.C2043bi.m5577f(r2)
            int r1 = r1.mo2440a(r0, r2)
            int r1 = r1 >> r15
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x0066
            goto L_0x0046
        L_0x0066:
            int r0 = r0 >> r15
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r2 = r10.f2009e
            float r2 = java.lang.Math.abs(r2)
            float r4 = r10.f2010f
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            int r2 = r10.m1872p(r1)
            if (r2 <= 0) goto L_0x008d
            r0 = r0 & r2
            if (r0 != 0) goto L_0x009c
            android.support.v7.widget.RecyclerView r0 = r10.f2017m
            int r0 = androidx.core.p098j.C2043bi.m5577f(r0)
            int r0 = android.support.p033v7.widget.p041a.C0496f.m1855b(r2, r0)
            goto L_0x0094
        L_0x008d:
            int r0 = r10.m1873q(r1)
            if (r0 > 0) goto L_0x0094
            goto L_0x0046
        L_0x0094:
            r7 = r0
            goto L_0x00b3
        L_0x0096:
            int r2 = r10.m1873q(r1)
            if (r2 <= 0) goto L_0x009e
        L_0x009c:
            r7 = r2
            goto L_0x00b3
        L_0x009e:
            int r1 = r10.m1872p(r1)
            if (r1 <= 0) goto L_0x0046
            r0 = r0 & r1
            if (r0 != 0) goto L_0x00b2
            android.support.v7.widget.RecyclerView r0 = r10.f2017m
            int r0 = androidx.core.p098j.C2043bi.m5577f(r0)
            int r0 = android.support.p033v7.widget.p041a.C0496f.m1855b(r1, r0)
            goto L_0x0094
        L_0x00b2:
            r7 = r1
        L_0x00b3:
            r19.m1870n()
            r0 = 4
            r1 = 0
            if (r7 == r13) goto L_0x00dd
            if (r7 == r14) goto L_0x00dd
            if (r7 == r0) goto L_0x00ca
            if (r7 == r15) goto L_0x00ca
            r2 = 16
            if (r7 == r2) goto L_0x00ca
            r2 = 32
            if (r7 == r2) goto L_0x00ca
            r6 = 0
            goto L_0x00da
        L_0x00ca:
            float r2 = r10.f2009e
            float r2 = java.lang.Math.signum(r2)
            android.support.v7.widget.RecyclerView r4 = r10.f2017m
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r2 = r2 * r4
            r6 = r2
        L_0x00da:
            r17 = 0
            goto L_0x00ef
        L_0x00dd:
            float r2 = r10.f2010f
            float r2 = java.lang.Math.signum(r2)
            android.support.v7.widget.RecyclerView r4 = r10.f2017m
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r2 = r2 * r4
            r17 = r2
            r6 = 0
        L_0x00ef:
            if (r3 != r14) goto L_0x00f4
            r5 = 8
            goto L_0x00f9
        L_0x00f4:
            if (r7 <= 0) goto L_0x00f8
            r5 = 2
            goto L_0x00f9
        L_0x00f8:
            r5 = 4
        L_0x00f9:
            float[] r0 = r10.f2024t
            r10.m1869m(r0)
            float[] r0 = r10.f2024t
            r4 = r0[r8]
            r18 = r0[r13]
            android.support.v7.widget.a.c r2 = new android.support.v7.widget.a.c
            r0 = r2
            r1 = r19
            r13 = r2
            r2 = r9
            r14 = r5
            r5 = r18
            r18 = r7
            r7 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.support.v7.widget.RecyclerView r0 = r10.f2017m
            android.support.v7.widget.fh r0 = r0.mItemAnimator
            if (r0 != 0) goto L_0x0125
            if (r14 != r15) goto L_0x0122
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x012c
        L_0x0122:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x012c
        L_0x0125:
            if (r14 != r15) goto L_0x012a
            long r0 = r0.f2410j
            goto L_0x012c
        L_0x012a:
            long r0 = r0.f2409i
        L_0x012c:
            android.animation.ValueAnimator r2 = r13.f1994j
            r2.setDuration(r0)
            java.util.List r0 = r10.f2016l
            r0.add(r13)
            android.support.v7.widget.gh r0 = r13.f1992h
            r1 = 0
            r0.setIsRecyclable(r1)
            android.animation.ValueAnimator r0 = r13.f1994j
            r0.start()
            r8 = 1
            goto L_0x0151
        L_0x0143:
            r1 = 0
            android.view.View r0 = r9.itemView
            r10.mo2466i(r0)
            android.support.v7.widget.a.f r0 = r10.f2014j
            android.support.v7.widget.RecyclerView r2 = r10.f2017m
            r0.mo2441d(r2, r9)
            r8 = 0
        L_0x0151:
            r0 = 0
            r10.f2006b = r0
            goto L_0x0157
        L_0x0155:
            r1 = 0
            r8 = 0
        L_0x0157:
            if (r11 == 0) goto L_0x0186
            android.support.v7.widget.a.f r0 = r10.f2014j
            android.support.v7.widget.RecyclerView r2 = r10.f2017m
            int r0 = r0.mo2449l(r2)
            r0 = r0 & r16
            int r2 = r10.f2027w
            int r2 = r2 * 8
            int r0 = r0 >> r2
            r10.f2015k = r0
            android.view.View r0 = r11.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r10.f2011g = r0
            android.view.View r0 = r11.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r10.f2012h = r0
            r10.f2006b = r11
            r0 = 2
            if (r12 != r0) goto L_0x0186
            android.view.View r0 = r11.itemView
            r0.performHapticFeedback(r1)
        L_0x0186:
            android.support.v7.widget.RecyclerView r0 = r10.f2017m
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0198
            android.support.v7.widget.gh r2 = r10.f2006b
            if (r2 == 0) goto L_0x0194
            r13 = 1
            goto L_0x0195
        L_0x0194:
            r13 = 0
        L_0x0195:
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x0198:
            if (r8 != 0) goto L_0x01a1
            android.support.v7.widget.RecyclerView r0 = r10.f2017m
            android.support.v7.widget.fo r0 = r0.mLayout
            r0.requestSimpleAnimationsInNextLayout()
        L_0x01a1:
            android.support.v7.widget.RecyclerView r0 = r10.f2017m
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.p041a.C0502l.mo2467j(android.support.v7.widget.gh, int):void");
    }

    /* renamed from: k */
    public final void mo2468k(C0673gh ghVar) {
        if (!this.f2014j.mo2450m(this.f2017m)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (ghVar.itemView.getParent() != this.f2017m) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            mo2465h();
            this.f2010f = 0.0f;
            this.f2009e = 0.0f;
            mo2467j(ghVar, 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo2469l(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f2007c;
        this.f2009e = f;
        this.f2010f = y - this.f2008d;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.f2009e = f;
        }
        if ((i & 8) == 0) {
            this.f2009e = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.f2010f = Math.max(0.0f, this.f2010f);
        }
        if ((i & 2) == 0) {
            this.f2010f = Math.min(0.0f, this.f2010f);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        int i = 0;
        if (this.f2006b != null) {
            m1869m(this.f2024t);
            float[] fArr = this.f2024t;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        C0496f fVar = this.f2014j;
        C0673gh ghVar = this.f2006b;
        List list = this.f2016l;
        int size = list.size();
        while (i < size) {
            C0499i iVar = (C0499i) list.get(i);
            float f4 = iVar.f1988d;
            float f5 = iVar.f1990f;
            if (f4 == f5) {
                iVar.f1996l = iVar.f1992h.itemView.getTranslationX();
            } else {
                iVar.f1996l = f4 + (iVar.f2000p * (f5 - f4));
            }
            float f6 = iVar.f1989e;
            float f7 = iVar.f1991g;
            if (f6 == f7) {
                iVar.f1997m = iVar.f1992h.itemView.getTranslationY();
            } else {
                iVar.f1997m = f6 + (iVar.f2000p * (f7 - f6));
            }
            int save = canvas.save();
            C0673gh ghVar2 = iVar.f1992h;
            float f8 = iVar.f1996l;
            float f9 = iVar.f1997m;
            int i2 = iVar.f1993i;
            fVar.mo2447j(recyclerView, ghVar2, f8, f9, false);
            canvas2.restoreToCount(save);
            i++;
        }
        if (ghVar != null) {
            int save2 = canvas.save();
            fVar.mo2447j(recyclerView, ghVar, f2, f, true);
            canvas2.restoreToCount(save2);
        }
    }

    public final void onDrawOver$ar$ds(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2006b != null) {
            m1869m(this.f2024t);
        }
        C0673gh ghVar = this.f2006b;
        List list = this.f2016l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0499i iVar = (C0499i) list.get(i);
            int save = canvas.save();
            C0673gh ghVar2 = iVar.f1992h;
            float f = iVar.f1996l;
            float f2 = iVar.f1997m;
            int i2 = iVar.f1993i;
            canvas.restoreToCount(save);
        }
        if (ghVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0499i iVar2 = (C0499i) list.get(size);
            if (!iVar2.f1999o) {
                z = true;
            } else if (!iVar2.f1995k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
