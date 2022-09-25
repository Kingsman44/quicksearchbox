package android.support.p031v4.app;

import androidx.activity.result.C0821h;
import androidx.p054b.p055a.p058c.C0895a;

/* renamed from: android.support.v4.app.ab */
/* compiled from: PG */
final class C0156ab implements C0895a {

    /* renamed from: a */
    final /* synthetic */ Fragment f695a;

    public C0156ab(Fragment fragment) {
        this.f695a = fragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo523a(Object obj) {
        Void voidR = (Void) obj;
        Fragment fragment = this.f695a;
        C0174at atVar = fragment.mHost;
        if (atVar instanceof C0821h) {
            return ((C0821h) atVar).mo539jy();
        }
        return fragment.requireActivity().f2708i;
    }
}
