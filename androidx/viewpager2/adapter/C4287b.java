package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.support.p031v4.app.C0192bk;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: androidx.viewpager2.adapter.b */
/* compiled from: PG */
final class C4287b extends C0192bk {

    /* renamed from: a */
    final /* synthetic */ Fragment f13879a;

    /* renamed from: b */
    final /* synthetic */ FrameLayout f13880b;

    public C4287b(Fragment fragment, FrameLayout frameLayout) {
        this.f13879a = fragment;
        this.f13880b = frameLayout;
    }

    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment == this.f13879a) {
            fragmentManager.f644k.mo607p(this);
            FragmentStateAdapter.m12296g(view, this.f13880b);
        }
    }
}
