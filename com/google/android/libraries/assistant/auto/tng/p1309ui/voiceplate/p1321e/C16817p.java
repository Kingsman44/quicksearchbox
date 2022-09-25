package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.C2050bp;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16788f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16789g;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32480m;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32434aa;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32436ac;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32464w;
import com.google.assistant.p3931f.p3940d.p3941a.C52860aj;
import java.util.ArrayList;
import java.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.p */
/* compiled from: PG */
public final /* synthetic */ class C16817p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C16820s f49249a;

    public /* synthetic */ C16817p(C16820s sVar) {
        this.f49249a = sVar;
    }

    public final void accept(Object obj) {
        C16820s sVar = this.f49249a;
        C32434aa aaVar = (C32434aa) obj;
        C52860aj ajVar = aaVar.f86904b;
        if (!ajVar.equals(C52860aj.f138686e)) {
            int i = -1;
            int c = ajVar.f138688a == 1 ? sVar.f49256e.mo23014c(((Float) ajVar.f138689b).floatValue()) : -1;
            int c2 = ajVar.f138690c == 2 ? sVar.f49256e.mo23014c(((Float) ajVar.f138691d).floatValue()) : -1;
            if (c == -1) {
                i = c2;
            } else if (c2 != -1) {
                C16789g gVar = sVar.f49256e;
                int b = gVar.mo23013b();
                int a = sVar.f49256e.mo23012a();
                int max = Math.max(c + gVar.mo23014c(30.0f), gVar.mo23014c(200.0f));
                int max2 = Math.max(c2 + gVar.mo23014c(30.0f), gVar.mo23014c(100.0f));
                double d = (double) b;
                double d2 = (double) max;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = (double) a;
                double d4 = (double) max2;
                Double.isNaN(d3);
                Double.isNaN(d4);
                sVar.f49258g = new C16788f(Math.min(2.0d, Math.min(d / d2, d3 / d4)), max, max2);
                C16788f fVar = sVar.f49258g;
                int i2 = fVar.f49124b;
                double d5 = fVar.f49123a;
                int i3 = fVar.f49125c;
                ViewGroup a2 = sVar.mo23042a();
                double d6 = (double) i2;
                Double.isNaN(d6);
                int i4 = (int) (d6 * d5);
                double d7 = (double) i3;
                Double.isNaN(d7);
                C16820s.m33854c(a2, i4, (int) (d7 * d5));
            }
            sVar.f49258g = new C16788f(1.0d, c, i);
            C16820s.m33854c(sVar.mo23042a(), i, i);
        }
        ViewGroup a3 = sVar.mo23042a();
        C16820s.m33853b(a3);
        C32480m mVar = new C32480m(sVar.f49254c.getContext());
        mVar.updateAppWidget(aaVar.f86903a);
        float f = (float) sVar.f49258g.f49123a;
        mVar.setScaleX(f);
        mVar.setScaleY(f);
        C16788f fVar2 = sVar.f49258g;
        a3.addView(mVar, new FrameLayout.LayoutParams(fVar2.f49124b, fVar2.f49125c, 17));
        ArrayList arrayList = new ArrayList();
        Iterator a4 = C2050bp.m5609a(mVar).mo5191a();
        while (a4.hasNext()) {
            C32464w.m60250b((View) a4.next(), arrayList);
        }
        sVar.f49253b.mo20959h(new C32436ac(arrayList));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
