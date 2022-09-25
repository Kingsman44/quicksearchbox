package com.facebook.litho.p322a;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.C6185de;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.p316c.C6033a;
import com.facebook.p313c.p316c.C6035c;
import com.facebook.p313c.p317d.C6038a;
import java.util.List;

/* renamed from: com.facebook.litho.a.e */
/* compiled from: PG */
final class C6072e implements C6076i {
    /* renamed from: a */
    public final float mo12760a(Object obj) {
        int width;
        if (obj instanceof View) {
            width = ((View) obj).getWidth();
        } else if (obj instanceof Drawable) {
            width = ((Drawable) obj).getBounds().width();
        } else {
            throw new UnsupportedOperationException("Getting width from unsupported mount content: ".concat(obj.toString()));
        }
        return (float) width;
    }

    /* renamed from: b */
    public final String mo12761b() {
        return "width";
    }

    /* renamed from: c */
    public final void mo12762c(Object obj) {
    }

    /* renamed from: d */
    public final void mo12763d(Object obj, float f) {
        if (obj instanceof C6040e) {
            C6040e eVar = (C6040e) obj;
            if (eVar instanceof C6033a) {
                ((C6033a) eVar).mo12592A((int) f);
            } else {
                int left = eVar.getLeft();
                C6038a.m15531c(left, eVar.getTop(), (int) (((float) left) + f), eVar.getBottom(), (Rect) null, eVar, false);
            }
            List d = C6075h.m15769d(eVar);
            if (d != null) {
                int i = (int) f;
                int height = eVar.getHeight();
                for (int i2 = 0; i2 < d.size(); i2++) {
                    C6035c.m15518b((Drawable) d.get(i2), i, height);
                }
            }
        } else if (obj instanceof View) {
            View view = (View) obj;
            int left2 = view.getLeft();
            C6038a.m15531c(left2, view.getTop(), (int) (((float) left2) + f), view.getBottom(), (Rect) null, view, false);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            C6035c.m15518b(drawable, (int) f, drawable.getBounds().height());
        } else {
            throw new UnsupportedOperationException("Setting width on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* renamed from: e */
    public final float mo12764e(C6185de deVar) {
        return (float) deVar.f18256f.width();
    }
}
