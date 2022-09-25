package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.av.ab;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.adf;
import com.google.assistant.p3897e.p3929l.p3930a.C52702bh;
import com.google.assistant.p3897e.p3929l.p3930a.C52704bj;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.bi */
/* compiled from: PG */
public final /* synthetic */ class C10132bi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10134bk f34467a;

    public /* synthetic */ C10132bi(C10134bk bkVar) {
        this.f34467a = bkVar;
    }

    public final void run() {
        String str;
        C10134bk bkVar = this.f34467a;
        bkVar.f34473e = (adf) Collection.EL.stream(bkVar.f34472d.b.f129041a).filter(new C10133bj(bkVar)).findFirst().orElse(adf.f129030h);
        List j = bkVar.f34471c.j(bkVar.f34470b, 3);
        int i = 0;
        bkVar.f34478j.setVisibility(true != j.isEmpty() ? 0 : 8);
        bkVar.f34477i.setVisibility(true != j.isEmpty() ? 8 : 0);
        int a = C52704bj.m86696a(bkVar.f34473e.f129036e);
        if (a == 0) {
            a = 1;
        }
        boolean z = a == 3 || a == 4;
        bkVar.f34475g.setVisibility((z || !bkVar.f34471c.h()) ? 8 : 0);
        bkVar.f34476h.setVisibility(true != z ? 8 : 0);
        bkVar.f34474f.setAdapter(new ab(j));
        ItemView itemView = bkVar.f34476h;
        Resources resources = bkVar.f34469a.getResources();
        StringBuilder sb = new StringBuilder();
        adf adf = bkVar.f34473e;
        int a2 = C52704bj.m86696a(adf.f129036e);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = C52702bh.m86695a(adf.f129038g);
        if (a3 == 0) {
            a3 = 1;
        }
        if (a2 != 4) {
            str = resources.getString(R.string.personal_results_off);
        } else {
            sb.append(resources.getString(R.string.personal_results_on));
            if (!bkVar.f34471c.f(bkVar.f34470b)) {
                str = sb.toString();
            } else {
                String string = resources.getString(R.string.personal_results_separator);
                int i2 = a3 - 1;
                if (i2 == 1) {
                    sb.append(string);
                    sb.append(resources.getString(R.string.never_show_proactively));
                } else if (i2 == 2 || i2 == 3) {
                    sb.append(string);
                    sb.append(resources.getString(R.string.show_proactively_on_displays));
                }
                str = sb.toString();
            }
        }
        itemView.o(str);
        View view = bkVar.f34479k;
        if (true != bkVar.f34471c.q(bkVar.f34470b, 3)) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
