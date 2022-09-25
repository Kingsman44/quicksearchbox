package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.UnsupportedEncodingException;
import p3186j$.net.URLDecoder;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ab */
/* compiled from: PG */
public final class C108204ab extends C108232bc {

    /* renamed from: d */
    private static final C59071e f300962d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.ab");

    /* renamed from: a */
    public final C91097g f300963a;

    /* renamed from: b */
    public CharSequence f300964b;

    /* renamed from: c */
    public int f300965c = 6;

    /* renamed from: e */
    private SpannableStringBuilder f300966e;

    public C108204ab(CharSequence charSequence, C91097g gVar) {
        super((byte[]) null);
        this.f300964b = charSequence;
        this.f300963a = gVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 27239;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return this.f300965c;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar == null) {
            return null;
        }
        jVar.mo33795i(5);
        return C28293k.m52908e(this.f301030l, new C28293k[0]);
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (this.f300966e == null) {
            Resources resources = blVar.f301087n.getResources();
            try {
                this.f300964b = URLDecoder.decode(this.f300964b.toString(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                ((C59052c) ((C59052c) ((C59052c) f300962d.mo56225c()).mo56382g(e)).mo56372aa(23938)).mo56389s("Error decoding html text: %s", this.f300964b);
            }
            Spanned fromHtml = Html.fromHtml(this.f300964b.toString());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            this.f300966e = spannableStringBuilder;
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class)) {
                SpannableStringBuilder spannableStringBuilder2 = this.f300966e;
                spannableStringBuilder2.setSpan(new C108203aa(this, uRLSpan, resources), spannableStringBuilder2.getSpanStart(uRLSpan), spannableStringBuilder2.getSpanEnd(uRLSpan), spannableStringBuilder2.getSpanFlags(uRLSpan));
                spannableStringBuilder2.removeSpan(uRLSpan);
            }
        }
        blVar.f301087n.setText(this.f300966e);
        blVar.f301087n.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
