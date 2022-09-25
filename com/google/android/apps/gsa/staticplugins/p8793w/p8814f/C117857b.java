package com.google.android.apps.gsa.staticplugins.p8793w.p8814f;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import androidx.core.app.C1811ba;
import com.google.android.apps.gsa.handsfree.h;
import com.google.android.apps.gsa.handsfree.i;
import com.google.android.apps.gsa.handsfree.notifications.BaseRemoteNotification;
import com.google.android.apps.gsa.handsfree.notifications.RemoteNotification;
import com.google.android.apps.gsa.handsfree.notifications.j;
import com.google.android.apps.gsa.handsfree.notifications.k;
import com.google.android.apps.gsa.handsfree.notifications.l;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6652cj.C85126a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.C87171z;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4671b.C61803av;
import com.google.knowledge.p4671b.C61805ax;
import com.google.knowledge.p4671b.C61806ay;
import com.google.knowledge.p4671b.C61807az;
import com.google.knowledge.p4671b.C61809ba;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4152bb.p4153a.C55421x;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.f.b */
/* compiled from: PG */
public final class C117857b extends C86734a implements C85126a {

    /* renamed from: a */
    private final C117856a f327083a;

    /* renamed from: b */
    private final C68214a f327084b;

    public C117857b(C117856a aVar, C68214a aVar2) {
        super(C118575h.WORKER_NOTIFICATION_ACTION, "remotenotification");
        this.f327083a = aVar;
        this.f327084b = aVar2;
    }

    /* renamed from: a */
    public final void mo78724a() {
        C58976aa aaVar = C58975e.f156826a;
        ((l) this.f327084b.mo27525b()).a();
        this.f327083a.mo103459a();
    }

    /* renamed from: b */
    public final void mo78725b(List list, boolean z) {
        List list2 = list;
        boolean z2 = z;
        if (list2 != null && !list.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            l lVar = (l) this.f327084b.mo27525b();
            if (!list.isEmpty()) {
                C59104x b = l.a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "RemoteNotifCDCManager");
                ((C59052c) ((C59052c) b).mo56372aa(2367)).mo56387q("processRemoteNotificationList(): Num notifications received %d.", list.size());
                lVar.a();
                int i = 0;
                for (int i2 = 6; i < Math.min(list.size(), i2); i2 = 6) {
                    RemoteNotification remoteNotification = (RemoteNotification) list2.get(i);
                    String valueOf = String.valueOf(i);
                    List l = remoteNotification.mo70925l();
                    long a = remoteNotification.mo70916a();
                    long b2 = remoteNotification.mo70917b();
                    String i3 = remoteNotification.mo70923i();
                    C61805ax f = remoteNotification.mo70920f();
                    C55421x g = remoteNotification.mo70921g();
                    C55093fp h = remoteNotification.mo70922h();
                    C61803av avVar = (C61803av) C61806ay.f166956i.createBuilder();
                    avVar.copyOnWrite();
                    C61806ay ayVar = (C61806ay) avVar.instance;
                    valueOf.getClass();
                    ayVar.f166958a |= 4;
                    ayVar.f166961d = valueOf;
                    avVar.copyOnWrite();
                    C61806ay ayVar2 = (C61806ay) avVar.instance;
                    h.getClass();
                    ayVar2.f166959b = h;
                    ayVar2.f166958a |= 2;
                    long j = -1;
                    if (a > -1) {
                        avVar.copyOnWrite();
                        C61806ay ayVar3 = (C61806ay) avVar.instance;
                        ayVar3.f166958a |= 8;
                        ayVar3.f166962e = a * 1000;
                        j = -1;
                    }
                    if (b2 > j && b2 < lVar.c.mo26870b()) {
                        avVar.copyOnWrite();
                        C61806ay ayVar4 = (C61806ay) avVar.instance;
                        ayVar4.f166958a |= 32;
                        ayVar4.f166964g = b2 * 1000;
                    }
                    avVar.copyOnWrite();
                    C61806ay ayVar5 = (C61806ay) avVar.instance;
                    i3.getClass();
                    ayVar5.f166958a |= 64;
                    ayVar5.f166965h = i3;
                    if (g != C55421x.UNKNOWN_ACTION_TYPE) {
                        ((C87541c) lVar.b.mo27525b()).mo81659u(g);
                    }
                    if (f != C61805ax.UNKNOWN) {
                        avVar.copyOnWrite();
                        C61806ay ayVar6 = (C61806ay) avVar.instance;
                        ayVar6.f166963f = f.f166955e;
                        ayVar6.f166958a |= 16;
                    }
                    for (int i4 = 0; i4 < l.size(); i4++) {
                        k kVar = (k) l.get(i4);
                        C61807az azVar = (C61807az) C61809ba.f166976e.createBuilder();
                        String str = kVar.a;
                        azVar.copyOnWrite();
                        C61809ba baVar = (C61809ba) azVar.instance;
                        baVar.f166978a |= 2;
                        baVar.f166981d = str;
                        if (kVar.b != null) {
                            String j2 = BaseRemoteNotification.j(valueOf, i4);
                            azVar.copyOnWrite();
                            C61809ba baVar2 = (C61809ba) azVar.instance;
                            baVar2.f166978a |= 1;
                            baVar2.f166979b = j2;
                        }
                        for (int i5 = 0; i5 < kVar.a(); i5++) {
                            j b3 = kVar.b(i5);
                            if (b3 != null) {
                                azVar.mo58197a(b3.a);
                            }
                        }
                        avVar.copyOnWrite();
                        C61806ay ayVar7 = (C61806ay) avVar.instance;
                        C61809ba baVar3 = (C61809ba) azVar.build();
                        baVar3.getClass();
                        ayVar7.mo58196a();
                        ayVar7.f166960c.add(baVar3);
                    }
                    ((C87541c) lVar.b.mo27525b()).mo81652n((C61806ay) avVar.build(), lVar.c.mo26870b() * 1000);
                    i++;
                    list2 = list;
                    boolean z3 = z;
                }
            }
            C117856a aVar = this.f327083a;
            if (!list.isEmpty()) {
                C59104x b4 = C117856a.f327077a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "RemoteNotifManager");
                boolean z4 = z;
                ((C59052c) ((C59052c) b4).mo56372aa(18678)).mo56396z("processRemoteNotificationList(): Num notifications received: %d; force offline: %b", list.size(), z4);
                aVar.mo103459a();
                for (int i6 = 0; i6 < Math.min(list.size(), 6); i6++) {
                    RemoteNotification remoteNotification2 = (RemoteNotification) list.get(i6);
                    String valueOf2 = String.valueOf(i6);
                    List<k> l2 = remoteNotification2.mo70925l();
                    String k = remoteNotification2.mo70924k();
                    List m = remoteNotification2.mo70926m();
                    if (!k.isEmpty()) {
                        ((h) aVar.f327080d.mo27525b()).n.put(valueOf2, k);
                        ((i) aVar.f327079c.mo27525b()).b.put(valueOf2, k);
                    }
                    if (!m.isEmpty()) {
                        ((h) aVar.f327080d.mo27525b()).o.put(valueOf2, m);
                    }
                    for (int i7 = 0; i7 < l2.size(); i7++) {
                        String j3 = BaseRemoteNotification.j(valueOf2, i7);
                        PendingIntent pendingIntent = ((k) l2.get(i7)).b;
                        if (!j3.isEmpty() && pendingIntent != null) {
                            ((i) aVar.f327079c.mo27525b()).e(j3, pendingIntent);
                        }
                    }
                    Icon c = remoteNotification2.mo70918c();
                    if (c != null) {
                        ((i) aVar.f327079c.mo27525b()).g(valueOf2, c);
                    }
                    for (k kVar2 : l2) {
                        for (int i8 = 0; i8 < kVar2.a(); i8++) {
                            j b5 = kVar2.b(i8);
                            if (b5 != null) {
                                String str2 = b5.a;
                                C1811ba baVar4 = b5.b;
                                if (!str2.isEmpty() && baVar4 != null) {
                                    ((i) aVar.f327079c.mo27525b()).f(str2, baVar4);
                                }
                            }
                        }
                    }
                    C55421x g2 = remoteNotification2.mo70921g();
                    if (g2 != C55421x.UNKNOWN_ACTION_TYPE) {
                        ((C87541c) aVar.f327078b.mo27525b()).mo81659u(g2);
                        C87171z zVar = aVar.f327082f;
                        zVar.f235557l = g2;
                        zVar.mo80774F();
                    }
                    Query e = remoteNotification2.mo70919e();
                    if (z4) {
                        e = e.mo84238A().mo84244G(false);
                    }
                    if (g2 != C55421x.UNKNOWN_ACTION_TYPE) {
                        int i9 = g2.f146230cP;
                        aVar.f327081e.mo80462q(e);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
