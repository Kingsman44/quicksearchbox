package com.google.android.apps.gsa.search.core.corpora;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.p395al.p408c.p414c.p416b.C8495e;
import com.google.p395al.p417d.C8600b;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class WebCorpus extends Corpus {

    /* renamed from: a */
    public final String f231866a;

    /* renamed from: b */
    public final String f231867b;

    /* renamed from: c */
    public final String f231868c;

    /* renamed from: d */
    public final String f231869d;

    /* renamed from: j */
    private final List f231870j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WebCorpus(String str, C8600b bVar, Uri uri, Uri uri2, String str2, String str3, String str4, String str5, Map map, List list, String str6, boolean z) {
        super(str, bVar, 1, uri, uri2, map, str6, z);
        this.f231866a = str2;
        this.f231867b = str3;
        this.f231868c = str4;
        this.f231869d = str5;
        this.f231870j = list;
    }

    /* renamed from: a */
    public static WebCorpus m137791a(C8495e eVar, String str) {
        if (!eVar.f29479n.isEmpty()) {
            str = eVar.f29479n;
        }
        String str2 = str;
        String str3 = eVar.f29467b;
        String concat = TextUtils.isEmpty(str3) ? "web" : "web.".concat(String.valueOf(str3));
        C8600b a = C8600b.m23279a(eVar.f29472g);
        if (a == null) {
            a = C8600b.NO_MODES;
        }
        C8600b bVar = a;
        Uri parse = Uri.parse(eVar.f29469d);
        Uri parse2 = Uri.parse(eVar.f29470e);
        String str4 = eVar.f29471f;
        String str5 = eVar.f29474i;
        String str6 = eVar.f29475j;
        m147520c(eVar.f29476k);
        Map c = m147520c(eVar.f29473h);
        C62971cq cqVar = eVar.f29478m;
        boolean z = eVar.f29477l;
        return new WebCorpus(concat, bVar, parse, parse2, str4, str2, str5, str6, c, cqVar, eVar.f29485t, eVar.f29486u);
    }

    /* renamed from: b */
    public final boolean mo79406b() {
        if (this.f231870j.isEmpty()) {
            return true;
        }
        String s = C90772bp.m148311s();
        for (String equals : this.f231870j) {
            if (s.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f252914e;
        String str2 = this.f231866a;
        String str3 = this.f231868c;
        String str4 = this.f231869d;
        String valueOf = String.valueOf(this.f252917h);
        String valueOf2 = String.valueOf(this.f252915f);
        return "WebCorpus[" + str + ", " + str2 + ", PATH:" + str3 + ", AUTH:" + str4 + ", PARAMS:" + valueOf + ", MODELINK:" + valueOf2 + "]";
    }
}
