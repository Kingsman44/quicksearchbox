package com.google.android.libraries.search.assistant.performer.communication;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.common.base.C58890d;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.aj */
/* compiled from: PG */
final class C35517aj {
    /* renamed from: a */
    static C63088z m63878a(String str) {
        String trim = str.trim();
        if (C59326i.f157516d.mo56829i(trim)) {
            return C63088z.m96139A(Base64.decode(trim, 0));
        }
        throw new IllegalArgumentException("decodeRegistrationId: invalid base64 string %s[" + trim + "]");
    }

    /* renamed from: b */
    static boolean m63879b(C51098gh ghVar) {
        C51058ev evVar;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        return C58890d.m90990e("com.google.android.apps.tachyon", evVar.f132944b);
    }

    /* renamed from: c */
    static boolean m63880c(C51098gh ghVar) {
        C51058ev evVar;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        return C58890d.m90990e("com.whatsapp", evVar.f132944b);
    }

    /* renamed from: d */
    static boolean m63881d(PackageManager packageManager, C51098gh ghVar) {
        C51058ev evVar;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (!C58890d.m90990e(evVar.f132944b, "com.google.android.apps.tachyon") || packageManager.getPackageInfo("com.google.android.apps.tachyon", 0).versionCode >= 2983276) {
            return false;
        }
        return true;
    }
}
