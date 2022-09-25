package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.shelf;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128626e;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.shelf.c */
/* compiled from: PG */
public final class C128642c extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        C69664n.m101061g(view, "view");
        C69664n.m101061g(outline, "outline");
        Context context = view.getContext();
        C69664n.m101060f(context, "view.context");
        int a = C128626e.m209922a(context, R.dimen.assistant_shelf_corner_radius);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + a, (float) a);
    }
}
