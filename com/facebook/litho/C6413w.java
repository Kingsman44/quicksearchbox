package com.facebook.litho;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.p060c.C0985o;
import com.facebook.p313c.C6051j;

/* renamed from: com.facebook.litho.w */
/* compiled from: PG */
final class C6413w {

    /* renamed from: a */
    public Canvas f19023a;

    /* renamed from: b */
    public int f19024b;

    /* renamed from: c */
    public int f19025c;

    /* renamed from: d */
    final /* synthetic */ ComponentHost f19026d;

    public C6413w(ComponentHost componentHost) {
        this.f19026d = componentHost;
    }

    /* renamed from: b */
    public final boolean mo13478b() {
        return this.f19023a != null && this.f19024b < this.f19025c;
    }

    /* renamed from: a */
    public final void mo13477a() {
        int i;
        int i2;
        if (this.f19023a != null) {
            int i3 = this.f19024b;
            C0985o oVar = this.f19026d.f17842a;
            if (oVar == null) {
                i = 0;
            } else {
                i = oVar.mo3725d();
            }
            while (true) {
                if (i3 >= i) {
                    i2 = this.f19025c;
                    break;
                }
                C6051j jVar = (C6051j) this.f19026d.f17842a.mo3727f(i3);
                Object obj = jVar.f17803a;
                if (obj instanceof View) {
                    i2 = i3 + 1;
                    break;
                }
                if (!jVar.f17805c) {
                    this.f19026d.f17849h++;
                } else {
                    ((Drawable) obj).draw(this.f19023a);
                }
                i3++;
            }
            this.f19024b = i2;
        }
    }
}
