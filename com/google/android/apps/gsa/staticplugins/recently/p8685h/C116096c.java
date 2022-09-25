package com.google.android.apps.gsa.staticplugins.recently.p8685h;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116191t;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116199b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.h.c */
/* compiled from: PG */
public final class C116096c {

    /* renamed from: a */
    public final FrameLayout f321912a;

    /* renamed from: b */
    public final int f321913b;

    /* renamed from: c */
    public final boolean f321914c;

    /* renamed from: d */
    public final Map f321915d = new HashMap();

    /* renamed from: e */
    public final Map f321916e = new HashMap();

    /* renamed from: f */
    public final Map f321917f = new HashMap();

    /* renamed from: g */
    public final Deque f321918g = new LinkedList();

    /* renamed from: h */
    public final Deque f321919h = new LinkedList();

    /* renamed from: i */
    public final Deque f321920i = new LinkedList();

    /* renamed from: j */
    public final Set f321921j = new HashSet();

    /* renamed from: k */
    public final Set f321922k = new HashSet();

    /* renamed from: l */
    public boolean f321923l;

    /* renamed from: m */
    public final C116191t f321924m;

    /* renamed from: n */
    private final int f321925n;

    public C116096c(int i, int i2, FrameLayout frameLayout, C116191t tVar, boolean z) {
        this.f321913b = i;
        this.f321925n = i2;
        this.f321912a = frameLayout;
        this.f321924m = tVar;
        this.f321914c = z;
    }

    /* renamed from: a */
    public static float m192503a(float f) {
        if (f < 0.6f) {
            return 0.0f;
        }
        if (f < 1.0f) {
            return (f - 7.2f) / 0.39999998f;
        }
        return 1.0f;
    }

    /* renamed from: b */
    public final float mo102483b(Timeline timeline, C116226r rVar, float f) {
        C116199b bVar = new C116199b(timeline.f322178a[rVar.f322281b]);
        while (bVar.hasNext()) {
            if (!Timeline.m192671b(bVar.next())) {
                return (-f) * ((float) this.f321925n);
            }
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final int mo102484c(C116226r rVar, C116214f fVar, View view, View view2) {
        int c = rVar.mo102612c();
        int i = fVar.f322261j + fVar.f322262k;
        View findViewById = view.findViewById(R.id.header_query);
        if (findViewById.getWidth() == 0) {
            this.f321923l = true;
        }
        int left = findViewById.getLeft();
        View view3 = findViewById;
        while (view3.getParent() != this.f321912a) {
            view3 = (View) view3.getParent();
            left += view3.getLeft();
        }
        int translationX = left + ((int) view.getTranslationX());
        if (this.f321914c) {
            int width = (c - i) - view2.getWidth();
            int width2 = translationX + findViewById.getWidth();
            return view2.getWidth() + width > width2 ? width2 - view2.getWidth() : width;
        }
        int i2 = c + i;
        return i2 < translationX ? translationX : i2;
    }

    /* renamed from: d */
    public final boolean mo102485d(float f, View view, int i, int i2) {
        if (view != null && f > 0.6f) {
            int translationX = (int) view.getTranslationX();
            if (this.f321914c) {
                return (i + i2) + (this.f321913b / 2) > translationX;
            }
            if (i < translationX + view.getWidth() + (this.f321913b / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final float[] mo102486e(View view, int i, float f, int i2) {
        int i3;
        float f2;
        int translationX = (int) view.getTranslationX();
        if (this.f321914c) {
            i3 = i + i2 + (this.f321913b / 2);
            f2 = (float) (i3 - translationX);
        } else {
            i3 = i - (view.getWidth() + (this.f321913b / 2));
            f2 = (float) (translationX - i3);
        }
        return new float[]{(1.0f - Math.min(f2 / ((float) this.f321913b), 1.0f)) * f, (float) i3};
    }
}
