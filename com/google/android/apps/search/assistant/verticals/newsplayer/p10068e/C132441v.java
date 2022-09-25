package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.media3.common.C2576ac;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2663g;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2666j;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.p145h.C3086bx;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132448c;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10065b.C132408a;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10066c.C132412d;
import com.google.android.gms.cast.C143366ax;
import com.google.android.gms.cast.C143368az;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.C143410ar;
import com.google.android.gms.cast.framework.C143411as;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.cast.framework.media.C143535v;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52173hy;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.v */
/* compiled from: PG */
public final class C132441v implements C132416a {

    /* renamed from: a */
    public static final C59071e f361464a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.newsplayer.e.v");

    /* renamed from: p */
    private static final C62910ar f361465p = C62948a.m95459j(200);

    /* renamed from: A */
    private C60870cx f361466A = null;

    /* renamed from: b */
    public final C47770dh f361467b;

    /* renamed from: c */
    public final C2759ad f361468c;

    /* renamed from: d */
    public final C2759ad f361469d;

    /* renamed from: e */
    final C69464a f361470e;

    /* renamed from: f */
    public C52176ia f361471f = C52176ia.f136911k;

    /* renamed from: g */
    public C143466m f361472g = null;

    /* renamed from: h */
    public C143410ar f361473h = null;

    /* renamed from: i */
    public final C143411as f361474i = new C132439t(this);

    /* renamed from: j */
    public boolean f361475j = false;

    /* renamed from: k */
    public int f361476k = -1;

    /* renamed from: l */
    public C62910ar f361477l = C62948a.f169987b;

    /* renamed from: m */
    public C62910ar f361478m = C62948a.f169987b;

    /* renamed from: n */
    public float f361479n = 1.0f;

    /* renamed from: o */
    public int f361480o = 2;

    /* renamed from: q */
    private final C132412d f361481q;

    /* renamed from: r */
    private final Context f361482r;

    /* renamed from: s */
    private final C132448c f361483s;

    /* renamed from: t */
    private final C132417aa f361484t;

    /* renamed from: u */
    private final KeyguardManager f361485u;

    /* renamed from: v */
    private final Executor f361486v;

    /* renamed from: w */
    private final C21370a f361487w;

    /* renamed from: x */
    private final C60887da f361488x;

    /* renamed from: y */
    private final C60888db f361489y;

    /* renamed from: z */
    private List f361490z = null;

    public C132441v(Context context, Executor executor, C60887da daVar, C60888db dbVar, C47770dh dhVar, C132412d dVar, C132448c cVar, C21370a aVar, C132417aa aaVar, KeyguardManager keyguardManager, C69464a aVar2, C69464a aVar3) {
        this.f361482r = context;
        this.f361483s = cVar;
        this.f361467b = dhVar;
        this.f361481q = dVar;
        this.f361487w = aVar;
        this.f361488x = daVar;
        this.f361489y = dbVar;
        this.f361484t = aaVar;
        this.f361485u = keyguardManager;
        this.f361486v = executor;
        this.f361470e = aVar3;
        this.f361468c = m215314z(context, C132418ab.ASSISTANT_TTS);
        this.f361469d = m215314z(context, C132418ab.GENERIC);
        daVar.execute(C47810es.m84977q(new C132431l(this, dhVar, dVar)));
        cVar.mo110732b(new C132434o(this));
        if (((Boolean) aVar2.mo17428b()).booleanValue()) {
            C60856cj.m92903l(C47810es.m84977q(new C132432m(this, context, executor)), daVar);
        }
    }

    /* renamed from: A */
    private final C132419ac m215310A(int i) {
        List<C132419ac> list = this.f361490z;
        if (list == null) {
            return null;
        }
        for (C132419ac acVar : list) {
            if (acVar.f361430c == i) {
                return acVar;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.media3.common.bh, androidx.media3.exoplayer.ad] */
    /* renamed from: B */
    private final void m215311B(C132419ac acVar, boolean z, boolean z2) {
        ? r = mo110724r(acVar.f361431d);
        if (z2) {
            r.mo6269ao(this.f361479n);
            C2666j jVar = r;
            jVar.mo5973A(jVar.mo5996c(), C62948a.m95453d(this.f361477l));
        }
        C2590aq aa = r.mo6256aa();
        boolean z3 = false;
        if (aa != null && aa.f7153b.equals(acVar.f361428a)) {
            z3 = true;
        }
        if (z3 && z) {
            r.mo5974B(true);
        }
        if (!z3) {
            C2576ac acVar2 = new C2576ac();
            acVar2.mo6083b(acVar.f361428a);
            String str = acVar.f361428a;
            str.getClass();
            acVar2.f7103a = str;
            C2666j jVar2 = r;
            jVar2.mo5992T(C58485gu.m89846n(acVar2.mo6082a()));
            if (acVar.f361432e == 2) {
                C52176ia iaVar = this.f361471f;
                jVar2.mo5973A(jVar2.mo5996c(), ((C52174hz) iaVar.f136914b.get(acVar.f361430c)).f136898e);
            }
            r.mo5974B(z);
            r.mo6017x();
        } else if (z) {
            ((C2666j) r).mo5974B(true);
        }
    }

    /* renamed from: C */
    private final void m215312C(int i) {
        C132419ac A;
        C132419ac s = mo110725s(this.f361476k);
        if (s != null) {
            int i2 = s.f361430c + i;
            if (!this.f361471f.equals(C52176ia.f136911k) && i2 >= 0 && i2 < this.f361471f.f136914b.size() && (A = m215310A(i2)) != null) {
                mo110729x(A.f361429b);
                this.f361488x.execute(C47810es.m84977q(new C132425f(this)));
            }
        }
    }

    /* renamed from: t */
    public static MediaQueueItem m215313t(MediaInfo mediaInfo) {
        MediaQueueItem mediaQueueItem = new MediaQueueItem(mediaInfo);
        C143366ax.m232629a(mediaQueueItem);
        return mediaQueueItem;
    }

    /* renamed from: z */
    private final C2759ad m215314z(Context context, C132418ab abVar) {
        C2664h a = C2663g.m7201a(2, 1);
        C2758ac acVar = new C2758ac(context);
        acVar.mo6457d(context.getMainLooper());
        acVar.mo6455b(a);
        acVar.mo6458e(new C3086bx(new C132426g(context)));
        C2759ad a2 = acVar.mo6454a();
        a2.mo6016w(new C132436q(this, abVar));
        return a2;
    }

    /* renamed from: a */
    public final C52174hz mo110699a() {
        C132419ac s = mo110725s(this.f361476k);
        if (s == null) {
            return null;
        }
        C52176ia iaVar = this.f361471f;
        return (C52174hz) iaVar.f136914b.get(s.f361430c);
    }

    /* renamed from: b */
    public final C52176ia mo110700b() {
        if (this.f361471f.equals(C52176ia.f136911k)) {
            return null;
        }
        return this.f361471f;
    }

    /* renamed from: c */
    public final String mo110701c() {
        C143410ar arVar;
        C143466m a;
        CastDevice b;
        if (!this.f361475j || (arVar = this.f361473h) == null || (a = arVar.mo118621a()) == null || (b = a.mo118719b()) == null) {
            return this.f361482r.getResources().getString(R.string.assistant_news_player_this_device);
        }
        return b.f388602d;
    }

    /* renamed from: d */
    public final void mo110702d() {
        this.f361483s.mo110731a();
    }

    /* renamed from: g */
    public final void mo110705g(C62910ar arVar) {
        C62948a.m95465p(arVar);
        if (C62948a.m95464o(arVar) || arVar.equals(C62948a.f169987b) || !mo110714p()) {
            mo110707i(C62948a.m95459j(C62948a.m95453d(this.f361477l) + C62948a.m95453d(arVar)));
        } else {
            mo110709k();
        }
    }

    /* renamed from: h */
    public final void mo110706h(int i) {
        this.f361477l = C62948a.f169987b;
        this.f361478m = C62948a.f169987b;
        C132419ac A = m215310A(i);
        if (A != null) {
            int i2 = A.f361429b;
            if (this.f361475j) {
                C143466m mVar = this.f361472g;
                mVar.getClass();
                C143500bf c = mVar.mo118720c();
                if (c == null) {
                    ((C59052c) ((C59052c) f361464a.mo56226d()).mo56372aa(39662)).mo56386p("NewsPlayerSession Cast RMC is null.");
                    return;
                }
                C143535v j = c.mo118782j();
                C143919bh.m233964g("Must be called from the main thread.");
                int i3 = 0;
                if (i2 >= 0 && i2 < j.f389216d.size()) {
                    i3 = ((Integer) j.f389216d.get(i2)).intValue();
                }
                c.mo118768H(i3, -1);
            } else {
                mo110729x(i2);
                mo110728w();
            }
            mo110704f();
        }
    }

    /* renamed from: k */
    public final void mo110709k() {
        if (!this.f361475j && mo110714p() && mo110730y()) {
            mo110729x(this.f361476k + 1);
            this.f361488x.execute(C47810es.m84977q(new C132425f(this)));
            mo110704f();
        }
    }

    /* renamed from: l */
    public final void mo110710l() {
        this.f361477l = C62948a.f169987b;
        this.f361478m = C62948a.f169987b;
        if (this.f361475j) {
            C143466m mVar = this.f361472g;
            mVar.getClass();
            C143500bf c = mVar.mo118720c();
            if (c == null) {
                ((C59052c) ((C59052c) f361464a.mo56226d()).mo56372aa(39665)).mo56386p("NewsPlayerSession Cast RMC is null.");
                return;
            }
            c.mo118770J();
        } else {
            m215312C(1);
        }
        mo110704f();
    }

    /* renamed from: m */
    public final void mo110711m() {
        this.f361477l = C62948a.f169987b;
        this.f361478m = C62948a.f169987b;
        if (this.f361475j) {
            C143466m mVar = this.f361472g;
            mVar.getClass();
            C143500bf c = mVar.mo118720c();
            if (c == null) {
                ((C59052c) ((C59052c) f361464a.mo56226d()).mo56372aa(39666)).mo56386p("NewsPlayerSession Cast RMC is null.");
                return;
            }
            c.mo118771K();
        } else {
            m215312C(-1);
        }
        mo110704f();
    }

    /* renamed from: n */
    public final void mo110712n(AccountId accountId, C52176ia iaVar) {
        C59071e eVar = f361464a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39667)).mo56386p("NewsPlayer session starting.");
        if (iaVar.f136914b.size() == 0) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39668)).mo56386p("NewsPlayer session has no media items.");
            return;
        }
        this.f361471f = iaVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (C52174hz hzVar : this.f361471f.f136914b) {
            for (String acVar : hzVar.f136899f) {
                arrayList.add(new C132419ac(acVar, i, i2, 1, C132418ab.ASSISTANT_TTS));
                i++;
            }
            if (!hzVar.f136895b.isEmpty()) {
                arrayList.add(new C132419ac(hzVar.f136895b, i, i2, 2, C132418ab.GENERIC));
                i++;
            }
            for (String acVar2 : hzVar.f136900g) {
                arrayList.add(new C132419ac(acVar2, i, i2, 3, C132418ab.ASSISTANT_TTS));
                i++;
            }
            i2++;
        }
        this.f361490z = arrayList;
        this.f361480o = 2;
        mo110729x(0);
        C132412d dVar = this.f361481q;
        dVar.f361414g = accountId;
        C132412d.C132413a aVar = (C132412d.C132413a) C47245e.m84045a(dVar.f361410c, C132412d.C132413a.class, accountId);
        dVar.f361412e = aVar.mo110697fM();
        dVar.f361413f = aVar.mo110698fP();
        dVar.f361411d = this;
        this.f361488x.execute(C47810es.m84977q(new C132425f(this)));
        C60870cx g = C60922j.m93044g(this.f361484t.f361424a.mo46042d(), C132444y.f361491a, C60826bg.f164896a);
        C132435p pVar = new C132435p(this);
        C60856cj.m92911t(g, C47810es.m84974n(pVar), this.f361486v);
        boolean booleanValue = ((Boolean) this.f361470e.mo17428b()).booleanValue();
        int a = C52173hy.m86533a(((C52174hz) this.f361471f.f136914b.get(0)).f136903j);
        if ((a != 0 && a == 3 && !this.f361485u.isDeviceLocked()) || booleanValue) {
            Context context = this.f361482r;
            C47810es.m84979s(context, C132408a.m215227a(context));
        }
    }

    /* renamed from: o */
    public final void mo110713o() {
        if (this.f361480o == 1) {
            mo110704f();
        } else {
            mo110703e();
        }
    }

    /* renamed from: p */
    public final boolean mo110714p() {
        C132419ac s = mo110725s(this.f361476k);
        return s != null && s.f361432e == 1;
    }

    /* renamed from: q */
    public final C132446a mo110715q() {
        return this.f361483s.mo110735e();
    }

    /* renamed from: r */
    public final C2646bh mo110724r(C132418ab abVar) {
        C132418ab abVar2 = C132418ab.ASSISTANT_TTS;
        int ordinal = abVar.ordinal();
        if (ordinal == 0) {
            return this.f361468c;
        }
        if (ordinal == 1) {
            return this.f361469d;
        }
        throw new AssertionError(abVar);
    }

    /* renamed from: s */
    public final C132419ac mo110725s(int i) {
        List list = this.f361490z;
        if (list == null || list.isEmpty() || i < 0 || i >= this.f361490z.size()) {
            return null;
        }
        return (C132419ac) this.f361490z.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        return;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo110726u() {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f361480o     // Catch:{ all -> 0x0042 }
            r1 = 2
            if (r0 == r1) goto L_0x0019
            com.google.common.util.concurrent.cx r0 = r9.f361466A     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0019
            r2 = 0
            r0.cancel(r2)     // Catch:{ all -> 0x0042 }
            r0 = 0
            r9.f361466A = r0     // Catch:{ all -> 0x0042 }
            com.google.android.apps.search.assistant.verticals.newsplayer.e.u r0 = new com.google.android.apps.search.assistant.verticals.newsplayer.e.u     // Catch:{ all -> 0x0042 }
            r0.<init>(r9)     // Catch:{ all -> 0x0042 }
            r0.run()     // Catch:{ all -> 0x0042 }
        L_0x0019:
            int r0 = r9.f361480o     // Catch:{ all -> 0x0042 }
            if (r0 != r1) goto L_0x0040
            com.google.common.util.concurrent.cx r0 = r9.f361466A     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0040
            boolean r0 = r9.f361475j     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0040
            com.google.android.apps.search.assistant.verticals.newsplayer.e.u r1 = new com.google.android.apps.search.assistant.verticals.newsplayer.e.u     // Catch:{ all -> 0x0042 }
            r1.<init>(r9)     // Catch:{ all -> 0x0042 }
            r2 = 0
            com.google.protobuf.ar r0 = f361465p     // Catch:{ all -> 0x0042 }
            long r4 = com.google.protobuf.p4750c.C62948a.m95453d(r0)     // Catch:{ all -> 0x0042 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0042 }
            com.google.android.libraries.f.a r7 = r9.f361487w     // Catch:{ all -> 0x0042 }
            com.google.common.util.concurrent.db r8 = r9.f361489y     // Catch:{ all -> 0x0042 }
            com.google.common.util.concurrent.cx r0 = com.google.common.android.concurrent.C58301z.m89281a(r1, r2, r4, r6, r7, r8)     // Catch:{ all -> 0x0042 }
            r9.f361466A = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r9)
            return
        L_0x0040:
            monitor-exit(r9)
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132441v.mo110726u():void");
    }

    /* renamed from: v */
    public final void mo110727v() {
        this.f361483s.mo110734d(this.f361480o == 2, this.f361477l, this.f361478m, this.f361479n, this.f361475j);
    }

    /* renamed from: w */
    public final void mo110728w() {
        C132419ac s = mo110725s(this.f361476k);
        if (s != null) {
            m215311B(s, this.f361480o == 2, true);
            int i = this.f361476k + 1;
            List list = this.f361490z;
            list.getClass();
            if (i < list.size()) {
                C132419ac acVar = (C132419ac) this.f361490z.get(this.f361476k + 1);
                if (acVar.f361431d != s.f361431d) {
                    m215311B(acVar, false, false);
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo110729x(int i) {
        C132419ac s = mo110725s(this.f361476k);
        boolean z = true;
        if (s != null) {
            int i2 = s.f361430c;
            List list = this.f361490z;
            list.getClass();
            if (i2 == ((C132419ac) list.get(i)).f361430c) {
                z = false;
            }
        }
        this.f361476k = i;
        if (z) {
            C132448c cVar = this.f361483s;
            C52174hz a = mo110699a();
            a.getClass();
            cVar.mo110733c(a);
        }
    }

    /* renamed from: y */
    public final boolean mo110730y() {
        C132419ac s = mo110725s(this.f361476k);
        if (s == null) {
            return false;
        }
        int i = s.f361429b;
        List list = this.f361490z;
        list.getClass();
        if (i < list.size() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo110703e() {
        if (this.f361475j) {
            C143466m mVar = this.f361472g;
            mVar.getClass();
            C143500bf c = mVar.mo118720c();
            if (c == null) {
                ((C59052c) ((C59052c) f361464a.mo56226d()).mo56372aa(39660)).mo56386p("NewsPlayerSession Cast RMC is null.");
            } else {
                c.mo118766F();
            }
        } else {
            C132419ac s = mo110725s(this.f361476k);
            if (s != null) {
                this.f361488x.execute(C47810es.m84977q(new C132424e(this, s)));
            }
        }
    }

    /* renamed from: f */
    public final void mo110704f() {
        if (this.f361475j) {
            C143466m mVar = this.f361472g;
            mVar.getClass();
            C143500bf c = mVar.mo118720c();
            if (c == null) {
                ((C59052c) ((C59052c) f361464a.mo56226d()).mo56372aa(39661)).mo56386p("NewsPlayerSession Cast RMC is null.");
            } else {
                c.mo118767G();
            }
        } else {
            C132419ac s = mo110725s(this.f361476k);
            if (s != null) {
                this.f361488x.execute(C47810es.m84977q(new C132421b(this, s)));
            }
        }
    }

    /* renamed from: i */
    public final void mo110707i(C62910ar arVar) {
        if (this.f361475j) {
            C143466m mVar = this.f361472g;
            mVar.getClass();
            C143500bf c = mVar.mo118720c();
            if (c == null) {
                ((C59052c) ((C59052c) f361464a.mo56226d()).mo56372aa(39663)).mo56386p("NewsPlayerSession Cast RMC is null.");
            } else {
                c.mo118783k(new C143368az(C62948a.m95453d(arVar)));
            }
        } else {
            C132419ac s = mo110725s(this.f361476k);
            if (s != null) {
                this.f361488x.execute(C47810es.m84977q(new C132423d(this, s, arVar)));
            }
        }
    }

    /* renamed from: j */
    public final void mo110708j(float f) {
        this.f361479n = f;
        if (this.f361475j) {
            C143466m mVar = this.f361472g;
            mVar.getClass();
            C143500bf c = mVar.mo118720c();
            if (c == null) {
                ((C59052c) ((C59052c) f361464a.mo56226d()).mo56372aa(39664)).mo56386p("NewsPlayerSession Cast RMC is null.");
                return;
            }
            c.mo118772L((double) this.f361479n);
        } else {
            C132419ac s = mo110725s(this.f361476k);
            if (s != null) {
                this.f361488x.execute(C47810es.m84977q(new C132428i(this, s)));
            } else {
                return;
            }
        }
        mo110727v();
        C46459k.m82829b(this.f361484t.f361424a.mo46039a(new C132445z(f), C60826bg.f164896a), "Failed to update playback speed in NewsPreferences", new Object[0]);
    }
}
