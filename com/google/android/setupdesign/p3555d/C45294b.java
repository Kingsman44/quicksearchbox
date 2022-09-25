package com.google.android.setupdesign.p3555d;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: com.google.android.setupdesign.d.b */
/* compiled from: PG */
final class C45294b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ TextView f118338a;

    /* renamed from: b */
    final /* synthetic */ C45295c f118339b;

    public C45294b(C45295c cVar, TextView textView) {
        this.f118339b = cVar;
        this.f118338a = textView;
    }

    public final boolean onPreDraw() {
        this.f118338a.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = this.f118338a.getLineCount();
        C45295c cVar = this.f118339b;
        if (lineCount <= cVar.f118344e) {
            return true;
        }
        this.f118338a.setTextSize(0, cVar.f118342c);
        TextView textView = this.f118338a;
        C45295c cVar2 = this.f118339b;
        textView.setLineHeight(Math.round(cVar2.f118343d + cVar2.f118342c));
        this.f118338a.invalidate();
        return false;
    }
}
