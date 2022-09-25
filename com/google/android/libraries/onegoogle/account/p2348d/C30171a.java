package com.google.android.libraries.onegoogle.account.p2348d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.browser.p059a.C0963k;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.common.base.C58838bb;
import com.google.p4017at.p4049f.p4050a.p4051a.p4052a.C53935d;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.libraries.onegoogle.account.d.a */
/* compiled from: PG */
public final class C30171a {

    /* renamed from: a */
    private static final String f81546a = "a";

    private C30171a() {
    }

    /* renamed from: a */
    public static void m56062a(Activity activity, C30158c cVar, Object obj) {
        if (!cVar.mo35558i(obj)) {
            Log.i(f81546a, "openMyAccount called with non-Gaia account");
        } else {
            m56064c(activity, 2, cVar, obj);
        }
    }

    /* renamed from: b */
    public static void m56063b(Activity activity, String str, C53935d dVar) {
        Intent e = m56066e(dVar.f141523b, str);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : Collections.unmodifiableMap(dVar.f141524c).entrySet()) {
            bundle.putString(String.format("extra.screen.%s", new Object[]{entry.getKey()}), (String) entry.getValue());
        }
        e.putExtras(bundle);
        activity.startActivityForResult(e, 51332);
    }

    /* renamed from: c */
    public static void m56064c(Activity activity, int i, C30158c cVar, Object obj) {
        C58838bb.m90868c(cVar.mo35558i(obj));
        C58838bb.m90868c(cVar.mo35558i(obj));
        activity.startActivityForResult(m56066e(i - 1, cVar.mo35553d(obj)), 51332);
    }

    /* renamed from: d */
    public static void m56065d(Activity activity, int i, C30158c cVar, Object obj, String str) {
        if (obj == null || !cVar.mo35558i(obj)) {
            try {
                new C0963k().mo3582a().mo3590a(activity, Uri.parse(str));
            } catch (ActivityNotFoundException e) {
                Log.e(f81546a, String.format("Can't open URL '%s'. This can happen if there is no browser app on the device.", new Object[]{str}), e);
            }
        } else {
            m56064c(activity, i, cVar, obj);
        }
    }

    /* renamed from: e */
    private static Intent m56066e(int i, String str) {
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", i).putExtra("extra.utmSource", "OG");
        putExtra.putExtra("extra.accountName", str);
        return putExtra;
    }
}
