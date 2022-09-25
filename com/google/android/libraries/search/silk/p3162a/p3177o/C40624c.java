package com.google.android.libraries.search.silk.p3162a.p3177o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.search.silk.p3183b.C40652f;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.search.silk.a.o.c */
/* compiled from: PG */
public final class C40624c {

    /* renamed from: a */
    public static final Pattern f106610a = Pattern.compile("^\\+?\\d+$");

    /* renamed from: b */
    public final C40652f f106611b;

    /* renamed from: c */
    public final Context f106612c;

    /* renamed from: d */
    public final C60887da f106613d;

    public C40624c(C40652f fVar, Context context, C60887da daVar) {
        this.f106611b = fVar;
        this.f106612c = context;
        this.f106613d = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo42566a(String str, boolean z) {
        if (!z) {
            return C60856cj.m92899h(new C41742a(C41749b.m73222a("permission_denied", "No permission to make phone call.")));
        }
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setFlags(268697600);
        intent.setData(Uri.parse("tel:".concat(String.valueOf(str))));
        C47810es.m84979s(this.f106612c, intent);
        return C60866ct.f164955a;
    }
}
