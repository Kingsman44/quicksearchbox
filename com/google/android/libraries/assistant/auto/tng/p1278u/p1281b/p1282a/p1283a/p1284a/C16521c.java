package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12984b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51232ab;
import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3917i.p3918a.C51571mq;
import com.google.assistant.p3897e.p3917i.p3918a.C51572mr;
import com.google.assistant.p3897e.p3917i.p3918a.C51573ms;
import com.google.assistant.p3897e.p3917i.p3918a.C51574mt;
import com.google.assistant.p3897e.p3917i.p3918a.C51575mu;
import com.google.assistant.p3897e.p3917i.p3918a.C51576mv;
import com.google.assistant.p3897e.p3917i.p3918a.C51577mw;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.assistant.p3931f.p3939c.C52828e;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3939c.C52838o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import com.google.protobuf.C63088z;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.c */
/* compiled from: PG */
public final class C16521c extends C68247h {

    /* renamed from: a */
    private final C68283d f48508a;

    /* renamed from: c */
    private final C68283d f48509c;

    public C16521c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16521c.class), aVar);
        this.f48508a = C68236af.m98549d(dVar);
        this.f48509c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C12991i iVar = (C12991i) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        if ((iVar.f40382a & 64) != 0) {
            if (iVar.f40390i == null) {
                C12984b bVar = C12984b.f40359e;
            }
            C51232ab abVar = (C51232ab) C51233ac.f133389b.createBuilder();
            C51636z zVar = (C51636z) C51231aa.f133382f.createBuilder();
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.params.ThirdPartyAppContextParams";
            C12984b bVar2 = iVar.f40390i;
            if (bVar2 == null) {
                bVar2 = C12984b.f40359e;
            }
            C52829f fVar = bVar2.f40362b;
            if (fVar == null) {
                fVar = C52829f.f138611c;
            }
            C12984b bVar3 = iVar.f40390i;
            String str = (bVar3 == null ? C12984b.f40359e : bVar3).f40364d;
            if (bVar3 == null) {
                bVar3 = C12984b.f40359e;
            }
            long j = bVar3.f40363c;
            C69664n.m101061g(fVar, "appActionsContext");
            C69664n.m101061g(str, "packageName");
            C51577mw mwVar = (C51577mw) C51580mz.f134430h.createBuilder();
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            str.getClass();
            evVar.f132943a = 1 | evVar.f132943a;
            evVar.f132944b = str;
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            evVar2.f132943a |= 4;
            evVar2.f132946d = j;
            mwVar.copyOnWrite();
            C51580mz mzVar = (C51580mz) mwVar.instance;
            C51058ev evVar3 = (C51058ev) esVar.build();
            evVar3.getClass();
            mzVar.f134433b = evVar3;
            mzVar.f134432a = 7;
            mwVar.copyOnWrite();
            ((C51580mz) mwVar.instance).f134434c = 2;
            if (fVar.f138613a.size() > 0) {
                C52825b bVar4 = (C52825b) fVar.f138613a.get(0);
                C51571mq mqVar = (C51571mq) C51576mv.f134424c.createBuilder();
                String str2 = bVar4.f138596b;
                mqVar.copyOnWrite();
                str2.getClass();
                ((C51576mv) mqVar.instance).f134426a = str2;
                C51572mr mrVar = (C51572mr) C51575mu.f134418e.createBuilder();
                C69664n.m101060f(mrVar, "newBuilder()");
                String str3 = bVar4.f138596b;
                if (C69664n.m101066l(str3, "actions.intent.UPDATE_ITEM_LIST")) {
                    mrVar.copyOnWrite();
                    ((C51575mu) mrVar.instance).f134420a = 4;
                    mrVar.copyOnWrite();
                    ((C51575mu) mrVar.instance).f134422c = 2;
                    C62971cq<C52838o> cqVar = ((C52828e) bVar4.f138598d.get(0)).f138606c;
                    C69664n.m101060f(cqVar, "selectionParam.possibleEntitiesList");
                    ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
                    for (C52838o oVar : cqVar) {
                        C51573ms msVar = (C51573ms) C51574mt.f134414c.createBuilder();
                        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
                        String str4 = oVar.f138636b;
                        C69664n.m101060f(str4, "entity.identifier");
                        String str5 = str4.length() == 0 ? oVar.f138637c : oVar.f138636b;
                        fyVar.copyOnWrite();
                        C63063ga gaVar = (C63063ga) fyVar.instance;
                        str5.getClass();
                        gaVar.f170181a = 3;
                        gaVar.f170182b = str5;
                        msVar.copyOnWrite();
                        C63063ga gaVar2 = (C63063ga) fyVar.build();
                        gaVar2.getClass();
                        ((C51574mt) msVar.instance).f134416a = gaVar2;
                        String str6 = oVar.f138637c;
                        msVar.copyOnWrite();
                        C51574mt mtVar = (C51574mt) msVar.instance;
                        str6.getClass();
                        mtVar.mo53642a();
                        mtVar.f134417b.add(str6);
                        msVar.mo53641a(oVar.f138638d);
                        arrayList.add((C51574mt) msVar.build());
                    }
                    mrVar.copyOnWrite();
                    C51575mu muVar = (C51575mu) mrVar.instance;
                    muVar.mo53643a();
                    C62947c.addAll((Iterable) arrayList, (List) muVar.f134423d);
                    C51575mu muVar2 = (C51575mu) mrVar.build();
                    mqVar.copyOnWrite();
                    muVar2.getClass();
                    ((C51576mv) mqVar.instance).f134427b = muVar2;
                    mwVar.mo53644a((C51576mv) mqVar.build());
                } else if (C69664n.m101066l(str3, "actions.intent.GET_CONFIRMATION")) {
                    mrVar.copyOnWrite();
                    ((C51575mu) mrVar.instance).f134420a = 3;
                    mrVar.copyOnWrite();
                    ((C51575mu) mrVar.instance).f134422c = 2;
                    C51575mu muVar3 = (C51575mu) mrVar.build();
                    mqVar.copyOnWrite();
                    muVar3.getClass();
                    ((C51576mv) mqVar.instance).f134427b = muVar3;
                    mwVar.mo53644a((C51576mv) mqVar.build());
                } else {
                    C59052c cVar2 = (C59052c) C16464a.f48375a.mo56226d();
                    String str7 = bVar4.f138596b;
                    cVar2.mo56379ah(new C59094n(46311));
                    cVar2.mo56389s("BII %s is unsupported", str7);
                }
            }
            C62942bv build = mwVar.build();
            C69664n.m101060f(build, "builder.build()");
            C63088z byteString = ((C51580mz) build).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            zVar.mo53670b((C52230ka) jzVar.build());
            abVar.mo53558b((C51231aa) zVar.build());
            obj2 = C58833ax.m90834k((C51233ac) abVar.build());
        } else {
            C12989g a = C12989g.m29225a(iVar.f40385d);
            if (a == null) {
                a = C12989g.UNKNOWN;
            }
            if (a != C12989g.AUTO_EMBEDDED) {
                obj2 = C58836b.f156633a;
            } else if (!C57940c.m88582i(cVar) || TextUtils.isEmpty((CharSequence) cVar.mo60292a())) {
                ((C59052c) ((C59052c) C16493b.f48456a.mo56224b()).mo56372aa(46312)).mo56386p("Empty project id.");
                obj2 = C58836b.f156633a;
            } else {
                C51232ab abVar2 = (C51232ab) C51233ac.f133389b.createBuilder();
                C51636z zVar2 = (C51636z) C51231aa.f133382f.createBuilder();
                C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar2.copyOnWrite();
                C52230ka kaVar3 = (C52230ka) jzVar2.instance;
                kaVar3.f137059a |= 1;
                kaVar3.f137060b = "assistant.api.params.ThirdPartyAppContextParams";
                C51577mw mwVar2 = (C51577mw) C51580mz.f134430h.createBuilder();
                String str8 = (String) cVar.mo60292a();
                mwVar2.copyOnWrite();
                C51580mz mzVar2 = (C51580mz) mwVar2.instance;
                str8.getClass();
                mzVar2.f134432a = 5;
                mzVar2.f134433b = str8;
                mwVar2.copyOnWrite();
                ((C51580mz) mwVar2.instance).f134435d = true;
                mwVar2.copyOnWrite();
                ((C51580mz) mwVar2.instance).f134434c = 1;
                C63088z byteString2 = ((C51580mz) mwVar2.build()).toByteString();
                jzVar2.copyOnWrite();
                C52230ka kaVar4 = (C52230ka) jzVar2.instance;
                byteString2.getClass();
                kaVar4.f137059a |= 2;
                kaVar4.f137061c = byteString2;
                zVar2.mo53670b((C52230ka) jzVar2.build());
                abVar2.mo53558b((C51231aa) zVar2.build());
                obj2 = C58833ax.m90834k((C51233ac) abVar2.build());
            }
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48508a.mo60297gq(), C68236af.m98546a(this.f48509c.mo60297gq()));
    }
}
