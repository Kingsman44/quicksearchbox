package com.google.android.apps.search.googleapp.search.srp;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.p10415i.C137501c;
import com.google.android.apps.search.googleapp.search.p10415i.C137508j;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.common.p4522b.C58422el;
import com.google.common.p4580v.C60950i;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4309n.C56743b;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.a */
/* compiled from: PG */
public final class C137692a {

    /* renamed from: a */
    private final C136832c f374513a;

    /* renamed from: b */
    private final C137501c f374514b;

    /* renamed from: c */
    private final C60950i f374515c;

    /* renamed from: d */
    private final C43269t f374516d;

    /* renamed from: e */
    private final C46401p f374517e;

    public C137692a(C136832c cVar, C137501c cVar2, C60950i iVar, C43269t tVar, C44077a aVar) {
        this.f374517e = aVar.f114747a.mo50325a("event_id_store", C56743b.f151439c);
        this.f374513a = cVar;
        this.f374514b = cVar2;
        this.f374515c = iVar;
        this.f374516d = tVar;
    }

    /* renamed from: a */
    public final void mo113908a() {
        C46370ah a = this.f374517e.mo50378a(C62912at.f169862a);
        String str = null;
        if (a != null) {
            C56743b bVar = (C56743b) a.f121384a;
            if ((bVar.f151441a & 1) != 0) {
                str = bVar.f151442b;
            }
        }
        C137501c cVar = this.f374514b;
        Uri.Builder appendQueryParameter = this.f374513a.mo113405k().path("gen_204").appendQueryParameter("atyp", "i").appendQueryParameter("ct", "googleapp-backbutton").appendQueryParameter("zx", Long.toString(this.f374515c.mo57444a().toEpochMilli()));
        if (str != null) {
            appendQueryParameter.appendQueryParameter("ei", str);
        }
        ((C137508j) cVar).mo113788a(appendQueryParameter.build().toString(), C58422el.f156033a, 0, this.f374516d.mo46386d()).mo57275g();
    }
}
