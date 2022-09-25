package com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a;

import android.content.Context;
import androidx.media3.common.C2644bf;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.p132b.C2505i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.C17448a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.c.g.j.a.g */
/* compiled from: PG */
public final class C17455g implements C17448a {

    /* renamed from: a */
    public static final C59071e f50408a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.j.a.g");

    /* renamed from: b */
    private final C46428ao f50409b;

    /* renamed from: c */
    private final C58881cr f50410c;

    public C17455g(C2505i iVar, C17522y yVar, Context context, C46428ao aoVar) {
        this.f50409b = aoVar;
        this.f50410c = C58886cw.m90973a(new C17451c(context, iVar, aoVar, yVar));
    }

    /* renamed from: a */
    public final void mo23361a(C2644bf bfVar) {
        C58976aa aaVar = C58975e.f156826a;
        ((C2759ad) this.f50410c.mo6453a()).mo6016w(bfVar);
    }

    /* renamed from: b */
    public final void mo23362b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f50409b.post(new C17449a((C2759ad) this.f50410c.mo6453a()));
    }

    /* renamed from: c */
    public final void mo23363c() {
        C58976aa aaVar = C58975e.f156826a;
        C46428ao aoVar = this.f50409b;
        C2759ad adVar = (C2759ad) this.f50410c.mo6453a();
        Objects.requireNonNull(adVar);
        aoVar.post(new C17450b(adVar));
    }
}
