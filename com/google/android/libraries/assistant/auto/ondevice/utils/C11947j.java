package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3921j.afa;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4850an.p4855d.p4856a.C63454g;
import com.google.protos.p4850an.p4855d.p4856a.C63457j;
import com.google.protos.p4850an.p4855d.p4856a.C63465r;
import com.google.protos.p4850an.p4855d.p4856a.C63473z;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.j */
/* compiled from: PG */
public final class C11947j {

    /* renamed from: a */
    public C64782b f38381a = C64782b.f175579d;

    /* renamed from: b */
    int f38382b = 0;

    /* renamed from: c */
    private final C86124t f38383c;

    /* renamed from: d */
    private final C9309a f38384d;

    /* renamed from: e */
    private final C91123v f38385e;

    public C11947j(C9309a aVar, C86124t tVar, C91123v vVar) {
        this.f38384d = aVar;
        this.f38383c = tVar;
        this.f38385e = vVar;
    }

    /* renamed from: h */
    public static final boolean m27796h(C63473z zVar) {
        for (C63457j jVar : zVar.f171535f) {
            int a = C63454g.m96239a(jVar.f171492b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 0 || i == 2) {
                break;
            } else if (i != 4) {
                if (i == 5) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private final boolean m27797i() {
        return !this.f38383c.mo79746e(C90086ek.f250510h);
    }

    /* renamed from: a */
    public final List mo20317a() {
        this.f38381a = C11945h.m27778c("reply.MESSAGE", C11939b.f38358f);
        ArrayList arrayList = new ArrayList();
        C9309a aVar = this.f38384d;
        arrayList.add(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.get_message_reply_notification)));
        arrayList.add(C11932a.m27751d());
        return arrayList;
    }

    /* renamed from: b */
    public final List mo20318b(C63473z zVar) {
        return mo20319c(zVar, 0, false, true);
    }

    /* renamed from: c */
    public final List mo20319c(C63473z zVar, int i, boolean z, boolean z2) {
        List list;
        for (C63457j jVar : zVar.f171535f) {
            int a = C63454g.m96239a(jVar.f171492b);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            boolean z3 = false;
            if (i2 == 0) {
                this.f38382b = 0;
                C63465r rVar = zVar.f171532c;
                if (rVar == null) {
                    rVar = C63465r.f171513c;
                }
                String str = rVar.f171516b;
                C64782b f = C11945h.m27781f(this.f38381a, "message", str);
                this.f38381a = f;
                this.f38381a = C11945h.m27790o(f, "message", 2);
                ArrayList arrayList = new ArrayList();
                C9309a aVar = this.f38384d;
                arrayList.add(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.confirm_reply_message, new Object[]{str})));
                arrayList.add(C11932a.m27751d());
                return arrayList;
            } else if (i2 == 2) {
                this.f38382b = 0;
                return mo20317a();
            } else if (i2 == 4) {
                this.f38382b = 0;
                C64782b o = C11945h.m27790o(this.f38381a, "message", 4);
                this.f38381a = o;
                String h = C11945h.m27783h(o, "message");
                ArrayList arrayList2 = new ArrayList();
                if (this.f38385e.mo85390b() || (!z && !z2)) {
                    z3 = true;
                }
                afa afa = (afa) afb.f134984e.createBuilder();
                afa.copyOnWrite();
                afb afb = (afb) afa.instance;
                afb.f134986a = 1 | afb.f134986a;
                afb.f134987b = i;
                afa.copyOnWrite();
                afb afb2 = (afb) afa.instance;
                h.getClass();
                afb2.f134986a = 2 | afb2.f134986a;
                afb2.f134988c = h;
                afa.copyOnWrite();
                afb afb3 = (afb) afa.instance;
                afb3.f134986a |= 4;
                afb3.f134989d = z3;
                arrayList2.add(C11932a.m27748a("notification.REPLY", "notification_reply_args", "assistant.api.client_op.NotificationReplyArgs", ((afb) afa.build()).toByteString()));
                C9309a aVar2 = this.f38384d;
                arrayList2.add(C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(R.string.reply_message_notice)));
                if (this.f38383c.mo79746e(C90086ek.f250253E) && !z2) {
                    arrayList2.add(C11932a.m27750c(i, z3, m27797i()));
                }
                return arrayList2;
            } else if (i2 == 5) {
                ArrayList arrayList3 = new ArrayList();
                C9309a aVar3 = this.f38384d;
                arrayList3.add(C15669a.m32462a(aVar3.mo17491a(aVar3.f32300b).getString(R.string.okay_notification)));
                if (this.f38383c.mo79746e(C90086ek.f250253E)) {
                    arrayList3.add(C11932a.m27750c(i, true, m27797i()));
                }
                return arrayList3;
            }
        }
        int i3 = this.f38382b;
        if (i3 < 2) {
            int i4 = i3 == 0 ? R.string.sorry_string : R.string.ask_to_confirm_message_reprompt;
            C9309a aVar4 = this.f38384d;
            list = C58485gu.m89847o(C15669a.m32462a(aVar4.mo17491a(aVar4.f32300b).getString(i4)), C11932a.m27751d());
        } else {
            C9309a aVar5 = this.f38384d;
            list = C11932a.m27753f(aVar5.mo17491a(aVar5.f32300b));
            if (this.f38383c.mo79746e(C90086ek.f250253E)) {
                list.add(C11932a.m27750c(i, true, m27797i()));
            }
        }
        this.f38382b++;
        return C58485gu.m89842j(list);
    }

    /* renamed from: d */
    public final List mo20320d(C63473z zVar) {
        return mo20319c(zVar, 0, true, false);
    }

    /* renamed from: e */
    public final void mo20321e() {
        this.f38381a = C64782b.f175579d;
        this.f38382b = 0;
    }

    /* renamed from: f */
    public final boolean mo20322f(C63473z zVar) {
        for (C63457j jVar : zVar.f171535f) {
            int a = C63454g.m96239a(jVar.f171492b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 0 || i == 2 || i == 4) {
                return false;
            }
            if (i == 5) {
                return true;
            }
        }
        return this.f38382b > 2;
    }

    /* renamed from: g */
    public final boolean mo20323g() {
        return !C58832aw.m90831a(this.f38381a, C64782b.f175579d);
    }
}
