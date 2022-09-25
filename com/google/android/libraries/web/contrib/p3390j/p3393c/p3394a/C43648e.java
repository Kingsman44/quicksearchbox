package com.google.android.libraries.web.contrib.p3390j.p3393c.p3394a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43654b;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.android.libraries.web.weblayer.p3446a.p3447a.C44116b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.web.contrib.j.c.a.e */
/* compiled from: PG */
public final class C43648e implements C43654b {

    /* renamed from: a */
    private final C28310af f113900a;

    /* renamed from: b */
    private final C47770dh f113901b;

    /* renamed from: c */
    private final C44116b f113902c;

    public C43648e(C28310af afVar, C44116b bVar, C47770dh dhVar) {
        this.f113900a = afVar;
        this.f113902c = bVar;
        this.f113901b = dhVar;
    }

    /* renamed from: a */
    public final View.OnClickListener mo46670a(View view) {
        return new C47591co(this.f113901b, "Emit url text click event.", new C43645b(view));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ View mo46671b(LayoutInflater layoutInflater, ViewGroup viewGroup, C43664l lVar, View.OnLongClickListener onLongClickListener) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.webx_urlbar_container, viewGroup, false);
        this.f113902c.mo47084c(new C43646c(this, lVar, onLongClickListener, frameLayout));
        this.f113900a.f76997b.mo33800a(C28427h.m53115a(79654)).mo33809b(frameLayout);
        return frameLayout;
    }

    /* renamed from: c */
    public final boolean mo46672c() {
        this.f113902c.mo47084c(C43644a.f113892a);
        return true;
    }
}
