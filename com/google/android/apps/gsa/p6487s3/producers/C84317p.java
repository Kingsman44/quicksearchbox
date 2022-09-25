package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89956x;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.s3.producers.p */
/* compiled from: PG */
final class C84317p implements C60845bz {

    /* renamed from: a */
    private final C89956x f229462a;

    /* renamed from: b */
    private final C68214a f229463b;

    public C84317p(C89956x xVar, C68214a aVar) {
        this.f229462a = xVar;
        this.f229463b = aVar;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 258;
        C89949q.m146519c(tzVar, xVar);
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if ((th instanceof CancellationException) || (th instanceof InterruptedException)) {
            C59104x d = C84320s.f229469b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S3ReqUpHdlr");
            ((C59052c) ((C59052c) d).mo56372aa(7240)).mo56387q("Future for event cancelled: %d", 259);
        } else {
            C89886e b = ((C89911f) this.f229463b.mo27525b()).mo83756b(new C90452a(211, C89885b.S3REQUEST_BUILD_PINHOLE_UPDATE_LAST_LOCATION_FAILED_VALUE));
            b.f246284e = this.f229462a;
            b.mo83721a();
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 259;
        C89949q.m146519c(tzVar, this.f229462a);
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 259;
        C89949q.m146519c(tzVar, this.f229462a);
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
