package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.protos.p4932ax.p4933a.C64269i;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.u */
/* compiled from: PG */
public final class C138668u {

    /* renamed from: a */
    private final Context f377165a;

    /* renamed from: b */
    private final C47770dh f377166b;

    /* renamed from: c */
    private final boolean f377167c;

    /* renamed from: d */
    private final boolean f377168d;

    public C138668u(Context context, C47770dh dhVar, boolean z, boolean z2) {
        this.f377165a = context;
        this.f377166b = dhVar;
        this.f377167c = z;
        this.f377168d = z2;
    }

    /* renamed from: a */
    public final void mo114458a(ViewGroup viewGroup, C138030av avVar, List list) {
        LayoutInflater from = LayoutInflater.from(this.f377165a);
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C64269i iVar = (C64269i) it.next();
            MaterialButton materialButton = (MaterialButton) from.inflate(R.layout.googleapp_suggestion_enhancement, viewGroup, false);
            materialButton.setText(iVar.f173766b);
            if (!this.f377167c) {
                materialButton.mo28945lq((Drawable) null);
                materialButton.setPaddingRelative(this.f377165a.getResources().getDimensionPixelOffset(R.dimen.googleapp_core_suggestion_enhancement_without_icon_padding_start), materialButton.getPaddingTop(), materialButton.getPaddingEnd(), materialButton.getPaddingBottom());
            }
            materialButton.setOnClickListener(new C47591co(this.f377166b, "Clicked suggestion enhancement", new C138666s(avVar, iVar, materialButton)));
            if (this.f377168d) {
                materialButton.setOnTouchListener(new C138626ae(new C47586cj(this.f377166b, new C138667t(iVar, materialButton), "Touched suggestion")));
            }
            viewGroup.addView(materialButton);
        }
    }
}
