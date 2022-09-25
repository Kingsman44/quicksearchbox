package com.google.android.apps.gsa.searchnow;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7148ui.p7151c.C90663a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;

/* compiled from: PG */
public class SearchNowDrawerLayout extends C90663a {

    /* renamed from: h */
    View f240555h;

    /* renamed from: com.google.android.apps.gsa.searchnow.SearchNowDrawerLayout$a */
    /* compiled from: PG */
    public interface C88847a {
        /* renamed from: sk */
        void mo82637sk();
    }

    public SearchNowDrawerLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        super.fitSystemWindows(rect);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setWillNotDraw(false);
        ((C88847a) C47266f.m84076a(getContext(), C88847a.class)).mo82637sk();
        this.f240555h = findViewById(R.id.search_wrapper);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo82635x() {
        Rect rect = this.f253553p;
        if (rect == null) {
            return 0;
        }
        return rect.bottom;
    }

    /* renamed from: y */
    public final void mo82636y(Rect rect) {
        super.mo82636y(rect);
        getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f240555h.getLayoutParams();
        marginLayoutParams.leftMargin = rect.left;
        marginLayoutParams.rightMargin = rect.right;
        marginLayoutParams.topMargin = rect.top;
        this.f240555h.setLayoutParams(marginLayoutParams);
        mo84960A();
    }

    public SearchNowDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchNowDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
