package com.google.android.apps.search.googleapp.promomanager.p10377f.p10379b;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.b.f */
/* compiled from: PG */
final class C137104f extends ViewOutlineProvider {

    /* renamed from: a */
    private final Path f373085a = new Path();

    public final void getOutline(View view, Outline outline) {
        this.f373085a.reset();
        this.f373085a.moveTo(0.0f, 0.0f);
        this.f373085a.lineTo(((float) view.getWidth()) / 2.0f, (float) view.getHeight());
        this.f373085a.moveTo((float) view.getWidth(), 0.0f);
        this.f373085a.close();
        if (this.f373085a.isConvex()) {
            outline.setConvexPath(this.f373085a);
        } else {
            outline.setEmpty();
        }
    }
}
