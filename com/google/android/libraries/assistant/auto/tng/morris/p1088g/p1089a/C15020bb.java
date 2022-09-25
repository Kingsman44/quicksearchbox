package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14145o;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bb */
/* compiled from: PG */
final class C15020bb extends C0673gh implements View.OnClickListener, C14145o {

    /* renamed from: a */
    final /* synthetic */ C15024bf f45034a;

    /* renamed from: b */
    private final ViewGroup f45035b;

    /* renamed from: c */
    private final C15015ax f45036c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15020bb(C15024bf bfVar, ViewGroup viewGroup, C15015ax axVar) {
        super(viewGroup);
        this.f45034a = bfVar;
        this.f45036c = axVar;
        this.f45035b = viewGroup;
        viewGroup.setOnClickListener(new C14129bc(bfVar.f45047a, Optional.empty(), this));
    }

    /* renamed from: a */
    public final void mo21470a() {
        this.f45034a.f45047a.mo21444a(this.f45035b, 110271);
    }

    /* renamed from: b */
    public final void mo21471b() {
        this.f45034a.f45047a.mo21447d(this.f45035b);
    }

    public final void onClick(View view) {
        this.f45036c.f44996a.mo21898c();
    }
}
