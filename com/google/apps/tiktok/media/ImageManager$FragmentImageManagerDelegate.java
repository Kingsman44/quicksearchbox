package com.google.apps.tiktok.media;

import android.content.ComponentCallbacks2;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
final class ImageManager$FragmentImageManagerDelegate implements C47450f {

    /* renamed from: a */
    public final Fragment f123206a;

    /* renamed from: b */
    public final C47451g f123207b;

    public ImageManager$FragmentImageManagerDelegate(Fragment fragment, C47451g gVar) {
        this.f123206a = fragment;
        this.f123207b = gVar;
    }

    /* renamed from: a */
    public final void mo51270a(final C47449e eVar) {
        final ComponentCallbacks2 componentCallbacks2 = eVar.f123220c;
        final C0167am activity = this.f123206a.getActivity();
        activity.getClass();
        activity.registerComponentCallbacks(componentCallbacks2);
        C47451g gVar = this.f123207b;
        Set set = (Set) gVar.f123225a.get(activity);
        if (set != null) {
            set.add(eVar);
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add(eVar);
            gVar.f123225a.put(activity, hashSet);
        }
        this.f123206a.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                C47451g gVar = ImageManager$FragmentImageManagerDelegate.this.f123207b;
                C0167am amVar = activity;
                C47449e eVar = eVar;
                Set set = (Set) gVar.f123225a.get(amVar);
                if (set != null) {
                    set.remove(eVar);
                }
                activity.unregisterComponentCallbacks(componentCallbacks2);
                ImageManager$FragmentImageManagerDelegate.this.f123206a.getLifecycle().mo5791c(this);
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }
}
