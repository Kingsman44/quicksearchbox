package android.support.p031v4.app;

import java.util.ArrayList;

/* renamed from: android.support.v4.app.bi */
/* compiled from: PG */
public final class C0190bi implements C0195bn {

    /* renamed from: a */
    final /* synthetic */ FragmentManager f760a;

    /* renamed from: b */
    private final String f761b;

    public C0190bi(FragmentManager fragmentManager, String str) {
        this.f760a = fragmentManager;
        this.f761b = str;
    }

    /* renamed from: j */
    public final boolean mo513j(ArrayList arrayList, ArrayList arrayList2) {
        FragmentManager fragmentManager = this.f760a;
        String str = this.f761b;
        if (!fragmentManager.mo465af(arrayList, arrayList2, str)) {
            return false;
        }
        return fragmentManager.mo464ae(arrayList, arrayList2, str, -1, 1);
    }
}
