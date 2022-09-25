package com.facebook.litho.p322a;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.C6185de;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6064w;
import com.facebook.p313c.p316c.C6035c;

/* renamed from: com.facebook.litho.a.f */
/* compiled from: PG */
final class C6073f implements C6076i {
    /* renamed from: a */
    public final float mo12760a(Object obj) {
        if ((obj instanceof C6040e) && (obj instanceof C6064w)) {
            return ((C6040e) obj).getX();
        }
        if (obj instanceof View) {
            return C6075h.m15766a((View) obj, true);
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            return C6075h.m15766a(C6075h.m15768c(drawable), true) + ((float) drawable.getBounds().left);
        }
        throw new UnsupportedOperationException("Getting X from unsupported mount content: ".concat(obj.toString()));
    }

    /* renamed from: b */
    public final String mo12761b() {
        return "x";
    }

    /* renamed from: c */
    public final void mo12762c(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
        }
    }

    /* renamed from: d */
    public final void mo12763d(Object obj, float f) {
        if ((obj instanceof C6040e) && (obj instanceof C6064w)) {
            ((View) obj).setX(f);
        } else if (obj instanceof View) {
            View view = (View) obj;
            view.setX(f - C6075h.m15766a((View) view.getParent(), true));
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            C6035c.m15519c(drawable, (int) (f - C6075h.m15766a(C6075h.m15768c(drawable), true)), drawable.getBounds().top);
        } else {
            throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* renamed from: e */
    public final float mo12764e(C6185de deVar) {
        return (float) deVar.f18256f.left;
    }
}
