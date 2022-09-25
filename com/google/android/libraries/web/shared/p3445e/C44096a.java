package com.google.android.libraries.web.shared.p3445e;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.shared.C44076a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.web.shared.e.a */
/* compiled from: PG */
public final class C44096a {

    /* renamed from: a */
    private static final C59071e f114779a = C59071e.m91332i("com.google.android.libraries.web.shared.e.a");

    /* renamed from: a */
    public final Intent mo47065a(C43376u uVar) {
        String str = uVar.f113329b;
        if (str.isEmpty()) {
            C43367l lVar = uVar.f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            str = lVar.f113296b;
        }
        if (!str.isEmpty()) {
            return mo47066b(Uri.parse(str), uVar.f113334g);
        }
        ((C59052c) ((C59052c) f114779a.mo56226d()).mo56372aa(54166)).mo56386p("Cannot share an empty URL.");
        throw new IllegalStateException("Cannot share an empty URL.");
    }

    /* renamed from: b */
    public final Intent mo47066b(Uri uri, String str) {
        Uri b = C44076a.m77819b(uri);
        return Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", str.isEmpty() ? b.toString() : str).putExtra("android.intent.extra.TEXT", str.isEmpty() ? b.toString() : String.format("\"%s\" %s", new Object[]{str, b})), (CharSequence) null);
    }
}
