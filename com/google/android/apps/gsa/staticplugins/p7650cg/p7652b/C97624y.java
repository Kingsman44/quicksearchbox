package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91760f;
import com.google.android.apps.gsa.sidekick.shared.util.C91975az;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.p2779j.C36327d;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.ajz;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C7947pw;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56956f;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collection;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.y */
/* compiled from: PG */
public final class C97624y extends C97600b {

    /* renamed from: e */
    private final C7947pw f272666e;

    /* renamed from: f */
    private final C21370a f272667f;

    public C97624y(C7718hj hjVar, C7874nd ndVar, C21370a aVar, C89291a aVar2, C86124t tVar, C68214a aVar3) {
        super(hjVar, ndVar, aVar2, tVar, aVar3);
        C7947pw pwVar = hjVar.f26979t;
        this.f272666e = pwVar == null ? C7947pw.f27896j : pwVar;
        this.f272667f = aVar;
    }

    /* renamed from: L */
    public static boolean m161829L(C7874nd ndVar) {
        int i = ndVar.f27591c;
        int a = C56956f.m88243a(i);
        if (a != 0 && a == 4) {
            return true;
        }
        int a2 = C56956f.m88243a(i);
        return a2 != 0 && a2 == 3;
    }

    /* renamed from: A */
    public final boolean mo85869A(CardRenderingContext cardRenderingContext) {
        return cardRenderingContext.mo49312g();
    }

    /* renamed from: C */
    public final CharSequence mo85871C(Context context) {
        return C91975az.m150931a(context, this.f272666e, this.f272667f.mo26870b());
    }

    /* renamed from: D */
    public final CharSequence mo85872D(Context context) {
        return this.f272666e.f27900c;
    }

    /* renamed from: E */
    public final CharSequence mo85873E() {
        return this.f272666e.f27900c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo90756G() {
        return 65544;
    }

    /* renamed from: a */
    public final int mo85875a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo85876b() {
        return R.drawable.ic_reminder;
    }

    /* renamed from: f */
    public final PendingIntent mo85880f(Context context) {
        return C91760f.m150326a(context, C58485gu.m89846n(mo90760K()));
    }

    /* renamed from: g */
    public final PendingIntent mo85881g(Context context, CardRenderingContext cardRenderingContext) {
        if (!cardRenderingContext.mo49312g()) {
            return null;
        }
        return C36327d.m64817a(context, C58485gu.m89846n(this.f272666e.f27899b), (byte[]) null, (String) null, (ajz) null, C58836b.f156633a, (String) null, Instant.EPOCH, 0, false);
    }

    /* renamed from: n */
    public final String mo85888n() {
        return "reminder";
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ Collection mo85891q(CardRenderingContext cardRenderingContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo85891q(cardRenderingContext));
        return arrayList;
    }

    /* renamed from: s */
    public final boolean mo85893s() {
        return m161829L(this.f272626b);
    }

    /* renamed from: v */
    public final boolean mo85896v() {
        return false;
    }
}
