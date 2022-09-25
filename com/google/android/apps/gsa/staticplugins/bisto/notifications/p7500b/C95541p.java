package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95208w;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.p */
/* compiled from: PG */
public final class C95541p extends C95551z {

    /* renamed from: n */
    private static final C59071e f267377n = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.b.p");

    /* renamed from: o */
    private CharSequence f267378o;

    public C95541p(List list, C95598as asVar, C95706l lVar, C95293ae aeVar, C95600au auVar, C68214a aVar, C68214a aVar2, C89656k kVar, C95307m mVar, C21370a aVar3) {
        super(list, asVar, lVar, aeVar, auVar, aVar, aVar2, kVar, mVar, aVar3);
        if (list.isEmpty() || !((MessageNotification) list.get(0)).mo84134g()) {
            C59104x d = f267377n.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GroupNotifAnn");
            ((C59052c) ((C59052c) d).mo56372aa(16054)).mo56386p("Can only handle group messages!");
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: Z */
    private final C95209x m158100Z(int i, MessageNotification messageNotification) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return new C95209x(BuildConfig.FLAVOR);
        }
        boolean z = i == 0;
        boolean aa = m158101aa(z, messageNotification.f252535E);
        C58976aa aaVar = C58975e.f156826a;
        if (z || aa) {
            boolean z2 = afVar.f267281b && z;
            String b = new C95525ao(this.f267276j.f267947e, messageNotification.f252535E.toString()).mo89429b();
            if (!z2) {
                return new C95208w(this.f267276j.f267947e, R.string.sender_and_message_contents, b, mo89439I(messageNotification));
            } else if (afVar.f267286g) {
                return new C95208w(this.f267276j.f267947e, R.string.interruptive_group_and_sender_and_message_contents, mo89403L(), b, mo89439I(messageNotification));
            } else {
                return new C95208w(this.f267276j.f267947e, R.string.non_interruptive_group_and_sender_and_message_contents, mo89403L(), b, mo89439I(messageNotification));
            }
        } else {
            return new C95208w(this.f267276j.f267947e, R.string.message_contents, mo89439I(messageNotification));
        }
    }

    /* renamed from: aa */
    private final boolean m158101aa(boolean z, CharSequence charSequence) {
        return !z && !TextUtils.equals(this.f267378o, charSequence);
    }

    /* renamed from: A */
    public final int mo89432A() {
        return 6;
    }

    /* renamed from: B */
    public final C95209x mo89433B() {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
        }
        if (afVar == null || afVar.f267286g) {
            Integer g = this.f267406d.mo89215g(6);
            if (g == null) {
                return new C95208w(this.f267276j.f267947e, R.string.interruptive_messages_from_group, mo89403L());
            }
            Integer f = this.f267406d.mo89214f(6);
            if (f == null) {
                f = 1;
            }
            String j = this.f267406d.mo89217j(this.f267276j.f267947e, 19, f.intValue());
            if (j == null) {
                j = this.f267276j.f267947e.getString(R.string.default_instruction);
            }
            return new C95208w(this.f267276j.f267947e, g.intValue(), mo89403L(), j);
        }
        return new C95208w(this.f267276j.f267947e, R.string.non_interruptive_messages_from_group, mo89403L());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89434E(int r8, com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o r9, com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n r10) {
        /*
            r7 = this;
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.af r0 = r7.f267279m
            if (r0 == 0) goto L_0x005a
            java.util.List r0 = r7.f267409g
            java.lang.Object r0 = r0.get(r8)
            r6 = r0
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r6 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r6
            boolean r0 = r6.mo84135h()
            if (r0 == 0) goto L_0x0017
            super.mo89434E(r8, r9, r10)
            return
        L_0x0017:
            r0 = 1
            if (r8 != 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.CharSequence r2 = r6.f252535E
            boolean r2 = r7.m158101aa(r1, r2)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.b.b.x r4 = r7.m158100Z(r8, r6)
            if (r1 != 0) goto L_0x002e
            if (r2 == 0) goto L_0x0036
            r2 = 1
        L_0x002e:
            r7.f267411i = r0
            java.lang.CharSequence r8 = r6.f252535E
            r7.f267378o = r8
            if (r2 != 0) goto L_0x0045
        L_0x0036:
            int r8 = r9.mo89203c(r4, r10)
            com.google.common.o.lk r9 = r7.f267277k
            com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q.m157570d(r9, r8)
            if (r8 == 0) goto L_0x0044
            r7.mo89441M(r6)
        L_0x0044:
            return
        L_0x0045:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.n r8 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.b.n
            r1 = r8
            r2 = r7
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = 400(0x190, double:1.976E-321)
            int r8 = r9.mo89201a(r0, r8)
            com.google.common.o.lk r9 = r7.f267277k
            com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q.m157570d(r9, r8)
            return
        L_0x005a:
            java.lang.String r8 = "no settings"
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r8)
            r10.mo88601a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95541p.mo89434E(int, com.google.android.apps.gsa.staticplugins.bisto.e.o, com.google.android.apps.gsa.staticplugins.bisto.e.n):void");
    }

    /* renamed from: F */
    public final void mo89435F(C94647k kVar, C94637a aVar, boolean z, int i) {
        if (this.f267279m == null) {
            C89655j.m145957a("no settings");
            aVar.mo88580a(false);
        } else if (i >= this.f267409g.size()) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            MessageNotification messageNotification = (MessageNotification) this.f267409g.get(i);
            if (messageNotification.mo84135h()) {
                super.mo89435F(kVar, aVar, z, i);
                return;
            }
            m158100Z(i, messageNotification);
            new C95540o(this, kVar, aVar, z, i).mo88580a(false);
        }
    }

    /* renamed from: G */
    public final boolean mo89401G() {
        return true;
    }
}
