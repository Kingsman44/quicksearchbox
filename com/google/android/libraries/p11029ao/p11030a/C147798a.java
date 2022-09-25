package com.google.android.libraries.p11029ao.p11030a;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.ao.a.a */
/* compiled from: PG */
public final class C147798a {

    /* renamed from: a */
    public static final ClipData f398772a = ClipData.newIntent(BuildConfig.FLAVOR, new Intent());

    /* renamed from: a */
    public static PendingIntent m240895a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2 | 67108864);
    }

    /* renamed from: b */
    public static Intent m240896b(Intent intent, int i, int i2) {
        boolean z = false;
        C58838bb.m90869d((i & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        if (intent.getComponent() != null) {
            z = true;
        }
        C58838bb.m90869d(z, "Must set component on Intent.");
        if (m240898d(i2, 1)) {
            C58838bb.m90869d(!m240898d(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            C58838bb.m90869d(m240898d(i, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!m240898d(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m240898d(i2, 3) && intent2.getAction() == null) {
                intent2.setAction(BuildConfig.FLAVOR);
            }
            if (!m240898d(i2, 9) && intent2.getCategories() == null) {
                intent2.addCategory(BuildConfig.FLAVOR);
            }
            if (!m240898d(i2, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m240898d(i2, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f398772a);
            }
        }
        return intent2;
    }

    /* renamed from: c */
    public static PendingIntent m240897c(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getService(context, i, m240896b(intent, i2, 0), i2);
    }

    /* renamed from: d */
    private static boolean m240898d(int i, int i2) {
        return (i & i2) == i2;
    }
}
