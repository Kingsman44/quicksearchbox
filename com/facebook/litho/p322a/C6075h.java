package com.facebook.litho.p322a;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.C6201du;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6051j;
import com.facebook.p313c.C6064w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.a.h */
/* compiled from: PG */
public final class C6075h {

    /* renamed from: a */
    public static final C6076i f17956a = new C6073f();

    /* renamed from: b */
    public static final C6076i f17957b = new C6074g();

    /* renamed from: c */
    public static final C6076i f17958c = new C6072e();

    /* renamed from: d */
    public static final C6076i f17959d = new C6069b();

    /* renamed from: e */
    public static final C6076i f17960e = new C6068a();

    /* renamed from: f */
    public static final C6076i f17961f = new C6071d();

    /* renamed from: g */
    public static final C6076i f17962g = new C6070c();

    /* renamed from: a */
    public static float m15766a(View view, boolean z) {
        float f = 0.0f;
        while (view != null && (view.getParent() instanceof View)) {
            if ((view instanceof C6040e) && (view instanceof C6064w)) {
                return f;
            }
            f += z ? view.getX() : view.getY();
            view = (View) view.getParent();
        }
        return f;
    }

    /* renamed from: b */
    public static View m15767b(Object obj, C6076i iVar) {
        if (obj instanceof View) {
            return (View) obj;
        }
        String b = iVar.mo12761b();
        String valueOf = String.valueOf(obj);
        throw new RuntimeException("Animating '" + b + "' is only supported on Views (got " + valueOf + ")");
    }

    /* renamed from: c */
    public static View m15768c(Drawable drawable) {
        Drawable.Callback callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }

    /* renamed from: d */
    public static List m15769d(C6040e eVar) {
        int a = eVar.mo12601a();
        ArrayList arrayList = null;
        for (int i = 0; i < a; i++) {
            C6051j c = eVar.mo12602c(i);
            if ((c.f17803a instanceof Drawable) && (((C6201du) c.f17806d.f17827b).f18345a.f18257g & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Drawable) c.f17803a);
            }
        }
        return arrayList;
    }
}
