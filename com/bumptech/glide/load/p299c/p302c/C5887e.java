package com.bumptech.glide.load.p299c.p302c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import androidx.core.content.C1877c;
import androidx.core.content.p091b.C1874w;
import androidx.p043a.p044a.C0782b;

/* renamed from: com.bumptech.glide.load.c.c.e */
/* compiled from: PG */
public final class C5887e {

    /* renamed from: a */
    private static volatile boolean f17503a = true;

    /* renamed from: a */
    public static Drawable m15219a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f17503a) {
                return C0678gm.m2375e().mo3100c(theme != null ? new C0782b(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            f17503a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C1877c.m5125a(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return C1874w.m5109f(context2.getResources(), i, theme);
    }
}
