package com.google.android.libraries.lens.view.p2056af;

import android.content.res.Configuration;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59874aj;
import com.google.common.p4552o.p4563i.C59876al;
import com.google.common.p4552o.p4563i.C59898bg;

/* renamed from: com.google.android.libraries.lens.view.af.a */
/* compiled from: PG */
public final class C25028a {
    /* renamed from: a */
    public static C59898bg m46316a(Configuration configuration) {
        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
        C59874aj ajVar = (C59874aj) C59876al.f161807c.createBuilder();
        int i = configuration.orientation;
        int i2 = 2;
        if (i != 1) {
            i2 = i != 2 ? 1 : 3;
        }
        ajVar.copyOnWrite();
        C59876al alVar = (C59876al) ajVar.instance;
        alVar.f161810b = i2 - 1;
        alVar.f161809a |= 1;
        C59876al alVar2 = (C59876al) ajVar.build();
        afVar.copyOnWrite();
        C59898bg bgVar = (C59898bg) afVar.instance;
        alVar2.getClass();
        bgVar.f161887s = alVar2;
        bgVar.f161869a |= C89885b.S3REQUEST_VALUE;
        return (C59898bg) afVar.build();
    }
}
