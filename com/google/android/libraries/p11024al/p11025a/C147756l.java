package com.google.android.libraries.p11024al.p11025a;

import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.Random;

/* renamed from: com.google.android.libraries.al.a.l */
/* compiled from: PG */
public final class C147756l {

    /* renamed from: a */
    private static final Random f398700a = new Random();

    /* renamed from: a */
    public static TaskId m240819a(String str) {
        return new TaskIdEntity(str, (String) null);
    }

    /* renamed from: b */
    public static String m240820b() {
        long abs = Math.abs(f398700a.nextLong());
        return "a" + abs;
    }

    /* renamed from: c */
    public static final String m240821c(String str) {
        return String.valueOf(str).concat("/master");
    }
}
