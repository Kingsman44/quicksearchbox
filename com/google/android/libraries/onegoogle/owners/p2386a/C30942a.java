package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.gms.people.internal.C145670g;
import com.google.android.libraries.onegoogle.owners.C30941a;
import com.google.android.libraries.onegoogle.owners.C30974i;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.a */
/* compiled from: PG */
abstract class C30942a implements C58817ah {
    /* renamed from: a */
    public final C30976k apply(C145670g gVar) {
        C30974i m = C30976k.m57823m();
        if (gVar.mo119337kv("account_name") != null) {
            m.mo36618b(gVar.mo119337kv("account_name"));
        }
        if (gVar.mo121719i() != null) {
            ((C30941a) m).f83366a = gVar.mo121719i();
        }
        if (gVar.mo121721k() != null) {
            mo36629c(gVar, m);
        }
        if (gVar.mo121720j() != null) {
            mo36628b(gVar, m);
        }
        if (gVar.mo119337kv("gaia_id") != null) {
            ((C30941a) m).f83369d = gVar.mo119337kv("gaia_id");
        }
        mo36630d(gVar, m);
        if (gVar.mo121718h() != null) {
            ((C30941a) m).f83370e = gVar.mo121718h();
        }
        return m.mo36617a();
    }

    /* renamed from: b */
    public void mo36628b(C145670g gVar, C30974i iVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo36629c(C145670g gVar, C30974i iVar) {
        throw null;
    }

    /* renamed from: d */
    public abstract void mo36630d(C145670g gVar, C30974i iVar);
}
