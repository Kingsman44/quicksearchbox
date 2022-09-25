package com.google.android.libraries.web.coordinator.internal;

import androidx.lifecycle.C2368bp;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.coordinator.internal.a */
/* compiled from: PG */
final class C43738a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C43739b f114079a;

    /* renamed from: b */
    final /* synthetic */ Class f114080b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43738a(C43739b bVar, Class cls) {
        super(0);
        this.f114079a = bVar;
        this.f114080b = cls;
    }

    /* renamed from: a */
    public final Object mo5672a() {
        C43740c cVar = (C43740c) ((HiltWebModelHolderViewModel) new C2368bp(C43756o.m77265a(((C43251d) this.f114079a.f114081a).f113024a).f114092a).mo5770a(HiltWebModelHolderViewModel.class)).f114813a.mo27525b();
        String name = this.f114080b.getName();
        if (name != null) {
            Object obj = cVar.f114082a.get(name);
            if (obj != null) {
                return ((C69464a) obj).mo17428b();
            }
            throw new IllegalArgumentException("Trying to access a WebCoordinatorRetained instance from an unknown key.");
        }
        throw new IllegalArgumentException("@WebCoordinatorRetained cannot be used anonymous classes.");
    }
}
