package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView */
/* compiled from: PG */
public class ValyrianRecyclerView extends RecyclerView {

    /* renamed from: c */
    private static final C59071e f316110c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView");

    /* renamed from: a */
    public boolean f316111a = true;

    /* renamed from: b */
    public int f316112b = -1;

    /* renamed from: d */
    private boolean f316113d = false;

    /* renamed from: e */
    private int f316114e = 0;

    /* renamed from: f */
    private int f316115f = 0;

    /* renamed from: g */
    private int f316116g = 0;

    /* renamed from: h */
    private int f316117h = 0;

    /* renamed from: i */
    private int f316118i = 0;

    /* renamed from: j */
    private int f316119j = 0;

    /* renamed from: k */
    private int f316120k = 0;

    public ValyrianRecyclerView(Context context) {
        super(context);
    }

    /* renamed from: b */
    private static String m189166b(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    /* renamed from: c */
    private static String m189167c(C0673gh ghVar) {
        return ghVar == null ? "null" : C108241bl.m179898a(ghVar.mItemViewType);
    }

    public final boolean canScrollVertically(int i) {
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        if (computeVerticalScrollRange == 0) {
            return false;
        }
        return i < 0 ? computeVerticalScrollOffset > 0 : computeVerticalScrollOffset < computeVerticalScrollRange;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f316111a && motionEvent.getActionMasked() == 0) {
            this.f316113d = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0640fb fbVar = this.mAdapter;
        int i5 = -1;
        boolean z2 = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
            C59081b.m91349a(TimeUnit.SECONDS, "time unit");
            C0640fb fbVar2 = this.mAdapter;
            StringBuilder sb = new StringBuilder();
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[8];
            objArr[0] = getResources().getResourceEntryName(getId());
            objArr[1] = Boolean.valueOf(fbVar2 != null && fbVar2.mObservable.mo2885g());
            objArr[2] = Boolean.valueOf(z);
            objArr[3] = Integer.valueOf(this.f316114e);
            objArr[4] = Integer.valueOf(i);
            objArr[5] = Integer.valueOf(i2);
            objArr[6] = Integer.valueOf(i3);
            objArr[7] = Integer.valueOf(i4);
            sb.append(String.format(locale, "ValyrianRecyclerView resId=%s, hasOvesrvers=%b, changed=%s CallCount=%d, L=%d, T=%d, R=%d, B=%d ", objArr));
            sb.append(String.format(locale, "prevPos L=%d, T=%d, R=%d, B=%d ", new Object[]{Integer.valueOf(this.f316115f), Integer.valueOf(this.f316116g), Integer.valueOf(this.f316117h), Integer.valueOf(this.f316118i)}));
            sb.append(String.format(locale, "currentPosition L=%d, T=%d, R=%d, B=%d ", new Object[]{Integer.valueOf(getLeft()), Integer.valueOf(getTop()), Integer.valueOf(getRight()), Integer.valueOf(getBottom())}));
            Object[] objArr2 = new Object[5];
            objArr2[0] = m189166b(this.mItemAnimator);
            objArr2[1] = Integer.valueOf(this.f316119j);
            objArr2[2] = Integer.valueOf(getChildCount());
            objArr2[3] = Integer.valueOf(this.f316120k);
            objArr2[4] = Integer.valueOf(fbVar2 != null ? fbVar2.getItemCount() : -1);
            sb.append(String.format(locale, "ItemAnimator=%s, RecyclerViewPrevChildCount=%d, current=%d, AdapterPrevChildCount=%d, current=%d ", objArr2));
            sb.append(fbVar2);
            this.f316114e++;
            this.f316115f = getLeft();
            this.f316116g = getTop();
            this.f316117h = getRight();
            this.f316118i = getBottom();
            this.f316119j = getChildCount();
            this.f316120k = fbVar != null ? fbVar.getItemCount() : -1;
        } catch (NullPointerException e) {
            try {
                C0640fb fbVar3 = this.mAdapter;
                C59071e eVar = f316110c;
                C59052c cVar = (C59052c) ((C59052c) ((C59052c) eVar.mo56225c()).mo56382g(e)).mo56372aa(28719);
                String resourceEntryName = getResources().getResourceEntryName(getId());
                if (fbVar3 == null || !fbVar3.mObservable.mo2885g()) {
                    z2 = false;
                }
                cVar.mo56364Q("#ValyrianRecyclerView.onLayout: Caught NPE. resId: %s, hasOvesrvers=%b, onLayoutCallCount: %d, changed=%s, left: %d, top: %d, right: %d, bottom: %d", resourceEntryName, Boolean.valueOf(z2), Integer.valueOf(this.f316114e), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(28720)).mo56360M("#ValyrianRecyclerView.onLayout: prevPosition: left: %d, top: %d, right: %d, bottom: %d", Integer.valueOf(this.f316115f), Integer.valueOf(this.f316116g), Integer.valueOf(this.f316117h), Integer.valueOf(this.f316118i));
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(28721)).mo56360M("#ValyrianRecyclerView.onLayout: currentPosition: left: %d, top: %d, right: %d, bottom: %d", Integer.valueOf(getLeft()), Integer.valueOf(getTop()), Integer.valueOf(getRight()), Integer.valueOf(getBottom()));
                C59052c cVar2 = (C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(28722);
                String b = m189166b(this.mItemAnimator);
                Integer valueOf = Integer.valueOf(this.f316119j);
                Integer valueOf2 = Integer.valueOf(getChildCount());
                Integer valueOf3 = Integer.valueOf(this.f316120k);
                if (fbVar3 != null) {
                    i5 = fbVar3.getItemCount();
                }
                cVar2.mo56361N("#ValyrianRecyclerView.onLayout: currentAnimator: %s, prevRecyclerViewChildCount: %d, currentRecyclerViewChildCount: %d, prevAdapterChildCount: %d, currentAdapterChildCount: %d", b, valueOf, valueOf2, valueOf3, Integer.valueOf(i5));
                try {
                    C0640fb fbVar4 = this.mAdapter;
                    if (fbVar4 != null) {
                        for (int i6 = 0; i6 < fbVar4.getItemCount(); i6++) {
                            ((C59052c) ((C59052c) f316110c.mo56224b()).mo56372aa(28726)).mo56359L("#ValyrianRecyclerView.onLayout: adapterChildIndex: %d, adapterChildItemId: %d, adapterChildViewType: %s", Integer.valueOf(i6), Long.valueOf(fbVar4.getItemId(i6)), C108241bl.m179898a(fbVar4.getItemViewType(i6)));
                        }
                    }
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt == null) {
                            ((C59052c) ((C59052c) f316110c.mo56224b()).mo56372aa(28725)).mo56387q("#ValyrianRecyclerView.onLayout: child[%s] IsNull", i7);
                        } else {
                            ((C59052c) ((C59052c) f316110c.mo56224b()).mo56372aa(28723)).mo56360M("#ValyrianRecyclerView.onLayout: child[%s] NonNull viewHolder=%s recyclerViewChildItemId=%d, ItemViewType=%s", Integer.valueOf(i7), m189167c(getChildViewHolder(childAt)), Long.valueOf(getChildItemId(childAt)), m189167c(findViewHolderForItemId(getChildItemId(childAt))));
                        }
                    }
                } catch (Exception e2) {
                    ((C59052c) ((C59052c) ((C59052c) f316110c.mo56226d()).mo56382g(e2)).mo56372aa(28724)).mo56386p("#ValyrianRecyclerView.onLayout: error while logging children");
                }
            } catch (RuntimeException e3) {
                ((C59052c) ((C59052c) ((C59052c) f316110c.mo56226d()).mo56382g(e3)).mo56372aa(28728)).mo56386p("#ValyrianRecyclerView.onLayout: error while logging");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f316112b != -1) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), this.f316112b));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f316111a) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f316113d = false;
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f316113d) {
            super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        C59052c cVar = (C59052c) f316110c.mo56224b();
        cVar.mo56380ai(getChildCount() > 0 ? C58979ad.MEDIUM : C58979ad.NONE);
        ((C59052c) cVar.mo56372aa(28729)).mo56387q("ValyrianRecyclerView.removeAllView: childCount: %s", getChildCount());
        super.removeAllViews();
    }

    public final void removeView(View view) {
        C59052c cVar = (C59052c) f316110c.mo56226d();
        cVar.mo56380ai(C58979ad.MEDIUM);
        ((C59052c) cVar.mo56372aa(28730)).mo56395y("ValyrianRecyclerView.removeView: dhildCount: %s, viewHolder: %s", getChildCount(), m189167c(getChildViewHolder(view)));
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        C59052c cVar = (C59052c) f316110c.mo56226d();
        cVar.mo56380ai(C58979ad.MEDIUM);
        ((C59052c) cVar.mo56372aa(28731)).mo56359L("ValyrianRecyclerView.removeViewAt: childCount: %s, index: %d, viewHolder: %s.", Integer.valueOf(getChildCount()), Integer.valueOf(i), m189167c(getChildViewHolder(getChildAt(i))));
        super.removeViewAt(i);
    }

    public final void removeViews(int i, int i2) {
        C59052c cVar = (C59052c) f316110c.mo56226d();
        cVar.mo56380ai(C58979ad.MEDIUM);
        ((C59052c) cVar.mo56372aa(28732)).mo56359L("ValyrianRecyclerView.removeViews: childCount: %s, start: %d, count: %d.", Integer.valueOf(getChildCount()), Integer.valueOf(i), Integer.valueOf(i2));
        super.removeViews(i, i2);
    }

    public ValyrianRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ValyrianRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo101064a(C114095a aVar) {
        C0640fb fbVar;
        if (aVar == null || this.mLayout != null) {
            ((C59052c) ((C59052c) f316110c.mo56224b()).mo56372aa(28733)).mo56354G("setAdapter %s with LayoutManager %s", m189166b(aVar), m189166b(this.mLayout));
        } else {
            C59052c cVar = (C59052c) f316110c.mo56226d();
            cVar.mo56380ai(C58979ad.MEDIUM);
            ((C59052c) cVar.mo56372aa(28734)).mo56389s("setAdapter without LayoutManager %s", m189166b(aVar));
            aVar.mo101119E();
            aVar.mo101119E();
        }
        if (aVar == null) {
            fbVar = null;
        } else {
            fbVar = aVar.mo101126i();
        }
        super.setAdapter(fbVar);
    }
}
