package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.ActionMenuView;
import android.support.p033v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.material.internal.bg */
/* compiled from: PG */
public final class C44735bg {

    /* renamed from: a */
    public static final Comparator f116598a = new C44734bf();

    /* renamed from: a */
    public static ActionMenuView m79302a(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ImageButton m79303b(Toolbar toolbar) {
        Drawable e = toolbar.mo2391e();
        if (e != null) {
            for (int i = 0; i < toolbar.getChildCount(); i++) {
                View childAt = toolbar.getChildAt(i);
                if (childAt instanceof ImageButton) {
                    ImageButton imageButton = (ImageButton) childAt;
                    if (imageButton.getDrawable() == e) {
                        return imageButton;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static List m79304c(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
