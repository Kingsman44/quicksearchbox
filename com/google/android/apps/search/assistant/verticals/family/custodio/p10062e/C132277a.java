package com.google.android.apps.search.assistant.verticals.family.custodio.p10062e;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.libraries.parenttools.youtube.C31109o;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.base.C58838bb;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.e.a */
/* compiled from: PG */
public final class C132277a {

    /* renamed from: a */
    private final Context f361046a;

    /* renamed from: b */
    private final String f361047b;

    public C132277a(Context context, String str) {
        this.f361046a = context;
        this.f361047b = str;
    }

    /* renamed from: a */
    public final void mo110582a(Fragment fragment, Bundle bundle) {
        String str = (String) Objects.requireNonNull(bundle.getString("account_name"));
        String str2 = (String) Objects.requireNonNull(bundle.getString("supervised_oid"));
        Context context = this.f361046a;
        C31109o oVar = C31109o.UNKNOWN;
        String str3 = this.f361047b;
        C58838bb.m90884s(context != null, "Can't create an intent from a null context!");
        C58838bb.m90884s(!TextUtils.isEmpty("HOST_CLIENT_NAME_GOOGLE_ASSISTANT_ANDROID"), "Client name is required");
        C58838bb.m90884s(!TextUtils.isEmpty(str3), "Client version is required");
        C58838bb.m90884s(true ^ TextUtils.isEmpty(str), "Parent account name is required");
        Intent intent = new Intent(context, ParentToolsActivity.class);
        Bundle bundle2 = new Bundle();
        bundle2.putString("client_name", "HOST_CLIENT_NAME_GOOGLE_ASSISTANT_ANDROID");
        bundle2.putString("client_version", str3);
        bundle2.putString("parent_account_name", str);
        bundle2.putBoolean("should_block_system_back_button", false);
        bundle2.putString("tool_bar_title", (String) null);
        bundle2.putSerializable("parent_tools_use_case", oVar);
        bundle2.putBoolean("is_logging_enabled", false);
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("child_obfuscated_gaia_id", str2);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle2.putString("parent_tools_url", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle2.putString("end_url", (String) null);
        }
        intent.putExtras(bundle2);
        C47709i.m84862b(fragment, intent, 0);
    }
}
