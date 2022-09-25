package com.google.android.libraries.privatetelemetry.tqcobalt.p2452e;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.e.c */
/* compiled from: PG */
public abstract class C32020c {

    /* renamed from: a */
    private static final C59071e f86044a = C59071e.m91332i("com.google.android.libraries.privatetelemetry.tqcobalt.e.c");

    /* renamed from: b */
    private static final Duration f86045b = Duration.ofHours(1);

    /* renamed from: a */
    public abstract C32021d mo37783a();

    /* renamed from: b */
    public abstract void mo37784b(boolean z);

    /* renamed from: c */
    public abstract void mo37785c();

    /* renamed from: d */
    public abstract void mo37786d(Duration duration);

    /* renamed from: e */
    public final void mo37795e() {
        char[] charArray = "ac2ec9ea034c103c".toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            C58838bb.m90873h(Character.digit(charArray[i], 16) != -1, "Cobalt: the provided hexApiKey (%s) contains invalid characters", "ac2ec9ea034c103c");
        }
        mo37785c();
    }

    /* renamed from: f */
    public final void mo37796f(Duration duration) {
        Duration duration2 = f86045b;
        if (duration.compareTo(duration2) < 0) {
            ((C59052c) ((C59052c) f86044a.mo56226d()).mo56372aa(50476)).mo56386p("Cobalt: uploading interval is smaller than allowed value of one hour; Changed to one hour");
            duration = duration2;
        }
        mo37786d(duration);
    }
}
