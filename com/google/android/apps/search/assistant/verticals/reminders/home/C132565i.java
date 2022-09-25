package com.google.android.apps.search.assistant.verticals.reminders.home;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.home.i */
/* compiled from: PG */
final class C132565i implements C46852f {

    /* renamed from: a */
    final /* synthetic */ boolean f361769a;

    /* renamed from: b */
    final /* synthetic */ C132567k f361770b;

    public C132565i(C132567k kVar, boolean z) {
        this.f361770b = kVar;
        this.f361769a = z;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132567k.f361778f.mo56224b()).mo56382g(th)).mo56372aa(39685)).mo56384n();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        Uri.Builder builder;
        String str5 = (String) obj;
        boolean z = this.f361769a;
        String str6 = BuildConfig.FLAVOR;
        if (z) {
            try {
                this.f361770b.f361780h.getContext().getPackageManager().getPackageInfo(C132567k.f361774b, 0);
                C132567k kVar = this.f361770b;
                Bundle arguments = kVar.f361780h.getArguments();
                if (!(arguments == null || arguments.getString("REMINDER_ID") == null)) {
                    str6 = arguments.getString("REMINDER_ID");
                }
                Uri.Builder buildUpon = Uri.parse(C132567k.f361775c).buildUpon();
                if (!TextUtils.isEmpty(str6)) {
                    buildUpon.appendPath(str6);
                }
                buildUpon.appendQueryParameter("sa", Integer.toString(2));
                Intent data = new Intent("android.intent.action.VIEW").setData(buildUpon.build());
                data.setPackage(C132567k.f361774b);
                Context context = kVar.f361780h.getContext();
                str5.getClass();
                C144354b.m234631a(context, data, AccountData.m234630a(str5));
                C47709i.m84861a(kVar.f361780h, data);
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                if (this.f361770b.f361784l.booleanValue()) {
                    C132567k kVar2 = this.f361770b;
                    if (kVar2.f361780h.getChildFragmentManager().f634a.mo671c("webx_fragment") == null) {
                        C43861g a = C43864j.m77435a(kVar2.f361779g, C132567k.f361776d);
                        C0154a aVar = new C0154a(kVar2.f361780h.getChildFragmentManager());
                        aVar.mo511h(R.id.assistant_webx_container, a, "webx_fragment", 1);
                        aVar.mo509f();
                        return;
                    }
                    return;
                }
            }
        }
        C132567k kVar3 = this.f361770b;
        Boolean bool2 = false;
        Bundle arguments2 = kVar3.f361780h.getArguments();
        if (arguments2 != null) {
            str6 = arguments2.getString("REMINDER_ID");
            String string = arguments2.getString("LANGUAGE_PARAM");
            str3 = arguments2.getString("SOURCE_PARAM");
            str2 = arguments2.getString("EXPECTED_CLIENT_ID");
            bool = Boolean.valueOf(arguments2.getBoolean("OPEN_DIALOG_PARAM"));
            str = arguments2.getString("CONSENT_FLOW_PARAM");
            Boolean valueOf = Boolean.valueOf(arguments2.getBoolean("MOVE_URL"));
            str4 = string;
            bool2 = valueOf;
        } else {
            bool = bool2;
            str4 = str6;
            str3 = str4;
            str2 = str3;
            str = str2;
        }
        if (str6 != null && !TextUtils.isEmpty(str6)) {
            builder = Uri.parse("https://assistant.google.com/reminders/id").buildUpon().appendPath(str6);
        } else if (bool2.booleanValue()) {
            builder = Uri.parse(C132567k.f361773a).buildUpon();
        } else {
            builder = Uri.parse("https://assistant.google.com/reminders/mainview").buildUpon();
        }
        if (str4 != null && !TextUtils.isEmpty(str4)) {
            builder = builder.appendQueryParameter("hl", str4);
        }
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            builder = builder.appendQueryParameter("source", str3);
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            builder = builder.appendQueryParameter("expected_client_id", str2);
        }
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("openDialog", Boolean.toString(bool.booleanValue()));
        if (str != null && !TextUtils.isEmpty(str)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("consentFlowVariant", str);
        }
        if (kVar3.f361780h.getChildFragmentManager().f634a.mo671c("webx_fragment") == null) {
            appendQueryParameter.build();
            C43861g a2 = C43864j.m77435a(kVar3.f361779g, appendQueryParameter.build().toString());
            C0154a aVar2 = new C0154a(kVar3.f361780h.getChildFragmentManager());
            aVar2.mo511h(R.id.assistant_webx_container, a2, "webx_fragment", 1);
            aVar2.mo509f();
        }
    }
}
