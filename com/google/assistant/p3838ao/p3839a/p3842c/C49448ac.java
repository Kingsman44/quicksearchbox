package com.google.assistant.p3838ao.p3839a.p3842c;

import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49539aw;
import com.google.assistant.p3838ao.p3839a.p3845e.C49542az;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.assistant.ao.a.c.ac */
/* compiled from: PG */
public final class C49448ac implements C49477be {
    /* renamed from: a */
    public final C58485gu mo53269a() {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C58485gu mo53270b(C49692r rVar) {
        String t = rVar.mo53333t(R.string.nga_suggestion_chip_lock_screen_open_maps, new Object[0]);
        C49539aw awVar = (C49539aw) C49542az.f127827e.createBuilder();
        String uri = new Intent("android.intent.action.VIEW").toUri(0);
        awVar.copyOnWrite();
        C49542az azVar = (C49542az) awVar.instance;
        uri.getClass();
        azVar.f127829a |= 2;
        azVar.f127831c = uri;
        return C58485gu.m89846n(C49681l.m85668a(t, (C49542az) awVar.build(), 1.0d));
    }
}
