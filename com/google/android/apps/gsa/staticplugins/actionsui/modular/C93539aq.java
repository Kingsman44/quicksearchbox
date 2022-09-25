package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.aq */
/* compiled from: PG */
final class C93539aq implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C93540ar f261184a;

    public C93539aq(C93540ar arVar) {
        this.f261184a = arVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f261184a.mo88128o();
        C91109h b = this.f261184a.f261185a.getItem(i);
        if (!b.f254418c) {
            Object obj = b.f254417b;
            if (obj != null) {
                int intValue = ((Integer) obj).intValue();
                if (intValue == 0) {
                    this.f261184a.mo87951b(Calendar.getInstance());
                } else if (intValue == 1) {
                    C93540ar arVar = this.f261184a;
                    Calendar instance = Calendar.getInstance();
                    instance.add(5, 1);
                    arVar.mo87951b(instance);
                }
            }
        } else {
            C93540ar arVar2 = this.f261184a;
            arVar2.f261451q.mo87961i(arVar2.f261447m, "datepicker_tag");
        }
    }
}
