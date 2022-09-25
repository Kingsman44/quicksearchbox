package com.google.android.apps.search.googleapp.tabs.manager;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.search.googleapp.p10117aa.C133127l;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.common.base.C58852bp;
import com.google.protobuf.C63077o;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.aa */
/* compiled from: PG */
public final /* synthetic */ class C139718aa implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C139720ac f379763a;

    public /* synthetic */ C139718aa(C139720ac acVar) {
        this.f379763a = acVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C139720ac acVar = this.f379763a;
        C133127l lVar = (C133127l) obj;
        List list = (List) Collection.EL.stream(lVar.f362935b).map(new C139749p(lVar)).collect(Collectors.toCollection(C139752s.f379857a));
        acVar.f379790w.mo50772a(list);
        View view = acVar.f379770c.getView();
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.googleapp_tabs_manager_recycler);
        View view2 = acVar.f379770c.getView();
        view2.getClass();
        View findViewById = view2.findViewById(R.id.googleapp_tabs_manager_empty_state);
        int i = 0;
        if (list.isEmpty()) {
            recyclerView.setVisibility(8);
            findViewById.setVisibility(0);
        } else {
            recyclerView.setVisibility(0);
            findViewById.setVisibility(8);
            C46370ah a = acVar.f379792y.mo50378a(C139720ac.f379766a);
            if (a == null || !((C63077o) a.f121384a).f170230a) {
                int size = list.size() - 1;
                while (true) {
                    if (i < list.size()) {
                        if (((C139713a) list.get(i)).f379755b) {
                            size = i;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                recyclerView.scrollToPosition(size);
            }
        }
        acVar.f379770c.requireView().findViewById(R.id.googleapp_tabs_manager_close_all_tabs_button).setEnabled(!list.isEmpty());
    }
}
