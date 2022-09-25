package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.gestureclassifier.C76118h;
import com.google.android.apps.gsa.nga.engine.gestureclassifier.C76120j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80294ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6290a.C80474b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6290a.C80475c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80479d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80482g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80483h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82797au;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82813bj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82815bl;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82849cs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82864dg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82911f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82927fp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82928fq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82938g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82981hp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82983hr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82986hu;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83017z;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.aew;
import com.google.common.p4552o.agx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import com.google.speech.p5224k.p5225a.C67190ah;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.f */
/* compiled from: PG */
public final /* synthetic */ class C78096f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78097g f215083a;

    /* renamed from: b */
    public final /* synthetic */ C82889ee f215084b;

    public /* synthetic */ C78096f(C78097g gVar, C82889ee eeVar) {
        this.f215083a = gVar;
        this.f215084b = eeVar;
    }

    public final void run() {
        C80484i iVar;
        C82843cm cmVar;
        Optional empty;
        String str;
        Optional empty2;
        C80475c cVar;
        C82797au auVar;
        C82938g gVar;
        C82813bj bjVar;
        C82981hp hpVar;
        C82864dg dgVar;
        C82849cs csVar;
        C83017z zVar;
        C82928fq fqVar;
        C82815bl blVar;
        C82823bt btVar;
        C78097g gVar2 = this.f215083a;
        C82889ee eeVar = this.f215084b;
        C83320io ioVar = eeVar.f226102g;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        if (!ioVar.f227136c.isEmpty()) {
            C58528ij ijVar = C78097g.f215087c;
            C82887ec a = C82887ec.m132416a(eeVar.f226097b);
            if (a == null) {
                a = C82887ec.UNKNOWN;
            }
            if (!ijVar.contains(a)) {
                return;
            }
        }
        C82887ec ecVar = C82887ec.UNKNOWN;
        C82887ec a2 = C82887ec.m132416a(eeVar.f226097b);
        if (a2 == null) {
            a2 = C82887ec.UNKNOWN;
        }
        int ordinal = a2.ordinal();
        String str2 = BuildConfig.FLAVOR;
        if (ordinal == 1) {
            C82885ea eaVar = eeVar.f226099d;
            if (eaVar == null) {
                eaVar = C82885ea.f225977c;
            }
            if (eaVar.f225979a == 1) {
                iVar = (C80484i) eaVar.f225980b;
            } else {
                iVar = C80484i.f220937h;
            }
            C80478c a3 = C80478c.m128173a(iVar.f220944f);
            if (a3 == null) {
                a3 = C80478c.UNRECOGNIZED;
            }
            String name = a3.name();
            if (iVar.f220943e.isEmpty()) {
                gVar2.mo73070e(name, str2, eeVar.f226098c);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (C80483h hVar : iVar.f220943e) {
                C80482g a4 = C80482g.m128176a(hVar.f220935b);
                if (a4 == null) {
                    a4 = C80482g.UNRECOGNIZED;
                }
                String str3 = " [" + a4.name() + "-" + hVar.f220936c + "] " + hVar.f220934a;
                sb.append(str3);
                if (true == str2.isEmpty()) {
                    str2 = str3;
                }
            }
            C80479d a5 = C80479d.m128175a(iVar.f220942d);
            if (a5 == null) {
                a5 = C80479d.UNRECOGNIZED;
            }
            String str4 = " [" + a5.name() + "] ";
            sb.append(str4);
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new ForegroundColorSpan(C78097g.f215085a), 0, sb.length(), 256);
            spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, str2.length(), 256);
            spannableString.setSpan(new ForegroundColorSpan(C78097g.f215086b), sb.length() - str4.length(), sb.length(), 256);
            gVar2.mo73070e(name, spannableString, eeVar.f226098c);
        } else if (ordinal == 2) {
            C82885ea eaVar2 = eeVar.f226099d;
            if (eaVar2 == null) {
                eaVar2 = C82885ea.f225977c;
            }
            if (eaVar2.f225979a == 2) {
                cmVar = (C82843cm) eaVar2.f225980b;
            } else {
                cmVar = C82843cm.f225889f;
            }
            C82988hw hwVar = cmVar.f225895e;
            if (hwVar != null) {
                Iterator it = C58495hd.m89901o("AndroidIntent", hwVar.f226449c, "BroadcastAndroidIntent", hwVar.f226450d).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        empty = Optional.empty();
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!((List) entry.getValue()).isEmpty()) {
                        empty = Optional.m71637of((String) Collection.EL.stream((List) entry.getValue()).map(new C78094d(entry)).collect(Collectors.joining(",")));
                        break;
                    }
                }
                if (empty.isPresent()) {
                    str = (String) empty.get();
                } else {
                    C80401n nVar = hwVar.f226470x;
                    if (nVar == null) {
                        nVar = C80401n.f220656k;
                    }
                    Optional k = C81442m.m129549k(nVar, C80294ap.FEEDBACK_OP);
                    C58490gz gzVar = new C58490gz(4);
                    gzVar.mo55429h("confirmation_data", hwVar.f226451e);
                    gzVar.mo55429h("answer_text", hwVar.f226452f);
                    gzVar.mo55429h("cloud_handover_query", hwVar.f226453g);
                    C63490p b = C63490p.m96250b(hwVar.f226455i);
                    if (b == null) {
                        b = C63490p.UNSPECIFIED;
                    }
                    gzVar.mo55429h("enable_device_setting", Integer.toString(b.getNumber()));
                    C63490p b2 = C63490p.m96250b(hwVar.f226456j);
                    if (b2 == null) {
                        b2 = C63490p.UNSPECIFIED;
                    }
                    gzVar.mo55429h("disable_device_setting", Integer.toString(b2.getNumber()));
                    C82986hu huVar = hwVar.f226457k;
                    if (huVar == null) {
                        huVar = C82986hu.f226439a;
                    }
                    gzVar.mo55429h("device_setting_value", huVar.toString());
                    C82986hu huVar2 = hwVar.f226458l;
                    if (huVar2 == null) {
                        huVar2 = C82986hu.f226439a;
                    }
                    gzVar.mo55429h("increase_device_setting", huVar2.toString());
                    C82986hu huVar3 = hwVar.f226459m;
                    if (huVar3 == null) {
                        huVar3 = C82986hu.f226439a;
                    }
                    gzVar.mo55429h("decrease_device_setting", huVar3.toString());
                    C63490p b3 = C63490p.m96250b(hwVar.f226460n);
                    if (b3 == null) {
                        b3 = C63490p.UNSPECIFIED;
                    }
                    gzVar.mo55429h("mute", Integer.toString(b3.getNumber()));
                    C63490p b4 = C63490p.m96250b(hwVar.f226461o);
                    if (b4 == null) {
                        b4 = C63490p.UNSPECIFIED;
                    }
                    gzVar.mo55429h("unmute", Integer.toString(b4.getNumber()));
                    gzVar.mo55429h("ringer_mode", Long.toString(hwVar.f226462p));
                    gzVar.mo55429h("media_control_action", hwVar.f226463q);
                    gzVar.mo55429h("delete_uri", hwVar.f226466t);
                    gzVar.mo55429h("send_message_action", hwVar.f226467u);
                    gzVar.mo55429h("reply_to_notification_action", hwVar.f226468v);
                    gzVar.mo55429h("popup_action", hwVar.f226469w);
                    gzVar.mo55429h("feedback_params", k.toString());
                    Iterator it2 = gzVar.mo55427f(false).entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            empty2 = Optional.empty();
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        if (!((String) entry2.getValue()).isEmpty()) {
                            empty2 = Optional.m71637of(String.format("%s \"%s\"", new Object[]{entry2.getKey(), entry2.getValue()}));
                            break;
                        }
                    }
                    if (empty2.isPresent()) {
                        str = (String) empty2.get();
                    } else if (!hwVar.f226465s.isEmpty()) {
                        str = String.format("%s \"%s\"", new Object[]{"ClientOpsList", Collection.EL.stream(hwVar.f226465s).map(C78093c.f215080a).collect(Collectors.joining(","))});
                    } else if ((hwVar.f226447a & 67108864) != 0) {
                        Object[] objArr = new Object[3];
                        objArr[0] = "TtsServiceRequest";
                        C67190ah ahVar = hwVar.f226464r;
                        if (ahVar == null) {
                            ahVar = C67190ah.f182619q;
                        }
                        objArr[1] = ahVar.f182633l;
                        C67190ah ahVar2 = hwVar.f226464r;
                        if (ahVar2 == null) {
                            ahVar2 = C67190ah.f182619q;
                        }
                        objArr[2] = ahVar2.f182625d;
                        str = String.format("%s \"%s-%s\"", objArr);
                    } else {
                        str = "NULL";
                    }
                }
                gVar2.mo73070e("FUL", String.format("[Winning: %s]", new Object[]{str}), eeVar.f226098c);
                return;
            }
            gVar2.mo73070e("FUL", "[Winning: NULL]", eeVar.f226098c);
        } else if (ordinal == 5) {
            int i = gVar2.f215091g;
            if (i != 5 && i != 2) {
                C82885ea eaVar3 = eeVar.f226099d;
                if (eaVar3 == null) {
                    eaVar3 = C82885ea.f225977c;
                }
                if (eaVar3.f225979a == 4) {
                    cVar = (C80475c) eaVar3.f225980b;
                } else {
                    cVar = C80475c.f220879e;
                }
                C80474b a6 = C80474b.m128172a(cVar.f220881a);
                if (a6 == null) {
                    a6 = C80474b.UNRECOGNIZED;
                }
                if (C80474b.PICK_UP == a6) {
                    gVar2.mo73070e("PICK UP", "(SENSOR)", eeVar.f226098c);
                }
            }
        } else if (ordinal == 6) {
            C82885ea eaVar4 = eeVar.f226099d;
            if (eaVar4 == null) {
                eaVar4 = C82885ea.f225977c;
            }
            if (eaVar4.f225979a == 5) {
                auVar = (C82797au) eaVar4.f225980b;
            } else {
                auVar = C82797au.f225585G;
            }
            String str5 = true != auVar.f225597d ? "REJECTED" : "PASSED";
            SpannableString spannableString2 = new SpannableString(str5.concat(String.valueOf(String.format(" - [Scr: %.02f Q: %s]", new Object[]{Double.valueOf(auVar.f225599f), auVar.f225596c}))));
            spannableString2.setSpan(new ForegroundColorSpan(true != auVar.f225597d ? -65536 : -16711936), 0, str5.length(), 256);
            gVar2.mo73070e("DID", spannableString2, eeVar.f226098c);
        } else if (ordinal == 8) {
            C82885ea eaVar5 = eeVar.f226099d;
            if (eaVar5 == null) {
                eaVar5 = C82885ea.f225977c;
            }
            if (eaVar5.f225979a == 6) {
                gVar = (C82938g) eaVar5.f225980b;
            } else {
                gVar = C82938g.f226273j;
            }
            int a7 = C82911f.m132425a(gVar.f226276b);
            if (a7 == 0) {
                a7 = 1;
            }
            if (gVar2.f215091g != a7) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a7 != 1 ? a7 != 2 ? a7 != 3 ? a7 != 5 ? a7 != 6 ? "EXECUTING" : "DICTATING" : "HALF_LISTENING" : "IDLE" : "FULL_LISTENING" : "UNKNOWN");
                sb2.append(" triggered by ");
                if ((gVar.f226275a & 32) != 0) {
                    C83016y a8 = C83016y.m132448a(gVar.f226279e);
                    if (a8 == null) {
                        a8 = C83016y.UNKNOWN;
                    }
                    sb2.append(a8.name());
                }
                gVar2.mo73070e("ACT", sb2.toString(), eeVar.f226098c);
                gVar2.f215091g = a7;
            }
        } else if (ordinal == 38) {
            C82885ea eaVar6 = eeVar.f226099d;
            if (eaVar6 == null) {
                eaVar6 = C82885ea.f225977c;
            }
            if (eaVar6.f225979a == 49) {
                bjVar = (C82813bj) eaVar6.f225980b;
            } else {
                bjVar = C82813bj.f225656e;
            }
            gVar2.mo73069d(C78097g.m125402b("SPEECH", "Estimated end of user speech").append(" ").append(C78097g.m125403c(bjVar.f225659b)));
        } else if (ordinal == 65) {
            C82885ea eaVar7 = eeVar.f226099d;
            if (eaVar7 == null) {
                eaVar7 = C82885ea.f225977c;
            }
            if (eaVar7.f225979a == 56) {
                hpVar = (C82981hp) eaVar7.f225980b;
            } else {
                hpVar = C82981hp.f226382f;
            }
            StringBuilder sb3 = new StringBuilder();
            C82983hr a9 = C82983hr.m132443a(hpVar.f226385b);
            if (a9 == null) {
                a9 = C82983hr.NGA_EXPLICIT_TRIGGER_SQUEEZE;
            }
            sb3.append(a9.name());
            for (Map.Entry entry3 : gVar2.f215089e.mo71413a(hpVar).entrySet()) {
                sb3.append(", latency since ");
                sb3.append((String) entry3.getKey());
                sb3.append(" ");
                sb3.append(entry3.getValue());
                sb3.append(" ms");
            }
            gVar2.mo73070e("SysH", sb3, gVar2.f215090f.a(hpVar.f226388e));
        } else if (ordinal == 16) {
            C78095e eVar = C78095e.f215082a;
            C82885ea eaVar8 = eeVar.f226099d;
            if (eaVar8 == null) {
                eaVar8 = C82885ea.f225977c;
            }
            if (eaVar8.f225979a == 15) {
                dgVar = (C82864dg) eaVar8.f225980b;
            } else {
                dgVar = C82864dg.f225947c;
            }
            aew aew = dgVar.f225950b;
            if (aew == null) {
                aew = aew.f158493e;
            }
            agx agx = aew.f158498d;
            if (agx == null) {
                agx = agx.f158676b;
            }
            gVar2.mo73069d(C78097g.m125402b("S-CTX", TextUtils.join(str2, (Iterable) Collection.EL.stream(agx.f158678a).map(eVar).collect(Collectors.toList()))));
        } else if (ordinal == 17) {
            C82885ea eaVar9 = eeVar.f226099d;
            if (eaVar9 == null) {
                eaVar9 = C82885ea.f225977c;
            }
            if (eaVar9.f225979a == 17) {
                csVar = (C82849cs) eaVar9.f225980b;
            } else {
                csVar = C82849cs.f225909d;
            }
            C76118h hVar2 = csVar.f225912b;
            if (hVar2 == null) {
                hVar2 = C76118h.f211042d;
            }
            C76120j a10 = C76120j.m122699a(hVar2.f211044a);
            if (a10 == null) {
                a10 = C76120j.UNKNOWN;
            }
            if (C76120j.PICKUP == a10) {
                gVar2.mo73070e("PICK UP", "(GESTURE)", eeVar.f226098c);
            }
        } else if (ordinal == 24) {
            C82885ea eaVar10 = eeVar.f226099d;
            if (eaVar10 == null) {
                eaVar10 = C82885ea.f225977c;
            }
            if (eaVar10.f225979a == 24) {
                zVar = (C83017z) eaVar10.f225980b;
            } else {
                zVar = C83017z.f226625d;
            }
            C83016y a11 = C83016y.m132448a(zVar.f226628b);
            if (a11 == null) {
                a11 = C83016y.UNKNOWN;
            }
            if (a11 == C83016y.INITIAL_RESULT) {
                gVar2.mo73069d(str2);
            }
            StringBuilder sb4 = new StringBuilder();
            C83016y a12 = C83016y.m132448a(zVar.f226628b);
            if (a12 == null) {
                a12 = C83016y.UNKNOWN;
            }
            sb4.append(a12.name());
            e eVar2 = e.a;
            C82907ew ewVar = zVar.f226629c;
            if (ewVar == null) {
                ewVar = C82907ew.f226160o;
            }
            e a13 = e.a(ewVar.f226163b);
            if (a13 == null) {
                a13 = e.a;
            }
            if (!eVar2.equals(a13)) {
                sb4.append(" triggered by ");
                C82907ew ewVar2 = zVar.f226629c;
                if (ewVar2 == null) {
                    ewVar2 = C82907ew.f226160o;
                }
                e a14 = e.a(ewVar2.f226163b);
                if (a14 == null) {
                    a14 = e.a;
                }
                sb4.append(a14.name());
            }
            gVar2.mo73070e("ACT", sb4.toString(), eeVar.f226098c);
        } else if (ordinal == 25) {
            C82885ea eaVar11 = eeVar.f226099d;
            if (eaVar11 == null) {
                eaVar11 = C82885ea.f225977c;
            }
            if (eaVar11.f225979a == 25) {
                fqVar = (C82928fq) eaVar11.f225980b;
            } else {
                fqVar = C82928fq.f226243b;
            }
            for (C82927fp fpVar : fqVar.f226245a) {
                C80517f a15 = C80517f.m128187a(fpVar.f226239a);
                if (a15 == null) {
                    a15 = C80517f.UNKNOWN;
                }
                String name2 = a15.name();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(fpVar.f226240b);
                sb5.append(" -> ");
                sb5.append(fpVar.f226241c);
                gVar2.mo73070e(name2, sb5, eeVar.f226098c);
            }
        } else if (ordinal == 28) {
            C82885ea eaVar12 = eeVar.f226099d;
            if (eaVar12 == null) {
                eaVar12 = C82885ea.f225977c;
            }
            if (eaVar12.f225979a == 28) {
                blVar = (C82815bl) eaVar12.f225980b;
            } else {
                blVar = C82815bl.f225662e;
            }
            if (blVar.f225667d.toLowerCase(Locale.US).contains("fulfillment")) {
                gVar2.mo73070e("ERR", blVar.f225667d + " " + blVar.f225665b, eeVar.f226098c);
            }
        } else if (ordinal == 29) {
            C82885ea eaVar13 = eeVar.f226099d;
            if (eaVar13 == null) {
                eaVar13 = C82885ea.f225977c;
            }
            if (eaVar13.f225979a == 29) {
                btVar = (C82823bt) eaVar13.f225980b;
            } else {
                btVar = C82823bt.f225680i;
            }
            StringBuilder sb6 = new StringBuilder();
            if ((btVar.f225682a & 2) != 0) {
                C80513b bVar = btVar.f225684c;
                if (bVar == null) {
                    bVar = C80513b.f221014e;
                }
                C80515d a16 = C80515d.m128185a(bVar.f221019d);
                if (a16 == null) {
                    a16 = C80515d.UNRECOGNIZED;
                }
                String name3 = a16.name();
                if (true == name3.equals("GINA")) {
                    name3 = "PATTERN_MATCHER";
                }
                sb6.append(name3);
                sb6.append(": ");
                C80513b bVar2 = btVar.f225684c;
                if (bVar2 == null) {
                    bVar2 = C80513b.f221014e;
                }
                C61752n nVar2 = bVar2.f221016a;
                if (nVar2 == null) {
                    nVar2 = C61752n.f166808f;
                }
                sb6.append(nVar2.f166811b);
            } else {
                sb6.append("CLOUD_HANDOVER");
            }
            gVar2.mo73070e("EXE", String.format("[%s]", new Object[]{sb6}), eeVar.f226098c);
        }
    }
}
