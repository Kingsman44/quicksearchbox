package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class NavigationBar extends LinearLayout implements View.OnClickListener {
    public NavigationBar(Context context) {
        super(m80794a(context));
        m80795b();
    }

    /* renamed from: a */
    private static Context m80794a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudNavBarTheme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            resourceId = fArr[2] > fArr2[2] ? R.style.SudNavBarThemeDark : R.style.SudNavBarThemeLight;
        }
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    /* renamed from: b */
    private final void m80795b() {
        if (!isInEditMode()) {
            View.inflate(getContext(), R.layout.sud_navbar_view, this);
            Button button = (Button) findViewById(R.id.sud_navbar_next);
            Button button2 = (Button) findViewById(R.id.sud_navbar_back);
            Button button3 = (Button) findViewById(R.id.sud_navbar_more);
        }
    }

    public final void onClick(View view) {
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(m80794a(context), attributeSet);
        m80795b();
    }

    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(m80794a(context), attributeSet, i);
        m80795b();
    }
}
