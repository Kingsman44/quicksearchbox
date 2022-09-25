package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.h */
/* compiled from: PG */
public final /* synthetic */ class C88774h implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88776j f240238a;

    /* renamed from: b */
    public final /* synthetic */ List f240239b;

    public /* synthetic */ C88774h(C88776j jVar, List list) {
        this.f240238a = jVar;
        this.f240239b = list;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f240238a.f240243a.mo44276n((Suggestion) this.f240239b.get(0));
        return true;
    }
}
