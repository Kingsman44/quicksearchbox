package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.p098j.p099a.C1981aa;

/* renamed from: androidx.drawerlayout.widget.b */
/* compiled from: PG */
public final /* synthetic */ class C2173b implements C1981aa {

    /* renamed from: a */
    public final /* synthetic */ DrawerLayout f6185a;

    public /* synthetic */ C2173b(DrawerLayout drawerLayout) {
        this.f6185a = drawerLayout;
    }

    /* renamed from: a */
    public final boolean mo5140a(View view) {
        DrawerLayout drawerLayout = this.f6185a;
        if (!DrawerLayout.m6036w(view) || drawerLayout.mo5454e(view) == 2) {
            return false;
        }
        drawerLayout.mo5462k(view, true);
        return true;
    }
}
