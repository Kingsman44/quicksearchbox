package com.google.android.apps.gsa.searchbox.shared;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.util.C91041i;
import com.google.android.apps.gsa.shared.util.p7157a.C90716a;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.shared.b */
/* compiled from: PG */
public final class C88690b {

    /* renamed from: a */
    public static final C59071e f239803a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.shared.b");

    /* renamed from: b */
    private final Context f239804b;

    public C88690b(Context context) {
        this.f239804b = context;
    }

    /* renamed from: b */
    public static Intent m143521b(String str, String str2, String str3, String str4, String str5, String str6) {
        Intent intent = new Intent(str2);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        if (str != null) {
            intent.putExtra("user_query", str);
            intent.putExtra("query", str);
        }
        if (str3 != null) {
            intent.setData(Uri.parse(str3));
        }
        if (str4 != null) {
            intent.putExtra("intent_extra_data_key", str4);
        }
        if (str5 != null) {
            intent.setPackage(str5);
            if (str6 != null) {
                intent.setComponent(new ComponentName(str5, str6));
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        return intent;
    }

    /* renamed from: c */
    public static void m143522c(Intent intent) {
        intent.putExtra("com.google.chrome.transition_type", 1);
    }

    /* renamed from: d */
    public static void m143523d(Intent intent, String str) {
        if (C91041i.m148716a(str)) {
            intent.setPackage(str);
        } else {
            intent.setPackage((String) null);
        }
    }

    /* renamed from: a */
    public final Intent mo82391a(Suggestion suggestion, String str) {
        String i = C89235z.m145137i(suggestion);
        Uri uri = null;
        if (TextUtils.isEmpty(i)) {
            C59104x c = f239803a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.s.IntentUtils");
            ((C59052c) ((C59052c) c).mo56372aa(9975)).mo56386p("Empty appUrl provided");
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            uri = Uri.parse(str);
        }
        Intent b = C90716a.m148157b(Uri.parse(i), uri, this.f239804b);
        return (b != null || uri == null) ? b : m143521b(suggestion.mo44269v(), "android.intent.action.VIEW", str, (String) null, (String) null, (String) null);
    }
}
