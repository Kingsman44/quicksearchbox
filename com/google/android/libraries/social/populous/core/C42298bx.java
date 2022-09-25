package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.core.bx */
/* compiled from: PG */
public abstract class C42298bx implements C42281bg {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InAppNotificationTarget mo45257a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C58833ax mo45258b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C58833ax mo45259c();

    /* renamed from: d */
    public abstract void mo45260d(PersonFieldMetadata personFieldMetadata);

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo45235e(Name name) {
        throw null;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo45236f(Photo photo) {
        throw null;
    }

    /* renamed from: g */
    public abstract void mo45261g(C58485gu guVar);

    /* renamed from: h */
    public abstract void mo45262h(C42282bh bhVar);

    /* renamed from: i */
    public abstract void mo45263i(CharSequence charSequence);

    /* renamed from: j */
    public final InAppNotificationTarget mo45264j() {
        if (!mo45258b().mo56113h()) {
            C42318cq cqVar = new C42318cq();
            cqVar.f110974a = PeopleApiAffinity.f110783e;
            cqVar.f110975b = ((C$AutoValue_PeopleApiAffinity) PeopleApiAffinity.f110783e).f110655a;
            mo45260d(cqVar.mo45296a());
        }
        if (!mo45259c().mo56113h()) {
            mo45261g(C58485gu.m89845m());
        }
        return mo45257a();
    }
}
