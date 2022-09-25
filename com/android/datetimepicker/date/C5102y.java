package com.android.datetimepicker.date;

import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.format.DateFormat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.p099a.C1991k;
import androidx.customview.p103b.C2144b;
import com.google.android.googlequicksearchbox.R;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.android.datetimepicker.date.y */
/* compiled from: PG */
public final class C5102y extends C2144b {

    /* renamed from: a */
    final /* synthetic */ C5072ab f16273a;

    /* renamed from: b */
    private final Rect f16274b = new Rect();

    /* renamed from: c */
    private final Calendar f16275c = Calendar.getInstance();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5102y(C5072ab abVar, View view) {
        super(view);
        this.f16273a = abVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CharSequence mo10123a(int i) {
        Calendar calendar = this.f16275c;
        C5072ab abVar = this.f16273a;
        calendar.set(abVar.f16185p, abVar.f16184o, i);
        CharSequence format = DateFormat.format("dd MMMM yyyy", this.f16275c.getTimeInMillis());
        C5072ab abVar2 = this.f16273a;
        if (i != abVar2.f16190u) {
            return format;
        }
        return abVar2.getContext().getString(R.string.item_is_selected, new Object[]{format});
    }

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        C5097t c = this.f16273a.mo10057c(f, f2);
        return c != null ? c.f16265c : LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        for (int i = 1; i <= this.f16273a.f16194y; i++) {
            list.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        if (i2 == 16) {
            C5072ab abVar = this.f16273a;
            abVar.mo10058d(new C5097t(abVar.f16185p, abVar.f16184o, i));
            return true;
        } else if (i2 != 32) {
            return false;
        } else {
            C5072ab abVar2 = this.f16273a;
            abVar2.mo10060e(new C5097t(abVar2.f16185p, abVar2.f16184o, i));
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(mo10123a(i));
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        Rect rect = this.f16274b;
        C5072ab abVar = this.f16273a;
        int b = abVar.mo10056b();
        int i2 = abVar.f16173d;
        int i3 = abVar.f16188s;
        int i4 = abVar.f16186q;
        int b2 = abVar.mo10056b();
        int i5 = abVar.f16193x;
        int i6 = (i4 - b2) / i5;
        int a = (i - 1) + abVar.mo10055a();
        int i7 = a / i5;
        int i8 = a % i5;
        abVar.mo10064j(i8);
        int i9 = b + (i8 * i6);
        int i10 = i2 + (i7 * i3);
        rect.set(i9, i10, i6 + i9, i3 + i10);
        kVar.f5921a.setContentDescription(mo10123a(i));
        kVar.f5921a.setBoundsInParent(this.f16274b);
        kVar.f5921a.addAction(16);
        kVar.f5921a.addAction(32);
        if (i == this.f16273a.f16190u) {
            kVar.f5921a.setSelected(true);
        }
    }
}
