package com.google.assistant.p3838ao.p3839a.p3842c;

import android.content.Intent;
import android.net.Uri;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.assistant.ao.a.c.x */
/* compiled from: PG */
public final class C49500x implements C49477be {

    /* renamed from: a */
    private static final Uri f127718a = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.photos");

    /* renamed from: a */
    public final C58485gu mo53269a() {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C58485gu mo53270b(C49692r rVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(f127718a);
        return C58485gu.m89846n(C49681l.m85672e(intent.toUri(0), rVar.mo53333t(R.string.nga_suggestion_chip_open_google_photos_in_play_store, new Object[0])));
    }
}
