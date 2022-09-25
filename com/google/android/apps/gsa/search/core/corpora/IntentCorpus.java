package com.google.android.apps.gsa.search.core.corpora;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p417d.C8600b;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import p3186j$.net.URLEncoder;

/* compiled from: PG */
public class IntentCorpus extends Corpus {

    /* renamed from: a */
    public static final C59071e f231862a = C59071e.m91332i("com.google.android.apps.gsa.search.core.corpora.IntentCorpus");

    /* renamed from: b */
    public final String f231863b;

    /* renamed from: c */
    public final String f231864c;

    /* renamed from: d */
    private final String f231865d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntentCorpus(String str, C8600b bVar, int i, Uri uri, Uri uri2, Map map, String str2, String str3, String str4, String str5) {
        super(str, bVar, i, uri, uri2, map, str5, false);
        this.f231863b = str2;
        this.f231864c = str3;
        this.f231865d = str4;
    }

    /* renamed from: a */
    public final Intent mo79404a(String str) {
        try {
            return new Intent("android.intent.action.VIEW", Uri.parse(String.format(this.f231865d, new Object[]{URLEncoder.encode(str, Charset.defaultCharset().displayName())})));
        } catch (UnsupportedEncodingException unused) {
            C59104x d = f231862a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.IntentCorpus");
            ((C59052c) ((C59052c) d).mo56372aa(7617)).mo56386p("Error encoding uri");
            int i = C90755l.f253831a;
            return new Intent("android.intent.action.VIEW", Uri.parse(this.f231865d));
        }
    }

    public final String toString() {
        String str = this.f252914e;
        String str2 = this.f231863b;
        String str3 = this.f231864c;
        String str4 = this.f231865d;
        String valueOf = String.valueOf(this.f252915f);
        return "IntentCorpus[" + str + ", Intent[" + str2 + ", " + str3 + ", " + str4 + ", MODELINK: " + valueOf + "]";
    }
}
