package com.facebook.litho.p322a;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.C6185de;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6064w;
import com.facebook.p313c.p316c.C6035c;

/* renamed from: com.facebook.litho.a.g */
/* compiled from: PG */
final class C6074g implements C6076i {
    /* renamed from: a */
    public final float mo12760a(Object obj) {
        if ((obj instanceof C6040e) && (obj instanceof C6064w)) {
            return ((C6040e) obj).getY();
        }
        if (obj instanceof View) {
            return C6075h.m15766a((View) obj, false);
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            return C6075h.m15766a(C6075h.m15768c(drawable), false) + ((float) drawable.getBounds().top);
        }
        throw new UnsupportedOperationException("Getting Y from unsupported mount content: ".concat(obj.toString()));
    }

    /* renamed from: b */
    public final String mo12761b() {
        return "y";
    }

    /* renamed from: c */
    public final void mo12762c(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
        }
    }

    /* renamed from: d */
    public final void mo12763d(Object obj, float f) {
        if ((obj instanceof C6040e) && (obj instanceof C6064w)) {
            ((View) obj).setY(f);
        } else if (obj instanceof View) {
            View view = (View) obj;
            view.setY(f - C6075h.m15766a((View) view.getParent(), false));
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            C6035c.m15519c(drawable, drawable.getBounds().left, (int) (f - C6075h.m15766a(C6075h.m15768c(drawable), false)));
        } else {
            throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* renamed from: e */
    public final float mo12764e(C6185de deVar) {
        return (float) deVar.f18256f.top;
    }
}
