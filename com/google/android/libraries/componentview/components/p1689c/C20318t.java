package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.c.t */
/* compiled from: PG */
public abstract class C20318t extends C20078ci {

    /* renamed from: a */
    private LinearLayout f57104a;

    /* renamed from: c */
    public final C20524l f57105c;

    /* renamed from: g */
    public CompoundButton f57106g;

    public C20318t(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20524l lVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f57105c = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo25357D(boolean z, C19983f fVar, C19983f fVar2, boolean z2) {
        this.f57106g.setChecked(z);
        this.f57104a.addView(this.f57106g, 0);
        this.f57104a.setOnClickListener(new C20317s(this, fVar, fVar2));
        this.f57104a.setClickable(z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* bridge */ /* synthetic */ View mo25110e(Context context) {
        throw null;
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final LinearLayout mo25358m(Context context) {
        this.f57106g.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f57106g.setClickable(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f57104a = linearLayout;
        linearLayout.setOrientation(0);
        this.f57104a.setVerticalGravity(17);
        return this.f57104a;
    }
}
