package com.google.android.libraries.lens.view.filters.p2097a;

import android.support.p031v4.app.Fragment;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25986j;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.places.api.p2437b.C31855k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.lens.p4707j.C62485dh;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56285cl;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56287cn;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56290cq;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56291cr;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56292cs;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56302db;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.lens.view.filters.a.j */
/* compiled from: PG */
public final class C25877j implements C25986j {

    /* renamed from: a */
    private final C25876i f70314a;

    public C25877j(AccountId accountId) {
        C25876i iVar = new C25876i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        this.f70314a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Fragment mo31044a() {
        return this.f70314a;
    }

    /* renamed from: b */
    public final void mo31045b(C56304dd ddVar) {
        C56292cs csVar;
        C56292cs csVar2;
        C56292cs csVar3;
        C56292cs csVar4;
        C25891x a = this.f70314a.mo17754z();
        if (a.f70341e == null && !a.f70343g) {
            for (C56302db dbVar : ddVar.f150052a) {
                C56306df a2 = C56306df.m87964a(dbVar.f150048d);
                if (a2 == null) {
                    a2 = C56306df.UNKNOWN_FILTER_TYPE;
                }
                if (a2 == C56306df.DINING) {
                    if (dbVar.f150046b == 3) {
                        csVar = (C56292cs) dbVar.f150047c;
                    } else {
                        csVar = C56292cs.f150016e;
                    }
                    Iterator it = new C62963cj(csVar.f150020c, C56292cs.f150015d).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (C56285cl.MENU.equals((C56285cl) it.next())) {
                            a.f70346j = true;
                            break;
                        }
                    }
                    int i = dbVar.f150046b;
                    if (i == 3) {
                        csVar2 = (C56292cs) dbVar.f150047c;
                    } else {
                        csVar2 = C56292cs.f150016e;
                    }
                    if ((csVar2.f150018a & 4) != 0 && a.f70342f) {
                        if (i == 3) {
                            csVar3 = (C56292cs) dbVar.f150047c;
                        } else {
                            csVar3 = C56292cs.f150016e;
                        }
                        C56291cr crVar = csVar3.f150019b;
                        if (crVar == null) {
                            crVar = C56291cr.f150010c;
                        }
                        C62971cq cqVar = crVar.f150013b;
                        if (!cqVar.isEmpty()) {
                            C56287cn cnVar = (C56287cn) cqVar.get(0);
                            C62485dh dhVar = cnVar.f150007a;
                            if (dhVar == null) {
                                dhVar = C62485dh.f168693e;
                            }
                            if (!dhVar.f168697c.isEmpty()) {
                                C62485dh dhVar2 = cnVar.f150007a;
                                if (dhVar2 == null) {
                                    dhVar2 = C62485dh.f168693e;
                                }
                                if (!dhVar2.f168696b.isEmpty()) {
                                    C62485dh dhVar3 = cnVar.f150007a;
                                    String str = (dhVar3 == null ? C62485dh.f168693e : dhVar3).f168696b;
                                    if (dhVar3 == null) {
                                        dhVar3 = C62485dh.f168693e;
                                    }
                                    String str2 = dhVar3.f168697c;
                                    if (a.f70333D.containsKey(str)) {
                                        a.f70340d = (C25865ao) a.f70333D.get(str);
                                    } else {
                                        C146006ab a3 = a.f70357u.mo37395a(C31855k.m59240e(str, C25891x.f70329c).mo37447c());
                                        a3.mo122499r(new C25881n(a));
                                        a3.mo122498q(C25882o.f70318a);
                                    }
                                    a.mo31059h(str2);
                                    a.f70354r.setVisibility(8);
                                }
                            }
                        } else {
                            a.mo31058g(a.f70362z);
                            if (a.f70344h && !a.f70345i) {
                                a.f70354r.setVisibility(0);
                                a.f70345i = true;
                            }
                        }
                        if (dbVar.f150046b == 3) {
                            csVar4 = (C56292cs) dbVar.f150047c;
                        } else {
                            csVar4 = C56292cs.f150016e;
                        }
                        C56291cr crVar2 = csVar4.f150019b;
                        if (crVar2 == null) {
                            crVar2 = C56291cr.f150010c;
                        }
                        int a4 = C56290cq.m87960a(crVar2.f150012a);
                        if (a4 != 0 && a4 == 2) {
                            a.mo31062k(0);
                            a.mo31061j(8);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        this.f70314a.mo17754z();
        eVar.mo33150g("DiningFilterSettingsFragment");
    }

    /* renamed from: d */
    public final /* synthetic */ void mo31046d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo31047e() {
    }
}
