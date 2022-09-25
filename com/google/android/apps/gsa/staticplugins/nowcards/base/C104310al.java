package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91662a;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91663b;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8120a.C104994a;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C7518af;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7779jq;
import com.google.p375ai.p378b.C7845mb;
import com.google.p375ai.p378b.C7998rt;
import com.google.p375ai.p378b.C8150xj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.al */
/* compiled from: PG */
public abstract class C104310al extends C104307ai implements C104329bd {

    /* renamed from: i */
    protected final C104330be f290164i;

    /* renamed from: j */
    private final C89291a f290165j;

    protected C104310al(C7718hj hjVar, CardRenderingContext cardRenderingContext, C89291a aVar, C104308aj ajVar) {
        super(hjVar, cardRenderingContext, ajVar);
        this.f290164i = new C104330be(this, aVar, -1, 1);
        this.f290165j = aVar;
    }

    /* renamed from: A */
    public C7779jq mo94022A(C7718hj hjVar) {
        return null;
    }

    /* renamed from: C */
    public C9278v[] mo94023C(Context context, C7718hj hjVar) {
        return null;
    }

    /* renamed from: L */
    public C9278v mo94051L(Context context, List list) {
        return this.f290164i.mo94087b(context, list);
    }

    /* renamed from: M */
    public C9278v mo94052M(Context context) {
        String y = mo94014y(context);
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        C104994a aVar = new C104994a(context, y);
        aVar.f292497d = this.f290132c;
        String z = mo94015z();
        if (!TextUtils.isEmpty(z)) {
            aVar.f292496c = z;
        }
        return aVar.mo94435a();
    }

    /* renamed from: N */
    public C9278v mo94053N(Context context) {
        return null;
    }

    /* renamed from: O */
    public final List mo94054O(Context context) {
        C9278v w = mo94012w(context);
        if (w == null) {
            return new ArrayList();
        }
        return Arrays.asList(new C9278v[]{w});
    }

    /* renamed from: P */
    public boolean mo94055P() {
        return false;
    }

    /* renamed from: Q */
    public final C7718hj[] mo94056Q() {
        C1970e c = mo86081c();
        if (c == null) {
            return new C7718hj[0];
        }
        return (C7718hj[]) c.f5889b;
    }

    /* renamed from: a */
    public C9270n mo94024a(Context context) {
        return this.f290164i.mo94086a(context);
    }

    /* renamed from: d */
    public final C91663b mo86082d(C7718hj hjVar) {
        C1970e c = mo86081c();
        if (c == null || c.f5888a == null) {
            return super.mo86082d(hjVar);
        }
        C104330be beVar = this.f290164i;
        C7669fo foVar = hjVar.f26968i;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        Long valueOf = Long.valueOf(C91994m.m150994a(foVar));
        if (valueOf.longValue() == 0) {
            return C91663b.f255651a;
        }
        C1970e c2 = beVar.f290241a.mo94084c();
        if (!(c2 == null || c2.f5888a == null)) {
            long longValue = valueOf.longValue();
            C7669fo foVar2 = ((C7718hj) c2.f5888a).f26968i;
            if (foVar2 == null) {
                foVar2 = C7669fo.f26633e;
            }
            if (longValue == C91994m.m150994a(foVar2)) {
                return C91663b.m149981c(0);
            }
        }
        if (!beVar.f290244d.containsKey(valueOf)) {
            return C91663b.f255651a;
        }
        int intValue = ((Integer) beVar.f290244d.get(valueOf)).intValue();
        C58838bb.m90869d(intValue >= 0, "Parameter subIndex must be non-negative");
        return new C91662a(0, C58833ax.m90834k(Integer.valueOf(intValue)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C9278v mo94010u(Context context) {
        C9278v u = super.mo94010u(context);
        if (u == null) {
            return null;
        }
        C9273q qVar = (C9273q) u.toBuilder();
        boolean z = true;
        if (!this.f290164i.f290242b) {
            C7518af afVar = u.f32219z;
            if (afVar == null) {
                afVar = C7518af.f26025j;
            }
            if (!afVar.f26035i) {
                z = false;
            }
        }
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32195b |= 64;
        vVar.f32181O = z;
        return (C9278v) qVar.build();
    }

    /* renamed from: v */
    public C9278v mo94011v(Context context, List list) {
        return this.f290164i.mo94088c(context, list);
    }

    /* renamed from: w */
    public C9278v mo94012w(Context context) {
        return null;
    }

    /* renamed from: y */
    public String mo94014y(Context context) {
        Object obj;
        C7779jq A;
        C1970e c = mo86081c();
        if (c == null || (obj = c.f5888a) == null || (A = mo94022A((C7718hj) obj)) == null || (A.f27234a & 1) == 0) {
            return null;
        }
        C89291a aVar = this.f290165j;
        C8150xj xjVar = A.f27235b;
        if (xjVar == null) {
            xjVar = C8150xj.f28657d;
        }
        return aVar.mo83231a(context, xjVar);
    }

    /* renamed from: z */
    public String mo94015z() {
        return null;
    }

    protected C104310al(C7718hj hjVar, C7718hj[] hjVarArr, CardRenderingContext cardRenderingContext, C89291a aVar, int i, C104308aj ajVar) {
        super(hjVar, hjVarArr, cardRenderingContext, ajVar);
        this.f290165j = aVar;
        C7779jq A = mo94022A(hjVar);
        int i2 = 1;
        if (A != null && (A.f27234a & 4) != 0) {
            i = A.f27237d;
        } else if ((hjVar.f26955a & C89885b.HTTP_VALUE) != 0) {
            C7845mb mbVar = hjVar.f26982w;
            int max = Math.max(1, (mbVar == null ? C7845mb.f27493p : mbVar).f27499e);
            C7845mb mbVar2 = hjVar.f26982w;
            if (((mbVar2 == null ? C7845mb.f27493p : mbVar2).f27495a & 1) != 0) {
                i = Math.max(1, (mbVar2 == null ? C7845mb.f27493p : mbVar2).f27498d / max);
            }
            i2 = max;
        }
        C104330be beVar = new C104330be(this, aVar, i, i2);
        this.f290164i = beVar;
        C7845mb mbVar3 = hjVar.f26982w;
        if (((mbVar3 == null ? C7845mb.f27493p : mbVar3).f27495a & 256) != 0) {
            C7845mb mbVar4 = hjVar.f26982w;
            C7998rt rtVar = (mbVar4 == null ? C7845mb.f27493p : mbVar4).f27506l;
            beVar.f290243c = (rtVar == null ? C7998rt.f28087v : rtVar).f28091c;
        }
    }
}
