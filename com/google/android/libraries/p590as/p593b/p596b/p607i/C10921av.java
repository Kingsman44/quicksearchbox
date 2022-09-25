package com.google.android.libraries.p590as.p593b.p596b.p607i;

import android.net.Uri;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p590as.p593b.p596b.C10817au;
import com.google.android.libraries.p590as.p593b.p596b.C10846ba;
import com.google.android.libraries.p590as.p593b.p596b.C10853d;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.C10949k;
import com.google.android.libraries.p590as.p593b.p596b.C10950l;
import com.google.android.libraries.p590as.p593b.p596b.p602f.p603a.C10870e;
import com.google.android.libraries.p590as.p593b.p596b.p602f.p603a.C10871f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10878f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58670nq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.NoSuchElementException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.as.b.b.i.av */
/* compiled from: PG */
public final class C10921av implements C10949k {

    /* renamed from: a */
    public static final C58974d f36023a = C58974d.m91134h("ZipfileLPSourceImpl");

    /* renamed from: b */
    public final C29409fd f36024b;

    /* renamed from: c */
    public final C10905af f36025c;

    /* renamed from: d */
    public final C10932k f36026d;

    /* renamed from: e */
    public final C37215b f36027e;

    /* renamed from: f */
    public final C60887da f36028f;

    /* renamed from: g */
    private final C42813k f36029g;

    /* renamed from: h */
    private final C10846ba f36030h;

    /* renamed from: i */
    private final C60887da f36031i;

    public C10921av(C29409fd fdVar, C42813k kVar, C10905af afVar, C10846ba baVar, C10932k kVar2, C37215b bVar, C60887da daVar, C60887da daVar2) {
        this.f36024b = fdVar;
        this.f36029g = kVar;
        this.f36025c = afVar;
        this.f36030h = baVar;
        this.f36026d = kVar2;
        this.f36027e = bVar;
        this.f36028f = daVar;
        this.f36031i = daVar2;
    }

    /* renamed from: a */
    public final C60870cx mo19272a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final C60870cx mo19274c() {
        this.f36027e.mo19974a(C37206a.f98756M);
        C60870cx a = this.f36026d.mo19342a();
        C10915ap apVar = new C10915ap(this);
        return C60922j.m93044g(a, C47810es.m84963c(apVar), this.f36028f);
    }

    /* renamed from: d */
    public final C60870cx mo19275d() {
        this.f36027e.mo19974a(C37206a.f98758O);
        C60870cx b = this.f36026d.mo19343b(this.f36024b);
        C10908ai aiVar = new C10908ai(this);
        return C60922j.m93044g(b, C47810es.m84963c(aiVar), this.f36028f);
    }

    /* renamed from: f */
    public final C60870cx mo19277f() {
        this.f36027e.mo19974a(C37206a.f98760Q);
        return C47633f.m84733g(this.f36025c.mo19335a(this.f36024b)).mo51516i(new C10916aq(this), this.f36028f).mo51515h(new C10917ar(this), this.f36028f);
    }

    /* renamed from: g */
    public final C60870cx mo19278g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public final C10950l mo19338i(C10882h hVar, C29690f fVar) {
        C58833ax axVar;
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        if (a != C29689e.DOWNLOADED) {
            C58970a aVar = (C58970a) ((C58970a) f36023a.mo56226d()).mo56372aa(54048);
            String str = fVar.f80411b;
            C29689e a2 = C29689e.m54781a(fVar.f80415f);
            if (a2 == null) {
                a2 = C29689e.UNSPECIFIED;
            }
            aVar.mo56359L("LanguagePack %s is not downloaded, yet its read was requested. Caller probably made an error. MDD group %s download status: %s.", hVar, str, a2.name());
            return C10950l.m25964e(hVar);
        }
        try {
            C42813k kVar = this.f36029g;
            Uri parse = Uri.parse(((C28595b) Collection.EL.stream(fVar.f80416g).filter(C10909aj.f36004a).collect(C58670nq.f156403c)).f77799c + "/metadata");
            C42788l lVar = new C42788l();
            lVar.f112052a = true;
            File file = (File) kVar.mo45889c(parse, lVar);
            C58974d dVar = f36023a;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(54044)).mo56389s("Found LanguagePack metadata file with path: %s", file.getAbsolutePath());
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(54046)).mo56354G("LanguagePack %s seemed to be downloaded, but parent directory somehow does not exist. Child directory: %s", hVar, file.getAbsolutePath());
                return C10950l.m25964e(hVar);
            }
            Optional optional = (Optional) Collection.EL.stream(fVar.f80416g).filter(C10907ah.f36002a).collect(C58670nq.f156401a);
            if (optional.isEmpty()) {
                axVar = C58836b.f156633a;
            } else {
                try {
                    C42813k kVar2 = this.f36029g;
                    Uri parse2 = Uri.parse(((C28595b) optional.get()).f77799c);
                    C42788l lVar2 = new C42788l();
                    lVar2.f112052a = true;
                    File file2 = (File) kVar2.mo45889c(parse2, lVar2);
                    C10870e eVar = (C10870e) C10871f.f35937h.createBuilder();
                    int i = fVar.f80414e;
                    eVar.copyOnWrite();
                    C10871f fVar2 = (C10871f) eVar.instance;
                    fVar2.f35939a = 1 | fVar2.f35939a;
                    fVar2.f35940b = (long) i;
                    int i2 = ((C28595b) optional.get()).f77800d;
                    eVar.copyOnWrite();
                    C10871f fVar3 = (C10871f) eVar.instance;
                    fVar3.f35939a |= 8;
                    fVar3.f35943e = (long) i2;
                    String absolutePath = file2.getAbsolutePath();
                    eVar.copyOnWrite();
                    C10871f fVar4 = (C10871f) eVar.instance;
                    absolutePath.getClass();
                    fVar4.f35939a |= 16;
                    fVar4.f35944f = absolutePath;
                    axVar = C58833ax.m90834k((C10871f) eVar.build());
                } catch (IOException e) {
                    ((C58970a) ((C58970a) ((C58970a) f36023a.mo56226d()).mo56382g(e)).mo56372aa(54050)).mo56387q("Training plan %d seemed to be present, but disk read failed.", fVar.f80414e);
                    axVar = C58836b.f156633a;
                }
            }
            ((C58970a) ((C58970a) f36023a.mo56224b()).mo56372aa(54045)).mo56360M("Returning LanguagePack path for locale %s, version %d from MDD with group name '%s': '%s'", hVar.mo19289g(), Integer.valueOf(hVar.mo19282a()), fVar.f80411b, parentFile.getAbsolutePath());
            if (!axVar.mo56113h()) {
                return C10950l.m25963d(hVar, parentFile.getAbsolutePath());
            }
            return new C10853d(hVar, C58833ax.m90834k(parentFile.getAbsolutePath()), C58833ax.m90834k((C10871f) axVar.mo56107c()));
        } catch (IOException | NoSuchElementException e2) {
            ((C58970a) ((C58970a) ((C58970a) f36023a.mo56226d()).mo56382g(e2)).mo56372aa(54047)).mo56389s("LanguagePack %s seemed to be downloaded, but disk read failed.", hVar);
            return C10950l.m25964e(hVar);
        }
    }

    /* renamed from: j */
    public final C60870cx mo19273b(C10882h hVar) {
        this.f36027e.mo19974a(C37206a.f98764U);
        C10878f fVar = (C10878f) C10879g.f35958g.createBuilder();
        String languageTag = hVar.mo19289g().toLanguageTag();
        fVar.copyOnWrite();
        C10879g gVar = (C10879g) fVar.instance;
        languageTag.getClass();
        gVar.f35960a |= 1;
        gVar.f35961b = languageTag;
        int a = hVar.mo19282a();
        fVar.copyOnWrite();
        C10879g gVar2 = (C10879g) fVar.instance;
        gVar2.f35960a |= 2;
        gVar2.f35962c = (long) a;
        C10846ba baVar = this.f36030h;
        ((C58970a) ((C58970a) C10846ba.f35901a.mo56224b()).mo56372aa(53978)).mo56389s("[%s] #deleteRequest", baVar.f35904d);
        return C47633f.m84733g(baVar.f35902b.mo46039a(new C10817au(baVar, (C10879g) fVar.build()), baVar.f35903c)).mo51516i(new C10912am(this, hVar), this.f36028f).mo51516i(new C10913an(this, hVar), this.f36028f).mo51515h(new C10914ao(this, hVar), this.f36028f);
    }

    /* renamed from: k */
    public final C60870cx mo19276e(C10882h hVar) {
        ((C58970a) ((C58970a) f36023a.mo56224b()).mo56372aa(54054)).mo56386p("#getPackage");
        this.f36027e.mo19974a(C37206a.f98766W);
        return C47633f.m84733g(this.f36025c.mo19335a(this.f36024b)).mo51516i(new C10919at(this, C10934m.m25955c(hVar.mo19289g().toLanguageTag(), hVar.mo19282a())), this.f36028f).mo51515h(new C10920au(this, hVar), this.f36031i);
    }

    /* renamed from: l */
    public final C60870cx mo19279h(C10882h hVar) {
        this.f36027e.mo19974a(C37206a.f98762S);
        Locale g = hVar.mo19289g();
        int a = hVar.mo19282a();
        C10878f fVar = (C10878f) C10879g.f35958g.createBuilder();
        String languageTag = g.toLanguageTag();
        fVar.copyOnWrite();
        C10879g gVar = (C10879g) fVar.instance;
        languageTag.getClass();
        gVar.f35960a |= 1;
        gVar.f35961b = languageTag;
        fVar.copyOnWrite();
        C10879g gVar2 = (C10879g) fVar.instance;
        gVar2.f35960a |= 2;
        gVar2.f35962c = (long) a;
        return C47633f.m84733g(C60922j.m93045h(this.f36030h.mo19313a((C10879g) fVar.build()), C47810es.m84966f(new C10918as(this)), this.f36028f)).mo51516i(new C10910ak(this, hVar), this.f36028f).mo51515h(new C10911al(this, hVar), this.f36028f);
    }
}
