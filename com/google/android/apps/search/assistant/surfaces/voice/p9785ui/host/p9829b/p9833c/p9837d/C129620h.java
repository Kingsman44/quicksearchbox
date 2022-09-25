package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9837d;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2050bp;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.shelf.ShelfView;
import com.google.android.googlequicksearchbox.R;
import java.util.Iterator;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.d.h */
/* compiled from: PG */
public final class C129620h {
    /* renamed from: a */
    public static final View m211640a(View view) {
        C69664n.m101061g(view, "<this>");
        View c = m211642c(view, R.string.assistant_shelf);
        if (c != null) {
            return c;
        }
        View b = m211641b(view, C129618f.f355743a);
        if (true != (b instanceof ShelfView)) {
            b = null;
        }
        return (ShelfView) b;
    }

    /* renamed from: b */
    public static final View m211641b(View view, C69626l lVar) {
        if (((Boolean) lVar.mo5761a(view)).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            Iterator a = C2050bp.m5609a((ViewGroup) view).mo5191a();
            while (a.hasNext()) {
                View b = m211641b((View) a.next(), lVar);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final View m211642c(View view, int i) {
        String string = view.getContext().getString(i);
        C69664n.m101060f(string, "context.getString(transitionNameRes)");
        return m211641b(view, new C129619g(string));
    }
}
