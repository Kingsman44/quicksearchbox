package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7608d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97207b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97208c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BubbleView;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97044g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147444h;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.d.j */
/* compiled from: PG */
public final class C97204j implements C97208c {

    /* renamed from: a */
    public static final C147454r f271582a = new C147454r(400.0f, 0.75f);

    /* renamed from: c */
    private static final C59071e f271583c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.d.j");

    /* renamed from: d */
    private static final C147454r f271584d = new C147454r(250.0f, 0.75f);

    /* renamed from: b */
    public final BubbleView f271585b;

    /* renamed from: e */
    private final WindowManager f271586e;

    /* renamed from: f */
    private final ViewGroup f271587f;

    /* renamed from: g */
    private final HashMap f271588g;

    /* renamed from: h */
    private final C147444h f271589h;

    /* renamed from: i */
    private final int f271590i;

    /* renamed from: j */
    private int f271591j = 2;

    public C97204j(Context context) {
        HashMap hashMap = new HashMap();
        this.f271588g = hashMap;
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        this.f271586e = windowManager;
        BubbleView bubbleView = (BubbleView) LayoutInflater.from(context).inflate(R.layout.search_trash_layout, (ViewGroup) null);
        this.f271585b = bubbleView;
        ViewGroup viewGroup = (ViewGroup) bubbleView.findViewById(R.id.search_bubble_trash_layout_buttons);
        this.f271587f = viewGroup;
        C147444h hVar = new C147444h(viewGroup, View.TRANSLATION_Y);
        hVar.f397996b = f271584d;
        this.f271589h = hVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.search_bubble_trash_layout_bottom_buttons_container_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.search_bubble_trash_layout_bottom_buttons_margin);
        int i = dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2;
        this.f271590i = i;
        hVar.mo124186l((float) i);
        hashMap.put(C97207b.DROP, new C97203i(bubbleView.findViewById(R.id.search_bubble_turn_off_button)));
        hashMap.put(C97207b.TEMPORARY_HIDE, new C97203i(bubbleView.findViewById(R.id.search_bubble_temporary_hide_button)));
        m160899h(false);
        bubbleView.setVisibility(4);
        WindowManager.LayoutParams a = C97044g.m160631a(-1, -1, 536);
        a.gravity = 80;
        windowManager.addView(bubbleView, a);
    }

    /* renamed from: h */
    private final void m160899h(boolean z) {
        if (this.f271591j != 2) {
            this.f271591j = 2;
            this.f271585b.animate().setStartDelay(300).alpha(0.0f).setDuration(30).withEndAction(new C97202h(this)).start();
            for (C97203i iVar : this.f271588g.values()) {
                if (z) {
                    iVar.mo90589a(0.0f);
                } else {
                    iVar.f271579c.mo124186l(0.0f);
                    iVar.f271578b.mo124186l(0.0f);
                }
            }
            if (z) {
                this.f271589h.mo124179e((float) this.f271590i);
            } else {
                this.f271589h.mo124186l((float) this.f271590i);
            }
        }
    }

    /* renamed from: a */
    public final C97207b mo90536a(View view) {
        for (C97207b bVar : this.f271588g.keySet()) {
            C97203i iVar = (C97203i) this.f271588g.get(bVar);
            iVar.getClass();
            C97219g.m160927c(iVar.f271577a, iVar.f271580d);
            C97219g.m160927c(view, iVar.f271581e);
            if (iVar.f271580d.intersect(iVar.f271581e)) {
                return bVar;
            }
        }
        return C97207b.NONE;
    }

    /* renamed from: b */
    public final void mo90537b(C97207b bVar) {
        if (bVar == C97207b.NONE) {
            ((C59052c) ((C59052c) f271583c.mo56226d()).mo56372aa(18462)).mo56386p("Asked to expand non-existent button. Please check.");
        } else if (this.f271591j != 3) {
            this.f271591j = 3;
            C97203i iVar = (C97203i) this.f271588g.get(bVar);
            iVar.getClass();
            iVar.mo90589a(1.33f);
            this.f271589h.mo124179e(0.0f);
        }
    }

    /* renamed from: c */
    public final void mo90538c() {
        m160899h(true);
    }

    /* renamed from: d */
    public final void mo90539d() {
        BubbleView bubbleView = this.f271585b;
        bubbleView.f271645a = null;
        this.f271586e.removeView(bubbleView);
    }

    /* renamed from: e */
    public final void mo90540e() {
        if (this.f271591j != 1) {
            this.f271585b.setVisibility(0);
            this.f271585b.animate().setStartDelay(0).alpha(1.0f).setDuration(30).start();
            this.f271591j = 1;
            for (C97203i a : this.f271588g.values()) {
                a.mo90589a(1.0f);
            }
            this.f271589h.mo124179e(0.0f);
        }
    }

    /* renamed from: f */
    public final void mo90541f(C1967b bVar) {
    }

    /* renamed from: g */
    public final void mo90542g(Runnable runnable) {
        this.f271585b.f271645a = runnable;
    }
}
