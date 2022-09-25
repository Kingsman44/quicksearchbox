package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.g */
/* compiled from: PG */
public final class C16789g {

    /* renamed from: a */
    private static final C59071e f49126a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.g");

    /* renamed from: b */
    private final View f49127b;

    /* renamed from: c */
    private int f49128c = 0;

    /* renamed from: d */
    private int f49129d = 0;

    public C16789g(View view) {
        this.f49127b = view;
    }

    /* renamed from: e */
    public static int m33820e(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public final int mo23012a() {
        int i = this.f49129d;
        if (i > 0) {
            return i;
        }
        Resources resources = this.f49127b.getContext().getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f49127b.findViewById(R.id.voiceplate).getLayoutParams();
        if (marginLayoutParams == null) {
            ((C59052c) ((C59052c) f49126a.mo56225c()).mo56372aa(46852)).mo56386p("unexpected case: this view is not attached to a parent ViewGroup");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.fusion_voiceplate_top_guideline_percentage, typedValue, true);
        int height = ((((int) (((float) this.f49127b.getHeight()) * (1.0f - typedValue.getFloat()))) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) - this.f49127b.findViewById(R.id.query_transcript).getHeight();
        this.f49129d = height;
        return height;
    }

    /* renamed from: b */
    public final int mo23013b() {
        int i = this.f49128c;
        if (i > 0) {
            return i;
        }
        Resources resources = this.f49127b.getContext().getResources();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        resources.getValue(R.dimen.fusion_voiceplate_right_guideline_percentage, typedValue, true);
        resources.getValue(R.dimen.fusion_voiceplate_left_guideline_percentage, typedValue2, true);
        int width = (int) (((float) this.f49127b.getWidth()) * (typedValue.getFloat() - typedValue2.getFloat()));
        this.f49128c = width;
        return width;
    }

    /* renamed from: c */
    public final int mo23014c(float f) {
        return (int) (f * this.f49127b.getResources().getDisplayMetrics().density);
    }

    /* renamed from: d */
    public final int mo23015d(int i) {
        return (int) (((float) i) / this.f49127b.getResources().getDisplayMetrics().density);
    }
}
