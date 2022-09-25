package com.google.assistant.p3838ao.p3839a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ap.b.l;
import com.google.android.apps.gsa.nga.engine.ap.b.m;
import com.google.android.apps.gsa.nga.engine.p5949ap.p5950b.C75005n;
import com.google.assistant.p3838ao.p3839a.p3847g.C49644a;
import com.google.assistant.p3838ao.p3839a.p3848h.C49661p;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4580v.C60950i;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.b */
/* compiled from: PG */
final class C49431b extends C49381a {

    /* renamed from: n */
    private volatile transient Optional f127688n;

    public C49431b(Context context, Optional optional, int i, C49661p pVar, Optional optional2, Optional optional3, C58528ij ijVar, C58528ij ijVar2, l lVar, C75005n nVar, Locale locale, m mVar, C49644a aVar, String str, C60950i iVar) {
        super(context, optional, i, pVar, optional2, optional3, ijVar, ijVar2, lVar, nVar, locale, mVar, aVar, str, iVar);
    }

    /* renamed from: p */
    public final Optional mo53266p() {
        Optional optional;
        if (this.f127688n == null) {
            synchronized (this) {
                if (this.f127688n == null) {
                    if (this.f127645k == 3) {
                        optional = this.f127637c.mo53305c().f128143a.mo53295a();
                    } else {
                        optional = this.f127647m.mo71386a();
                        if (!optional.isPresent()) {
                            optional = this.f127637c.mo53305c().f128143a.mo53295a();
                        }
                    }
                    this.f127688n = optional;
                    if (this.f127688n == null) {
                        throw new NullPointerException("getForegroundAppPackage() cannot return null");
                    }
                }
            }
        }
        return this.f127688n;
    }
}
