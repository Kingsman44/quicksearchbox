package com.google.android.libraries.web.weblayer.contrib.medianotification.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;

/* compiled from: PG */
public final class MediaNotificationWebFragmentObserver implements C43773b {

    /* renamed from: a */
    public final Fragment f114986a;

    /* renamed from: b */
    private final WebModelProvider f114987b;

    /* renamed from: c */
    private C44211c f114988c;

    public MediaNotificationWebFragmentObserver(Fragment fragment, WebModelProvider webModelProvider) {
        this.f114986a = fragment;
        this.f114987b = webModelProvider;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f114988c = (C44211c) this.f114987b.mo47072a(C44211c.class);
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        C44211c cVar = this.f114988c;
        if (cVar != null) {
            cVar.f114992a = null;
        }
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        if (this.f114988c != null) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f114986a.requireContext(), this.f114986a.requireActivity().getClass()));
            intent.setFlags(603979776);
            this.f114988c.f114992a = new C44209a(this, intent);
        }
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
