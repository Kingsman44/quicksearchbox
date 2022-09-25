package androidx.navigation.fragment;

import android.support.p031v4.app.C0203bv;
import android.support.p031v4.app.Fragment;

/* renamed from: androidx.navigation.fragment.a */
/* compiled from: PG */
public final /* synthetic */ class C3877a implements C0203bv {

    /* renamed from: a */
    public final /* synthetic */ C3879c f12450a;

    public /* synthetic */ C3877a(C3879c cVar) {
        this.f12450a = cVar;
    }

    /* renamed from: j */
    public final void mo538j(Fragment fragment) {
        C3879c cVar = this.f12450a;
        if (cVar.f12452b.remove(fragment.getTag())) {
            fragment.getLifecycle().mo5790b(cVar.f12453c);
        }
    }
}
