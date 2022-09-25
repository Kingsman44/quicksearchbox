package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91826c;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105450t;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dt */
/* compiled from: PG */
final class C105573dt implements C91826c {

    /* renamed from: a */
    boolean f294505a = false;

    /* renamed from: b */
    final /* synthetic */ C105574du f294506b;

    public C105573dt(C105574du duVar) {
        this.f294506b = duVar;
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
        if (((C105499b) this.f294506b.f294521j).f294304c.getVisibility() == 0) {
            if (i != 0 && this.f294505a) {
                C105574du duVar = this.f294506b;
                duVar.f294517f -= i;
                duVar.mo94919j(duVar.f294514c, true);
            }
            if (i2 != 0) {
                C105574du duVar2 = this.f294506b;
                duVar2.f294518g -= i2;
                duVar2.mo94920k(duVar2.f294515d);
            }
        }
    }

    /* renamed from: h */
    public final void mo86307h(View view, String str, int i) {
        boolean z = false;
        if (i == 1 || i == 2) {
            C105574du duVar = this.f294506b;
            int e = duVar.mo94916e(duVar.f294514c);
            C105574du duVar2 = this.f294506b;
            float f = (float) (e + duVar2.f294517f);
            float g = (float) (duVar2.mo94917g(duVar2.f294515d) + this.f294506b.f294518g);
            if (f >= view.getX() && f <= view.getX() + ((float) view.getWidth()) && g >= view.getY() && g <= view.getY() + ((float) view.getHeight())) {
                C105574du duVar3 = this.f294506b;
                if (!(duVar3.f294514c == 0 || duVar3.f294515d == 0)) {
                    z = true;
                }
            }
            this.f294505a = z;
            C105574du duVar4 = this.f294506b;
            if (!duVar4.f294520i) {
                duVar4.mo94921l(C58833ax.m90834k(C105450t.COLLAPSING));
                return;
            }
            return;
        }
        this.f294505a = false;
    }
}
