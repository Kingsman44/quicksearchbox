package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.accounts.Account;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import androidx.preference.C4023s;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.utils.p7317ui.C92658d;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50323sv;
import com.google.assistant.p3861at.C50324sw;
import com.google.assistant.p3861at.C50327sz;
import com.google.assistant.p3861at.C50329ta;
import com.google.assistant.p3861at.C50330tb;
import com.google.assistant.p3861at.C50331tc;
import com.google.assistant.p3861at.C50333te;
import com.google.assistant.p3861at.C50334tf;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4129b.p4134b.p4135a.C54742b;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.ab */
/* compiled from: PG */
public final class C10064ab extends C9504g implements C4023s {

    /* renamed from: p */
    private static final C59071e f34310p = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ah.ab");

    /* renamed from: i */
    public final h f34311i;

    /* renamed from: j */
    public final C86124t f34312j;

    /* renamed from: k */
    C10073j f34313k;

    /* renamed from: l */
    C10073j f34314l;

    /* renamed from: m */
    public PreferenceCategory f34315m;

    /* renamed from: n */
    public PreferenceCategory f34316n;

    /* renamed from: o */
    public C50324sw f34317o;

    public C10064ab(h hVar, C86124t tVar) {
        this.f34311i = hVar;
        this.f34312j = tVar;
    }

    /* renamed from: N */
    private final C50334tf m24863N(Long l, Long l2) {
        C50333te teVar = (C50333te) C50334tf.f130998e.createBuilder();
        if (l != null) {
            long longValue = l.longValue();
            teVar.copyOnWrite();
            C50334tf tfVar = (C50334tf) teVar.instance;
            tfVar.f131000a |= 1;
            tfVar.f131001b = longValue;
        }
        C54742b bVar = null;
        if (l != null) {
            C50323sv svVar = this.f34317o.f130976a;
            if (svVar == null) {
                svVar = C50323sv.f130971b;
            }
            Iterator it = svVar.f130973a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C50323sv svVar2 = this.f34317o.f130977b;
                    if (svVar2 == null) {
                        svVar2 = C50323sv.f130971b;
                    }
                    Iterator it2 = svVar2.f130973a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C50329ta taVar = (C50329ta) it2.next();
                        if (taVar.f130984b == l.longValue()) {
                            bVar = taVar.f130990h;
                            if (bVar == null) {
                                bVar = C54742b.f143653a;
                            }
                        }
                    }
                } else {
                    C50329ta taVar2 = (C50329ta) it.next();
                    if (taVar2.f130984b == l.longValue()) {
                        bVar = taVar2.f130990h;
                        if (bVar == null) {
                            bVar = C54742b.f143653a;
                        }
                    }
                }
            }
        }
        if (bVar != null) {
            teVar.copyOnWrite();
            C50334tf tfVar2 = (C50334tf) teVar.instance;
            tfVar2.f131002c = bVar;
            tfVar2.f131000a |= 2;
        }
        if (l2 != null) {
            long longValue2 = l2.longValue();
            teVar.copyOnWrite();
            C50334tf tfVar3 = (C50334tf) teVar.instance;
            tfVar3.f131000a |= 4;
            tfVar3.f131003d = longValue2;
        }
        return (C50334tf) teVar.build();
    }

    /* renamed from: O */
    private final Long m24864O(PreferenceCategory preferenceCategory) {
        if (preferenceCategory == this.f34315m) {
            C10073j jVar = this.f34313k;
            jVar.getClass();
            String str = jVar.f12748t;
            if (!"assistant_notes_lists_no_preference".equals(str) && str.startsWith("assistant_notes_lists_provider_")) {
                return Long.valueOf(Long.parseLong(str.replaceFirst("assistant_notes_lists_provider_", BuildConfig.FLAVOR)));
            }
        } else if (preferenceCategory == this.f34316n) {
            C10073j jVar2 = this.f34314l;
            jVar2.getClass();
            String str2 = jVar2.f12748t;
            if (!"assistant_shopping_no_preference".equals(str2) && str2.startsWith("assistant_shopping_provider_")) {
                return Long.valueOf(Long.parseLong(str2.replaceFirst("assistant_shopping_provider_", BuildConfig.FLAVOR)));
            }
        }
        return null;
    }

    /* renamed from: P */
    private final void m24865P(C10073j jVar, DialogInterface.OnClickListener onClickListener) {
        C10073j jVar2;
        String str = jVar.f12748t;
        if ("assistant_notes_lists_no_preference".equals(str) || str.startsWith("assistant_notes_lists_provider_")) {
            jVar2 = this.f34313k;
        } else if ("assistant_shopping_no_preference".equals(str) || str.startsWith("assistant_shopping_provider_")) {
            jVar2 = this.f34314l;
        } else {
            C59104x d = f34310p.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotesListsV2Controller");
            ((C59052c) ((C59052c) d).mo56372aa(1042)).mo56389s("unknown preference key: %s", str);
            jVar2 = null;
        }
        jVar2.getClass();
        Activity fX = mo17794fX();
        if (fX != null) {
            new AlertDialog.Builder(fX).setTitle(mo17797h(R.string.notes_lists_provider_unselection_title, jVar2.f12745q)).setMessage(mo17797h(R.string.notes_lists_provider_unlink_description, jVar2.f12745q)).setPositiveButton(R.string.notes_lists_provider_unselection_positive_button, onClickListener).setNegativeButton(R.string.notes_lists_provider_unselection_negative_button, (DialogInterface.OnClickListener) null).show();
        }
    }

    /* renamed from: Q */
    private static boolean m24866Q(C10073j jVar) {
        return jVar.f12748t.equals("assistant_notes_lists_no_preference");
    }

    /* renamed from: F */
    public final C10063aa mo18215F(int i, int i2, int i3, String str, boolean z, boolean z2, boolean z3) {
        C10063aa aaVar = new C10063aa(mo17792e().f12738j);
        aaVar.f12718D = R.layout.notes_and_lists_title_preference_category;
        aaVar.mo8346M(i);
        String g = mo17795g(i3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mo17797h(i2, g));
        if (z) {
            C92658d.m152614a(spannableStringBuilder, g, new C10084u(this, str));
        } else {
            C92658d.m152614a(spannableStringBuilder, g, new URLSpan(str));
        }
        aaVar.mo8329n(spannableStringBuilder);
        if (z2) {
            aaVar.mo8343J("assistant_notes_lists_category");
        }
        aaVar.f34309e = Boolean.valueOf(z3);
        aaVar.mo8317e();
        return aaVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo18216G(C10073j jVar, String str, boolean z, Runnable runnable) {
        C58976aa aaVar = C58975e.f156826a;
        Intent putExtra = new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.gdi.GdiControlActivity").putExtra("extra_service_id", str).putExtra("extra_action_mode", 2);
        Account a = this.f34311i.a();
        if (a != null) {
            putExtra.putExtra("extra_account", a);
        }
        C91097g f = mo17793f();
        f.getClass();
        f.mo65090b(putExtra, new C10088y(this, runnable, z, jVar));
    }

    /* renamed from: H */
    public final void mo18217H(List list, PreferenceCategory preferenceCategory, String str, String str2, boolean z) {
        int i;
        int a;
        int a2;
        PreferenceCategory preferenceCategory2 = preferenceCategory;
        Iterator it = list.iterator();
        C10073j jVar = null;
        C10073j jVar2 = null;
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            C50329ta taVar = (C50329ta) it.next();
            int a3 = C50327sz.m85810a(taVar.f130985c);
            if (a3 == 0) {
                a3 = 1;
            }
            C10073j a4 = C10074k.m24891a(mo17792e().f12738j);
            a4.mo8347N(taVar.f130987e);
            a4.mo8329n(taVar.f130989g);
            a4.mo8343J(str + taVar.f130984b);
            a4.f12742n = this;
            a4.f34334c = taVar.f130991i;
            a4.f34335d = a3 == 2;
            if (a3 != 3) {
                if (a3 == 4) {
                    a3 = 4;
                } else {
                    z2 = false;
                }
            }
            a4.f34336e = z2;
            a4.f34337f = (String[]) taVar.f130992j.toArray(new String[0]);
            a4.f34338g = (String[]) taVar.f130993k.toArray(new String[0]);
            mo17803n(taVar.f130986d, R.drawable.quantum_ic_lists_grey600_24, new C10086w(a4));
            if (a3 == 5) {
                a4.mo8361ab();
                a4.mo8339F(false);
            }
            if (jVar2 == null && taVar.f130988f && (((a = C50327sz.m85810a((i = taVar.f130985c))) != 0 && a == 2) || ((a2 = C50327sz.m85810a(i)) != 0 && a2 == 4))) {
                jVar2 = a4;
            }
            preferenceCategory2.mo8379af(a4);
        }
        if (!list.isEmpty() || !z) {
            jVar = mo18223b(str2);
            preferenceCategory2.mo8379af(jVar);
        }
        if (jVar2 == null && jVar != null) {
            jVar2 = jVar;
        }
        if (jVar2 != null) {
            jVar2.mo8391j(true);
        }
        if (preferenceCategory2 == this.f34315m) {
            this.f34313k = jVar2;
        } else if (preferenceCategory2 == this.f34316n) {
            this.f34314l = jVar2;
        }
    }

    /* renamed from: I */
    public final void mo18218I() {
        mo17792e().mo8376ac();
        acu acu = (acu) acv.f128920X.createBuilder();
        C50330tb tbVar = (C50330tb) C50331tc.f130994c.createBuilder();
        tbVar.copyOnWrite();
        C50331tc tcVar = (C50331tc) tbVar.instance;
        tcVar.f130996a |= 1;
        tcVar.f130997b = true;
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        C50331tc tcVar2 = (C50331tc) tbVar.build();
        tcVar2.getClass();
        acv.f128930I = tcVar2;
        acv.f128946b |= 8192;
        mo17813x(acu, new C10082s(this), false);
    }

    /* renamed from: J */
    public final void mo18219J(C10073j jVar, boolean z) {
        String[] strArr = jVar.f34337f;
        String[] strArr2 = jVar.f34338g;
        String str = jVar.f34334c;
        if (jVar.f34335d) {
            mo18222M(jVar, (Long) null, z, (C9506h) null);
        } else if (jVar.f34336e) {
            C58976aa aaVar = C58975e.f156826a;
            Intent putExtra = new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.gdi.GdiControlActivity").putExtra("extra_service_id", str).putExtra("extra_scopes", strArr).putExtra("extra_google_scopes", strArr2).putExtra("extra_action_mode", 1);
            Account a = this.f34311i.a();
            if (a != null) {
                putExtra.putExtra("extra_account", a);
            }
            C91097g f = mo17793f();
            f.getClass();
            f.mo65090b(putExtra, new C10087x(this, jVar));
        }
    }

    /* renamed from: L */
    public final void mo18221L(C10073j jVar, DialogInterface.OnClickListener onClickListener) {
        Activity fX = mo17794fX();
        if (fX != null) {
            new AlertDialog.Builder(fX).setTitle(mo17797h(R.string.notes_lists_provider_selection_title, jVar.f12745q)).setMessage(mo17797h(R.string.notes_lists_provider_selection_description, jVar.f12745q)).setPositiveButton(R.string.notes_lists_provider_selection_positive_button, onClickListener).setNegativeButton(R.string.notes_lists_provider_selection_negative_button, (DialogInterface.OnClickListener) null).show();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.google.android.apps.gsa.assistant.settings.features.ah.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: com.google.android.apps.gsa.assistant.settings.features.ah.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.apps.gsa.assistant.settings.features.ah.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18222M(com.google.android.apps.gsa.assistant.settings.features.p548ah.C10073j r11, java.lang.Long r12, boolean r13, com.google.android.apps.gsa.assistant.settings.base.C9506h r14) {
        /*
            r10 = this;
            java.lang.String r0 = r11.f12748t
            com.google.assistant.at.acx r1 = com.google.assistant.p3861at.acx.f128971H
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.at.acw r1 = (com.google.assistant.p3861at.acw) r1
            com.google.assistant.at.tg r2 = com.google.assistant.p3861at.C50335tg.f131004c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.at.td r2 = (com.google.assistant.p3861at.C50332td) r2
            java.lang.String r3 = "assistant_notes_lists_no_preference"
            boolean r4 = r3.equals(r0)
            r5 = 0
            java.lang.String r6 = "assistant_notes_lists_provider_"
            if (r4 == 0) goto L_0x002e
            if (r12 != 0) goto L_0x0025
            androidx.preference.PreferenceCategory r12 = r10.f34315m
            java.lang.Long r12 = r10.m24864O(r12)
        L_0x0025:
            com.google.assistant.at.tf r12 = r10.m24863N(r5, r12)
            r2.mo53395a(r12)
            goto L_0x00a2
        L_0x002e:
            boolean r4 = r0.startsWith(r6)
            java.lang.String r7 = ""
            if (r4 == 0) goto L_0x0052
            if (r12 != 0) goto L_0x003e
            androidx.preference.PreferenceCategory r12 = r10.f34315m
            java.lang.Long r12 = r10.m24864O(r12)
        L_0x003e:
            java.lang.String r4 = r0.replaceFirst(r6, r7)
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.assistant.at.tf r12 = r10.m24863N(r4, r12)
            r2.mo53395a(r12)
            goto L_0x00a2
        L_0x0052:
            java.lang.String r4 = "assistant_shopping_no_preference"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x006a
            if (r12 != 0) goto L_0x0062
            androidx.preference.PreferenceCategory r12 = r10.f34316n
            java.lang.Long r12 = r10.m24864O(r12)
        L_0x0062:
            com.google.assistant.at.tf r12 = r10.m24863N(r5, r12)
            r2.mo53396b(r12)
            goto L_0x00a2
        L_0x006a:
            java.lang.String r4 = "assistant_shopping_provider_"
            boolean r5 = r0.startsWith(r4)
            if (r5 == 0) goto L_0x008e
            if (r12 != 0) goto L_0x007a
            androidx.preference.PreferenceCategory r12 = r10.f34316n
            java.lang.Long r12 = r10.m24864O(r12)
        L_0x007a:
            java.lang.String r4 = r0.replaceFirst(r4, r7)
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.assistant.at.tf r12 = r10.m24863N(r4, r12)
            r2.mo53396b(r12)
            goto L_0x00a2
        L_0x008e:
            com.google.common.f.e r12 = f34310p
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "NotesListsV2Controller"
            r12.mo56378ag(r4, r5)
            java.lang.String r4 = "unknown preference key: %s"
            r5 = 1043(0x413, float:1.462E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r5)).mo56389s(r4, r0)
        L_0x00a2:
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.assistant.at.acx r12 = (com.google.assistant.p3861at.acx) r12
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.at.tg r2 = (com.google.assistant.p3861at.C50335tg) r2
            r2.getClass()
            r12.f129005v = r2
            int r2 = r12.f128984a
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 | r4
            r12.f128984a = r2
            com.google.protobuf.bv r12 = r1.build()
            com.google.assistant.at.acx r12 = (com.google.assistant.p3861at.acx) r12
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.at.tg r1 = r12.f129005v
            if (r14 != 0) goto L_0x010f
            boolean r14 = r3.equals(r0)
            r1 = 0
            r2 = 1
            if (r14 != 0) goto L_0x00d8
            boolean r14 = r0.startsWith(r6)
            if (r14 == 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            r6 = 0
            goto L_0x00d9
        L_0x00d8:
            r6 = 1
        L_0x00d9:
            com.google.android.apps.gsa.assistant.settings.features.ah.j r9 = r10.f34313k
            r9.getClass()
            boolean r14 = r9.f34335d
            if (r14 == 0) goto L_0x00eb
            boolean r14 = m24866Q(r11)
            if (r14 != 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r5 = 1
            goto L_0x00f7
        L_0x00eb:
            boolean r14 = m24866Q(r9)
            if (r14 == 0) goto L_0x00f6
            boolean r14 = r11.f34335d
            if (r14 == 0) goto L_0x00f6
            goto L_0x00e9
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            if (r5 == 0) goto L_0x0106
            if (r6 == 0) goto L_0x0101
            androidx.preference.PreferenceCategory r14 = r10.f34315m
            r10.mo18220K(r14, r11)
            goto L_0x0106
        L_0x0101:
            androidx.preference.PreferenceCategory r14 = r10.f34316n
            r10.mo18220K(r14, r11)
        L_0x0106:
            com.google.android.apps.gsa.assistant.settings.features.ah.z r14 = new com.google.android.apps.gsa.assistant.settings.features.ah.z
            r3 = r14
            r4 = r10
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x010f:
            java.util.concurrent.atomic.AtomicInteger r11 = r10.f32989e
            int r11 = r11.getAndIncrement()
            com.google.android.apps.gsa.assistant.settings.d.a r13 = r10.f32986b
            com.google.android.apps.gsa.assistant.settings.base.f r0 = new com.google.android.apps.gsa.assistant.settings.base.f
            r0.<init>(r10, r14, r11)
            com.google.android.apps.gsa.staticplugins.dk.m r12 = r13.mo17842g(r12, r0)
            if (r12 == 0) goto L_0x012b
            j$.util.concurrent.ConcurrentHashMap r13 = r10.f32990f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.put(r11, r12)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.p548ah.C10064ab.mo18222M(com.google.android.apps.gsa.assistant.settings.features.ah.j, java.lang.Long, boolean, com.google.android.apps.gsa.assistant.settings.base.h):void");
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        String str = preference.f12748t;
        if (((Boolean) obj).booleanValue() && str != null) {
            C10073j jVar = this.f34313k;
            jVar.getClass();
            C10073j jVar2 = (C10073j) preference;
            if (jVar2.f12789a) {
                return true;
            }
            if (m24866Q(jVar2)) {
                m24865P(jVar, new C10075l(this, jVar, jVar2));
            } else if (m24866Q(jVar)) {
                mo18221L(jVar2, new C10076m(this, jVar2));
            } else {
                m24865P(jVar, new C10077n(this, jVar2, jVar));
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C10073j mo18223b(String str) {
        C10073j a = C10074k.m24891a(mo17792e().f12738j);
        a.mo8346M(R.string.notes_lists_none_preference_title_v2);
        a.mo8345L(R.string.notes_lists_none_preference_summary);
        a.mo8343J(str);
        a.f12742n = this;
        mo17803n((String) null, R.drawable.quantum_ic_sync_disabled_grey600_24, new C10085v(a));
        return a;
    }

    /* renamed from: o */
    public final void mo17804o(Bundle bundle) {
        mo18218I();
    }

    /* renamed from: K */
    public final void mo18220K(PreferenceCategory preferenceCategory, C10073j jVar) {
        if (preferenceCategory == this.f34315m) {
            C10073j jVar2 = this.f34313k;
            jVar2.getClass();
            jVar2.mo8391j(false);
            this.f34313k = jVar;
            jVar.mo8391j(true);
        } else if (preferenceCategory == this.f34316n) {
            C10073j jVar3 = this.f34314l;
            jVar3.getClass();
            jVar3.mo8391j(false);
            this.f34314l = jVar;
            jVar.mo8391j(true);
        }
    }
}
