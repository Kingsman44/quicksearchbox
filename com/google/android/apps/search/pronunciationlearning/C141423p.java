package com.google.android.apps.search.pronunciationlearning;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2882j.C37200a;
import com.google.common.p4552o.apw;
import com.google.common.p4552o.apx;
import com.google.common.p4552o.aqb;
import com.google.common.p4552o.aqf;

/* renamed from: com.google.android.apps.search.pronunciationlearning.p */
/* compiled from: PG */
final class C141423p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141419n f383884a;

    public C141423p(C141419n nVar) {
        this.f383884a = nVar;
    }

    public final void onClick(View view) {
        C141419n nVar = this.f383884a;
        View view2 = nVar.f383868d.getView();
        view2.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.pronunciationlearning_content_input_box);
        if (textView != null) {
            String obj = textView.getText().toString();
            C141330c cVar = nVar.f383875k;
            int length = obj.length();
            apw apw = (apw) apx.f159707d.createBuilder();
            apw.copyOnWrite();
            apx apx = (apx) apw.instance;
            apx.f159709a |= 1;
            apx.f159710b = length;
            cVar.mo116362b(C37200a.f98691a.mo40812e(aqf.f159732l, cVar.mo116361a((apx) apw.build(), (aqb) null)));
            nVar.mo116423d(obj, false);
        }
    }
}
