package com.google.android.libraries.lens.view.p2151m;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.p059a.C0955c;
import com.google.android.libraries.lens.view.imageviewer.C26956s;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59871ag;
import com.google.common.p4552o.p4563i.C59873ai;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.m.e */
/* compiled from: PG */
final class C27278e extends C0955c {

    /* renamed from: a */
    final /* synthetic */ C27280g f74603a;

    public C27278e(C27280g gVar) {
        this.f74603a = gVar;
    }

    /* renamed from: b */
    public final void mo3572b(int i, Bundle bundle) {
        int i2 = 5;
        if (i == 2) {
            this.f74603a.f74610c.mo19974a(C37194a.f98521be.mo40815i(C62722b.OK));
            C27280g gVar = this.f74603a;
            C62722b bVar = C62722b.OK;
            C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
            C59871ag agVar = (C59871ag) C59873ai.f161802c.createBuilder();
            C27280g gVar2 = this.f74603a;
            Uri uri = gVar2.f74613f;
            if (uri == null) {
                i2 = 1;
            } else if (C26956s.m49938a(uri)) {
                i2 = 2;
            } else {
                Uri a = gVar2.f74611d.mo33498a();
                if (TextUtils.isEmpty(uri.getQueryParameter("tbs")) || !TextUtils.equals(a.getAuthority(), uri.getAuthority()) || !TextUtils.equals(a.getPath(), uri.getPath())) {
                    i2 = gVar2.f74611d.mo33500e(uri) ? 3 : 4;
                }
            }
            agVar.copyOnWrite();
            C59873ai aiVar = (C59873ai) agVar.instance;
            aiVar.f161805b = i2 - 1;
            aiVar.f161804a |= 1;
            C59873ai aiVar2 = (C59873ai) agVar.build();
            afVar.copyOnWrite();
            C59898bg bgVar = (C59898bg) afVar.instance;
            aiVar2.getClass();
            bgVar.f161884p = aiVar2;
            bgVar.f161869a |= 16384;
            gVar.mo32809a(bVar, (C59898bg) afVar.build());
        } else if (i == 3) {
            this.f74603a.f74610c.mo19974a(C37194a.f98521be.mo40815i(C62722b.UNAVAILABLE));
            this.f74603a.mo32809a(C62722b.UNAVAILABLE, (C59898bg) null);
        } else if (i == 4) {
            this.f74603a.f74610c.mo19974a(C37194a.f98521be.mo40815i(C62722b.CANCELLED));
            this.f74603a.mo32809a(C62722b.CANCELLED, (C59898bg) null);
        } else if (i == 5) {
            this.f74603a.f74610c.mo19974a(C37194a.f98520bd);
        } else if (i == 6) {
            this.f74603a.f74610c.mo19974a(C37194a.f98522bf.mo40805c(C62722b.OK));
            this.f74603a.mo32809a(C62722b.CANCELLED, (C59898bg) null);
        }
    }
}
