package com.google.android.libraries.search.silk.p3162a.p3165c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.p059a.C0962j;
import androidx.browser.p059a.C0963k;
import androidx.browser.p059a.C0964l;
import com.google.android.libraries.silk.p3205a.p3215d.C41718a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4300e.C56681c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4300e.C56682d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4300e.C56684f;
import com.google.protos.p4887at.p4888a.C63814b;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import p3186j$.net.URLDecoder;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.a.c.b */
/* compiled from: PG */
public final class C40565b implements C41718a {

    /* renamed from: a */
    private static final C59071e f106464a = C59071e.m91332i("com.google.android.libraries.search.silk.a.c.b");

    /* renamed from: b */
    private static final C58485gu f106465b = C58485gu.m89850r("com.google.android.apps.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");

    /* renamed from: c */
    private final Context f106466c;

    /* renamed from: d */
    private final C40564a f106467d;

    public C40565b(Context context, C40564a aVar) {
        this.f106466c = context;
        this.f106467d = aVar;
    }

    /* renamed from: c */
    private final String m70304c() {
        String c = C0962j.m2897c(this.f106466c, C58485gu.m89845m(), false);
        C58485gu guVar = f106465b;
        if (guVar.contains(c)) {
            return c;
        }
        return C0962j.m2897c(this.f106466c, guVar, true);
    }

    /* renamed from: a */
    public final C60870cx mo42518a(C56682d dVar) {
        int b;
        try {
            String decode = URLDecoder.decode(dVar.f151299a, "UTF-8");
            String c = m70304c();
            if (c == null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(decode));
                intent.setFlags(268435456);
                this.f106466c.startActivity(intent);
                return C60866ct.f164955a;
            }
            C40564a aVar = this.f106467d;
            C0964l a = new C0963k().mo3582a();
            a.f3074a.setFlags(268435456);
            Intent intent2 = a.f3074a;
            intent2.putExtra("org.chromium.chrome.browser.autofill_assistant.ENABLED", true);
            intent2.putExtra("org.chromium.chrome.browser.autofill_assistant.CALLER", "2");
            intent2.putExtra("org.chromium.chrome.browser.autofill_assistant.SOURCE", "5");
            intent2.putExtra("browser_fallback_url", decode);
            for (C56681c cVar : dVar.f151300b) {
                int i = cVar.f151294a;
                int b2 = C63814b.m96312b(i);
                if ((b2 != 0 && b2 == 41) || ((b = C63814b.m96312b(i)) != 0 && b == 44)) {
                    int b3 = C63814b.m96312b(i);
                    if (b3 == 0) {
                        b3 = 1;
                    }
                    intent2.putExtra("org.chromium.chrome.browser.autofill_assistant.".concat(C63814b.m96311a(b3)), "true".equalsIgnoreCase(cVar.f151295b));
                } else {
                    int b4 = C63814b.m96312b(i);
                    if (b4 == 0) {
                        b4 = 1;
                    }
                    intent2.putExtra("org.chromium.chrome.browser.autofill_assistant.".concat(C63814b.m96311a(b4)), cVar.f151295b);
                }
            }
            a.f3074a.setPackage(c);
            a.mo3590a(aVar.f106463a, Uri.parse(decode));
            return C60866ct.f164955a;
        } catch (UnsupportedEncodingException e) {
            ((C59052c) ((C59052c) ((C59052c) f106464a.mo56225c()).mo56382g(e)).mo56372aa(53356)).mo56386p("Invalid URL.");
            return C60866ct.f164955a;
        }
    }

    /* renamed from: b */
    public final C60870cx mo42519b(C56684f fVar) {
        String c = m70304c();
        try {
            Intent parseUri = Intent.parseUri(fVar.f151304a, 1);
            if (c == null) {
                parseUri.setFlags(268435456);
                this.f106466c.startActivity(parseUri);
                return C60866ct.f164955a;
            }
            C40564a aVar = this.f106467d;
            C0964l a = new C0963k().mo3582a();
            a.f3074a.putExtras(parseUri);
            a.f3074a.setFlags(268435456);
            a.f3074a.putExtra("org.chromium.chrome.browser.autofill_assistant.SOURCE", "5");
            a.f3074a.setPackage(c);
            a.mo3590a(aVar.f106463a, (Uri) Objects.requireNonNull(parseUri.getData()));
            return C60866ct.f164955a;
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f106464a.mo56225c()).mo56382g(e)).mo56372aa(53357)).mo56386p("Invalid request.");
            return C60866ct.f164955a;
        }
    }
}
