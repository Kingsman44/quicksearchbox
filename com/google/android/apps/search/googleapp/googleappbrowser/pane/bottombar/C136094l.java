package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import androidx.core.p098j.C2050bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.l */
/* compiled from: PG */
public final class C136094l extends C136095m {

    /* renamed from: a */
    public static final C59071e f370648a = C59071e.m91331h();

    /* renamed from: b */
    public final BottomBarActionsLayout f370649b;

    /* renamed from: c */
    public final int f370650c;

    public C136094l(BottomBarActionsLayout bottomBarActionsLayout) {
        this.f370649b = bottomBarActionsLayout;
        this.f370650c = bottomBarActionsLayout.getContext().getResources().getDimensionPixelOffset(R.dimen.googleapp_browser_bottombar_actions_max_width);
    }

    /* renamed from: a */
    public final List mo112749a() {
        return C69734n.m101138f(C69734n.m101140h(C2050bp.m5609a(this.f370649b), C136093k.f370647a));
    }
}
