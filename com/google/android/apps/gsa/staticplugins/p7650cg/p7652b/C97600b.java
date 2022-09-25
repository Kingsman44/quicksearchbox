package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.app.PendingIntent;
import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.sidekick.main.notifications.C91529c;
import com.google.android.apps.gsa.sidekick.shared.p7242k.C91754b;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.p489g.p491b.p492a.C9126d;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7864mu;
import com.google.p375ai.p378b.C7873nc;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56954d;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56956f;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56992b;
import com.google.p4283bv.p4354e.p4356b.C57052a;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.b */
/* compiled from: PG */
public abstract class C97600b extends C97599a {

    /* renamed from: e */
    private static final C59071e f272625e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cg.b.b");

    /* renamed from: b */
    protected final C7874nd f272626b;

    /* renamed from: c */
    protected final C7709ha f272627c;

    /* renamed from: d */
    protected final C89291a f272628d;

    /* renamed from: f */
    private final C86124t f272629f;

    /* renamed from: g */
    private final C68214a f272630g;

    public C97600b(C7718hj hjVar, C7874nd ndVar, C89291a aVar, C86124t tVar, C68214a aVar2) {
        super(C58485gu.m89846n(hjVar));
        C58838bb.m90866a(ndVar, "notification");
        C58838bb.m90869d(1 != (ndVar.f27589a & 1) ? false : true, "type");
        this.f272626b = ndVar;
        C7709ha haVar = hjVar.f26972m;
        this.f272627c = haVar == null ? C7709ha.f26910f : haVar;
        this.f272628d = aVar;
        this.f272629f = tVar;
        this.f272630g = aVar2;
    }

    /* renamed from: A */
    public boolean mo85869A(CardRenderingContext cardRenderingContext) {
        return cardRenderingContext.mo49312g() && this.f272626b.f27581C;
    }

    /* renamed from: B */
    public final int mo85870B() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 65536) == 0) {
            return 2;
        }
        C7536ax axVar = ndVar.f27606r;
        if (axVar == null) {
            axVar = C7536ax.f26084o;
        }
        if (axVar.f26088c == 38) {
            return 2;
        }
        C7536ax axVar2 = this.f272626b.f27606r;
        if ((axVar2 == null ? C7536ax.f26084o : axVar2).f26088c == 7) {
            return 3;
        }
        if (axVar2 == null) {
            axVar2 = C7536ax.f26084o;
        }
        return axVar2.f26088c == 3 ? 4 : 1;
    }

    /* renamed from: F */
    public final int mo85874F() {
        int a = C56956f.m88243a(this.f272626b.f27591c);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if ((r0.f31536b & 2) == 0) goto L_0x0055;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PendingIntent mo90757H(android.content.Context r6) {
        /*
            r5 = this;
            com.google.ai.b.nd r0 = r5.f272626b
            int r1 = r0.f27589a
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            r2 = 0
            if (r1 == 0) goto L_0x0011
            com.google.ai.b.ax r0 = r0.f27606r
            if (r0 != 0) goto L_0x0012
            com.google.ai.b.ax r0 = com.google.p375ai.p378b.C7536ax.f26084o
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            com.google.android.apps.g.d.ad r0 = r5.mo90759J(r6, r0)
            com.google.ai.b.nd r1 = r5.f272626b
            com.google.ai.b.qv r1 = r1.f27613y
            if (r1 != 0) goto L_0x001e
            com.google.ai.b.qv r1 = com.google.p375ai.p378b.C7973qv.f28001c
        L_0x001e:
            int r1 = r1.f28004b
            int r1 = com.google.p4283bv.p4345d.p4346a.p4347a.C56952b.m88242b(r1)
            if (r1 != 0) goto L_0x0027
            goto L_0x0055
        L_0x0027:
            r3 = 216(0xd8, float:3.03E-43)
            if (r1 != r3) goto L_0x0055
            if (r0 == 0) goto L_0x0041
            com.google.ai.b.de r1 = r0.f31543i
            if (r1 != 0) goto L_0x0033
            com.google.ai.b.de r1 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x0033:
            int r1 = r1.f26271a
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0041
            int r1 = r0.f31536b
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0055
        L_0x0041:
            dagger.a r1 = r5.f272630g
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r1 = (com.google.android.apps.gsa.shared.logger.C89911f) r1
            r3 = 164231522(0x9c9f962, float:4.862351E-33)
            r4 = 29
            com.google.android.apps.gsa.shared.logger.e r1 = r1.mo83755a(r2, r3, r4)
            r1.mo83721a()
        L_0x0055:
            if (r0 != 0) goto L_0x005c
            android.app.PendingIntent r6 = super.mo90757H(r6)
            return r6
        L_0x005c:
            com.google.android.apps.gsa.sidekick.shared.k.b r1 = new com.google.android.apps.gsa.sidekick.shared.k.b
            r1.<init>(r6)
            java.lang.String r2 = "com.google.android.apps.sidekick.CLIENT_ACTION"
            r1.f255877a = r2
            java.lang.String r2 = "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver"
            r1.f255878b = r2
            int r2 = com.google.android.apps.gsa.sidekick.main.notifications.C91529c.m149709a(r5)
            r1.f255880d = r2
            com.google.ai.b.nd r2 = r5.f272626b
            boolean r2 = r2.f27614z
            r1.f255882f = r2
            long r2 = r5.mo85879e()
            r1.f255883g = r2
            com.google.common.b.gu r2 = r5.f272624a
            r2.getClass()
            r1.f255879c = r2
            r1.f255886j = r0
            com.google.ai.b.ga r0 = r5.mo90758I()
            com.google.bv.e.b.b r2 = r5.mo85886l()
            r1.f255884h = r0
            r1.f255885i = r2
            com.google.common.o.l.t r0 = r5.mo85883i()
            r1.f255890n = r0
            com.google.ai.b.fo r0 = r5.mo85884j()
            r1.f255889m = r0
            android.content.Intent r0 = r1.mo86242a()
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            r2 = 0
            android.app.PendingIntent r6 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7650cg.p7652b.C97600b.mo90757H(android.content.Context):android.app.PendingIntent");
    }

    /* renamed from: I */
    public final C7682ga mo90758I() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27590b & 8) == 0) {
            return null;
        }
        C7682ga gaVar = ndVar.f27585G;
        return gaVar == null ? C7682ga.f26836d : gaVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final C9141ad mo90759J(Context context, C7536ax axVar) {
        return C91992k.m150979g(context, this.f272628d, true, axVar);
    }

    /* renamed from: a */
    public int mo85875a() {
        int i;
        int a;
        if (mo85874F() == 7) {
            int a2 = C7873nc.m22882a(this.f272626b.f27608t);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 == 1) {
                return -2;
            }
            if (a2 == 2) {
                return -1;
            }
            if (a2 == 3) {
                return 0;
            }
            return a2 == 4 ? 1 : 2;
        } else if (mo85895u()) {
            return -2;
        } else {
            if (mo85893s() || ((a = C56956f.m88243a(i)) != 0 && a == 2)) {
                return 0;
            }
            C56956f.m88243a((i = this.f272626b.f27591c));
            return 0;
        }
    }

    /* renamed from: e */
    public final long mo85879e() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 8) != 0) {
            return ndVar.f27594f;
        }
        return 0;
    }

    /* renamed from: g */
    public PendingIntent mo85881g(Context context, CardRenderingContext cardRenderingContext) {
        C7536ax axVar;
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 1073741824) != 0) {
            axVar = ndVar.f27582D;
            if (axVar == null) {
                axVar = C7536ax.f26084o;
            }
        } else {
            axVar = null;
        }
        C9141ad J = mo90759J(context, axVar);
        if (J == null) {
            return null;
        }
        C91754b bVar = new C91754b(context);
        bVar.f255877a = "com.google.android.apps.sidekick.CLIENT_ACTION";
        bVar.f255878b = "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver";
        bVar.f255886j = J;
        bVar.f255880d = C91529c.m149709a(this);
        bVar.f255881e = BuildConfig.FLAVOR;
        return PendingIntent.getBroadcast(context, 0, bVar.mo86242a(), 201326592);
    }

    /* renamed from: j */
    public final C7669fo mo85884j() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 8388608) == 0) {
            return null;
        }
        C7669fo foVar = ndVar.f27612x;
        return foVar == null ? C7669fo.f26633e : foVar;
    }

    /* renamed from: k */
    public final C8178yk mo85885k() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 65536) != 0) {
            C7536ax axVar = ndVar.f27606r;
            if (axVar == null) {
                axVar = C7536ax.f26084o;
            }
            if ((axVar.f26087b & 2) != 0) {
                C7536ax axVar2 = this.f272626b.f27606r;
                if (axVar2 == null) {
                    axVar2 = C7536ax.f26084o;
                }
                C8178yk ykVar = axVar2.f26096k;
                return ykVar == null ? C8178yk.f28736g : ykVar;
            }
        }
        C7874nd ndVar2 = this.f272626b;
        if ((ndVar2.f27590b & 4) == 0) {
            return null;
        }
        C8178yk ykVar2 = ndVar2.f27584F;
        return ykVar2 == null ? C8178yk.f28736g : ykVar2;
    }

    /* renamed from: m */
    public final Long mo85887m() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 16) != 0) {
            return Long.valueOf(ndVar.f27595g);
        }
        return null;
    }

    /* renamed from: o */
    public final String mo85889o() {
        int i = 1;
        try {
            C9126d dVar = (C9126d) C62942bv.parseFrom((C62942bv) C9126d.f31412c, this.f272626b.toByteString(), C62921ba.m95368a());
            if ((dVar.f31414a & 1) != 0) {
                return Integer.toString(dVar.f31415b);
            }
        } catch (C62974ct e) {
            C59104x d = f272625e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AbstrSnglEntryNotif");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(22445)).mo56386p("protobuffer parsing exception which should never happen.");
        }
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 268435456) == 0) {
            return "0";
        }
        int a = C56992b.m88249a(ndVar.f27580B);
        if (a != 0) {
            i = a;
        }
        return Integer.toString(i - 1);
    }

    /* renamed from: p */
    public String mo85890p() {
        if (!this.f272629f.mo79746e(C90081ef.f249834c)) {
            return null;
        }
        C56954d dVar = this.f272626b.f27603o;
        if (dVar == null) {
            dVar = C56954d.f152000c;
        }
        if (dVar.f152002a == 1) {
            C56954d dVar2 = this.f272626b.f27603o;
            if (dVar2 == null) {
                dVar2 = C56954d.f152000c;
            }
            if (!(dVar2.f152002a == 1 ? (String) dVar2.f152003b : BuildConfig.FLAVOR).isEmpty()) {
                C56954d dVar3 = this.f272626b.f27603o;
                if (dVar3 == null) {
                    dVar3 = C56954d.f152000c;
                }
                if (dVar3.f152002a == 1) {
                    return (String) dVar3.f152003b;
                }
                return BuildConfig.FLAVOR;
            }
        }
        return null;
    }

    /* renamed from: q */
    public Collection mo85891q(CardRenderingContext cardRenderingContext) {
        if (this.f272626b.f27605q.size() != 0) {
            ArrayList arrayList = new ArrayList(this.f272626b.f27605q.size());
            for (C7864mu dVar : this.f272626b.f27605q) {
                arrayList.add(new C97602d(dVar, mo90760K(), this.f272628d, this.f272629f));
            }
            return arrayList;
        } else if (this.f272626b.f27604p.size() == 0) {
            return Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f272626b.f27604p.size());
            for (C7526an anVar : this.f272626b.f27604p) {
                int i = anVar.f26051a;
                if (!((i & 1) == 0 || ((i & 512) == 0 && (i & 2) == 0))) {
                    arrayList2.add(new C97602d(anVar, mo90760K(), this.f272628d, this.f272629f));
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: t */
    public final boolean mo85894t() {
        C7536ax axVar = this.f272626b.f27606r;
        if (axVar == null) {
            axVar = C7536ax.f26084o;
        }
        return axVar.f26088c == 38;
    }

    /* renamed from: v */
    public boolean mo85896v() {
        return true;
    }

    /* renamed from: w */
    public final boolean mo85897w() {
        return this.f272626b.f27614z;
    }

    /* renamed from: x */
    public final boolean mo85898x() {
        C7874nd ndVar = this.f272626b;
        return (ndVar.f27589a & 524288) != 0 ? ndVar.f27609u : mo85893s();
    }

    /* renamed from: y */
    public final boolean mo85899y() {
        C7874nd ndVar = this.f272626b;
        return (ndVar.f27589a & C89885b.NOW_VALUE) != 0 ? ndVar.f27611w : mo85893s();
    }

    /* renamed from: z */
    public final boolean mo85900z() {
        C7874nd ndVar = this.f272626b;
        return (ndVar.f27589a & 1048576) != 0 ? ndVar.f27610v : mo85893s();
    }

    /* renamed from: K */
    public final C7718hj mo90760K() {
        C58485gu guVar = this.f272624a;
        guVar.getClass();
        return (C7718hj) guVar.iterator().next();
    }

    /* renamed from: i */
    public final C60220t mo85883i() {
        C7709ha haVar = this.f272627c;
        if (haVar == null) {
            return null;
        }
        int i = haVar.f26912a;
        if ((i & 16) != 0) {
            C60220t tVar = haVar.f26916e;
            return tVar == null ? C60220t.f162931e : tVar;
        } else if ((i & 1) == 0) {
            return null;
        } else {
            C60220t tVar2 = haVar.f26913b;
            return tVar2 == null ? C60220t.f162931e : tVar2;
        }
    }

    /* renamed from: l */
    public final C57057b mo85886l() {
        C57052a aVar;
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27590b & 1) != 0) {
            C57057b bVar = ndVar.f27583E;
            if (bVar == null) {
                bVar = C57057b.f152311e;
            }
            aVar = (C57052a) bVar.toBuilder();
        } else {
            aVar = (C57052a) C57057b.f152311e.createBuilder();
        }
        C7669fo j = mo85884j();
        if (j != null) {
            aVar.copyOnWrite();
            C57057b bVar2 = (C57057b) aVar.instance;
            bVar2.f152314b = j;
            bVar2.f152313a |= 1;
        }
        if ((this.f272626b.f27589a & 16777216) != 0 && this.f272629f.mo79746e(C90010bp.f246945aN)) {
            C7973qv qvVar = this.f272626b.f27613y;
            if (qvVar == null) {
                qvVar = C7973qv.f28001c;
            }
            aVar.copyOnWrite();
            C57057b bVar3 = (C57057b) aVar.instance;
            qvVar.getClass();
            bVar3.f152315c = qvVar;
            bVar3.f152313a |= 2;
        }
        return (C57057b) aVar.build();
    }
}
