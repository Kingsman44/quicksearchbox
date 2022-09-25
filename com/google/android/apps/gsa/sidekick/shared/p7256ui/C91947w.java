package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.w */
/* compiled from: PG */
public final class C91947w extends C90953s {

    /* renamed from: a */
    private final WeakReference f256429a;

    /* renamed from: b */
    private final Context f256430b;

    /* renamed from: c */
    private final int f256431c;

    /* renamed from: d */
    private final boolean f256432d;

    public C91947w(C91948x xVar, Context context, int i, boolean z) {
        super("WebIconImageSpan");
        this.f256429a = new WeakReference(xVar);
        this.f256430b = context;
        this.f256431c = i;
        this.f256432d = z;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        C91948x xVar = (C91948x) this.f256429a.get();
        if (xVar != null && drawable != null) {
            int i = this.f256431c;
            int i2 = 2;
            if (i == 0) {
                boolean z = this.f256432d;
                Drawable mutate = drawable.mutate();
                xVar.f256435b.setDrawableByLayerId(R.id.icon, mutate);
                int height = xVar.f256435b.getBounds().height();
                if (true != z) {
                    i2 = 0;
                }
                mutate.setBounds(C91948x.m150881b(mutate, height, true, i2));
                xVar.f256434a.invalidate();
                return;
            }
            Context context = this.f256430b;
            Drawable mutate2 = drawable.mutate();
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.dark_bg);
            drawable2.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
            xVar.f256435b.setDrawableByLayerId(R.id.icon, new LayerDrawable(new Drawable[]{drawable2, mutate2}));
            Rect b = C91948x.m150881b(mutate2, xVar.f256435b.getBounds().height(), true, 0);
            mutate2.setBounds(b.left + 3, b.top + 3, b.right + 3, b.bottom);
            drawable2.setBounds(0, 0, b.right + 6, b.bottom + 4);
            xVar.f256434a.invalidate();
        }
    }
}
