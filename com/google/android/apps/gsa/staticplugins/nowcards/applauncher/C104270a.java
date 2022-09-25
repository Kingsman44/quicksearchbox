package com.google.android.apps.gsa.staticplugins.nowcards.applauncher;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.applauncher.a */
/* compiled from: PG */
final class C104270a extends C90953s {

    /* renamed from: a */
    private final WeakReference f290038a;

    public C104270a(AppIconView appIconView) {
        super("AppIconView");
        this.f290038a = new WeakReference(appIconView);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        AppIconView appIconView = (AppIconView) this.f290038a.get();
        if (appIconView != null && drawable != null) {
            int dimensionPixelSize = appIconView.getResources().getDimensionPixelSize(R.dimen.launcher_strip_icon_size);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            appIconView.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        }
    }
}
