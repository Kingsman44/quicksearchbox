package com.google.android.libraries.search.assistant.performer.communication;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35736d;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35737e;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52293mj;
import com.google.assistant.p3897e.p3921j.C52294mk;
import com.google.assistant.p3897e.p3921j.C52295ml;
import com.google.assistant.p3897e.p3921j.C52296mm;
import com.google.assistant.p3897e.p3921j.C52297mn;
import com.google.assistant.p3897e.p3921j.C52620ym;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52626ys;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.assistant.p3897e.p3921j.add;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.assistant.p3897e.p3921j.adf;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ad */
/* compiled from: PG */
public final /* synthetic */ class C35511ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f93256a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f93257b;

    public /* synthetic */ C35511ad(List list, C58485gu guVar) {
        this.f93256a = list;
        this.f93257b = guVar;
    }

    public final Object call() {
        Optional optional;
        List list = this.f93256a;
        C58485gu guVar = this.f93257b;
        C52293mj mjVar = (C52293mj) C52296mm.f137279b.createBuilder();
        for (int i = 0; i < list.size(); i++) {
            Optional optional2 = (Optional) C60856cj.m92909r((Future) list.get(i));
            if (optional2.isPresent()) {
                String b = ((C35515ah) optional2.get()).mo39687b();
                String c = ((C35515ah) optional2.get()).mo39688c();
                c.getClass();
                C58485gu n = C58485gu.m89846n(c);
                int i2 = C35737e.f93664a;
                C52622yo yoVar = (C52622yo) C52623yp.f138162g.createBuilder();
                long parseLong = TextUtils.isEmpty((CharSequence) null) ? 0 : Long.parseLong((String) null);
                C52626ys ysVar = (C52626ys) C52627yt.f138176c.createBuilder();
                ysVar.mo53900b(parseLong);
                yoVar.copyOnWrite();
                C52623yp ypVar = (C52623yp) yoVar.instance;
                C52627yt ytVar = (C52627yt) ysVar.build();
                ytVar.getClass();
                ypVar.f138165b = ytVar;
                ypVar.f138164a |= 1;
                if (TextUtils.isEmpty(b)) {
                    n.isEmpty();
                }
                if (!TextUtils.isEmpty(b)) {
                    C52620ym ymVar = (C52620ym) C52621yn.f138154g.createBuilder();
                    ymVar.copyOnWrite();
                    C52621yn ynVar = (C52621yn) ymVar.instance;
                    b.getClass();
                    ynVar.f138156a |= 2;
                    ynVar.f138158c = b;
                    yoVar.mo53892e(ymVar);
                }
                C58801sm G = n.listIterator(0);
                while (G.hasNext()) {
                    String str = (String) G.next();
                    if (!TextUtils.isEmpty(str)) {
                        C52628yu yuVar = (C52628yu) C52629yv.f138180g.createBuilder();
                        yuVar.copyOnWrite();
                        C52629yv yvVar = (C52629yv) yuVar.instance;
                        str.getClass();
                        yvVar.f138182a |= 2;
                        yvVar.f138184c = str;
                        String stripSeparators = PhoneNumberUtils.stripSeparators(str);
                        if (TextUtils.isEmpty(stripSeparators)) {
                            optional = Optional.empty();
                        } else {
                            String country = Locale.getDefault().getCountry();
                            String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(stripSeparators, TextUtils.isEmpty(country) ? "US" : country.toUpperCase(Locale.US));
                            if (TextUtils.isEmpty(formatNumberToE164)) {
                                optional = Optional.empty();
                            } else {
                                optional = Optional.m71637of(formatNumberToE164);
                            }
                        }
                        Objects.requireNonNull(yuVar);
                        optional.ifPresent(new C35736d(yuVar));
                        yoVar.mo53894g(yuVar);
                    }
                }
                adf adf = (adf) adm.f134889h.createBuilder();
                adf.copyOnWrite();
                adm adm = (adm) adf.instance;
                C52623yp ypVar2 = (C52623yp) yoVar.build();
                ypVar2.getClass();
                adm.f134892b = ypVar2;
                adm.f134891a |= 1;
                C52294mk mkVar = (C52294mk) C52295ml.f137275c.createBuilder();
                mkVar.copyOnWrite();
                ((C52295ml) mkVar.instance).f137277a = ((C52297mn) guVar.get(i)).getNumber();
                add add = (add) ade.f134877h.createBuilder();
                add.mo53673a((adm) adf.build());
                mkVar.copyOnWrite();
                ade ade = (ade) add.build();
                ade.getClass();
                ((C52295ml) mkVar.instance).f137278b = ade;
                mjVar.mo53826a(mkVar);
            }
        }
        if (Collections.unmodifiableList(((C52296mm) mjVar.instance).f137281a).isEmpty()) {
            return C36180b.m64579c(C52235kf.NOT_FOUND, "Cannot find any matching recent contact.");
        }
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "contact_query_result";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C63088z byteString = ((C52296mm) mjVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.CallHistoryContactQueryResult";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        eaVar.mo53779a(kbVar);
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        C52069eb ebVar = (C52069eb) eaVar.build();
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }
}
