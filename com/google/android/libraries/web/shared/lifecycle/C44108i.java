package com.google.android.libraries.web.shared.lifecycle;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2368bp;
import com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal;
import com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.shared.lifecycle.i */
/* compiled from: PG */
final class C44108i extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C2368bp f114810a;

    /* renamed from: b */
    final /* synthetic */ Fragment f114811b;

    /* renamed from: c */
    final /* synthetic */ WebCoordinatorInfoInternal f114812c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44108i(C2368bp bpVar, Fragment fragment, WebCoordinatorInfoInternal webCoordinatorInfoInternal) {
        super(0);
        this.f114810a = bpVar;
        this.f114811b = fragment;
        this.f114812c = webCoordinatorInfoInternal;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        HiltWebModelHolderViewModel hiltWebModelHolderViewModel = (HiltWebModelHolderViewModel) this.f114810a.mo5770a(HiltWebModelHolderViewModel.class);
        hiltWebModelHolderViewModel.mo47080e(this.f114811b, this.f114812c.f114085b);
        return hiltWebModelHolderViewModel;
    }
}
