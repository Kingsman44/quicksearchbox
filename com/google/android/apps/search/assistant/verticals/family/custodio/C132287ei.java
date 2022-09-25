package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.contrib.p3629c.C46485f;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ei */
/* compiled from: PG */
public final class C132287ei {

    /* renamed from: a */
    public final GenericCustodioDialogFragment f361070a;

    /* renamed from: b */
    public final Bundle f361071b;

    /* renamed from: c */
    public final C37215b f361072c;

    /* renamed from: d */
    private final Activity f361073d;

    /* renamed from: e */
    private final Bundle f361074e;

    /* renamed from: f */
    private final C46485f f361075f;

    public C132287ei(Activity activity, GenericCustodioDialogFragment genericCustodioDialogFragment, C46485f fVar, C37215b bVar) {
        this.f361073d = activity;
        this.f361070a = genericCustodioDialogFragment;
        Bundle arguments = genericCustodioDialogFragment.getArguments();
        arguments = arguments == null ? new Bundle() : arguments;
        this.f361074e = arguments;
        Bundle bundle = arguments.getBundle("dialog_data_key");
        this.f361071b = bundle == null ? new Bundle() : bundle;
        this.f361075f = fVar;
        this.f361072c = bVar;
    }

    /* renamed from: a */
    public static Bundle m214954a(String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title_text_key", str);
        bundle.putString("dialog_body_text_key", str2);
        bundle.putString("dialog_primary_button_text_key", str3);
        bundle.putString("dialog_primary_button_action_key", str4);
        if (str5 != null) {
            bundle.putString("dialog_secondary_button_text_key", str5);
            bundle.putString("dialog_secondary_button_action_key", str6);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("dialog_data_key", bundle);
        return bundle2;
    }

    /* renamed from: b */
    public final String mo110589b(String str) {
        String string = this.f361071b.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Custodio dialog missing required argument: ".concat(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110590c(java.lang.String r7) {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f361074e
            android.os.Bundle r0 = r0.deepCopy()
            java.lang.String r1 = "dialog_data_key"
            r0.remove(r1)
            int r1 = r7.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1707428558: goto L_0x003f;
                case -1441760335: goto L_0x0035;
                case -597316803: goto L_0x002b;
                case 49109561: goto L_0x0021;
                case 452081094: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0049
        L_0x0017:
            java.lang.String r1 = "action_dismiss_dialog"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 0
            goto L_0x004a
        L_0x0021:
            java.lang.String r1 = "action_navigate_to_voice_match_deeplinking_fragment"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 2
            goto L_0x004a
        L_0x002b:
            java.lang.String r1 = "action_perform_url_deeplink_and_finish"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 4
            goto L_0x004a
        L_0x0035:
            java.lang.String r1 = "action_navigate_to_selector_fragment"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 3
            goto L_0x004a
        L_0x003f:
            java.lang.String r1 = "action_finish_activity"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = -1
        L_0x004a:
            if (r1 == 0) goto L_0x00b0
            if (r1 == r5) goto L_0x00aa
            if (r1 == r4) goto L_0x009b
            if (r1 == r3) goto L_0x008c
            if (r1 != r2) goto L_0x0080
            android.os.Bundle r7 = r6.f361071b
            java.lang.String r0 = "param_perform_url_deeplink_url_key"
            java.lang.String r7 = r7.getString(r0)
            if (r7 == 0) goto L_0x0078
            com.google.android.apps.search.assistant.verticals.family.custodio.GenericCustodioDialogFragment r0 = r6.f361070a
            android.content.Context r0 = r0.requireContext()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r7 = android.net.Uri.parse(r7)
            r1.<init>(r2, r7)
            com.google.apps.tiktok.tracing.C47810es.m84979s(r0, r1)
            android.app.Activity r7 = r6.f361073d
            r7.finish()
            return
        L_0x0078:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "No URL provided for dialog with URL button action!"
            r7.<init>(r0)
            throw r7
        L_0x0080:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Custodio dialog action unrecognized: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x008c:
            com.google.apps.tiktok.contrib.c.f r7 = r6.f361075f
            com.google.android.apps.search.assistant.verticals.family.custodio.GenericCustodioDialogFragment r1 = r6.f361070a
            com.google.apps.tiktok.contrib.c.q r7 = r7.mo50482c(r1)
            r1 = 2131428223(0x7f0b037f, float:1.8478084E38)
            r7.mo50508d(r1, r0)
            return
        L_0x009b:
            com.google.apps.tiktok.contrib.c.f r7 = r6.f361075f
            com.google.android.apps.search.assistant.verticals.family.custodio.GenericCustodioDialogFragment r1 = r6.f361070a
            com.google.apps.tiktok.contrib.c.q r7 = r7.mo50482c(r1)
            r1 = 2131428224(0x7f0b0380, float:1.8478086E38)
            r7.mo50508d(r1, r0)
            return
        L_0x00aa:
            android.app.Activity r7 = r6.f361073d
            r7.finish()
            return
        L_0x00b0:
            com.google.apps.tiktok.contrib.c.f r7 = r6.f361075f
            com.google.android.apps.search.assistant.verticals.family.custodio.GenericCustodioDialogFragment r0 = r6.f361070a
            com.google.apps.tiktok.contrib.c.q r7 = r7.mo50482c(r0)
            r7.mo50510f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.family.custodio.C132287ei.mo110590c(java.lang.String):void");
    }

    /* renamed from: d */
    public final boolean mo110591d() {
        return "action_dismiss_dialog".equals(mo110589b("dialog_primary_button_action_key")) || "action_dismiss_dialog".equals(this.f361071b.getString("dialog_secondary_button_action_key"));
    }
}
