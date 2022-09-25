package com.google.android.libraries.notifications.p2294i.p2295a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.C29986f;
import com.google.android.libraries.notifications.data.C29787a;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.p2268e.p2283h.C29929b;
import com.google.android.libraries.notifications.p2268e.p2285i.p2286a.C29932c;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30113g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4160bf.p4164b.p4165a.C55625bh;
import com.google.p4160bf.p4164b.p4165a.C55626bi;
import com.google.p4160bf.p4164b.p4165a.C55628bk;
import com.google.p4160bf.p4164b.p4165a.C55656cl;
import com.google.p4160bf.p4164b.p4165a.C55657cm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import com.google.protobuf.MessageLite;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.i.a.g */
/* compiled from: PG */
final class C30024g implements C29929b {

    /* renamed from: a */
    private final C29823n f81249a;

    /* renamed from: b */
    private final C30113g f81250b;

    /* renamed from: c */
    private final C21370a f81251c;

    /* renamed from: d */
    private final C29932c f81252d;

    public C30024g(C29823n nVar, C30113g gVar, C21370a aVar, C29932c cVar) {
        this.f81249a = nVar;
        this.f81251c = aVar;
        this.f81250b = gVar;
        this.f81252d = cVar;
    }

    /* renamed from: c */
    public static int m55686c(C55626bi biVar) {
        C55625bh bhVar = (C55625bh) biVar.toBuilder();
        bhVar.copyOnWrite();
        C55626bi biVar2 = (C55626bi) bhVar.instance;
        biVar2.f146777h = null;
        biVar2.f146770a &= -33;
        bhVar.copyOnWrite();
        C55626bi biVar3 = (C55626bi) bhVar.instance;
        biVar3.f146770a &= -2;
        biVar3.f146771b = 0;
        bhVar.copyOnWrite();
        C55626bi biVar4 = (C55626bi) bhVar.instance;
        biVar4.f146770a &= -65;
        biVar4.f146778i = C55626bi.f146768k.f146778i;
        if ((biVar.f146770a & 4) != 0) {
            C55657cm cmVar = biVar.f146773d;
            if (cmVar == null) {
                cmVar = C55657cm.f146855e;
            }
            C55656cl clVar = (C55656cl) cmVar.toBuilder();
            clVar.copyOnWrite();
            C55657cm cmVar2 = (C55657cm) clVar.instance;
            cmVar2.f146857a &= -5;
            cmVar2.f146860d = C55657cm.f146855e.f146860d;
            bhVar.copyOnWrite();
            C55626bi biVar5 = (C55626bi) bhVar.instance;
            C55657cm cmVar3 = (C55657cm) clVar.build();
            cmVar3.getClass();
            biVar5.f146773d = cmVar3;
            biVar5.f146770a |= 4;
        }
        return ((C55626bi) bhVar.build()).hashCode();
    }

    /* renamed from: a */
    public final void mo35219a(C29820k kVar, MessageLite messageLite, Throwable th) {
        Object[] objArr = new Object[1];
        objArr[0] = kVar != null ? kVar.mo35009h() : BuildConfig.FLAVOR;
        C30058b.m55795g("StoreTargetCallback", th, "Registration finished for account: %s (FAILURE).", objArr);
        if (kVar != null) {
            if (!C68958v.m100020c()) {
                try {
                    kVar = this.f81249a.mo35088b(kVar.mo35009h());
                } catch (C29822m unused) {
                    return;
                }
            }
            C29787a l = kVar.mo35014l();
            l.mo34999e(C29986f.FAILED_REGISTRATION);
            this.f81249a.mo35091e(l.mo34995a());
        }
    }

    /* renamed from: b */
    public final void mo35220b(C29820k kVar, MessageLite messageLite, MessageLite messageLite2) {
        C30058b.m55794f("StoreTargetCallback", "Registration finished (SUCCESS)", new Object[0]);
        C55626bi biVar = (C55626bi) messageLite;
        C55628bk bkVar = (C55628bk) messageLite2;
        if (kVar != null) {
            if (!C68958v.m100020c()) {
                try {
                    kVar = this.f81249a.mo35088b(kVar.mo35009h());
                } catch (C29822m unused) {
                    return;
                }
            }
            C29787a l = kVar.mo35014l();
            l.mo34998d(m55686c(biVar));
            l.mo34999e(C29986f.REGISTERED);
            l.f80717e = Long.valueOf(this.f81251c.mo26870b());
            if (bkVar.f146785d != 0 && kVar.mo35001a() == 0 && kVar.mo35003c().longValue() == 0) {
                l.f80718f = Long.valueOf(bkVar.f146785d);
            }
            if ((bkVar.f146782a & 4) != 0) {
                l.f80714b = bkVar.f146784c;
            } else if (TextUtils.isEmpty(kVar.mo35012j())) {
                try {
                    l.f80714b = this.f81250b.mo35498c(kVar.mo35009h());
                } catch (Exception e) {
                    C30058b.m55792d("StoreTargetCallback", e, "Failed to get the obfuscated account ID", new Object[0]);
                }
            }
            if (C68958v.m100021d()) {
                l.mo34997c(bkVar.f146786e);
                C55657cm cmVar = bkVar.f146783b;
                if (cmVar == null) {
                    cmVar = C55657cm.f146855e;
                }
                l.mo35000f(cmVar.f146860d);
            }
            C29820k a = l.mo34995a();
            this.f81249a.mo35091e(a);
            C55540at a2 = C55540at.m87704a(biVar.f146771b);
            if (a2 == null) {
                a2 = C55540at.REGISTRATION_REASON_UNSPECIFIED;
            }
            if (a2 == C55540at.LOCALE_CHANGED) {
                this.f81252d.mo35222b(a, C55522ab.LOCALE_CHANGED);
            }
        }
    }
}
