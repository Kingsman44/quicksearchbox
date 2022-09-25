package com.android.datetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.datetimepicker.C5104e;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.android.datetimepicker.date.ah */
/* compiled from: PG */
public final class C5078ah extends ListView implements AdapterView.OnItemClickListener, C5087j {

    /* renamed from: a */
    public final C5086i f16200a;

    /* renamed from: b */
    public TextViewWithCircularIndicator f16201b;

    /* renamed from: c */
    private C5077ag f16202c;

    /* renamed from: d */
    private int f16203d;

    /* renamed from: e */
    private int f16204e;

    public C5078ah(Context context, C5086i iVar) {
        super(context);
        this.f16200a = iVar;
        ((C5081d) iVar).f16210c.add(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources resources = context.getResources();
        this.f16203d = resources.getDimensionPixelOffset(R.dimen.date_picker_view_animator_height);
        this.f16204e = resources.getDimensionPixelOffset(R.dimen.year_label_height);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.f16204e / 3);
        ArrayList arrayList = new ArrayList();
        for (int i = ((C5081d) iVar).f16222o; i <= ((C5081d) this.f16200a).f16223p; i++) {
            arrayList.add(String.format("%d", new Object[]{Integer.valueOf(i)}));
        }
        C5077ag agVar = new C5077ag(this, context, arrayList);
        this.f16202c = agVar;
        setAdapter(agVar);
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        mo10075a();
    }

    /* renamed from: b */
    public static int m13948b(TextView textView) {
        return Integer.valueOf(textView.getText().toString()).intValue();
    }

    /* renamed from: a */
    public final void mo10075a() {
        this.f16202c.notifyDataSetChanged();
        mo10076c(this.f16200a.mo10082a().f16263a - ((C5081d) this.f16200a).f16222o, (this.f16203d / 2) - (this.f16204e / 2));
    }

    /* renamed from: c */
    public final void mo10076c(int i, int i2) {
        post(new C5076af(this, i, i2));
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4096) {
            accessibilityEvent.setFromIndex(0);
            accessibilityEvent.setToIndex(0);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((C5081d) this.f16200a).f16226s.mo10050a();
        TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
        if (textViewWithCircularIndicator != null) {
            TextViewWithCircularIndicator textViewWithCircularIndicator2 = this.f16201b;
            if (textViewWithCircularIndicator != textViewWithCircularIndicator2) {
                if (textViewWithCircularIndicator2 != null) {
                    textViewWithCircularIndicator2.f16148b = false;
                    textViewWithCircularIndicator2.requestLayout();
                }
                textViewWithCircularIndicator.f16148b = true;
                textViewWithCircularIndicator.requestLayout();
                this.f16201b = textViewWithCircularIndicator;
            }
            C5086i iVar = this.f16200a;
            int b = m13948b(textViewWithCircularIndicator);
            C5081d dVar = (C5081d) iVar;
            int i2 = dVar.f16209b.get(2);
            int i3 = dVar.f16209b.get(5);
            int b2 = C5104e.m13981b(i2, b);
            if (i3 > b2) {
                dVar.f16209b.set(5, b2);
            }
            dVar.f16209b.set(1, b);
            dVar.mo10085d();
            dVar.mo10083b(dVar.f16208a.getDialog().getContext(), 0);
            dVar.mo10084c(dVar.f16208a.getDialog().getContext(), true);
            this.f16202c.notifyDataSetChanged();
        }
    }
}
