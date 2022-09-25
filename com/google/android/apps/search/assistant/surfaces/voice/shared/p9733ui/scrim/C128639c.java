package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.scrim;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128628g;
import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.scrim.c */
/* compiled from: PG */
final class C128639c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ScrimView f353648a;

    public C128639c(ScrimView scrimView) {
        this.f353648a = scrimView;
    }

    public final boolean onPreDraw() {
        View view;
        float f;
        ScrimView scrimView = this.f353648a;
        scrimView.f353641c.setBounds(0, 0, scrimView.getRight() - scrimView.getLeft(), scrimView.getBottom() - scrimView.getTop());
        C128638b bVar = scrimView.f353643e;
        Rect bounds = scrimView.f353641c.getBounds();
        C69664n.m101060f(bounds, "scrimDrawable.bounds");
        int i = scrimView.f353640b;
        int i2 = -1;
        if (i == -1) {
            view = scrimView.getChildCount() > 0 ? scrimView.getChildAt(0) : null;
        } else {
            view = scrimView.findViewById(i);
        }
        if (view != null) {
            C128628g.m209924b(scrimView, view, scrimView.f353642d);
            if (!scrimView.f353642d.intersect(scrimView.f353641c.getBounds())) {
                scrimView.f353642d.set(ScrimView.f353638a);
            }
        } else {
            scrimView.f353642d.set(ScrimView.f353638a);
        }
        Rect rect = scrimView.f353642d;
        C69664n.m101061g(bounds, "scrimBounds");
        C69664n.m101061g(rect, "contentBounds");
        float height = ((float) rect.height()) / ((float) bounds.height());
        float[] fArr = bVar.f353646a;
        if (height > fArr[0]) {
            if (height >= fArr[4]) {
                i2 = 4;
            } else {
                i2 = Arrays.binarySearch(fArr, 0, 5, height);
                if (i2 < 0) {
                    i2 = Math.abs(i2) - 2;
                }
            }
        }
        if (i2 < 0) {
            f = bVar.f353647b[0];
        } else if (i2 >= 4) {
            f = bVar.f353647b[4];
        } else {
            float[] fArr2 = bVar.f353646a;
            float f2 = fArr2[i2];
            int i3 = i2 + 1;
            float f3 = fArr2[i3];
            float[] fArr3 = bVar.f353647b;
            float f4 = fArr3[i2];
            f = f4 + (((height - f2) / (f3 - f2)) * (fArr3[i3] - f4));
        }
        scrimView.f353641c.setColor(Color.argb((int) (f * 255.0f), Color.red(0), Color.green(0), Color.blue(0)));
        return true;
    }
}
