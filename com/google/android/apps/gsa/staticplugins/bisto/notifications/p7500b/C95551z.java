package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89632c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95629y;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94639c;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95073aj;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95074ak;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95075al;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95197l;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95208w;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95210y;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95309o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7496n.p7497a.C95498a;
import com.google.android.apps.gsa.staticplugins.bisto.p7496n.p7497a.C95500c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import dagger.C68214a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.z */
/* compiled from: PG */
public class C95551z extends C95515ae {

    /* renamed from: n */
    private static final C59071e f267404n = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.b.z");

    /* renamed from: c */
    public final C95706l f267405c;

    /* renamed from: d */
    protected final C95293ae f267406d;

    /* renamed from: e */
    public final C90427h f267407e;

    /* renamed from: f */
    public final C95600au f267408f;

    /* renamed from: g */
    public final List f267409g;

    /* renamed from: h */
    public int f267410h = 0;

    /* renamed from: i */
    public boolean f267411i;

    /* renamed from: o */
    private final C95598as f267412o;

    /* renamed from: p */
    private final CharSequence f267413p;

    /* renamed from: q */
    private boolean f267414q;

    /* renamed from: r */
    private CharSequence f267415r;

    /* renamed from: s */
    private final C68214a f267416s;

    /* renamed from: t */
    private final C68214a f267417t;

    /* renamed from: u */
    private final C89656k f267418u;

    /* renamed from: v */
    private final C95307m f267419v;

    /* renamed from: w */
    private final C21370a f267420w;

    /* JADX WARNING: type inference failed for: r4v21, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v24, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95551z(java.util.List r2, com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as r3, com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l r4, com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae r5, com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95600au r6, dagger.C68214a r7, dagger.C68214a r8, com.google.android.apps.gsa.shared.bisto.C89656k r9, com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m r10, com.google.android.libraries.p1730f.C21370a r11) {
        /*
            r1 = this;
            r1.<init>(r10, r11, r4)
            r0 = 0
            r1.f267410h = r0
            r1.f267412o = r3
            r1.f267405c = r4
            r1.f267406d = r5
            r1.f267408f = r6
            r1.f267409g = r2
            r1.f267416s = r7
            r1.f267417t = r8
            r1.f267418u = r9
            r1.f267419v = r10
            r1.f267420w = r11
            boolean r3 = r2.isEmpty()
            java.lang.String r5 = ""
            java.lang.String r6 = "MessageAnnouncement"
            if (r3 == 0) goto L_0x0043
            com.google.common.f.e r2 = f267404n
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r6)
            java.lang.String r3 = "No messages"
            r4 = 16074(0x3eca, float:2.2524E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            com.google.android.apps.gsa.shared.notificationlistening.common.h r2 = new com.google.android.apps.gsa.shared.notificationlistening.common.h
            r3 = 0
            r2.<init>(r5, r5, r0, r3)
            r1.f267407e = r2
            r1.f267413p = r5
            return
        L_0x0043:
            java.lang.Object r3 = r2.get(r0)
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r3 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r3
            boolean r3 = r3.mo84134g()
            java.lang.Object r7 = r2.get(r0)
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r7
            com.google.android.apps.gsa.shared.notificationlistening.common.h r7 = r7.f252536F
            r1.f267407e = r7
            if (r3 == 0) goto L_0x0062
            java.lang.Object r4 = r2.get(r0)
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r4 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r4
            java.lang.CharSequence r4 = r4.f252541r
            goto L_0x0070
        L_0x0062:
            android.content.Context r4 = r4.f267947e
            java.lang.Object r7 = r2.get(r0)
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r7 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r7
            java.lang.CharSequence r7 = r7.f252535E
            java.lang.CharSequence r4 = m158120ab(r4, r7)
        L_0x0070:
            if (r4 != 0) goto L_0x0087
            com.google.common.f.e r4 = f267404n
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r6)
            java.lang.String r7 = "Messages must have a sender/group name!"
            r8 = 16073(0x3ec9, float:2.2523E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r8)).mo56386p(r7)
            int r4 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0088
        L_0x0087:
            r5 = r4
        L_0x0088:
            r1.f267413p = r5
            java.util.Iterator r2 = r2.iterator()
        L_0x008e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x011b
            java.lang.Object r4 = r2.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r4 = (com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification) r4
            boolean r5 = r4.mo84134g()
            if (r3 == r5) goto L_0x00b4
            com.google.common.f.e r5 = f267404n
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r6)
            java.lang.String r7 = "All notifications must be consistent on if they are a group message or not"
            r8 = 16072(0x3ec8, float:2.2522E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r7)
            int r5 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x00b4:
            com.google.android.apps.gsa.shared.notificationlistening.common.h r5 = r1.f267407e
            com.google.android.apps.gsa.shared.notificationlistening.common.h r7 = r4.f252536F
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x00d2
            com.google.common.f.e r5 = f267404n
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r6)
            java.lang.String r7 = "All notifications must have the same identifier"
            r8 = 16071(0x3ec7, float:2.252E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r7)
            int r5 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x00d2:
            if (r3 == 0) goto L_0x00f3
            java.lang.CharSequence r5 = r1.f267413p
            java.lang.CharSequence r4 = r4.f252541r
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 != 0) goto L_0x008e
            com.google.common.f.e r4 = f267404n
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = "Group name mismatch"
            r7 = 16070(0x3ec6, float:2.2519E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r5)
            int r4 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x008e
        L_0x00f3:
            java.lang.CharSequence r5 = r1.f267413p
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l r7 = r1.f267405c
            android.content.Context r7 = r7.f267947e
            java.lang.CharSequence r4 = r4.f252535E
            java.lang.CharSequence r4 = m158120ab(r7, r4)
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 != 0) goto L_0x008e
            com.google.common.f.e r4 = f267404n
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = "Sender name mismatch"
            r7 = 16069(0x3ec5, float:2.2517E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r5)
            int r4 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x008e
        L_0x011b:
            java.util.List r2 = r1.f267409g
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.as r3 = r1.f267412o
            com.google.android.apps.gsa.shared.notificationlistening.common.h r4 = r1.f267407e
            m158122ad(r2, r3, r4)
            java.util.List r2 = r1.f267409g
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.x r3 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.b.x
            r3.<init>()
            java.util.Collections.sort(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95551z.<init>(java.util.List, com.google.android.apps.gsa.staticplugins.bisto.notifications.d.as, com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l, com.google.android.apps.gsa.staticplugins.bisto.f.ae, com.google.android.apps.gsa.staticplugins.bisto.notifications.d.au, dagger.a, dagger.a, com.google.android.apps.gsa.shared.bisto.k, com.google.android.apps.gsa.staticplugins.bisto.f.m, com.google.android.libraries.f.a):void");
    }

    /* renamed from: Z */
    private final C1832s m158118Z() {
        int size = this.f267409g.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((MessageNotification) this.f267409g.get(size)).f252548y == null);
        return ((MessageNotification) this.f267409g.get(size)).f252548y;
    }

    /* renamed from: aa */
    private C95209x m158119aa(int i, MessageNotification messageNotification) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
        }
        if (i != 0 || afVar == null || !afVar.f267281b) {
            return C95197l.m157357b(this.f267276j.f267947e, R.string.message_contents, mo89439I(messageNotification));
        }
        Context context = this.f267276j.f267947e;
        return C95197l.m157357b(context, R.string.sender_and_message_contents, new C95525ao(context, this.f267413p.toString()).mo89429b(), mo89439I(messageNotification));
    }

    /* renamed from: ab */
    private static CharSequence m158120ab(Context context, CharSequence charSequence) {
        return new C95525ao(context, charSequence.toString()).f267321a;
    }

    /* renamed from: ac */
    private final String m158121ac() {
        Integer J = mo89440J();
        if (J == null) {
            return null;
        }
        return this.f267406d.mo89216i(this.f267276j.f267947e, J.intValue());
    }

    /* renamed from: ad */
    private static void m158122ad(List list, C95598as asVar, C90427h hVar) {
        List<C90421b> d = asVar.mo89541d(hVar, new C95629y());
        C58976aa aaVar = C58975e.f156826a;
        d.size();
        Collections.sort(d, new C95549x());
        HashSet hashSet = new HashSet();
        for (C90421b bVar : d) {
            if (bVar instanceof MessageNotification) {
                MessageNotification messageNotification = (MessageNotification) bVar;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.add(messageNotification);
                        break;
                    }
                    MessageNotification messageNotification2 = (MessageNotification) it.next();
                    if (messageNotification != messageNotification2) {
                        if (messageNotification.f252593n == messageNotification2.f252593n) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                C59104x d2 = f267404n.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "MessageAnnouncement");
                ((C59052c) ((C59052c) d2).mo56372aa(16077)).mo56389s("Non-message notification queried: %s", bVar);
            }
        }
        hashSet.size();
        list.addAll(hashSet);
        Collections.sort(list, new C95549x());
    }

    /* renamed from: A */
    public int mo89432A() {
        return 4;
    }

    /* renamed from: B */
    public C95209x mo89433B() {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
        }
        if (afVar == null || !afVar.f267286g) {
            return new C95208w(this.f267276j.f267947e, R.string.non_interruptive_messages_from_one_person, mo89403L());
        }
        Integer g = this.f267406d.mo89215g(mo89432A());
        if (g == null) {
            return new C95208w(this.f267276j.f267947e, R.string.interruptive_messages_from_one_person, mo89403L());
        }
        Integer f = this.f267406d.mo89214f(mo89432A());
        if (f == null) {
            f = 1;
        }
        String j = this.f267406d.mo89217j(this.f267276j.f267947e, 19, f.intValue());
        if (j == null) {
            j = this.f267276j.f267947e.getString(R.string.default_instruction);
        }
        return new C95208w(this.f267276j.f267947e, g.intValue(), mo89403L(), j);
    }

    /* renamed from: C */
    public final boolean mo89399C() {
        return true;
    }

    /* renamed from: E */
    public void mo89434E(int i, C95285o oVar, C95284n nVar) {
        int i2;
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            nVar.mo88601a();
            return;
        }
        MessageNotification messageNotification = (MessageNotification) this.f267409g.get(i);
        if (messageNotification.mo84135h()) {
            Uri uri = messageNotification.f252582c;
            if (uri == null) {
                C59104x d = f267404n.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MessageAnnouncement");
                ((C59052c) ((C59052c) d).mo56372aa(16066)).mo56386p("No audio contents for voice message!");
                int i3 = C90755l.f253831a;
                uri = Uri.EMPTY;
            }
            i2 = oVar.mo89204d(uri, nVar);
        } else {
            C95209x aa = m158119aa(i, messageNotification);
            C59104x b = f267404n.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MessageAnnouncement");
            ((C59052c) ((C59052c) b).mo56372aa(16085)).mo56389s("%s", true != (aa.f266358a instanceof Spanned) ? "MessageAnnouncement is not Spanned" : "MessageAnnouncement is Spanned");
            if (i == 0 && afVar.f267281b) {
                this.f267411i = true;
            }
            i2 = oVar.mo89203c(aa, nVar);
            if (i2 != 0) {
                mo89441M(messageNotification);
            }
        }
        C95311q.m157570d(this.f267277k, i2);
    }

    /* renamed from: F */
    public void mo89435F(C94647k kVar, C94637a aVar, boolean z, int i) {
        if (this.f267279m == null) {
            C89655j.m145957a("no settings");
            aVar.mo88580a(false);
        } else if (i >= this.f267409g.size()) {
            aVar.mo88580a(z);
        } else {
            C95548w wVar = new C95548w(this, i, kVar, aVar, z);
            MessageNotification messageNotification = (MessageNotification) this.f267409g.get(i);
            if (!messageNotification.mo84135h()) {
                C58976aa aaVar = C58975e.f156826a;
                C95209x aa = m158119aa(i, messageNotification);
                C59104x b = f267404n.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MessageAnnouncement");
                ((C59052c) ((C59052c) b).mo56372aa(16088)).mo56389s("%s", true != (aa.f266358a instanceof Spanned) ? "MessageAnnouncement is not Spanned" : "MessageAnnouncement is Spanned");
                wVar.mo88580a(false);
            }
        }
    }

    /* renamed from: H */
    public final C95209x mo89438H() {
        String ac = m158121ac();
        if (ac == null) {
            return null;
        }
        return new C95209x(ac);
    }

    /* renamed from: J */
    public final Integer mo89440J() {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
        }
        return (afVar == null || !afVar.f267282c || m158118Z() == null) ? null : 1;
    }

    /* renamed from: K */
    public final Integer mo89402K() {
        return m158118Z() == null ? null : 2;
    }

    /* renamed from: L */
    public final String mo89403L() {
        return this.f267413p.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo89441M(MessageNotification messageNotification) {
        CharSequence charSequence = messageNotification.f252543t;
        if (charSequence != null) {
            C60237lk lkVar = this.f267277k;
            int i = ((C60241lo) lkVar.instance).f162995n;
            int length = charSequence.length();
            lkVar.copyOnWrite();
            C60241lo loVar = (C60241lo) lkVar.instance;
            loVar.f162982a |= C89885b.S3REQUEST_VALUE;
            loVar.f162995n = i + length;
            CharSequence charSequence2 = this.f267415r;
            if (charSequence2 == null) {
                this.f267415r = messageNotification.f252543t;
                return;
            }
            this.f267415r = TextUtils.concat(new CharSequence[]{charSequence2, ". ", messageNotification.f252543t});
            return;
        }
        C89655j.m145957a("No text contents for non-voice message!");
    }

    /* renamed from: N */
    public final void mo89442N(C95285o oVar, C95284n nVar) {
        C95209x H = mo89438H();
        if (H == null) {
            nVar.mo88601a();
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C95311q.m157570d(this.f267277k, oVar.mo89203c(H, new C95542q(this, nVar)));
    }

    /* renamed from: O */
    public final void mo89443O(C95285o oVar, C95284n nVar) {
        this.f267414q = true;
        this.f267410h = 0;
        C95544s sVar = new C95544s(this, this.f264705a.mo89241d(), oVar, nVar);
        if (true == mo89445S()) {
            nVar = sVar;
        }
        mo89444P(oVar, nVar);
    }

    /* renamed from: P */
    public final void mo89444P(C95285o oVar, C95284n nVar) {
        if (this.f267410h >= this.f267409g.size()) {
            m158122ad(this.f267409g, this.f267412o, this.f267407e);
            if (this.f267410h >= this.f267409g.size()) {
                C58976aa aaVar = C58975e.f156826a;
                nVar.mo88601a();
                return;
            }
        }
        MessageNotification messageNotification = (MessageNotification) this.f267409g.get(this.f267410h);
        C95543r rVar = new C95543r(this, oVar, nVar);
        C58976aa aaVar2 = C58975e.f156826a;
        mo89434E(this.f267410h, oVar, rVar);
    }

    /* renamed from: Q */
    public final boolean mo89404Q() {
        return !this.f267409g.isEmpty() && ((MessageNotification) this.f267409g.get(0)).mo84135h();
    }

    /* renamed from: R */
    public final boolean mo89405R() {
        return true;
    }

    /* renamed from: S */
    public final boolean mo89445S() {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
        }
        return (afVar == null || !afVar.f267283d || m158121ac() == null) ? false : true;
    }

    /* renamed from: b */
    public final C94639c mo88568b(C95455a aVar, C95065ab abVar, Runnable runnable) {
        boolean z;
        C94639c b = super.mo88568b(aVar, abVar, runnable);
        if (!b.f264710a) {
            return b;
        }
        C58976aa aaVar = C58975e.f156826a;
        C1832s Z = m158118Z();
        C95550y yVar = new C95550y(this, runnable);
        if (Z == null) {
            C59104x c = f267404n.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MessageAnnouncement");
            ((C59052c) ((C59052c) c).mo56372aa(16068)).mo56386p("Undefined microphone action");
            z = false;
        } else {
            C89632c.m145885c(Z);
            C60237lk lkVar = this.f267277k;
            lkVar.copyOnWrite();
            C60241lo loVar = (C60241lo) lkVar.instance;
            C60241lo loVar2 = C60241lo.f162980w;
            loVar.f162982a |= 1048576;
            loVar.f162997p = true;
            Context context = this.f267276j.f267947e;
            C95500c cVar = (C95500c) this.f267416s.mo27525b();
            if (cVar == null) {
                C89655j.m145957a("No transcription handler");
                yVar.mo89437d();
            } else {
                cVar.mo89051a(aVar, abVar, new C95498a(context, Z, yVar));
            }
            z = true;
        }
        C60237lk lkVar2 = this.f267277k;
        lkVar2.copyOnWrite();
        C60241lo loVar3 = (C60241lo) lkVar2.instance;
        C60241lo loVar4 = C60241lo.f162980w;
        loVar3.f162982a |= C89885b.HTTP_VALUE;
        loVar3.f162996o = true;
        this.f267406d.mo89218k(1);
        return new C94639c(true, z);
    }

    /* renamed from: e */
    public final String mo88571e() {
        String j = this.f267406d.mo89217j(this.f267276j.f267947e, 1, 1);
        return j == null ? this.f267276j.f267947e.getString(R.string.default_instruction) : j;
    }

    /* renamed from: h */
    public final void mo88574h(String str, Runnable runnable) {
        String str2;
        C59104x b = f267404n.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MessageAnnouncement");
        ((C59052c) ((C59052c) b).mo56372aa(16080)).mo56386p("onTranscriptionResult");
        if (str == null || str.length() == 0) {
            str2 = this.f267276j.f267947e.getString(R.string.transcript_failure);
        } else {
            Integer g = this.f267406d.mo89215g(14);
            if (g != null) {
                String g2 = C58837ba.m90858g(this.f267406d.mo89216i(this.f267276j.f267947e, 21));
                str2 = this.f267276j.f267947e.getString(g.intValue(), new Object[]{str, g2});
            } else {
                C89655j.m145957a("No education prompt");
                str2 = BuildConfig.FLAVOR;
            }
        }
        ((C95075al) this.f267417t.mo27525b()).f265981a.mo89170r(new C95074ak(new C95073aj(this.f267276j.f267947e, this.f267406d, this.f267419v, this.f267420w, str2, str, ((C95075al) this.f267417t.mo27525b()).f265982b.mo89024c(), m158118Z(), new C95550y(this, runnable), (C95075al) this.f267417t.mo27525b())));
    }

    /* renamed from: k */
    public final boolean mo88577k() {
        return this.f267414q && m158118Z() != null;
    }

    /* renamed from: m */
    public final boolean mo88579m() {
        if (!super.mo88579m()) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        C1832s Z = m158118Z();
        if (Z == null) {
            C59104x c = f267404n.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MessageAnnouncement");
            ((C59052c) ((C59052c) c).mo56372aa(16094)).mo56386p("Undefined microphone action");
        } else {
            C89632c.m145885c(Z);
            C60237lk lkVar = this.f267277k;
            lkVar.copyOnWrite();
            C60241lo loVar = (C60241lo) lkVar.instance;
            C60241lo loVar2 = C60241lo.f162980w;
            loVar.f162982a |= 1048576;
            loVar.f162997p = true;
        }
        C60237lk lkVar2 = this.f267277k;
        lkVar2.copyOnWrite();
        C60241lo loVar3 = (C60241lo) lkVar2.instance;
        C60241lo loVar4 = C60241lo.f162980w;
        loVar3.f162982a |= C89885b.HTTP_VALUE;
        loVar3.f162996o = true;
        this.f267406d.mo89218k(1);
        return true;
    }

    /* renamed from: o */
    public final int mo89411o() {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return 6;
        } else if (afVar.f267282c) {
            return 9;
        } else {
            if (afVar.f267281b) {
                return 5;
            }
            if (afVar.f267280a) {
                return 1;
            }
            C89655j.m145957a("Unsupported playback type: ".concat(afVar.toString()));
            return 6;
        }
    }

    /* renamed from: p */
    public final Uri mo89412p() {
        return ((C90421b) this.f267409g.get(0)).f252585f;
    }

    /* renamed from: q */
    public final C90427h mo89413q() {
        return this.f267407e;
    }

    /* renamed from: r */
    public final List mo89414r() {
        return this.f267409g;
    }

    /* renamed from: s */
    public final void mo89415s(C95285o oVar, C95284n nVar) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            nVar.mo88601a();
        } else if (afVar.f267281b && !afVar.f267282c) {
            C95309o e = this.f264705a.mo89242e();
            C95209x B = mo89433B();
            Integer g = this.f267406d.mo89215g(mo89432A());
            if (g != null) {
                this.f267406d.mo89219l(mo89432A());
                C95311q.m157568b(this.f267276j.f267947e, this.f267406d, this.f267277k, g.intValue());
            }
            C60237lk lkVar = this.f267277k;
            int a = B.mo89114a();
            lkVar.copyOnWrite();
            C60241lo loVar = (C60241lo) lkVar.instance;
            C60241lo loVar2 = C60241lo.f162980w;
            loVar.f162982a |= 32768;
            loVar.f162993l = a;
            C95545t tVar = new C95545t(this, e, oVar, nVar);
            C58976aa aaVar = C58975e.f156826a;
            this.f267411i = true;
            C95311q.m157570d(this.f267277k, oVar.mo89203c(B, tVar));
        } else if (afVar.f267282c) {
            mo89443O(oVar, nVar);
        } else {
            if (mo89445S()) {
                C89655j.m145957a("Can't do action prompt only playback as its ambiguous which kind of action prompt, to play, reply or expand.");
            }
            nVar.mo88601a();
        }
    }

    /* renamed from: t */
    public final boolean mo89416t(C94647k kVar, C94637a aVar) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C95546u uVar = new C95546u(aVar, atomicBoolean);
        if (mo89445S() && mo89438H() != null) {
            aVar = new C95547v(this, atomicBoolean, uVar);
        }
        if (afVar.f267281b && !afVar.f267282c) {
            C58976aa aaVar = C58975e.f156826a;
            CharSequence charSequence = mo89433B().f266358a;
            return false;
        } else if (afVar.f267282c) {
            C58976aa aaVar2 = C58975e.f156826a;
            mo89435F(kVar, aVar, true, 0);
            return true;
        } else {
            C95209x H = mo89438H();
            if (!mo89445S() || H == null) {
                C58976aa aaVar3 = C58975e.f156826a;
                return false;
            }
            C58976aa aaVar4 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: v */
    public final boolean mo89418v() {
        return this.f267414q;
    }

    /* renamed from: w */
    public final boolean mo89419w() {
        return this.f267411i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final CharSequence mo89439I(MessageNotification messageNotification) {
        CharSequence charSequence = messageNotification.f252543t;
        if (charSequence != null) {
            return C95197l.m157356a(C95526ap.m158041b(C95526ap.m158040a(charSequence), this.f267276j.f267947e), C95210y.m157365g(this.f267276j.f267947e, this.f267418u));
        }
        C89655j.m145957a("No text contents for non-voice message!");
        return BuildConfig.FLAVOR;
    }
}
