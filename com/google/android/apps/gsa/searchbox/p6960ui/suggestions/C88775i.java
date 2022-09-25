package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.i */
/* compiled from: PG */
public final /* synthetic */ class C88775i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88776j f240240a;

    /* renamed from: b */
    public final /* synthetic */ View f240241b;

    /* renamed from: c */
    public final /* synthetic */ List f240242c;

    public /* synthetic */ C88775i(C88776j jVar, View view, List list) {
        this.f240240a = jVar;
        this.f240241b = view;
        this.f240242c = list;
    }

    public final void onClick(View view) {
        C88776j jVar = this.f240240a;
        View view2 = this.f240241b;
        List list = this.f240242c;
        LinearLayout linearLayout = jVar.f240244b;
        linearLayout.getClass();
        PopupMenu popupMenu = new PopupMenu(linearLayout.getContext(), view2, 8388693, 0, R.style.SpywInContextControlMenu);
        popupMenu.getMenu().add(R.string.dismiss_in_context_control_suggestion);
        popupMenu.setOnMenuItemClickListener(new C88774h(jVar, list));
        popupMenu.show();
    }
}
