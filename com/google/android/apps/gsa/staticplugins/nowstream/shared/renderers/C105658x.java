package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.support.p033v7.widget.C0653fo;
import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91826c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.x */
/* compiled from: PG */
final class C105658x implements C91826c {

    /* renamed from: a */
    final /* synthetic */ C105474ab f294771a;

    public C105658x(C105474ab abVar) {
        this.f294771a = abVar;
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
    }

    /* renamed from: h */
    public final void mo86307h(View view, String str, int i) {
        if (i == 0) {
            C105474ab abVar = this.f294771a;
            abVar.mo94834P(abVar.mo94825G());
            C105474ab abVar2 = this.f294771a;
            if (abVar2.f63126Q.mo28316z()) {
                int intValue = ((Integer) abVar2.mo94825G().first).intValue();
                if (intValue == -1) {
                    abVar2.f294198f.mo94584c(0, 0, false);
                    return;
                }
                C0653fo foVar = abVar2.f294209q.mLayout;
                View findViewByPosition = foVar != null ? foVar.findViewByPosition(intValue) : null;
                if (findViewByPosition == null) {
                    abVar2.f294198f.mo94584c(intValue, 0, false);
                } else {
                    abVar2.f294198f.mo94584c(intValue, findViewByPosition.getTop(), false);
                }
            }
        } else if (i == 1) {
            C105474ab abVar3 = this.f294771a;
            abVar3.mo94828J(false, abVar3.mo94825G());
        }
    }
}
