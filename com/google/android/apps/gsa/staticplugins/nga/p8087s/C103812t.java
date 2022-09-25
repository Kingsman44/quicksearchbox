package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.nga.shared.p6345h.C81247al;
import com.google.android.apps.gsa.nga.shared.p6345h.C81249an;
import com.google.android.apps.gsa.nga.shared.p6345h.C81250ao;
import com.google.android.apps.gsa.nga.shared.p6345h.C81274be;
import com.google.android.apps.gsa.nga.shared.p6345h.C81277bh;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.t */
/* compiled from: PG */
public final /* synthetic */ class C103812t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C103787ah f289057a;

    /* renamed from: b */
    public final /* synthetic */ C103810r f289058b;

    public /* synthetic */ C103812t(C103787ah ahVar, C103810r rVar) {
        this.f289057a = ahVar;
        this.f289058b = rVar;
    }

    public final Object apply(Object obj) {
        C103787ah ahVar = this.f289057a;
        C103810r rVar = this.f289058b;
        C81274be beVar = (C81274be) ((C81277bh) Objects.requireNonNull((C81277bh) obj)).toBuilder();
        C58800sl lA = rVar.mo93853b().iterator();
        while (true) {
            Throwable th = null;
            int i = 3;
            if (lA.hasNext()) {
                C103803k kVar = (C103803k) lA.next();
                C103807o oVar = ahVar.f288984b;
                Context context = ahVar.f288993k;
                switch (kVar.ordinal()) {
                    case 0:
                        if (oVar.mo93861a().contains(kVar.f289043k)) {
                            boolean z = oVar.mo93861a().getBoolean(kVar.f289043k, true);
                            beVar.copyOnWrite();
                            C81277bh bhVar = (C81277bh) beVar.instance;
                            bhVar.f222483a |= 1;
                            bhVar.f222484b = z;
                            break;
                        } else {
                            beVar.copyOnWrite();
                            C81277bh bhVar2 = (C81277bh) beVar.instance;
                            bhVar2.f222483a &= -2;
                            bhVar2.f222484b = false;
                            break;
                        }
                    case 1:
                        if (oVar.mo93861a().contains(kVar.f289043k)) {
                            boolean z2 = oVar.mo93861a().getBoolean(kVar.f289043k, false);
                            beVar.copyOnWrite();
                            C81277bh bhVar3 = (C81277bh) beVar.instance;
                            bhVar3.f222483a |= 2;
                            bhVar3.f222485c = z2;
                            break;
                        } else {
                            beVar.copyOnWrite();
                            C81277bh bhVar4 = (C81277bh) beVar.instance;
                            bhVar4.f222483a &= -3;
                            bhVar4.f222485c = false;
                            break;
                        }
                    case 2:
                        String b = ((C85757cq) oVar.f289051b.mo27525b()).mo6453a();
                        beVar.copyOnWrite();
                        C81277bh bhVar5 = (C81277bh) beVar.instance;
                        b.getClass();
                        bhVar5.f222483a |= 4;
                        bhVar5.f222486d = b;
                        break;
                    case 3:
                        boolean f = oVar.mo93863c().mo83817f();
                        beVar.copyOnWrite();
                        C81277bh bhVar6 = (C81277bh) beVar.instance;
                        bhVar6.f222483a |= 8;
                        bhVar6.f222487e = f;
                        break;
                    case 4:
                        boolean aF = oVar.mo93863c().mo83869aF();
                        beVar.copyOnWrite();
                        C81277bh bhVar7 = (C81277bh) beVar.instance;
                        bhVar7.f222483a |= 128;
                        bhVar7.f222491i = aF;
                        break;
                    case 5:
                        String string = oVar.mo93861a().getString(kVar.f289043k, BuildConfig.FLAVOR);
                        if (string.equals(context.getString(R.string.prefValue_ttsMode_verbose))) {
                            i = 2;
                        } else if (!string.equals(context.getString(R.string.prefValue_ttsMode_on))) {
                            i = string.equals(context.getString(R.string.prefValue_ttsMode_handsFreeOnly)) ? 4 : 1;
                        }
                        beVar.copyOnWrite();
                        C81277bh bhVar8 = (C81277bh) beVar.instance;
                        bhVar8.f222488f = i - 1;
                        bhVar8.f222483a |= 16;
                        break;
                    case 6:
                        String string2 = oVar.mo93861a().getString("inputMode", "voice");
                        beVar.copyOnWrite();
                        C81277bh bhVar9 = (C81277bh) beVar.instance;
                        string2.getClass();
                        bhVar9.f222483a |= 64;
                        bhVar9.f222490h = string2;
                        break;
                    case 7:
                        int i2 = oVar.mo93861a().getInt("opa_sticky_input_modality", 0);
                        if (i2 == 1) {
                            i = 2;
                        } else if (i2 != 2) {
                            i = 1;
                        }
                        beVar.copyOnWrite();
                        C81277bh bhVar10 = (C81277bh) beVar.instance;
                        bhVar10.f222492j = i - 1;
                        bhVar10.f222483a |= 256;
                        break;
                    case 8:
                        long j = oVar.mo93861a().getLong("opa_sticky_input_modality_expiration_timestamp", 0);
                        beVar.copyOnWrite();
                        C81277bh bhVar11 = (C81277bh) beVar.instance;
                        bhVar11.f222483a |= 512;
                        bhVar11.f222493k = j;
                        break;
                    case 9:
                        String languageTag = Locale.getDefault().toLanguageTag();
                        beVar.copyOnWrite();
                        C81277bh bhVar12 = (C81277bh) beVar.instance;
                        languageTag.getClass();
                        bhVar12.f222483a |= 32;
                        bhVar12.f222489g = languageTag;
                        break;
                    default:
                        throw null;
                }
            } else {
                C58800sl lA2 = rVar.mo93852a().entrySet().iterator();
                while (lA2.hasNext()) {
                    Map.Entry entry = (Map.Entry) lA2.next();
                    String str = (String) entry.getKey();
                    C81247al alVar = (C81247al) ((C81250ao) Objects.requireNonNull(beVar.mo74979a(str, C81250ao.f222431i))).toBuilder();
                    C58800sl lA3 = ((C58528ij) entry.getValue()).iterator();
                    while (lA3.hasNext()) {
                        C103807o oVar2 = ahVar.f288984b;
                        int ordinal = ((C103802j) lA3.next()).ordinal();
                        if (ordinal == 0) {
                            ae aeVar = (ae) oVar2.f289050a.mo27525b();
                            alVar.copyOnWrite();
                            ((C81250ao) alVar.instance).f222437e = C62942bv.emptyProtobufList();
                            Locale d = aeVar.d(str);
                            String languageTag2 = d.toLanguageTag();
                            alVar.copyOnWrite();
                            C81250ao aoVar = (C81250ao) alVar.instance;
                            languageTag2.getClass();
                            aoVar.f222433a |= 8;
                            aoVar.f222438f = languageTag2;
                            ArrayList arrayList = new ArrayList(aeVar.b(str));
                            if (arrayList.remove(d)) {
                                arrayList.add(0, d);
                            }
                            Stream map = Collection.EL.stream(arrayList).map(C103800h.f289025a);
                            Objects.requireNonNull(alVar);
                            map.forEach(new C103801i(alVar));
                            th = null;
                        } else if (ordinal == 1) {
                            C89994f c = oVar2.mo93863c();
                            String af = c.mo83886af();
                            alVar.copyOnWrite();
                            C81250ao aoVar2 = (C81250ao) alVar.instance;
                            af.getClass();
                            aoVar2.f222433a |= 1;
                            aoVar2.f222434b = af;
                            C58833ax axVar = ((SpeakerIdModel) C58833ax.m90833j(c.mo83841D(str)).mo56109e(new SpeakerIdModel(str))).f253284b;
                            if (!axVar.mo56113h()) {
                                alVar.copyOnWrite();
                                C81250ao aoVar3 = (C81250ao) alVar.instance;
                                aoVar3.f222433a &= -3;
                                aoVar3.f222435c = C81250ao.f222431i.f222435c;
                            } else {
                                C63088z A = C63088z.m96139A((byte[]) axVar.mo56107c());
                                alVar.copyOnWrite();
                                C81250ao aoVar4 = (C81250ao) alVar.instance;
                                aoVar4.f222433a |= 2;
                                aoVar4.f222435c = A;
                            }
                        } else if (ordinal == 2) {
                            boolean m = oVar2.mo93863c().mo83824m(str);
                            alVar.copyOnWrite();
                            C81250ao aoVar5 = (C81250ao) alVar.instance;
                            aoVar5.f222433a |= 16;
                            aoVar5.f222439g = m;
                        } else if (ordinal == 3) {
                            C9388a aVar = (C9388a) oVar2.f289052c.mo27525b();
                            C81249an anVar = aVar.mo17583e() ? C81249an.OPTED_IN : aVar.mo17585g() ? C81249an.OPTED_OUT : C81249an.NOT_SET;
                            alVar.copyOnWrite();
                            C81250ao aoVar6 = (C81250ao) alVar.instance;
                            aoVar6.f222440h = anVar.f222430d;
                            aoVar6.f222433a |= 32;
                        } else {
                            throw th;
                        }
                    }
                    beVar.mo74980b(str, (C81250ao) alVar.build());
                    th = null;
                }
                return (C81277bh) beVar.build();
            }
        }
    }
}
