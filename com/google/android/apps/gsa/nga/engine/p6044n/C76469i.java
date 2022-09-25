package com.google.android.apps.gsa.nga.engine.p6044n;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7183s.C91088a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.i */
/* compiled from: PG */
public final class C76469i {

    /* renamed from: a */
    private static final C58974d f211639a = C58974d.m91136j();

    /* renamed from: b */
    private final Context f211640b;

    /* renamed from: c */
    private final C91088a f211641c;

    public C76469i(Context context, C91088a aVar) {
        this.f211640b = context;
        this.f211641c = aVar;
    }

    /* renamed from: a */
    public final Optional mo72198a(String str, String str2, String str3, boolean z, boolean z2) {
        return mo72199b(new Intent("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS").setPackage(str).setType("text/plain").putExtra("android.intent.extra.TEXT", str3).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_NAME", str2).putExtra("EXPECT_EXTERNAL_CONFIRMATION", z).putExtra("EXPECT_EXTERNAL_APP_UI", z2).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID", str2).putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com"));
    }

    /* renamed from: b */
    public final Optional mo72199b(Intent intent) {
        if (this.f211641c.mo85355d(this.f211640b, intent)) {
            return Optional.m71637of(intent);
        }
        ((C58970a) ((C58970a) f211639a.mo56225c()).mo56372aa(3464)).mo56389s("Unable to sign intent with package %s", intent.getPackage());
        return Optional.empty();
    }
}
