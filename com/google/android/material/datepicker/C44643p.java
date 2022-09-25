package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.core.p097i.C1970e;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.p */
/* compiled from: PG */
final class C44643p extends C0648fj {

    /* renamed from: a */
    final /* synthetic */ C44649v f116306a;

    /* renamed from: b */
    private final Calendar f116307b = C44625au.m79086g((Calendar) null);

    /* renamed from: c */
    private final Calendar f116308c = C44625au.m79086g((Calendar) null);

    public C44643p(C44649v vVar) {
        this.f116306a = vVar;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        int i;
        RecyclerView recyclerView2 = recyclerView;
        C0640fb fbVar = recyclerView2.mAdapter;
        if (fbVar instanceof C44628ax) {
            C0653fo foVar = recyclerView2.mLayout;
            if (foVar instanceof GridLayoutManager) {
                C44628ax axVar = (C44628ax) fbVar;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) foVar;
                for (C1970e eVar : this.f116306a.f116318a.mo47803e()) {
                    Object obj = eVar.f5888a;
                    if (!(obj == null || eVar.f5889b == null)) {
                        this.f116307b.setTimeInMillis(((Long) obj).longValue());
                        this.f116308c.setTimeInMillis(((Long) eVar.f5889b).longValue());
                        int a = axVar.mo47865a(this.f116307b.get(1));
                        int a2 = axVar.mo47865a(this.f116308c.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(a);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(a2);
                        int i2 = gridLayoutManager.mSpanCount;
                        int i3 = a / i2;
                        int i4 = a2 / i2;
                        int i5 = i3;
                        while (i5 <= i4) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.mSpanCount * i5);
                            if (findViewByPosition3 != null) {
                                int top = findViewByPosition3.getTop() + this.f116306a.f116321d.f116282d.f116273a.top;
                                int bottom = findViewByPosition3.getBottom() - this.f116306a.f116321d.f116282d.f116273a.bottom;
                                int left = i5 == i3 ? findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2) : 0;
                                if (i5 == i4) {
                                    i = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, this.f116306a.f116321d.f116286h);
                            }
                            i5++;
                        }
                    }
                }
            }
        }
    }
}
