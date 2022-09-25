package com.google.android.libraries.search.assistant.proactive;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p3803ag.p3809c.C49067ff;
import com.google.assistant.p3803ag.p3809c.C49073fl;
import com.google.assistant.p3861at.C49927ed;
import com.google.assistant.p3861at.C49932ei;
import com.google.assistant.p3861at.C49934ek;
import com.google.assistant.p3861at.C49935el;
import com.google.assistant.p3861at.C49937en;
import com.google.assistant.p3897e.p3921j.C51792dh;
import com.google.assistant.p3897e.p3921j.C51793di;
import com.google.assistant.p3897e.p3921j.C51795dk;
import com.google.assistant.p3897e.p3921j.C51798dn;
import com.google.assistant.p3897e.p3921j.aaz;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protos.p4985f.p5036r.C65319e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.proactive.y */
/* compiled from: PG */
public final class C36371y implements C36337r {

    /* renamed from: a */
    public static final C59071e f94979a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.y");

    /* renamed from: b */
    public final C36221aq f94980b;

    /* renamed from: c */
    public final C68214a f94981c;

    /* renamed from: d */
    public final Executor f94982d;

    /* renamed from: e */
    private final Context f94983e;

    public C36371y(Context context, C36221aq aqVar, C68214a aVar, Executor executor) {
        this.f94983e = context;
        this.f94980b = aqVar;
        this.f94981c = aVar;
        this.f94982d = executor;
    }

    /* renamed from: m */
    public static C36370x m64892m(C49067ff ffVar, int i) {
        for (C49927ed edVar : ffVar.f126919a) {
            Iterator it = edVar.f129775b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C49937en enVar = (C49937en) it.next();
                    int a = C65319e.m96667a(enVar.f129797a);
                    if (a == 0) {
                        a = 1;
                    }
                    if (a - 1 == i) {
                        return new C36370x(enVar);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    static String m64893n(int i) {
        return "OpaChannel_" + i;
    }

    /* renamed from: p */
    public static boolean m64894p(C49937en enVar, NotificationChannel notificationChannel) {
        return !enVar.f129798b.equals(notificationChannel.getName() != null ? notificationChannel.getName().toString() : BuildConfig.FLAVOR) || !enVar.f129799c.equals(C58837ba.m90858g(notificationChannel.getDescription()));
    }

    /* renamed from: s */
    private static C36335p m64895s(C48980c cVar) {
        C48980c cVar2 = C48980c.TYPE_UNKNOWN;
        int ordinal = cVar.ordinal();
        if (ordinal == 1) {
            return C36335p.OPA_PROACTIVE;
        }
        if (ordinal == 2) {
            return C36335p.OPA_HANDOFF;
        }
        if (ordinal == 4) {
            return C36335p.OPA_RECOMMENDATIONS;
        }
        if (ordinal == 5) {
            return C36335p.OPA_PRODUCT_UPDATES;
        }
        if (ordinal != 6) {
            return C36335p.OPA_MISC;
        }
        return C36335p.OPA_THIRD_PARTY;
    }

    /* renamed from: a */
    public final C36334o mo40114a(C36335p pVar) {
        return mo40145l(pVar);
    }

    /* renamed from: b */
    public final C36334o mo40115b(C48980c cVar) {
        return mo40145l(m64895s(cVar));
    }

    /* renamed from: c */
    public final C60870cx mo40116c(C51792dh dhVar) {
        C60870cx f = ((C36275ad) this.f94981c.mo27525b()).mo40081f();
        C60870cx c = ((C36275ad) this.f94981c.mo27525b()).mo40078c();
        return C47638k.m84751b(f, c).mo51520a(new C36369w(this, f, c, dhVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo40117d(abc abc) {
        C36335p pVar;
        if ((abc.f134694a & 32) != 0) {
            return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(((C36275ad) this.f94981c.mo27525b()).mo40081f()), new C36367u(this, abc), C60826bg.f164896a), Exception.class, new C36368v(this), C60826bg.f164896a);
        }
        int i = abc.f134695b;
        if (i == 4) {
            String str = (String) abc.f134696c;
            int a = aaz.m86272a(abc.f134697d);
            int i2 = 0;
            if (a != 0 && a == 2) {
                i2 = 1;
            }
            return C60856cj.m92900i(new C36334o(str, BuildConfig.FLAVOR, i2));
        }
        if (i == 3) {
            C48980c a2 = C48980c.m85331a(((Integer) abc.f134696c).intValue());
            if (a2 == null) {
                a2 = C48980c.TYPE_UNKNOWN;
            }
            pVar = m64895s(a2);
        } else {
            int a3 = aaz.m86272a(abc.f134697d);
            if (a3 != 0 && a3 == 2) {
                pVar = C36335p.OPA_HANDOFF;
            } else {
                pVar = C36335p.OPA_MISC;
            }
        }
        return C60856cj.m92900i(mo40145l(pVar));
    }

    /* renamed from: e */
    public final C60870cx mo40118e(int i) {
        C60870cx d = ((C36275ad) this.f94981c.mo27525b()).mo40079d(i);
        C36338s sVar = C36338s.f94901a;
        return C60846c.m92878g(d, Throwable.class, C47810es.m84963c(sVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo40119f(C49067ff ffVar, C49067ff ffVar2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(ffVar.f126922d);
        for (C49927ed edVar : ffVar2.f126919a) {
            for (C49937en enVar : edVar.f129775b) {
                int a = C65319e.m96667a(enVar.f129797a);
                if (a == 0) {
                    a = 1;
                }
                hashSet.add(Integer.valueOf(a - 1));
            }
        }
        for (C49927ed edVar2 : ffVar.f126919a) {
            for (C49937en enVar2 : edVar2.f129775b) {
                int a2 = C65319e.m96667a(enVar2.f129797a);
                if (a2 == 0) {
                    a2 = 1;
                }
                String n = m64893n(a2 - 1);
                NotificationChannel a3 = this.f94980b.mo40029a(n);
                if (a3 != null) {
                    int a4 = C65319e.m96667a(enVar2.f129797a);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    if (!hashSet.contains(Integer.valueOf(a4 - 1))) {
                        if (a3.getImportance() == 0) {
                            int a5 = C65319e.m96667a(enVar2.f129797a);
                            if (a5 == 0) {
                                a5 = 1;
                            }
                            arrayList.add(Integer.valueOf(a5 - 1));
                        }
                        this.f94980b.mo40033e(n);
                    } else if (m64894p(enVar2, a3)) {
                        mo40146o();
                        String str = enVar2.f129798b;
                        C49935el elVar = enVar2.f129800d;
                        if (elVar == null) {
                            elVar = C49935el.f129789e;
                        }
                        int a6 = C49932ei.m85771a(elVar.f129793c);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        NotificationChannel notificationChannel = new NotificationChannel(n, str, a6 - 1);
                        notificationChannel.setDescription(enVar2.f129799c);
                        notificationChannel.setGroup("assistant_notification_channels");
                        this.f94980b.mo40032d(notificationChannel);
                    }
                }
            }
        }
        return ((C36275ad) this.f94981c.mo27525b()).mo40082g(ffVar2, arrayList);
    }

    /* renamed from: g */
    public final boolean mo40120g() {
        return this.f94980b.mo40036h();
    }

    /* renamed from: h */
    public final boolean mo40121h(C36334o oVar) {
        return mo40123j(oVar) == 1;
    }

    /* renamed from: i */
    public final boolean mo40122i(String str) {
        if (!mo40120g()) {
            return false;
        }
        C36335p[] values = C36335p.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!values[i].name().equals(str)) {
                i++;
            } else if (!this.f94980b.mo40037i("assistant_notification_channels")) {
                return false;
            }
        }
        NotificationChannel a = this.f94980b.mo40029a(str);
        if (a == null || a.getImportance() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo40123j(C36334o oVar) {
        if (!mo40120g()) {
            return 2;
        }
        String str = oVar.f94888b;
        if (!C58837ba.m90859h(str) && !this.f94980b.mo40037i(str)) {
            return 3;
        }
        NotificationChannel a = this.f94980b.mo40029a(oVar.f94887a);
        return (a == null || a.getImportance() != 0) ? 1 : 4;
    }

    /* renamed from: l */
    public final C36334o mo40145l(C36335p pVar) {
        if (this.f94980b.mo40029a(pVar.name()) == null) {
            mo40146o();
            String name = pVar.name();
            String string = this.f94983e.getString(pVar.f94897g);
            int i = pVar.f94900j;
            int i2 = i - 1;
            if (i != 0) {
                NotificationChannel notificationChannel = new NotificationChannel(name, string, i2);
                notificationChannel.setDescription(this.f94983e.getString(pVar.f94898h));
                notificationChannel.setGroup("assistant_notification_channels");
                this.f94980b.mo40032d(notificationChannel);
            } else {
                throw null;
            }
        }
        return new C36334o(pVar.name(), "assistant_notification_channels", C36336q.m64827a(pVar.f94900j));
    }

    /* renamed from: o */
    public final void mo40146o() {
        List<NotificationChannelGroup> c = this.f94980b.mo40031c();
        if (c != null) {
            for (NotificationChannelGroup id : c) {
                if (id.getId().equals("assistant_notification_channels")) {
                    return;
                }
            }
            this.f94980b.mo40040l(this.f94983e.getString(R.string.opa_notification_channel_group_title));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo40147q(C60870cx cxVar, C60870cx cxVar2, C51792dh dhVar) {
        try {
            C49073fl flVar = (C49073fl) C60856cj.m92909r(cxVar2);
            boolean z = !mo40120g();
            for (C49927ed edVar : ((C49067ff) C60856cj.m92909r(cxVar)).f126919a) {
                for (C49937en enVar : edVar.f129775b) {
                    C51793di diVar = (C51793di) C51795dk.f135896e.createBuilder();
                    int a = C65319e.m96667a(enVar.f129797a);
                    if (a == 0) {
                        a = 1;
                    }
                    diVar.copyOnWrite();
                    C51795dk dkVar = (C51795dk) diVar.instance;
                    dkVar.f135898a |= 1;
                    dkVar.f135899b = a - 1;
                    if (z) {
                        diVar.copyOnWrite();
                        C51795dk dkVar2 = (C51795dk) diVar.instance;
                        dkVar2.f135898a = 2 | dkVar2.f135898a;
                        dkVar2.f135900c = true;
                        diVar.copyOnWrite();
                        C51795dk dkVar3 = (C51795dk) diVar.instance;
                        dkVar3.f135901d = 3;
                        dkVar3.f135898a |= 4;
                    } else {
                        int a2 = C65319e.m96667a(enVar.f129797a);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        C62995dn dnVar = flVar.f126931a;
                        Integer valueOf = Integer.valueOf(a2 - 1);
                        if (!dnVar.containsKey(valueOf) || ((Boolean) dnVar.get(valueOf)).booleanValue()) {
                            int a3 = C65319e.m96667a(enVar.f129797a);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            String n = m64893n(a3 - 1);
                            C49935el elVar = enVar.f129800d;
                            if (elVar == null) {
                                elVar = C49935el.f129789e;
                            }
                            int a4 = C49932ei.m85771a(elVar.f129793c);
                            if (a4 == 0) {
                                a4 = 1;
                            }
                            int j = mo40123j(new C36334o(n, "assistant_notification_channels", C36336q.m64827a(a4)));
                            if (j == 3) {
                                diVar.copyOnWrite();
                                C51795dk dkVar4 = (C51795dk) diVar.instance;
                                dkVar4.f135898a |= 2;
                                dkVar4.f135900c = true;
                                diVar.copyOnWrite();
                                C51795dk dkVar5 = (C51795dk) diVar.instance;
                                dkVar5.f135901d = 4;
                                dkVar5.f135898a |= 4;
                            } else if (j == 4) {
                                diVar.copyOnWrite();
                                C51795dk dkVar6 = (C51795dk) diVar.instance;
                                dkVar6.f135898a |= 2;
                                dkVar6.f135900c = true;
                                diVar.copyOnWrite();
                                C51795dk dkVar7 = (C51795dk) diVar.instance;
                                dkVar7.f135901d = 5;
                                dkVar7.f135898a |= 4;
                            } else if (j == 2) {
                                diVar.copyOnWrite();
                                C51795dk dkVar8 = (C51795dk) diVar.instance;
                                dkVar8.f135898a = 2 | dkVar8.f135898a;
                                dkVar8.f135900c = true;
                                diVar.copyOnWrite();
                                C51795dk dkVar9 = (C51795dk) diVar.instance;
                                dkVar9.f135901d = 3;
                                dkVar9.f135898a |= 4;
                            }
                        } else {
                            diVar.copyOnWrite();
                            C51795dk dkVar10 = (C51795dk) diVar.instance;
                            dkVar10.f135898a |= 2;
                            dkVar10.f135900c = true;
                            diVar.copyOnWrite();
                            C51795dk dkVar11 = (C51795dk) diVar.instance;
                            dkVar11.f135901d = 1;
                            dkVar11.f135898a |= 4;
                        }
                    }
                    dhVar.copyOnWrite();
                    C51798dn dnVar2 = (C51798dn) dhVar.instance;
                    C51795dk dkVar12 = (C51795dk) diVar.build();
                    C51798dn dnVar3 = C51798dn.f135907e;
                    dkVar12.getClass();
                    C62971cq cqVar = dnVar2.f135912d;
                    if (!cqVar.mo58948c()) {
                        dnVar2.f135912d = C62942bv.mutableCopy(cqVar);
                    }
                    dnVar2.f135912d.add(dkVar12);
                }
            }
        } catch (CancellationException | ExecutionException e) {
            C59104x d = f94979a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationChHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52231)).mo56386p("failed to fill category state");
        }
    }

    /* renamed from: r */
    public final void mo40148r(String str, int i, C49937en enVar) {
        NotificationChannel notificationChannel = new NotificationChannel(str, enVar.f129798b, i);
        notificationChannel.setDescription(enVar.f129799c);
        notificationChannel.setGroup("assistant_notification_channels");
        if (i == 3) {
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
        }
        this.f94980b.mo40032d(notificationChannel);
    }

    /* renamed from: k */
    public final int mo40144k(C49067ff ffVar, C49934ek ekVar) {
        NotificationChannel a;
        int i = ekVar.f129786a;
        int a2 = C65319e.m96667a(i);
        int i2 = 1;
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 - 1 == 0) {
            return (ekVar.f129787b.isEmpty() || (a = this.f94980b.mo40029a(ekVar.f129787b)) == null || a.getImportance() != 0) ? -1 : 0;
        }
        int a3 = C65319e.m96667a(i);
        if (a3 == 0) {
            a3 = 1;
        }
        NotificationChannel a4 = this.f94980b.mo40029a(m64893n(a3 - 1));
        if (a4 != null) {
            int a5 = C65319e.m96667a(ekVar.f129786a);
            if (a5 == 0) {
                a5 = 1;
            }
            C36370x m = m64892m(ffVar, a5 - 1);
            if (m == null) {
                return -1;
            }
            C49935el elVar = m.f94978a.f129800d;
            if (elVar == null) {
                elVar = C49935el.f129789e;
            }
            int a6 = C49932ei.m85771a(elVar.f129793c);
            if (a6 != 0) {
                i2 = a6;
            }
            if (i2 - 1 != a4.getImportance()) {
                return a4.getImportance();
            }
            return -1;
        }
        C62961ch chVar = ffVar.f126922d;
        int a7 = C65319e.m96667a(ekVar.f129786a);
        if (a7 != 0) {
            i2 = a7;
        }
        return !chVar.contains(Integer.valueOf(i2 + -1)) ? -1 : 0;
    }
}
