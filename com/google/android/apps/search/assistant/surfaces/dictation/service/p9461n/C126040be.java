package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125099c;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125126d;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125157f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125164m;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125166o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9462a.C125941c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126311at;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62970cp;
import com.google.protobuf.C62995dn;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.be */
/* compiled from: PG */
public final class C126040be {

    /* renamed from: a */
    private final boolean f347390a;

    /* renamed from: b */
    private final boolean f347391b;

    /* renamed from: c */
    private final C125941c f347392c;

    /* renamed from: d */
    private final C126311at f347393d;

    /* renamed from: e */
    private final long f347394e;

    /* renamed from: f */
    private final long f347395f;

    public C126040be(boolean z, boolean z2, C125941c cVar, C126311at atVar, long j, long j2) {
        C69664n.m101061g(cVar, "localizationManager");
        this.f347390a = z;
        this.f347391b = z2;
        this.f347392c = cVar;
        this.f347393d = atVar;
        this.f347394e = j;
        this.f347395f = j2;
    }

    /* renamed from: c */
    private final String m206097c(int i) {
        return this.f347392c.mo107211a(this.f347393d.mo107523b()).getString(i, new Object[0]);
    }

    /* renamed from: a */
    public final String mo107267a(C125160i iVar) {
        C69664n.m101061g(iVar, "eligibility");
        C125160i iVar2 = C125160i.UNKNOWN;
        int ordinal = iVar.ordinal();
        if (ordinal == 1) {
            return null;
        }
        if (ordinal == 5) {
            return m206097c(R.string.assistant_dictation_ineligible_locale_mismatch);
        }
        if (ordinal == 10) {
            return m206097c(R.string.assistant_dictation_ineligible_work_profile);
        }
        if (ordinal != 13) {
            if (ordinal == 18) {
                return m206097c(R.string.assistant_dictation_ineligible_aiai_version);
            }
            if (ordinal == 28) {
                long j = this.f347395f;
                if (j < 0 || this.f347394e < j) {
                    return m206097c(R.string.assistant_dictation_ineligible_android_old_version);
                }
                return m206097c(R.string.assistant_dictation_ineligible_android_old_version_v2);
            } else if (ordinal == 29) {
                long j2 = this.f347395f;
                if (j2 < 0 || this.f347394e < j2) {
                    return m206097c(R.string.assistant_dictation_ineligible_assistant_disabled);
                }
                return m206097c(R.string.assistant_dictation_ineligible_assistant_disabled_v2);
            } else if (!(ordinal == 31 || ordinal == 32)) {
                switch (ordinal) {
                    case 21:
                    case 25:
                        break;
                    case 22:
                        return m206097c(R.string.assistant_dictation_ineligible_unsupported_language);
                    case 23:
                        return m206097c(R.string.assistant_dictation_ineligible_unsupported_system_language);
                    case 24:
                        return m206097c(R.string.assistant_dictation_ineligible_saa_disabled);
                    default:
                        return null;
                }
            }
        }
        return m206097c(R.string.assistant_dictation_ineligible_download_needed);
    }

    /* renamed from: b */
    public final C125166o mo107268b(C125160i iVar, C125160i iVar2, Map map) {
        C69664n.m101061g(iVar, "eligibility");
        C69664n.m101061g(iVar2, "inputFieldEligibility");
        C69664n.m101061g(map, "configEligibilityByLocale");
        C125164m mVar = (C125164m) C125166o.f345294h.createBuilder();
        C69664n.m101060f(mVar, "newBuilder()");
        C69664n.m101061g(mVar, "builder");
        C69664n.m101061g(iVar, "value");
        mVar.copyOnWrite();
        ((C125166o) mVar.instance).f345297a = iVar.getNumber();
        C69664n.m101061g(iVar2, "value");
        mVar.copyOnWrite();
        ((C125166o) mVar.instance).f345298b = iVar2.getNumber();
        for (Map.Entry entry : map.entrySet()) {
            C125160i iVar3 = (C125160i) entry.getValue();
            Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(new C62970cp(((C125166o) mVar.instance).f345299c, C125166o.f345295i)));
            C69664n.m101060f(unmodifiableMap, "_builder.getLocaleConfigEligibilityMap()");
            new C62884c(unmodifiableMap);
            String languageTag = ((Locale) entry.getKey()).toLanguageTag();
            C69664n.m101060f(languageTag, "locale.toLanguageTag()");
            C69664n.m101061g(languageTag, "key");
            C69664n.m101061g(iVar3, "value");
            languageTag.getClass();
            iVar3.getClass();
            mVar.copyOnWrite();
            C125166o oVar = (C125166o) mVar.instance;
            C62995dn dnVar = oVar.f345299c;
            if (!dnVar.f170058b) {
                oVar.f345299c = dnVar.mo58980a();
            }
            new C62970cp(oVar.f345299c, C125166o.f345295i).put(languageTag, iVar3);
        }
        mVar.copyOnWrite();
        boolean z = false;
        ((C125166o) mVar.instance).f345300d = false;
        if (iVar != C125160i.NON_ELIGIBLE_SAA_DISABLED) {
            z = true;
        }
        mVar.copyOnWrite();
        ((C125166o) mVar.instance).f345301e = z;
        if (this.f347390a) {
            String a = mo107267a(iVar);
            if (a == null) {
                a = BuildConfig.FLAVOR;
            }
            mVar.copyOnWrite();
            ((C125166o) mVar.instance).f345302f = a;
        }
        C125099c cVar = (C125099c) C125126d.f345189b.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C125157f a2 = C69664n.m101061g(cVar, "builder");
        boolean z2 = this.f347391b;
        C125099c cVar2 = a2.f345245a;
        cVar2.copyOnWrite();
        ((C125126d) cVar2.instance).f345191a = z2;
        C125126d a3 = a2.mo106810a();
        C69664n.m101061g(a3, "value");
        mVar.copyOnWrite();
        a3.getClass();
        ((C125166o) mVar.instance).f345303g = a3;
        C62942bv build = mVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C125166o) build;
    }
}
