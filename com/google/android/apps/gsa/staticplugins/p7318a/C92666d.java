package com.google.android.apps.gsa.staticplugins.p7318a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6686d.C85273a;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86786a;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4500cm.p4518d.C58189f;
import com.google.p4500cm.p4518d.C58190g;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.a.d */
/* compiled from: PG */
public final class C92666d extends C86734a implements C85273a {

    /* renamed from: c */
    private static final C59071e f258666c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.a.d");

    /* renamed from: a */
    protected final C89932c f258667a = C89932c.f246391b;

    /* renamed from: b */
    public final C86786a f258668b;

    /* renamed from: f */
    private final C90931ca f258669f;

    /* renamed from: g */
    private final C22871g f258670g;

    /* renamed from: h */
    private final C21370a f258671h;

    /* renamed from: i */
    private final C85929cw f258672i;

    /* renamed from: j */
    private final C68214a f258673j;

    /* renamed from: k */
    private final C86338r f258674k;

    /* renamed from: l */
    private final C68214a f258675l;

    /* renamed from: m */
    private final Context f258676m;

    /* renamed from: n */
    private final C87242k f258677n;

    /* renamed from: o */
    private final C84466a f258678o;

    public C92666d(C90931ca caVar, C22871g gVar, C21370a aVar, C85929cw cwVar, C68214a aVar2, C86338r rVar, C68214a aVar3, Context context, C84466a aVar4, C87242k kVar, C86786a aVar5) {
        super(C118575h.WORKER_ACTION_VE_LOGGING, "actionvelogging");
        this.f258669f = caVar;
        this.f258670g = gVar;
        this.f258671h = aVar;
        this.f258672i = cwVar;
        this.f258673j = aVar2;
        this.f258674k = rVar;
        this.f258675l = aVar3;
        this.f258676m = context;
        this.f258678o = aVar4;
        this.f258677n = kVar;
        this.f258668b = aVar5;
    }

    /* renamed from: a */
    public final C60870cx mo78835a(C58189f fVar) {
        return this.f258669f.mo85138c(new C92665c(this, fVar));
    }

    /* renamed from: b */
    public final void mo78836b(long j) {
        boolean z;
        if (((C85664bo) this.f258673j.mo27525b()).mo79197l(C85662bm.WEB_HISTORY)) {
            z = true;
        } else {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 537;
            String b = C39191a.m68623b(j);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            z = false;
        }
        C89932c cVar = this.f258667a;
        boolean z2 = cVar.f246397g;
        cVar.f246397g = z;
    }

    /* renamed from: c */
    public final void mo78837c(C58189f fVar) {
        this.f258670g.mo28212l("requestLogging", new C92664b(this, fVar));
    }

    /* renamed from: d */
    public final void mo78838d() {
        this.f258670g.mo28212l("resetNumberOfFailures", new C92663a(this));
    }

    /* renamed from: e */
    public final boolean mo87434e(C58189f fVar) {
        long micros = TimeUnit.MILLISECONDS.toMicros(this.f258671h.mo26870b());
        fVar.copyOnWrite();
        C58190g gVar = (C58190g) fVar.instance;
        C58190g gVar2 = C58190g.f155597d;
        gVar.f155599a |= 1;
        gVar.f155600b = micros;
        C58190g gVar3 = (C58190g) fVar.build();
        UriRequest k = this.f258672i.mo79571k(gVar3);
        Uri uri = k.f236331a;
        if (uri.toString().length() > 1536) {
            ((C89911f) this.f258675l.mo27525b()).mo83755a((Throwable) null, 17935266, 29).mo83721a();
            ((C59052c) ((C59052c) f258666c.mo56225c()).mo56372aa(13777)).mo56386p("URL is too long, skip uploading");
            return true;
        }
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri.toString());
            c.mo82991c(k.mo81502a());
            c.f241245k = 5;
            c.f241244j = true;
            ((C89057m) C90877ak.m148472f(this.f258677n.mo80852a(mo80351ic(this.f258678o, "ActionVeLogging", C118575h.GRAPH_ACTION_VE_LOGGING), C89066v.f241382a, new C89018ap(c.mo82989a(), C89009ag.f241207b)))).mo83036f();
            String string = this.f258674k.getString("actions_ve_logging_dump_uri", (String) null);
            if (!TextUtils.isEmpty(string)) {
                byte[] byteArray = gVar3.toByteArray();
                try {
                    OutputStream openOutputStream = this.f258676m.getContentResolver().openOutputStream(Uri.parse(string), "wa");
                    openOutputStream.write(ByteBuffer.allocate(4).putInt(byteArray.length).array());
                    openOutputStream.write(byteArray);
                    openOutputStream.close();
                } catch (FileNotFoundException e) {
                    ((C59052c) ((C59052c) ((C59052c) f258666c.mo56225c()).mo56382g(e)).mo56372aa(13769)).mo56389s("Content URI is not found: %s", string);
                } catch (IOException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f258666c.mo56225c()).mo56382g(e2)).mo56372aa(13770)).mo56389s("Could not write actions VE logging to %s", string);
                }
            }
            return true;
        } catch (C89013ak | C90457d | InterruptedException e3) {
            C89949q.m146523g(285);
            ((C59052c) ((C59052c) ((C59052c) f258666c.mo56225c()).mo56382g(e3)).mo56372aa(13774)).mo56386p("Could not upload actions VE logging");
            return false;
        } catch (MalformedURLException | ExecutionException e4) {
            C89949q.m146523g(285);
            ((C59052c) ((C59052c) ((C59052c) f258666c.mo56226d()).mo56382g(e4)).mo56372aa(13775)).mo56386p("Could not upload actions VE logging");
            int i = C90755l.f253831a;
            return false;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
