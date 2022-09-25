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

/* renamed from: com.facebook.litho.a.b */
/* compiled from: PG */
final class C6069b implements C6076i {
    /* renamed from: a */
    public final float mo12760a(Object obj) {
        int height;
        if (obj instanceof View) {
            height = ((View) obj).getHeight();
        } else if (obj instanceof Drawable) {
            height = ((Drawable) obj).getBounds().height();
        } else {
            throw new UnsupportedOperationException("Getting height from unsupported mount content: ".concat(obj.toString()));
        }
        return (float) height;
    }

    /* renamed from: b */
    public final String mo12761b() {
        return "height";
    }

    /* renamed from: c */
    public final void mo12762c(Object obj) {
    }

    /* renamed from: d */
    public final void mo12763d(Object obj, float f) {
        if (obj instanceof C6040e) {
            C6040e eVar = (C6040e) obj;
            if (eVar instanceof C6033a) {
                ((C6033a) eVar).mo12594z((int) f);
            } else {
                int top = eVar.getTop();
                C6038a.m15531c(eVar.getLeft(), top, eVar.getRight(), (int) (((float) top) + f), (Rect) null, eVar, false);
            }
            List d = C6075h.m15769d(eVar);
            if (d != null) {
                int width = eVar.getWidth();
                int i = (int) f;
                for (int i2 = 0; i2 < d.size(); i2++) {
                    C6035c.m15518b((Drawable) d.get(i2), width, i);
                }
            }
        } else if (obj instanceof View) {
            View view = (View) obj;
            int top2 = view.getTop();
            C6038a.m15531c(view.getLeft(), top2, view.getRight(), (int) (((float) top2) + f), (Rect) null, view, false);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            C6035c.m15518b(drawable, drawable.getBounds().width(), (int) f);
        } else {
            throw new UnsupportedOperationException("Setting height on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* renamed from: e */
    public final float mo12764e(C6185de deVar) {
        return (float) deVar.f18256f.height();
    }
}
