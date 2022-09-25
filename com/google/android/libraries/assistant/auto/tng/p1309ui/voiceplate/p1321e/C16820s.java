package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13081a;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13101e;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16788f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16789g;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.s */
/* compiled from: PG */
public final class C16820s {

    /* renamed from: a */
    public static final C59071e f49252a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.s");

    /* renamed from: b */
    public final C16782d f49253b;

    /* renamed from: c */
    public final View f49254c;

    /* renamed from: d */
    public final ady f49255d;

    /* renamed from: e */
    public final C16789g f49256e;

    /* renamed from: f */
    public C13101e f49257f = new C13081a().mo20879a();

    /* renamed from: g */
    public C16788f f49258g = new C16788f(1.0d, 0, 0);

    public C16820s(C16782d dVar, View view, ady ady) {
        this.f49253b = dVar;
        this.f49254c = view;
        this.f49255d = ady;
        this.f49256e = new C16789g(view);
    }

    /* renamed from: b */
    public static void m33853b(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() != 0) {
            viewGroup.getChildAt(0).setVisibility(8);
        }
        viewGroup.removeAllViews();
    }

    /* renamed from: c */
    public static void m33854c(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) Objects.requireNonNull(view.getLayoutParams());
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final ViewGroup mo23042a() {
        ViewGroup viewGroup = (ViewGroup) this.f49254c.findViewById(R.id.app_actions_view);
        if (viewGroup != null) {
            return viewGroup;
        }
        return (ViewGroup) ((ViewStub) this.f49254c.findViewById(R.id.app_actions_view_stub)).inflate().findViewById(R.id.app_actions_view);
    }
}
