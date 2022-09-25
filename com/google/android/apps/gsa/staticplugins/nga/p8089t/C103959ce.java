package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.os.Build;
import com.google.common.base.C58881cr;
import com.google.common.p4537i.C59294s;
import java.util.Locale;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ce */
/* compiled from: PG */
public final /* synthetic */ class C103959ce implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ C103959ce f289332a = new C103959ce();

    private /* synthetic */ C103959ce() {
    }

    /* renamed from: a */
    public final Object mo6453a() {
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ROOT);
        String lowerCase2 = Build.DEVICE.toLowerCase(Locale.ROOT);
        return Long.valueOf(Long.reverseBytes(C59294s.m92135e().mo56759a("l6RFaYShT4Nts05EEDffKauUGpaV5sno|" + lowerCase + "|" + lowerCase2, StandardCharsets.UTF_8).mo56773c()));
    }
}
