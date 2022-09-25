package com.google.apps.tiktok.media;

import android.content.ComponentCallbacks2;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* compiled from: PG */
final class ImageManager$FragmentNoActivityImageManagerDelegate implements C47450f {

    /* renamed from: a */
    public final Fragment f123212a;

    public ImageManager$FragmentNoActivityImageManagerDelegate(Fragment fragment) {
        this.f123212a = fragment;
    }

    /* renamed from: a */
    public final void mo51270a(final C47449e eVar) {
        C19559g.m37304c();
        final ComponentCallbacks2 componentCallbacks2 = eVar.f123220c;
        this.f123212a.getContext().registerComponentCallbacks(componentCallbacks2);
        this.f123212a.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                ImageManager$FragmentNoActivityImageManagerDelegate.this.f123212a.getContext().unregisterComponentCallbacks(componentCallbacks2);
                ImageManager$FragmentNoActivityImageManagerDelegate.this.f123212a.getLifecycle().mo5791c(this);
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final void mo3524gZ(C2391v vVar) {
                eVar.f123219b++;
            }

            /* renamed from: ha */
            public final void mo3525ha(C2391v vVar) {
                C47449e eVar = eVar;
                eVar.f123219b--;
            }
        });
    }
}
