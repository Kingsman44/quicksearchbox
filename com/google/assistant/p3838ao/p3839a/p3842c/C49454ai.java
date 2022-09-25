package com.google.assistant.p3838ao.p3839a.p3842c;

import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.C49693s;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;

/* renamed from: com.google.assistant.ao.a.c.ai */
/* compiled from: PG */
public final class C49454ai {

    /* renamed from: a */
    private static final String f127699a = new Intent("android.intent.action.SHOW_ALARMS").toUri(0);

    /* renamed from: b */
    private static final String f127700b = new Intent("android.intent.action.SHOW_TIMERS").toUri(0);

    /* renamed from: a */
    public static C49693s m85498a(C49692r rVar) {
        return C49681l.m85672e(f127699a, rVar.mo53333t(R.string.nga_suggestion_chip_productivity_show_alarms, new Object[0]));
    }

    /* renamed from: b */
    public static C49693s m85499b(C49692r rVar) {
        return C49681l.m85672e(f127700b, rVar.mo53333t(R.string.nga_suggestion_chip_productivity_show_timers, new Object[0]));
    }
}
