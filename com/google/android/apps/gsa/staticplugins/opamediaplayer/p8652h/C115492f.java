package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8652h;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.android.apps.gsa.p6486s.C84265e;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.p6486s.C84278r;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6614br.C85011a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88418ap;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88421as;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88422at;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.C115148g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52565wl;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.h.f */
/* compiled from: PG */
public final class C115492f extends C86734a implements C85011a {

    /* renamed from: a */
    public static final C59071e f320341a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.h.f");

    /* renamed from: b */
    public final C68214a f320342b;

    /* renamed from: c */
    public final C86124t f320343c;

    /* renamed from: f */
    private final Context f320344f;

    /* renamed from: g */
    private final C86695q f320345g;

    /* renamed from: h */
    private final C60888db f320346h;

    /* renamed from: i */
    private final C21370a f320347i;

    /* renamed from: j */
    private final C115148g f320348j;

    /* renamed from: k */
    private final C91123v f320349k;

    public C115492f(Context context, C68214a aVar, C86124t tVar, C86695q qVar, C90851k kVar, C21370a aVar2, C115148g gVar, C91123v vVar) {
        super(C118575h.WORKER_OPA_MEDIA_PLAYER, "opamediaplayer");
        this.f320344f = context;
        this.f320342b = aVar;
        this.f320343c = tVar;
        this.f320345g = qVar;
        this.f320346h = kVar.mo85208a("opamediaplayer-browser");
        this.f320347i = aVar2;
        this.f320348j = gVar;
        this.f320349k = vVar;
    }

    /* renamed from: c */
    public static Parcel m191577c(MediaBrowserCompat.MediaItem mediaItem) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(mediaItem, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: g */
    private static C84278r m191578g(C52176ia iaVar) {
        C84265e eVar = new C84265e();
        eVar.mo77768d(iaVar);
        eVar.mo77766b(true);
        eVar.mo77767c(true);
        return eVar.mo77765a();
    }

    /* renamed from: h */
    private final void m191579h(C84278r rVar) {
        C60856cj.m92902k(new C115487a(this, rVar), this.f320343c.mo79743a(C90014bt.f247495iI), TimeUnit.MILLISECONDS, this.f320346h);
    }

    /* renamed from: i */
    private final void m191580i(SettableFuture settableFuture) {
        if (!settableFuture.isDone() && !(settableFuture.value instanceof C60873d.C60875b)) {
            this.f320348j.mo101858e(C89885b.OPA_MEDIA_BROWSER_CLIENTINPUT_LOAD_FAILED_VALUE);
            settableFuture.cancel(true);
        }
    }

    /* renamed from: j */
    private static void m191581j(SettableFuture settableFuture) {
        if (!settableFuture.isDone() && !(settableFuture.value instanceof C60873d.C60875b)) {
            settableFuture.cancel(true);
        }
    }

    /* renamed from: k */
    private final boolean m191582k(C52176ia iaVar) {
        if (!iaVar.f136914b.isEmpty()) {
            C52174hz hzVar = (C52174hz) iaVar.f136914b.get(0);
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C52565wl wlVar = woVar.f138009p;
            if (wlVar == null) {
                wlVar = C52565wl.f137961c;
            }
            if ((wlVar.f137963a & 2) != 0) {
                C52568wo woVar2 = hzVar.f136897d;
                if (woVar2 == null) {
                    woVar2 = C52568wo.f137992v;
                }
                C52565wl wlVar2 = woVar2.f138009p;
                if (wlVar2 == null) {
                    wlVar2 = C52565wl.f137961c;
                }
                C52407qp qpVar = wlVar2.f137964b;
                if (qpVar == null) {
                    qpVar = C52407qp.f137523d;
                }
                if ((qpVar.f137525a & 1) != 0 && qpVar.f137526b * 1000 < this.f320347i.mo26870b()) {
                    ((C59052c) ((C59052c) f320341a.mo56224b()).mo56372aa(30097)).mo56350C("Current media item list is out-dated, expired time millis is %d, current time millis is %d.", qpVar.f137526b * 1000, this.f320347i.mo26870b());
                    return true;
                }
            }
            return false;
        }
        ((C59052c) ((C59052c) f320341a.mo56226d()).mo56372aa(30098)).mo56386p("Current media item list is empty.");
        return true;
    }

    /* renamed from: a */
    public final C60870cx mo78651a(String str, String str2) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 86480;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        if (!this.f320343c.mo79746e(C90086ek.f250302aa) || !this.f320349k.mo85390b() || Objects.equals(str2, "media_id_news_player_root")) {
            return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(((C84274n) this.f320342b.mo27525b()).mo77785a()), new C115488b(this), this.f320346h), Exception.class, C115489c.f320337a, C60826bg.f164896a);
        }
        if (str2.equals("agsa_root_media_id")) {
            return C60856cj.m92900i(C58485gu.m89846n(m191577c(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat("media_id_news_player_root", this.f320344f.getResources().getString(R.string.omp_media_type_news), (CharSequence) null, (CharSequence) null, (Bitmap) null, (Uri) null, (Bundle) null, (Uri) null), 1))));
        }
        ((C59052c) ((C59052c) f320341a.mo56226d()).mo56372aa(30091)).mo56386p("Unexpected parentMediaId, returning empty list.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }

    /* renamed from: e */
    public final C52176ia mo102053e(C52176ia iaVar) {
        if (!m191582k(iaVar)) {
            return iaVar;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 86479;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        SettableFuture settableFuture = new SettableFuture();
        C115490d dVar = new C115490d(settableFuture);
        ((C84274n) this.f320342b.mo27525b()).mo77791g(dVar);
        C88418ap apVar = (C88418ap) C88421as.f239066c.createBuilder();
        apVar.copyOnWrite();
        C88421as asVar = (C88421as) apVar.instance;
        asVar.f239069b = 1;
        asVar.f239068a = 1 | asVar.f239068a;
        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
        baVar.mo58885m(C88422at.f239070a, (C88421as) apVar.build());
        this.f320345g.mo80275j("opa_media_player", (C88431bb) baVar.build());
        try {
            iaVar = (C52176ia) C90877ak.m148473g(settableFuture, this.f320343c.mo79743a(C90014bt.f247405gY), TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            ((C59052c) ((C59052c) f320341a.mo56225c()).mo56372aa(30088)).mo56388r("The wait for getting playMediaArgs has timed out.%d", this.f320347i.mo26870b());
            m191580i(settableFuture);
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            ((C59052c) ((C59052c) ((C59052c) f320341a.mo56225c()).mo56382g(th)).mo56372aa(30089)).mo56386p("Unexpected exception while waiting for execution result");
            m191580i(settableFuture);
        }
        ((C84274n) this.f320342b.mo27525b()).mo77792h(dVar);
        return iaVar;
    }

    /* renamed from: f */
    public final void mo102054f(C52176ia iaVar) {
        if (m191582k(iaVar)) {
            ((C59052c) ((C59052c) f320341a.mo56226d()).mo56372aa(30096)).mo56386p("playlist is stale, cannot autoplay the playlist.");
            return;
        }
        SettableFuture settableFuture = new SettableFuture();
        C115491e eVar = new C115491e(settableFuture);
        ((C84274n) this.f320342b.mo27525b()).mo77791g(eVar);
        try {
            C84275o oVar = (C84275o) C90877ak.m148473g(settableFuture, 2000, TimeUnit.MILLISECONDS);
            if (!oVar.mo77814t() && !oVar.mo77812r()) {
                m191579h(m191578g(iaVar));
            }
        } catch (TimeoutException unused) {
            ((C59052c) ((C59052c) f320341a.mo56224b()).mo56372aa(30094)).mo56386p("The wait for getting playbackState has timed out, no current OMP.");
            m191581j(settableFuture);
            m191579h(m191578g(iaVar));
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            ((C59052c) ((C59052c) ((C59052c) f320341a.mo56225c()).mo56382g(th)).mo56372aa(30095)).mo56386p("Unexpected exception while waiting for execution result.");
            m191581j(settableFuture);
        }
        ((C84274n) this.f320342b.mo27525b()).mo77792h(eVar);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
