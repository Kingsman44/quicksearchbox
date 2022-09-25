package com.google.android.gms.reminders.internal.p10862a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.internal.C145809f;
import com.google.android.gms.reminders.internal.C145813j;
import com.google.android.gms.reminders.model.C145854z;

/* renamed from: com.google.android.gms.reminders.internal.a.o */
/* compiled from: PG */
final class C145796o extends C145782a {

    /* renamed from: a */
    final /* synthetic */ LoadRemindersOptions f394169a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145796o(C143851w wVar, LoadRemindersOptions loadRemindersOptions) {
        super(wVar);
        this.f394169a = loadRemindersOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C145803v((C145854z) null, status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C145813j jVar = (C145813j) bVar;
        C145791j jVar2 = new C145791j(this);
        LoadRemindersOptions loadRemindersOptions = this.f394169a;
        C143919bh.m233969l(jVar.f394182a.mo119476a());
        ((C145809f) jVar.mo119451G()).mo121963h(jVar2, loadRemindersOptions);
    }
}
