package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.C1789af;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.main.notifications.C91529c;
import com.google.android.apps.gsa.sidekick.main.notifications.C91530d;
import com.google.android.apps.gsa.sidekick.shared.p7242k.C91754b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.a */
/* compiled from: PG */
public abstract class C97599a implements C91530d {

    /* renamed from: a */
    public final C58485gu f272624a;

    /* renamed from: A */
    public boolean mo85869A(CardRenderingContext cardRenderingContext) {
        throw null;
    }

    /* renamed from: B */
    public int mo85870B() {
        return 1;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: G */
    public abstract int mo90756G();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public PendingIntent mo90757H(Context context) {
        C91754b bVar = new C91754b(context);
        C58485gu guVar = this.f272624a;
        guVar.getClass();
        bVar.f255879c = guVar;
        bVar.f255880d = C91529c.m149709a(this);
        bVar.f255882f = mo85897w();
        bVar.f255883g = mo85879e();
        C7682ga I = mo90758I();
        C57057b l = mo85886l();
        bVar.f255884h = I;
        bVar.f255885i = l;
        bVar.f255887k = true;
        bVar.f255890n = mo85883i();
        bVar.f255889m = mo85884j();
        return PendingIntent.getActivity(context, 0, bVar.mo86242a(), 201326592);
    }

    /* renamed from: I */
    public C7682ga mo90758I() {
        return null;
    }

    /* renamed from: a */
    public int mo85875a() {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final int mo85877c() {
        int F = mo85874F();
        int i = F - 1;
        if (F == 0) {
            throw null;
        } else if (i != 4) {
            return i != 5 ? mo90756G() : C89885b.S3_DOWN_CONNECT_FAILED_VALUE;
        } else {
            return 65539;
        }
    }

    /* renamed from: d */
    public final int mo85878d() {
        return 0;
    }

    /* renamed from: f */
    public PendingIntent mo85880f(Context context) {
        return mo90757H(context);
    }

    /* renamed from: g */
    public PendingIntent mo85881g(Context context, CardRenderingContext cardRenderingContext) {
        return null;
    }

    /* renamed from: h */
    public C1789af mo85882h(Context context) {
        return null;
    }

    /* renamed from: i */
    public C60220t mo85883i() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        for (C7718hj hjVar : guVar) {
            C7709ha haVar = hjVar.f26972m;
            if (haVar == null) {
                haVar = C7709ha.f26910f;
            }
            if ((haVar.f26912a & 16) != 0) {
                C7709ha haVar2 = hjVar.f26972m;
                if (haVar2 == null) {
                    haVar2 = C7709ha.f26910f;
                }
                C60220t tVar = haVar2.f26916e;
                return tVar == null ? C60220t.f162931e : tVar;
            }
            C7709ha haVar3 = hjVar.f26972m;
            if (((haVar3 == null ? C7709ha.f26910f : haVar3).f26912a & 1) != 0) {
                if (haVar3 == null) {
                    haVar3 = C7709ha.f26910f;
                }
                C60220t tVar2 = haVar3.f26913b;
                return tVar2 == null ? C60220t.f162931e : tVar2;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C7669fo mo85884j() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        for (C7718hj hjVar : guVar) {
            C7874nd ndVar = hjVar.f26938J;
            if (ndVar == null) {
                ndVar = C7874nd.f27577J;
            }
            if ((ndVar.f27589a & 8388608) != 0) {
                C7874nd ndVar2 = hjVar.f26938J;
                if (ndVar2 == null) {
                    ndVar2 = C7874nd.f27577J;
                }
                C7669fo foVar = ndVar2.f27612x;
                return foVar == null ? C7669fo.f26633e : foVar;
            }
        }
        return null;
    }

    /* renamed from: k */
    public C8178yk mo85885k() {
        return null;
    }

    /* renamed from: l */
    public C57057b mo85886l() {
        return null;
    }

    /* renamed from: n */
    public String mo85888n() {
        return null;
    }

    /* renamed from: p */
    public String mo85890p() {
        return null;
    }

    /* renamed from: q */
    public Collection mo85891q(CardRenderingContext cardRenderingContext) {
        throw null;
    }

    /* renamed from: r */
    public final Collection mo85892r() {
        C58485gu guVar = this.f272624a;
        guVar.getClass();
        return guVar;
    }

    /* renamed from: s */
    public boolean mo85893s() {
        return mo85874F() == 3;
    }

    /* renamed from: t */
    public /* synthetic */ boolean mo85894t() {
        return false;
    }

    /* renamed from: u */
    public final boolean mo85895u() {
        return mo85874F() == 5;
    }

    /* renamed from: x */
    public boolean mo85898x() {
        return mo85893s();
    }

    /* renamed from: y */
    public boolean mo85899y() {
        return mo85893s();
    }

    /* renamed from: z */
    public boolean mo85900z() {
        return mo85893s();
    }

    public C97599a(C58485gu guVar) {
        guVar.getClass();
        C58838bb.m90883r(!guVar.isEmpty());
        this.f272624a = guVar;
    }
}
