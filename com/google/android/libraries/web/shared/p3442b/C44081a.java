package com.google.android.libraries.web.shared.p3442b;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.shared.C44076a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.web.shared.b.a */
/* compiled from: PG */
public final class C44081a {

    /* renamed from: a */
    private static final C59071e f114752a = C59071e.m91332i("com.google.android.libraries.web.shared.b.a");

    /* renamed from: b */
    private final Context f114753b;

    /* renamed from: c */
    private final ClipboardManager f114754c;

    public C44081a(Fragment fragment, ClipboardManager clipboardManager) {
        this.f114753b = fragment.requireContext();
        this.f114754c = clipboardManager;
    }

    /* renamed from: a */
    public final void mo47047a(C43376u uVar) {
        String str = uVar.f113329b;
        if (str.isEmpty()) {
            ((C59052c) ((C59052c) f114752a.mo56226d()).mo56372aa(54165)).mo56386p("Cannot copy an empty URL.");
        } else {
            mo47048b(str);
        }
    }

    /* renamed from: b */
    public final void mo47048b(String str) {
        this.f114754c.setPrimaryClip(ClipData.newPlainText("url", C44076a.m77822e(str)));
        Toast.makeText(this.f114753b, R.string.webx_url_copied_to_clipboard, 0).show();
    }
}
