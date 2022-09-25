package com.google.android.setupcompat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3550b.C45245b;
import com.google.android.setupcompat.template.FooterActionButton;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private static final C45245b f118302a = new C45245b("ButtonBarLayout");

    /* renamed from: b */
    private boolean f118303b = false;

    /* renamed from: c */
    private int f118304c;

    /* renamed from: d */
    private int f118305d;

    public ButtonBarLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m80687a(boolean z) {
        if (this.f118303b != z) {
            this.f118303b = z;
            int childCount = getChildCount();
            boolean z2 = false;
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (z) {
                    childAt.setTag(R.id.suc_customization_original_weight, Float.valueOf(layoutParams.weight));
                    layoutParams.weight = 0.0f;
                    layoutParams.leftMargin = 0;
                } else {
                    Float f = (Float) childAt.getTag(R.id.suc_customization_original_weight);
                    if (f != null) {
                        layoutParams.weight = f.floatValue();
                    } else {
                        z2 = true;
                    }
                    if (m80688b(childAt)) {
                        i++;
                    }
                }
                childAt.setLayoutParams(layoutParams);
            }
            setOrientation(z ? 1 : 0);
            if (!z2) {
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break;
                    }
                    bringChildToFront(getChildAt(childCount));
                }
            } else {
                f118302a.mo49115e("Reorder the FooterActionButtons in the container");
                ArrayList arrayList = new ArrayList();
                if (i <= 1) {
                    arrayList.addAll(Collections.nCopies(3, (Object) null));
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = getChildAt(i3);
                    if (i <= 1) {
                        if (m80688b(childAt2)) {
                            arrayList.set(2, childAt2);
                        } else if (!(childAt2 instanceof FooterActionButton)) {
                            arrayList.set(1, childAt2);
                        } else {
                            arrayList.set(0, childAt2);
                        }
                    } else if (!(childAt2 instanceof FooterActionButton)) {
                        arrayList.add(1, childAt2);
                    } else {
                        arrayList.add(getChildAt(i3));
                    }
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    View view = (View) arrayList.get(i4);
                    if (view != null) {
                        bringChildToFront(view);
                    }
                }
            }
            if (z) {
                setHorizontalGravity(17);
                this.f118304c = getPaddingLeft();
                int paddingRight = getPaddingRight();
                this.f118305d = paddingRight;
                int max = Math.max(this.f118304c, paddingRight);
                setPadding(max, getPaddingTop(), max, getPaddingBottom());
                return;
            }
            setPadding(this.f118304c, getPaddingTop(), this.f118305d, getPaddingBottom());
        }
    }

    /* renamed from: b */
    private static final boolean m80688b(View view) {
        return (view instanceof FooterActionButton) && ((FooterActionButton) view).f118258b;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        m80687a(false);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        Context context = getContext();
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((childAt instanceof FooterActionButton) && ((FooterActionButton) childAt).f118258b) {
                i4++;
            }
        }
        if ((i4 != 2 || context.getResources().getConfiguration().smallestScreenWidthDp < 600 || !C45240c.m80578o(context)) && getMeasuredWidth() > size) {
            m80687a(true);
        } else if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
