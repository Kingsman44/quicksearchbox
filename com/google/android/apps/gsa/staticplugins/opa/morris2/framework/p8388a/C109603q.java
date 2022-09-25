package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14189a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14290dt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.q */
/* compiled from: PG */
public final /* synthetic */ class C109603q implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109578ae f305235a;

    public /* synthetic */ C109603q(C109578ae aeVar) {
        this.f305235a = aeVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51058ev evVar;
        String str;
        C109578ae aeVar = this.f305235a;
        C52560wg wgVar = (C52560wg) obj;
        if (!wgVar.f137948d.isEmpty()) {
            C52568wo woVar = wgVar.f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (!woVar.f137998e.isEmpty()) {
                C51098gh ghVar = wgVar.f137949e;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                String str2 = evVar.f132944b;
                C52568wo woVar2 = wgVar.f137950f;
                if (woVar2 == null) {
                    woVar2 = C52568wo.f137992v;
                }
                C62971cq cqVar = woVar2.f138011r;
                if (cqVar.isEmpty()) {
                    C59104x d = C109578ae.f305157a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Morris.SearchSvcDataSrc");
                    ((C59052c) ((C59052c) d).mo56372aa(24855)).mo56386p("#convertServerMediaItemToMediaBrowseItem: no media entity type or second subtitle available for media pivot item.");
                    str = BuildConfig.FLAVOR;
                } else if (cqVar.size() == 1) {
                    str = (String) cqVar.get(0);
                } else {
                    str = aeVar.f305169e.getResources().getString(R.string.media_pivot_item_subtitle, new Object[]{cqVar.get(0), cqVar.get(1)});
                }
                C14290dt dtVar = (C14290dt) C14292dv.f43233q.createBuilder();
                C52568wo woVar3 = wgVar.f137950f;
                if (woVar3 == null) {
                    woVar3 = C52568wo.f137992v;
                }
                String str3 = woVar3.f137998e;
                dtVar.copyOnWrite();
                str3.getClass();
                ((C14292dv) dtVar.instance).f43241g = str3;
                C52568wo woVar4 = wgVar.f137950f;
                if (woVar4 == null) {
                    woVar4 = C52568wo.f137992v;
                }
                C51012dc dcVar = woVar4.f138004k;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                String str4 = dcVar.f132817c;
                dtVar.copyOnWrite();
                C14292dv dvVar = (C14292dv) dtVar.instance;
                str4.getClass();
                dvVar.f43237c = 14;
                dvVar.f43238d = str4;
                String str5 = wgVar.f137948d;
                dtVar.copyOnWrite();
                str5.getClass();
                ((C14292dv) dtVar.instance).f43249o = str5;
                dtVar.copyOnWrite();
                str.getClass();
                ((C14292dv) dtVar.instance).f43242h = str;
                C14189a aVar = (C14189a) C14216b.f43007f.createBuilder();
                aVar.copyOnWrite();
                str2.getClass();
                ((C14216b) aVar.instance).f43011c = str2;
                String h = aeVar.f305177m.mo22272h(str2);
                aVar.copyOnWrite();
                h.getClass();
                ((C14216b) aVar.instance).f43012d = h;
                dtVar.copyOnWrite();
                C14216b bVar = (C14216b) aVar.build();
                bVar.getClass();
                ((C14292dv) dtVar.instance).f43239e = bVar;
                return Optional.m71637of((C14292dv) dtVar.build());
            }
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
