package com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9160a;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83928o;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83929p;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83931r;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9161b.C121110b;
import com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9161b.C121113e;
import com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9161b.C121114f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.assistant.platform.h.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C121094a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121095b f336510a;

    /* renamed from: b */
    public final /* synthetic */ C121114f f336511b;

    public /* synthetic */ C121094a(C121095b bVar, C121114f fVar) {
        this.f336510a = bVar;
        this.f336511b = fVar;
    }

    public final Object apply(Object obj) {
        C121095b bVar = this.f336510a;
        C121114f fVar = this.f336511b;
        String str = (String) obj;
        ((C59052c) ((C59052c) C121095b.f336512a.mo56224b()).mo56372aa(35709)).mo56386p("OpaConsentStatusAgsaSharedPreferencesMigration running now.");
        C121113e eVar = (C121113e) fVar.toBuilder();
        eVar.copyOnWrite();
        C121114f fVar2 = (C121114f) eVar.instance;
        fVar2.f336546a &= -2;
        fVar2.f336547b = 0;
        eVar.copyOnWrite();
        C121114f fVar3 = (C121114f) eVar.instance;
        fVar3.f336546a &= -3;
        boolean z = false;
        fVar3.f336548c = false;
        eVar.copyOnWrite();
        ((C121114f) eVar.instance).f336549d = C121114f.emptyIntList();
        eVar.copyOnWrite();
        ((C121114f) eVar.instance).f336550f = C121114f.emptyIntList();
        long j = ((SharedPreferences) bVar.f336513b.mo27525b()).getLong("opa_last_udc_consent".concat(String.valueOf(str)), 0);
        eVar.copyOnWrite();
        C121114f fVar4 = (C121114f) eVar.instance;
        fVar4.f336546a |= 1;
        fVar4.f336547b = j;
        if (j != 0) {
            z = true;
        }
        eVar.copyOnWrite();
        C121114f fVar5 = (C121114f) eVar.instance;
        fVar5.f336546a |= 2;
        fVar5.f336548c = z;
        byte[] e = ((C86338r) bVar.f336514c.mo27525b()).mo80079e("oc:tos_and_pp_acked", (byte[]) null);
        if (e != null) {
            try {
                for (C83928o oVar : ((C83929p) C62942bv.parseFrom((C62942bv) C83929p.f228585b, e, C62921ba.m95368a())).f228587a) {
                    if (oVar.f228583b.equals(str)) {
                        int b = C83931r.m133681b(oVar.f228584c);
                        if (b == 0) {
                            b = 1;
                        }
                        int i = b - 1;
                        if (i == 2) {
                            eVar.mo105054b(C121110b.OMNICONSENT_SCOPE_OPA_ANDROID);
                        } else if (i == 3) {
                            eVar.mo105054b(C121110b.OMNICONSENT_SCOPE_ANDROID_SUW);
                        } else if (i == 4) {
                            eVar.mo105054b(C121110b.OMNICONSENT_SCOPE_BISTO);
                        } else if (i == 5) {
                            eVar.mo105054b(C121110b.OMNICONSENT_SCOPE_OPA_ANDROID_AUTO);
                        }
                    }
                }
            } catch (Exception e2) {
                ((C59052c) ((C59052c) ((C59052c) C121095b.f336512a.mo56225c()).mo56382g(e2)).mo56372aa(35711)).mo56389s("invalid OmniconsentProgressRecord for key = %s", "oc:third_party_disclosures_acked");
                return (C121114f) eVar.build();
            }
        }
        byte[] e3 = ((C86338r) bVar.f336514c.mo27525b()).mo80079e("oc:third_party_disclosures_acked", (byte[]) null);
        if (e3 != null) {
            try {
                for (C83928o oVar2 : ((C83929p) C62942bv.parseFrom((C62942bv) C83929p.f228585b, e3, C62921ba.m95368a())).f228587a) {
                    if (oVar2.f228583b.equals(str)) {
                        int b2 = C83931r.m133681b(oVar2.f228584c);
                        if (b2 == 0) {
                            b2 = 1;
                        }
                        int i2 = b2 - 1;
                        if (i2 == 2) {
                            eVar.mo105053a(C121110b.OMNICONSENT_SCOPE_OPA_ANDROID);
                        } else if (i2 == 3) {
                            eVar.mo105053a(C121110b.OMNICONSENT_SCOPE_ANDROID_SUW);
                        } else if (i2 == 4) {
                            eVar.mo105053a(C121110b.OMNICONSENT_SCOPE_BISTO);
                        } else if (i2 == 5) {
                            eVar.mo105053a(C121110b.OMNICONSENT_SCOPE_OPA_ANDROID_AUTO);
                        }
                    }
                }
            } catch (Exception e4) {
                ((C59052c) ((C59052c) ((C59052c) C121095b.f336512a.mo56225c()).mo56382g(e4)).mo56372aa(35710)).mo56389s("invalid OmniconsentProgressRecord for key = %s", "oc:tos_and_pp_acked");
                return (C121114f) eVar.build();
            }
        }
        return (C121114f) eVar.build();
    }
}
