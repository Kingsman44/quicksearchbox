package org.chromium.weblayer;

import android.webkit.ValueCallback;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37645gx;
import com.google.android.libraries.web.weblayer.contrib.microphone.internal.C44215c;
import com.google.android.libraries.web.weblayer.contrib.microphone.internal.C44216d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import org.chromium.p5643b.p5644a.C72307ac;
import org.chromium.p5643b.p5644a.C72317am;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.p5643b.p5644a.C72343bl;

/* renamed from: org.chromium.weblayer.af */
/* compiled from: PG */
public final class C72570af extends C72307ac {

    /* renamed from: a */
    private final C72569ae f193100a;

    public C72570af(C72569ae aeVar) {
        this.f193100a = aeVar;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.libraries.search.c.b.a, org.chromium.weblayer.ae] */
    /* renamed from: a */
    public final void mo63697a(boolean z, C72317am amVar) {
        C72343bl.m106991a();
        ValueCallback valueCallback = (ValueCallback) C72341bj.m106988a(amVar, ValueCallback.class);
        ? r0 = this.f193100a;
        if (!z) {
            valueCallback.onReceiveValue(true);
            return;
        }
        C44216d dVar = r0;
        C60870cx a = dVar.f115001d.f115003b.mo41160a(C37645gx.f100013a, r0);
        C44215c cVar = new C44215c(valueCallback);
        C60856cj.m92911t(a, C47810es.m84974n(cVar), dVar.f115001d.f115004c);
    }

    /* renamed from: b */
    public final void mo63698b(boolean z) {
        C72343bl.m106991a();
        C72569ae aeVar = this.f193100a;
        if (!z) {
            C44216d dVar = (C44216d) aeVar;
            if (dVar.f115000c) {
                C2164c cVar = dVar.f114999b;
                if (cVar != null) {
                    C58893dc.m90996a(cVar);
                    C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
                    C37516dw dwVar = C37516dw.CLOSED;
                    dtVar.copyOnWrite();
                    C37514du duVar = (C37514du) dtVar.instance;
                    duVar.f99632b = Integer.valueOf(dwVar.f99638d);
                    duVar.f99631a = 1;
                    cVar.mo5437b((C37514du) dtVar.build());
                    dVar.f114999b = null;
                } else {
                    dVar.f115001d.f115003b.mo41161b();
                }
            }
        }
        ((C44216d) aeVar).f115000c = z;
    }
}
