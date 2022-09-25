package com.google.android.apps.search.googleapp.stampviewer.p10497i;

import android.content.Intent;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.c */
/* compiled from: PG */
public final class C139424c {
    /* renamed from: a */
    public static Intent m226558a(String str, String str2) {
        C58838bb.m90869d(!str.isEmpty(), "Cannot share an empty URL.");
        if (true == str2.isEmpty()) {
            str2 = str;
        }
        return Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", str2).putExtra("android.intent.extra.TEXT", str), (CharSequence) null).setFlags(603979776);
    }
}
