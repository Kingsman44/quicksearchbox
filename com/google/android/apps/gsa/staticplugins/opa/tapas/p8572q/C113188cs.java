package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4985f.p5046x.C65379d;
import dagger.C68214a;
import java.net.URISyntaxException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.cs */
/* compiled from: PG */
public final class C113188cs {

    /* renamed from: a */
    public static final C59071e f313512a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.q.cs");

    /* renamed from: b */
    public final C113206m f313513b;

    /* renamed from: c */
    public final C68214a f313514c;

    /* renamed from: d */
    public final C113115a f313515d;

    /* renamed from: e */
    public final C86124t f313516e;

    /* renamed from: f */
    private final Context f313517f;

    /* renamed from: g */
    private final C68214a f313518g;

    /* renamed from: h */
    private final C68214a f313519h;

    public C113188cs(C113206m mVar, Context context, C68214a aVar, C113115a aVar2, C86124t tVar, C68214a aVar3, C68214a aVar4) {
        this.f313513b = mVar;
        this.f313517f = context;
        this.f313514c = aVar;
        this.f313515d = aVar2;
        this.f313516e = tVar;
        this.f313518g = aVar3;
        this.f313519h = aVar4;
    }

    /* renamed from: a */
    public static Intent m187209a(C113415ez ezVar) {
        ComponentName b;
        C41679e i = ezVar.mo100209i();
        C41689o oVar = i.f109010d;
        if (oVar == null) {
            oVar = C41689o.f109041e;
        }
        if ("internal.3p:MobileApplication".equals(oVar.f109045c)) {
            try {
                C41693s sVar = i.f109009c;
                if (sVar == null) {
                    sVar = C41693s.f109053h;
                }
                String str = sVar.f109057c;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return Intent.parseUri(str, 3).setFlags(270532608);
            } catch (Exception e) {
                C59104x c = f313512a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TapasCreationUtils");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27976)).mo56386p("Failed to get app intent");
                return null;
            }
        } else if (ezVar.mo100205e() == 223) {
            try {
                C41693s sVar2 = i.f109009c;
                if (sVar2 == null) {
                    sVar2 = C41693s.f109053h;
                }
                return Intent.parseUri(sVar2.f109061g, 0).setFlags(270565376);
            } catch (URISyntaxException unused) {
                return null;
            }
        } else {
            C41693s sVar3 = i.f109009c;
            if (sVar3 == null) {
                sVar3 = C41693s.f109053h;
            }
            if (!"android.intent.action.MAIN".equals(sVar3.f109056b)) {
                return null;
            }
            C41693s sVar4 = i.f109009c;
            if (sVar4 == null) {
                sVar4 = C41693s.f109053h;
            }
            String str2 = sVar4.f109057c;
            if (TextUtils.isEmpty(str2) || (b = C89235z.m145130b(Uri.parse(str2))) == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(270532608);
            intent.setComponent(b);
            return intent;
        }
    }

    /* renamed from: d */
    public static C113415ez m187210d(C65379d dVar, C48578al alVar, C48672ag agVar) {
        String str = dVar.f177779b;
        C113414ey R = C113415ez.m187750R();
        R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
        R.mo100175t(agVar);
        R.mo100167l(10001);
        R.mo100180y(10081);
        R.mo100177v(C48580an.MEDIA_ENTITY);
        C113386e eVar = (C113386e) R;
        eVar.f313969q = Optional.m71637of(dVar);
        R.mo100164i(str);
        eVar.f313956d = Optional.m71637of(alVar);
        C112142i iVar = C112142i.DISPLAY_TEXT;
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(C58890d.m90988c(str), 1.0f);
        eVar.f313963k = C58495hd.m89900n(iVar, (C112144k) hVar.build());
        return R.mo100156a();
    }

    /* renamed from: b */
    public final SpannableStringBuilder mo99901b(String str, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            String string = this.f313517f.getString(R.string.tapas_annotation_separator);
            spannableStringBuilder.append(String.valueOf(string).concat(str2), new ForegroundColorSpan(i), 17);
        }
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public final C112144k mo99902c(C48580an anVar, String str, String str2) {
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(str + " - " + str2, 1.0f);
        if (this.f313516e.mo79746e(C90063do.f249443dd)) {
            String c = ((C113185cp) this.f313518g.mo27525b()).mo99900c(str, C113185cp.m187204b(((bm) this.f313519h.mo27525b()).b()), anVar);
            if (c.length() < str.length()) {
                hVar.mo99420b(c + " - " + str2, 1.0f);
            }
        }
        return (C112144k) hVar.build();
    }

    /* renamed from: e */
    public final CharSequence mo99903e(ShortcutInfo shortcutInfo) {
        if (shortcutInfo.getShortLabel() != null) {
            return shortcutInfo.getShortLabel();
        }
        return shortcutInfo.getLongLabel();
    }
}
