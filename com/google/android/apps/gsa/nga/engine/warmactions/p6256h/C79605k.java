package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79568aa;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79577i;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79594z;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.p3304a.p3312f.C42787k;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.p5610a.p5611a.p5612a.C71989i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.k */
/* compiled from: PG */
public final class C79605k implements C79597c, C90991b {

    /* renamed from: a */
    static final C58495hd f218394a = C58495hd.m89906t("en", Integer.valueOf(R.raw.config_en), "ja", Integer.valueOf(R.raw.config_ja), "de", Integer.valueOf(R.raw.config_de), "fr-CA", Integer.valueOf(R.raw.config_fr_CA), "fr-FR", Integer.valueOf(R.raw.config_fr_FR), "es", Integer.valueOf(R.raw.config_es), "it", Integer.valueOf(R.raw.config_it));

    /* renamed from: b */
    static final C58495hd f218395b = C58495hd.m89900n("en", "dev_config_en");

    /* renamed from: c */
    public static final /* synthetic */ int f218396c = 0;

    /* renamed from: d */
    private static final C58974d f218397d = C58974d.m91136j();

    /* renamed from: e */
    private final Context f218398e;

    /* renamed from: f */
    private final C76092h f218399f;

    /* renamed from: g */
    private final C79607m f218400g;

    /* renamed from: h */
    private final C81013d f218401h;

    /* renamed from: i */
    private final Optional f218402i;

    /* renamed from: j */
    private final C91142g f218403j;

    public C79605k(Context context, C76092h hVar, C79607m mVar, C81013d dVar, Optional optional, C91142g gVar) {
        this.f218399f = hVar;
        this.f218398e = context;
        this.f218400g = mVar;
        this.f218401h = dVar;
        this.f218402i = optional;
        this.f218403j = gVar;
    }

    /* renamed from: c */
    public static String m127660c(String str) {
        return "embedded_config_" + str + ".pb";
    }

    /* renamed from: e */
    static final Optional m127661e(C79569ab abVar, byte[] bArr) {
        C79577i iVar = (C79577i) abVar.toBuilder();
        C79568aa aaVar = ((C79569ab) iVar.instance).f218321d;
        if (aaVar == null) {
            aaVar = C79568aa.f218309f;
        }
        C79594z zVar = (C79594z) aaVar.toBuilder();
        C63088z A = C63088z.m96139A(bArr);
        zVar.copyOnWrite();
        C79568aa aaVar2 = (C79568aa) zVar.instance;
        aaVar2.f218311a |= 4;
        aaVar2.f218314d = A;
        iVar.copyOnWrite();
        C79569ab abVar2 = (C79569ab) iVar.instance;
        C79568aa aaVar3 = (C79568aa) zVar.build();
        aaVar3.getClass();
        abVar2.f218321d = aaVar3;
        abVar2.f218318a |= 4;
        return Optional.m71637of((C79569ab) iVar.build());
    }

    /* renamed from: f */
    private final Optional m127662f() {
        Optional optional;
        Optional optional2;
        InputStream openRawResource;
        Locale e = this.f218399f.mo72021b().mo72039e();
        String c = m127660c(e.getLanguage());
        String language = e.getLanguage();
        if (!this.f218403j.mo85405j(C90126fx.f251781pl) || !this.f218403j.mo85405j(C90126fx.f251779pj)) {
            C58495hd hdVar = f218394a;
            Optional ofNullable = Optional.ofNullable((Integer) hdVar.get(language));
            if (ofNullable.isPresent()) {
                optional = ofNullable;
            } else {
                optional = Optional.ofNullable((Integer) hdVar.get(e.toLanguageTag()));
            }
        } else {
            ((C58970a) ((C58970a) f218397d.mo56225c()).mo56372aa(5682)).mo56386p("#MWW Using dev resources");
            C58495hd hdVar2 = f218395b;
            if (!hdVar2.containsKey(language)) {
                optional = Optional.empty();
            } else {
                int identifier = this.f218398e.getResources().getIdentifier((String) hdVar2.get(language), "raw", this.f218398e.getPackageName());
                if (identifier == 0) {
                    optional = Optional.empty();
                } else {
                    optional = Optional.m71637of(Integer.valueOf(identifier));
                }
            }
        }
        this.f218401h.mo74786b(c, optional.isPresent());
        if (optional.isEmpty()) {
            ((C58970a) ((C58970a) f218397d.mo56225c()).mo56372aa(5689)).mo56389s("#MWW Missing resource id for resource: %s", c);
            return Optional.empty();
        }
        Optional flatMap = optional.flatMap(new C79599e(this, c));
        if (flatMap.isPresent() && this.f218403j.mo85405j(C90126fx.f251781pl) && this.f218403j.mo85405j(C90126fx.f251787pr)) {
            int identifier2 = this.f218398e.getResources().getIdentifier("hotword", "raw", this.f218398e.getPackageName());
            if (identifier2 == 0) {
                optional2 = Optional.empty();
            } else {
                try {
                    openRawResource = this.f218398e.getResources().openRawResource(identifier2);
                    Optional of = Optional.m71637of(C71989i.m105288c(openRawResource));
                    if (openRawResource != null) {
                        openRawResource.close();
                    }
                    optional2 = of;
                } catch (IOException e2) {
                    ((C58970a) ((C58970a) ((C58970a) f218397d.mo56225c()).mo56382g(e2)).mo56372aa(5681)).mo56386p("#MWW Failed to load MWW hotword.data resource");
                    optional2 = Optional.empty();
                } catch (Throwable th) {
                    C79598d.m127659a(th, th);
                }
            }
            if (optional2.isPresent()) {
                flatMap = m127661e((C79569ab) flatMap.get(), (byte[]) optional2.get());
            }
        }
        this.f218401h.mo74785a(c, flatMap.isPresent());
        return flatMap;
        throw th;
    }

    /* renamed from: a */
    public final Optional mo74149a() {
        if (this.f218403j.mo85405j(C90126fx.f251781pl)) {
            return m127662f();
        }
        Optional a = this.f218400g.mo74151a(C79606l.CONFIG_FILE, new C42789m(C79569ab.f218316f.getParserForType()));
        if (this.f218403j.mo85405j(C90126fx.f251788ps) && a.isPresent() && this.f218400g.mo74152l(C79606l.HOTWORD_DATA)) {
            Optional a2 = this.f218400g.mo74151a(C79606l.HOTWORD_DATA, new C42787k());
            if (a2.isPresent()) {
                a = m127661e((C79569ab) a.get(), (byte[]) a2.get());
            } else {
                ((C58970a) ((C58970a) f218397d.mo56226d()).mo56372aa(5685)).mo56386p("#MWW failed to load hotword model.");
            }
        }
        if (a.isPresent()) {
            return a;
        }
        ((C58970a) ((C58970a) f218397d.mo56226d()).mo56372aa(5684)).mo56386p("#MWW MDD config unavailable, reading embedded config as fallback.");
        return m127662f();
    }

    /* renamed from: b */
    public final Optional mo74150b(int i, String str) {
        InputStream openRawResource;
        try {
            openRawResource = this.f218398e.getResources().openRawResource(i);
            Optional of = Optional.m71637of((C79569ab) C62942bv.parseFrom((C62942bv) C79569ab.f218316f, openRawResource, C62921ba.m95368a()));
            if (openRawResource != null) {
                openRawResource.close();
            }
            return of;
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) f218397d.mo56225c()).mo56382g(e)).mo56372aa(5687)).mo56389s("#MWW Failed to open resource: %s", str);
            return Optional.empty();
        } catch (Throwable th) {
            C79598d.m127659a(th, th);
        }
        throw th;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MWW embedded resources validity");
        C59364ae.m92266l(f218394a).mo56897g(new C79602h(this, fVar));
        if (((Boolean) this.f218402i.map(C79603i.f218392a).orElse(false)).booleanValue()) {
            mo74149a().ifPresent(new C79604j(fVar));
        }
        C91005e b = fVar.mo85278b("MWW Embedded config settings");
        boolean j = this.f218403j.mo85405j(C90126fx.f251781pl);
        boolean j2 = this.f218403j.mo85405j(C90126fx.f251779pj);
        b.mo85276a(C90752i.m148229c("force embedded config: " + j + ", use dev config: " + j2));
    }
}
