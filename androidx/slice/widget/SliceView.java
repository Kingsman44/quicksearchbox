package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.C2333ah;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4094a;
import androidx.slice.p194a.C4101h;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class SliceView extends ViewGroup implements View.OnClickListener, C2333ah {

    /* renamed from: a */
    public static final Comparator f13188a = new C4140ar();

    /* renamed from: A */
    private C4137ao f13189A;

    /* renamed from: B */
    private int f13190B;

    /* renamed from: C */
    private C4141as f13191C;

    /* renamed from: D */
    private int f13192D;

    /* renamed from: E */
    private int f13193E;

    /* renamed from: F */
    private int f13194F;

    /* renamed from: b */
    C4154j f13195b;

    /* renamed from: c */
    C4129ag f13196c;

    /* renamed from: d */
    View.OnLongClickListener f13197d;

    /* renamed from: e */
    Handler f13198e;

    /* renamed from: f */
    public C4110i f13199f;

    /* renamed from: g */
    public Slice f13200g;

    /* renamed from: h */
    public List f13201h;

    /* renamed from: i */
    public C4143au f13202i;

    /* renamed from: j */
    public View.OnClickListener f13203j;

    /* renamed from: k */
    boolean f13204k;

    /* renamed from: l */
    boolean f13205l;

    /* renamed from: m */
    int[] f13206m;

    /* renamed from: n */
    Runnable f13207n;

    /* renamed from: o */
    Runnable f13208o;

    /* renamed from: p */
    private C4135am f13209p;

    /* renamed from: q */
    private C4122a f13210q;

    /* renamed from: r */
    private boolean f13211r;

    /* renamed from: s */
    private boolean f13212s;

    /* renamed from: t */
    private boolean f13213t;

    /* renamed from: u */
    private boolean f13214u;

    /* renamed from: v */
    private boolean f13215v;

    /* renamed from: w */
    private int f13216w;

    /* renamed from: x */
    private int f13217x;

    /* renamed from: y */
    private int f13218y;

    /* renamed from: z */
    private int f13219z;

    public SliceView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: j */
    private final int m11816j() {
        int i = this.f13190B;
        if (i != -1) {
            return i;
        }
        SliceItem c = C4101h.m11750c(this.f13200g, "int", "color");
        if (c != null) {
            return c.mo8593a();
        }
        return C4144av.m11881a(getContext(), 16843829);
    }

    /* renamed from: k */
    private final ViewGroup.LayoutParams m11817k(View view) {
        if (!(view instanceof C4169y)) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        int i = this.f13216w;
        return new ViewGroup.LayoutParams(i, i);
    }

    /* renamed from: l */
    private final void m11818l() {
        this.f13196c.mo8709p(this.f13191C);
        C4129ag agVar = this.f13196c;
        C4137ao aoVar = this.f13189A;
        agVar.mo8704fw(aoVar, aoVar.mo8722h());
        this.f13196c.mo8645i(m11816j());
        C4154j jVar = this.f13195b;
        if (jVar == null || jVar.mo8712g() == -1) {
            this.f13196c.setLayoutDirection(2);
        } else {
            this.f13196c.setLayoutDirection(this.f13195b.mo8712g());
        }
    }

    /* renamed from: m */
    private final void m11819m(Context context, AttributeSet attributeSet, int i, int i2) {
        C4137ao aoVar = new C4137ao(context, attributeSet, i, i2);
        this.f13189A = aoVar;
        this.f13190B = aoVar.f13295a;
        this.f13216w = getContext().getResources().getDimensionPixelSize(R.dimen.abc_slice_shortcut_size);
        this.f13217x = getContext().getResources().getDimensionPixelSize(R.dimen.abc_slice_row_min_height);
        this.f13218y = getResources().getDimensionPixelSize(R.dimen.abc_slice_large_height);
        this.f13219z = getResources().getDimensionPixelSize(R.dimen.abc_slice_action_row_height);
        this.f13202i = new C4143au();
        C4145aw awVar = new C4145aw(getContext());
        this.f13196c = awVar;
        awVar.mo8708o(this.f13202i);
        C4129ag agVar = this.f13196c;
        addView(agVar, m11817k(agVar));
        m11818l();
        C4122a aVar = new C4122a(getContext());
        this.f13210q = aVar;
        aVar.setBackground(new ColorDrawable(-1118482));
        C4122a aVar2 = this.f13210q;
        addView(aVar2, m11817k(aVar2));
        mo8672g();
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f13192D = scaledTouchSlop * scaledTouchSlop;
        this.f13198e = new Handler();
        setClipToPadding(false);
        super.setOnClickListener(this);
    }

    /* renamed from: o */
    private final void m11821o(boolean z) {
        C4110i iVar;
        if (this.f13211r && (iVar = this.f13199f) != null && iVar.f13135a != -1) {
            if (z) {
                Handler handler = this.f13198e;
                Runnable runnable = this.f13208o;
                long j = 60000;
                if (!iVar.mo8621j()) {
                    C4110i iVar2 = this.f13199f;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = iVar2.f13135a;
                    long j3 = 0;
                    if (!(j2 == 0 || j2 == -1 || currentTimeMillis > j2)) {
                        j3 = j2 - currentTimeMillis;
                    }
                    j = 60000 + j3;
                }
                handler.postDelayed(runnable, j);
                return;
            }
            this.f13198e.removeCallbacks(this.f13208o);
        }
    }

    /* renamed from: p */
    private final boolean m11822p(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int rawX = ((int) motionEvent.getRawX()) - this.f13193E;
                    int rawY = ((int) motionEvent.getRawY()) - this.f13194F;
                    if ((rawX * rawX) + (rawY * rawY) > this.f13192D) {
                        this.f13204k = false;
                        this.f13198e.removeCallbacks(this.f13207n);
                    }
                    return this.f13205l;
                } else if (actionMasked != 3) {
                    return false;
                }
            }
            boolean z = this.f13205l;
            this.f13204k = false;
            this.f13205l = false;
            this.f13198e.removeCallbacks(this.f13207n);
            return z;
        }
        this.f13198e.removeCallbacks(this.f13207n);
        this.f13193E = (int) motionEvent.getRawX();
        this.f13194F = (int) motionEvent.getRawY();
        this.f13204k = true;
        this.f13205l = false;
        this.f13198e.postDelayed(this.f13207n, (long) ViewConfiguration.getLongPressTimeout());
        return false;
    }

    /* renamed from: b */
    public void mo774hX(Slice slice) {
        mo8671f(slice);
    }

    /* renamed from: c */
    public final void mo8668c(C4129ag agVar) {
        removeView(this.f13196c);
        this.f13196c = agVar;
        agVar.mo8708o(this.f13202i);
        C4129ag agVar2 = this.f13196c;
        addView(agVar2, m11817k(agVar2));
        m11818l();
    }

    /* renamed from: d */
    public final void mo8669d(C4141as asVar) {
        this.f13191C = asVar;
        this.f13196c.mo8709p(asVar);
    }

    /* renamed from: e */
    public final void mo8670e(boolean z) {
        C4143au auVar = this.f13202i;
        boolean z2 = auVar.f13325c;
        if (z != z2 && z != z2) {
            auVar.f13325c = z;
            C4142at atVar = auVar.f13327e;
            if (atVar != null) {
                atVar.mo8727h(z);
            }
        }
    }

    /* renamed from: f */
    public void mo8671f(Slice slice) {
        View view;
        View findFocus = findFocus();
        if (findFocus != null) {
            new C4158n(this, findFocus, C4158n.f13383a);
        }
        boolean z = false;
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            ArrayList arrayList = new ArrayList();
            addFocusables(arrayList, 2, 0);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    view = null;
                    break;
                }
                view = (View) arrayList.get(i);
                i++;
                if (view.isAccessibilityFocused()) {
                    break;
                }
            }
            if (view != null) {
                new C4158n(this, view, C4158n.f13384b);
            }
        }
        if (slice == null || Uri.parse(slice.f13090f) == null) {
            m11820n(false);
            this.f13209p = null;
        } else {
            Slice slice2 = this.f13200g;
            if (slice2 == null || !Uri.parse(slice2.f13090f).equals(Uri.parse(slice.f13090f))) {
                m11820n(false);
                this.f13209p = new C4136an(getContext(), Uri.parse(slice.f13090f));
            }
        }
        boolean z2 = (slice == null || this.f13200g == null || !Uri.parse(slice.f13090f).equals(Uri.parse(this.f13200g.f13090f))) ? false : true;
        C4110i iVar = this.f13199f;
        this.f13200g = slice;
        C4110i iVar2 = slice != null ? new C4110i(getContext(), this.f13200g) : null;
        this.f13199f = iVar2;
        if (!z2) {
            this.f13196c.mo8642f();
        } else if (iVar.mo8612a() == 2 && iVar2.mo8612a() == 0) {
            return;
        }
        C4110i iVar3 = this.f13199f;
        this.f13195b = iVar3 != null ? iVar3.f13137c : null;
        if (this.f13213t) {
            mo8674i();
        }
        if (this.f13214u) {
            this.f13214u = true;
            C4154j jVar = this.f13195b;
            if (!(jVar == null || jVar.f13378a == null || jVar.f13380c.size() <= 1)) {
                jVar.f13378a.f13399k = true;
            }
        }
        if (this.f13215v) {
            this.f13215v = true;
            C4154j jVar2 = this.f13195b;
            if (jVar2 != null) {
                ArrayList arrayList2 = jVar2.f13380c;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C4130ah ahVar = (C4130ah) arrayList2.get(i2);
                    if (ahVar instanceof C4160p) {
                        ((C4160p) ahVar).f13400l = true;
                    }
                }
            }
        }
        C4154j jVar3 = this.f13195b;
        if (jVar3 == null || !jVar3.mo8711d()) {
            this.f13201h = null;
            this.f13196c.mo8642f();
            mo8672g();
            return;
        }
        this.f13196c.mo8701ft((Set) null);
        C4110i iVar4 = this.f13199f;
        this.f13201h = iVar4.f13138d;
        this.f13196c.mo8700fs(iVar4.f13136b);
        C4129ag agVar = this.f13196c;
        if (this.f13211r && this.f13199f.mo8621j()) {
            z = true;
        }
        agVar.mo8702fu(z);
        this.f13196c.mo8699fr(this.f13199f.mo8622k());
        this.f13196c.mo8645i(m11816j());
        if (this.f13195b.mo8712g() != -1) {
            this.f13196c.setLayoutDirection(this.f13195b.mo8712g());
        } else {
            this.f13196c.setLayoutDirection(2);
        }
        this.f13196c.mo8705fx(this.f13195b);
        mo8672g();
        m11820n(true);
        m11821o(true);
    }

    /* renamed from: g */
    public final void mo8672g() {
        List list = this.f13201h;
        if (list == null) {
            this.f13210q.setVisibility(8);
            this.f13196c.mo8703fv((List) null);
            this.f13196c.mo8644g(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, f13188a);
        this.f13196c.mo8703fv(arrayList);
        this.f13196c.mo8644g(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        this.f13210q.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo8673h(int i) {
        if (this.f13202i.f13326d != i) {
            if (!(i == 1 || i == 2 || i == 3)) {
                Log.w("SliceView", "Unknown mode: " + i + " please use one of MODE_SHORTCUT, MODE_SMALL, MODE_LARGE");
                i = 2;
            }
            C4143au auVar = this.f13202i;
            if (auVar.f13326d != i) {
                auVar.f13326d = i;
                C4142at atVar = auVar.f13327e;
                if (atVar != null) {
                    atVar.mo8730r();
                }
            }
            int i2 = this.f13202i.f13326d;
            C4129ag agVar = this.f13196c;
            boolean z = agVar instanceof C4169y;
            Set fq = agVar.mo8698fq();
            if (i2 == 3) {
                if (!z) {
                    removeView(this.f13196c);
                    C4169y yVar = new C4169y(getContext());
                    this.f13196c = yVar;
                    addView(yVar, m11817k(yVar));
                }
                mo8672g();
            }
            if (i2 != 3 && z) {
                removeView(this.f13196c);
                C4145aw awVar = new C4145aw(getContext());
                this.f13196c = awVar;
                addView(awVar, m11817k(awVar));
            }
            mo8672g();
            this.f13196c.mo8708o(this.f13202i);
            m11818l();
            C4154j jVar = this.f13195b;
            if (jVar != null && jVar.mo8711d()) {
                this.f13196c.mo8705fx(this.f13195b);
            }
            this.f13196c.mo8701ft(fq);
            mo8672g();
        }
    }

    /* renamed from: i */
    public final void mo8674i() {
        C4160p pVar;
        this.f13213t = true;
        C4154j jVar = this.f13195b;
        if (jVar != null && (pVar = jVar.f13378a) != null) {
            pVar.f13398j = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            m11820n(true);
            m11821o(true);
        }
    }

    public final void onClick(View view) {
        C4141as asVar;
        int[] iArr;
        C4154j jVar = this.f13195b;
        if (jVar == null || jVar.mo8744c(getContext()) == null) {
            View.OnClickListener onClickListener = this.f13203j;
            if (onClickListener != null) {
                onClickListener.onClick(this);
                return;
            }
            return;
        }
        try {
            C4094a c = this.f13195b.mo8744c(getContext());
            SliceItem sliceItem = c.f13106a;
            if (sliceItem != null && sliceItem.mo8599g(getContext(), (Intent) null)) {
                this.f13196c.mo8707n(c.f13113h);
            }
            if (sliceItem != null && (asVar = this.f13191C) != null && (iArr = this.f13206m) != null && iArr.length > 1) {
                C4147c cVar = new C4147c(this.f13202i.f13326d, 3, iArr[0], iArr[1]);
                asVar.mo8726b(cVar, c.f13113h);
                SliceItem sliceItem2 = c.f13113h;
                if (this.f13209p != null && sliceItem2.mo8596d() != null && Uri.parse(sliceItem2.mo8596d().f13090f) != null) {
                    C4135am amVar = this.f13209p;
                    ((C4136an) amVar).f13282a.logTouch(cVar.f13338b, Uri.parse(sliceItem2.mo8596d().f13090f));
                }
            }
        } catch (PendingIntent.CanceledException e) {
            Log.e("SliceView", "PendingIntent for slice cannot be sent", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11820n(false);
        m11821o(false);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (this.f13197d != null && m11822p(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C4129ag agVar = this.f13196c;
        agVar.layout(0, 0, agVar.getMeasuredWidth(), agVar.getMeasuredHeight());
        if (this.f13210q.getVisibility() != 8) {
            int measuredHeight = agVar.getMeasuredHeight();
            C4122a aVar = this.f13210q;
            aVar.layout(0, measuredHeight, aVar.getMeasuredWidth(), this.f13210q.getMeasuredHeight() + measuredHeight);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        if (this.f13202i.f13326d == 3) {
            size = this.f13216w + getPaddingLeft() + getPaddingRight();
        }
        int i4 = 0;
        int i5 = this.f13210q.getVisibility() != 8 ? this.f13219z : 0;
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i6 = -1;
        if (layoutParams == null || layoutParams.height != -2) {
            if (mode == 0) {
                mode = 0;
            } else {
                i6 = size2;
            }
        }
        C4154j jVar = this.f13195b;
        if (jVar != null && jVar.mo8711d()) {
            C4143au auVar = this.f13202i;
            if (auVar.f13326d != 3) {
                if (i6 <= 0 || i6 >= this.f13189A.f13309o) {
                    auVar.mo8731a(0);
                } else {
                    int i7 = this.f13217x;
                    if (i6 <= i7) {
                        i6 = i7;
                    }
                    auVar.mo8731a(i6);
                }
                C4143au auVar2 = this.f13202i;
                if (i6 != auVar2.f13323a) {
                    auVar2.f13323a = i6;
                    C4142at atVar = auVar2.f13327e;
                    if (atVar != null) {
                        atVar.mo8728m();
                    }
                }
            }
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        if (mode != 1073741824) {
            C4154j jVar2 = this.f13195b;
            if (jVar2 == null || !jVar2.mo8711d()) {
                paddingTop = i5;
            } else {
                C4143au auVar3 = this.f13202i;
                if (auVar3.f13326d == 3) {
                    paddingTop = this.f13216w + i5;
                } else {
                    int b = this.f13189A.mo8716b(this.f13195b, auVar3) + i5;
                    if (paddingTop > b || mode == 0) {
                        paddingTop = b;
                    } else if (!this.f13189A.f13312r && ((this.f13202i.f13326d == 2 && paddingTop >= (i3 = this.f13218y + i5)) || paddingTop <= (i3 = this.f13217x))) {
                        paddingTop = i3;
                    }
                }
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        this.f13210q.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5 > 0 ? getPaddingBottom() + i5 : 0, 1073741824));
        int paddingTop2 = paddingTop + getPaddingTop();
        if (i5 <= 0) {
            i4 = getPaddingBottom();
        }
        this.f13196c.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(paddingTop2 + i4, 1073741824));
        setMeasuredDimension(size, this.f13196c.getMeasuredHeight() + this.f13210q.getMeasuredHeight());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f13197d != null && m11822p(motionEvent)) || super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (isAttachedToWindow()) {
            boolean z = i == 0;
            m11820n(z);
            m11821o(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = i == 0;
        m11820n(z);
        m11821o(z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13203j = onClickListener;
    }

    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f13197d = onLongClickListener;
    }

    public SliceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliceViewStyle);
    }

    /* renamed from: n */
    private final void m11820n(boolean z) {
        C4135am amVar = this.f13209p;
        if (amVar == null) {
            return;
        }
        if (z) {
            if (!this.f13212s) {
                ((C4136an) amVar).f13282a.logVisible();
                this.f13212s = true;
            }
        } else if (this.f13212s) {
            ((C4136an) amVar).f13282a.logHidden();
            this.f13212s = false;
        }
    }

    public SliceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13211r = true;
        this.f13212s = false;
        this.f13213t = false;
        this.f13214u = false;
        this.f13215v = false;
        this.f13190B = -1;
        this.f13207n = new C4138ap(this);
        this.f13208o = new C4139aq(this);
        m11819m(context, attributeSet, i, 2132151850);
    }

    public SliceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f13211r = true;
        this.f13212s = false;
        this.f13213t = false;
        this.f13214u = false;
        this.f13215v = false;
        this.f13190B = -1;
        this.f13207n = new C4138ap(this);
        this.f13208o = new C4139aq(this);
        m11819m(context, attributeSet, i, i2);
    }
}
