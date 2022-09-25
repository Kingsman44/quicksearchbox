package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.r */
/* compiled from: PG */
public final class C135676r {

    /* renamed from: a */
    public final C28443m f369556a;

    /* renamed from: b */
    private final Context f369557b;

    /* renamed from: c */
    private final C47770dh f369558c;

    /* renamed from: d */
    private final C28306ab f369559d;

    /* renamed from: e */
    private final int f369560e;

    public C135676r(Context context, C28443m mVar, C47770dh dhVar, C28306ab abVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f369557b = context;
        this.f369556a = mVar;
        this.f369558c = dhVar;
        this.f369559d = abVar;
        this.f369560e = context.getResources().getDimensionPixelSize(R.dimen.googleapp_browser_size_overflow_item_icon);
    }

    /* renamed from: a */
    public final TextView mo112460a(C135665g gVar, ViewGroup viewGroup) {
        C69664n.m101061g(viewGroup, "parent");
        if (!gVar.f369531a.mo46598e()) {
            return null;
        }
        View inflate = LayoutInflater.from(this.f369557b).inflate(R.layout.googleapp_browser_bottom_sheet_menu_item, viewGroup, false);
        C69664n.m101059e(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setId(gVar.f369531a.mo46594a());
        textView.setText(gVar.f369531a.mo46596c());
        Drawable a = C1877c.m5125a(this.f369557b, gVar.f369532b);
        if (a != null) {
            Rect rect = new Rect();
            rect.left = 0;
            rect.top = 0;
            rect.right = this.f369560e;
            rect.bottom = this.f369560e;
            a.setBounds(rect);
            textView.setCompoundDrawablesRelative(a, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (gVar.f369531a.mo46595b() != 0) {
            C28306ab abVar = this.f369559d;
            abVar.mo33801b(textView, abVar.f76990a.mo33805a(C28427h.m53115a(gVar.f369531a.mo46595b())));
        }
        textView.setOnClickListener(new C47591co(this.f369558c, "Click overflow menu item", new C135675q(gVar, this)));
        return textView;
    }
}
