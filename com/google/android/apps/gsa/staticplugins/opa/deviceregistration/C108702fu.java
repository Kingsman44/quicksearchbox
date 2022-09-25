package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50121li;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fu */
/* compiled from: PG */
final class C108702fu extends C0640fb {

    /* renamed from: a */
    private final List f302317a;

    public C108702fu(Context context, C50121li liVar) {
        ArrayList arrayList = new ArrayList();
        this.f302317a = arrayList;
        List<C108683fb> c = C108579bk.m180530c(liVar, context);
        if (!c.isEmpty()) {
            for (C108683fb fbVar : c) {
                List list = this.f302317a;
                list.add(fbVar.mo97064a());
                list.addAll(fbVar.mo97065b());
            }
            return;
        }
        m180788a(arrayList, context, R.string.setup_complete_get_answer_category_name, R.drawable.quantum_ic_search_googblue_24, R.array.setup_complete_get_answer_queries);
        m180788a(arrayList, context, R.string.setup_complete_home_control_category_name, R.drawable.quantum_ic_home_googblue_24, R.array.setup_complete_home_control_queries);
        m180788a(arrayList, context, R.string.setup_complete_manage_task_category_name, R.drawable.quantum_ic_playlist_add_check_googblue_24, R.array.setup_complete_manage_task_queries);
    }

    /* renamed from: a */
    private static final void m180788a(List list, Context context, int i, int i2, int i3) {
        list.add(C108727gs.m180835c(i2, context.getResources().getString(i)));
        for (String add : context.getResources().getStringArray(i3)) {
            list.add(add);
        }
    }

    public final int getItemCount() {
        return this.f302317a.size();
    }

    public final int getItemViewType(int i) {
        Object obj = this.f302317a.get(i);
        if (obj instanceof C108727gs) {
            return 1;
        }
        if (obj instanceof String) {
            return 2;
        }
        C59104x c = C108704fw.f302320b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SetupCompFrag");
        ((C59052c) ((C59052c) c).mo56372aa(24218)).mo56389s("Unknown object at given position: %s", obj);
        return 0;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        int itemViewType = getItemViewType(i);
        Object obj = this.f302317a.get(i);
        if (itemViewType == 1) {
            C108703fv fvVar = (C108703fv) ghVar;
            C108727gs gsVar = (C108727gs) obj;
            fvVar.f302318a.setImageResource(gsVar.mo97085a());
            C2043bi.m5530X(fvVar.f302318a, fvVar.itemView.getContext().getResources().getDrawable(R.drawable.opa_circle_white));
            fvVar.f302319b.setText(gsVar.mo97086b());
        } else if (itemViewType != 2) {
            C59104x c = C108704fw.f302320b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SetupCompFrag");
            ((C59052c) ((C59052c) c).mo56372aa(24220)).mo56387q("Unexpected view type: %d", itemViewType);
        } else {
            ((C108701ft) ghVar).f302316a.setText((String) obj);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new C108703fv(from, viewGroup);
        }
        if (i == 2) {
            return new C108701ft(from, viewGroup);
        }
        C59104x c = C108704fw.f302320b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SetupCompFrag");
        ((C59052c) ((C59052c) c).mo56372aa(24219)).mo56387q("Unexpected view type: %d", i);
        return null;
    }
}
