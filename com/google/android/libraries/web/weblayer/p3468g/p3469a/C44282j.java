package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import android.net.Uri;
import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.base.p3348b.p3349a.C43236a;
import com.google.android.libraries.web.contrib.contextmenu.internal.p3365a.C43456a;
import com.google.android.libraries.web.contrib.contextmenu.internal.p3365a.C43457b;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43443c;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43445e;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43374s;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.base.C58893dc;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72602bk;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72624m;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.j */
/* compiled from: PG */
public final class C44282j extends C72602bk {

    /* renamed from: a */
    public C43456a f115167a;

    /* renamed from: b */
    private final C43331ag f115168b;

    /* renamed from: c */
    private final C72601bj f115169c;

    public C44282j(C43331ag agVar, C72601bj bjVar) {
        this.f115168b = agVar;
        this.f115169c = bjVar;
    }

    /* renamed from: c */
    public final void mo47188c() {
        C72601bj bjVar = this.f115169c;
        C72604bm.m107399a();
        bjVar.mo64476g();
        try {
            if (bjVar.f193153k.mo63749t()) {
                this.f115168b.mo46451m(C43374s.RENDER_DEAD_IN_BACKGROUND);
            } else {
                this.f115168b.mo46451m(C43374s.RENDER_DEAD_IN_FOREGROUND);
            }
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: d */
    public final void mo47189d(String str) {
        C69664n.m101061g(str, "title");
        C43367l lVar = this.f115168b.mo46439a().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        if (!C69664n.m101066l(lVar.f113297c, str)) {
            this.f115168b.mo46458t(str);
        }
    }

    /* renamed from: e */
    public final void mo47190e(Uri uri) {
        C69664n.m101061g(uri, "url");
    }

    /* renamed from: f */
    public final void mo47191f(C72624m mVar) {
        String str;
        C43446f fVar;
        C43456a aVar = this.f115167a;
        if (aVar != null) {
            C43236a aVar2 = new C43236a(mVar.f193194a, mVar.f193195b, mVar.f193196c, mVar.f193197d, mVar.f193198e);
            Consumer consumer = aVar.f113529a;
            C43443c cVar = (C43443c) C43446f.f113498i.createBuilder();
            Uri uri = aVar2.f112993c;
            if (uri != null) {
                C58893dc.m90996a(uri);
                str = uri.toString();
            } else {
                str = BuildConfig.FLAVOR;
            }
            Uri uri2 = aVar2.f112991a;
            if (uri2 != null) {
                C58893dc.m90996a(uri2);
                String uri3 = uri2.toString();
                Uri uri4 = aVar2.f112991a;
                C58893dc.m90996a(uri4);
                String g = C58837ba.m90858g(uri4.getScheme());
                Uri uri5 = aVar2.f112991a;
                C58893dc.m90996a(uri5);
                String g2 = C58837ba.m90858g(uri5.getSchemeSpecificPart());
                if (uri3.isEmpty() || g.isEmpty() || g2.isEmpty()) {
                    C43445e eVar = C43445e.UNKNOWN;
                    cVar.copyOnWrite();
                    C43446f fVar2 = (C43446f) cVar.instance;
                    fVar2.f113501b = eVar.f113497h;
                    fVar2.f113500a |= 1;
                    fVar = (C43446f) cVar.build();
                } else {
                    if (C58890d.m90990e(g, "tel")) {
                        C43445e eVar2 = C43445e.PHONE_NUMBER;
                        cVar.copyOnWrite();
                        C43446f fVar3 = (C43446f) cVar.instance;
                        fVar3.f113501b = eVar2.f113497h;
                        fVar3.f113500a |= 1;
                        cVar.copyOnWrite();
                        C43446f fVar4 = (C43446f) cVar.instance;
                        fVar4.f113500a |= 8;
                        fVar4.f113504e = g2;
                    } else if (C58890d.m90990e(g, "mailto")) {
                        C43445e eVar3 = C43445e.EMAIL_ADDRESS;
                        cVar.copyOnWrite();
                        C43446f fVar5 = (C43446f) cVar.instance;
                        fVar5.f113501b = eVar3.f113497h;
                        fVar5.f113500a |= 1;
                        cVar.copyOnWrite();
                        C43446f fVar6 = (C43446f) cVar.instance;
                        fVar6.f113500a |= 16;
                        fVar6.f113505f = g2;
                    } else if (C58890d.m90990e(g, "geo")) {
                        C43445e eVar4 = C43445e.GEO_ADDRESS;
                        cVar.copyOnWrite();
                        C43446f fVar7 = (C43446f) cVar.instance;
                        fVar7.f113501b = eVar4.f113497h;
                        fVar7.f113500a |= 1;
                        cVar.copyOnWrite();
                        C43446f fVar8 = (C43446f) cVar.instance;
                        fVar8.f113500a |= 32;
                        fVar8.f113506g = g2;
                    } else if (C43457b.m76687a(str)) {
                        C43445e eVar5 = C43445e.IMAGE_LINK;
                        cVar.copyOnWrite();
                        C43446f fVar9 = (C43446f) cVar.instance;
                        fVar9.f113501b = eVar5.f113497h;
                        fVar9.f113500a |= 1;
                        cVar.copyOnWrite();
                        C43446f fVar10 = (C43446f) cVar.instance;
                        uri3.getClass();
                        fVar10.f113500a |= 4;
                        fVar10.f113503d = uri3;
                        cVar.copyOnWrite();
                        C43446f fVar11 = (C43446f) cVar.instance;
                        str.getClass();
                        fVar11.f113500a |= 2;
                        fVar11.f113502c = str;
                    } else {
                        C43445e eVar6 = C43445e.LINK;
                        cVar.copyOnWrite();
                        C43446f fVar12 = (C43446f) cVar.instance;
                        fVar12.f113501b = eVar6.f113497h;
                        fVar12.f113500a |= 1;
                        cVar.copyOnWrite();
                        C43446f fVar13 = (C43446f) cVar.instance;
                        uri3.getClass();
                        fVar13.f113500a |= 4;
                        fVar13.f113503d = uri3;
                        String str2 = aVar2.f112992b;
                        cVar.copyOnWrite();
                        C43446f fVar14 = (C43446f) cVar.instance;
                        fVar14.f113500a |= 64;
                        fVar14.f113507h = C58837ba.m90858g(str2);
                    }
                    fVar = (C43446f) cVar.build();
                }
            } else if (C43457b.m76687a(str)) {
                C43445e eVar7 = C43445e.IMAGE;
                cVar.copyOnWrite();
                C43446f fVar15 = (C43446f) cVar.instance;
                fVar15.f113501b = eVar7.f113497h;
                fVar15.f113500a |= 1;
                cVar.copyOnWrite();
                C43446f fVar16 = (C43446f) cVar.instance;
                str.getClass();
                fVar16.f113500a |= 2;
                fVar16.f113502c = str;
                fVar = (C43446f) cVar.build();
            } else {
                C43445e eVar8 = C43445e.UNKNOWN;
                cVar.copyOnWrite();
                C43446f fVar17 = (C43446f) cVar.instance;
                fVar17.f113501b = eVar8.f113497h;
                fVar17.f113500a |= 1;
                fVar = (C43446f) cVar.build();
            }
            consumer.accept(fVar);
        }
    }
}
