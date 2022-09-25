package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80163cl;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80164cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89123d;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bi */
/* compiled from: PG */
public final /* synthetic */ class C103687bi implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C103688bj f288792a;

    public /* synthetic */ C103687bi(C103688bj bjVar) {
        this.f288792a = bjVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C103688bj bjVar = this.f288792a;
        Optional optional = (Optional) obj;
        Set set = (Set) obj2;
        Optional findFirst = Collection.EL.stream(set).filter(C103680bb.f288785a).findFirst();
        Optional findFirst2 = Collection.EL.stream(set).filter(C103681bc.f288786a).findFirst();
        Optional findFirst3 = Collection.EL.stream(set).filter(C103682bd.f288787a).findFirst();
        Optional findFirst4 = Collection.EL.stream(set).filter(C103683be.f288788a).findFirst();
        Optional findFirst5 = Collection.EL.stream(set).filter(C103684bf.f288789a).findFirst();
        Optional findFirst6 = Collection.EL.stream(set).filter(C103685bg.f288790a).findFirst();
        Optional findFirst7 = Collection.EL.stream(set).filter(C103686bh.f288791a).findFirst();
        C80163cl clVar = (C80163cl) C80164cm.f219971c.createBuilder();
        if (findFirst3.isPresent()) {
            C80595f f = C80595f.m128216f(C80590x.VOICE_MATCH, ((C89123d) findFirst3.get()).mo83107b());
            f.mo74361h(105440);
            C80581o a = f.mo74358b().mo74356a();
            clVar.copyOnWrite();
            C80164cm cmVar = (C80164cm) clVar.instance;
            a.getClass();
            cmVar.f219974b = a;
            cmVar.f219973a |= 1;
        } else if (findFirst2.isPresent()) {
            C80595f f2 = C80595f.m128216f(C80590x.HOMESCREEN_ENTRY_POINT, ((C89123d) findFirst2.get()).mo83107b());
            f2.mo74361h(105439);
            C80581o a2 = f2.mo74358b().mo74356a();
            clVar.copyOnWrite();
            C80164cm cmVar2 = (C80164cm) clVar.instance;
            a2.getClass();
            cmVar2.f219974b = a2;
            cmVar2.f219973a |= 1;
        } else if (findFirst5.isPresent()) {
            C80581o a3 = C80595f.m128216f(C80590x.ASSISTANT_ON_LOCKSCREEN, ((C89123d) findFirst5.get()).mo83107b()).mo74358b().mo74356a();
            clVar.copyOnWrite();
            C80164cm cmVar3 = (C80164cm) clVar.instance;
            a3.getClass();
            cmVar3.f219974b = a3;
            cmVar3.f219973a |= 1;
        } else if (findFirst6.isPresent()) {
            C80581o a4 = C80595f.m128216f(C80590x.TELL_MY_FAMILY, ((C89123d) findFirst6.get()).mo83107b()).mo74360d(bjVar.f288794b.mo75121a(Locale.US).getString(R.string.nga_assist_family_broadcast_blue_bar_query, new Object[0])).mo74356a();
            clVar.copyOnWrite();
            C80164cm cmVar4 = (C80164cm) clVar.instance;
            a4.getClass();
            cmVar4.f219974b = a4;
            cmVar4.f219973a |= 1;
        } else if (findFirst7.isPresent()) {
            C80581o a5 = C80595f.m128216f(C80590x.LONG_PRESS_POWER_CONTEXTUAL_EDU, ((C89123d) findFirst7.get()).mo83107b()).mo74358b().mo74356a();
            clVar.copyOnWrite();
            C80164cm cmVar5 = (C80164cm) clVar.instance;
            a5.getClass();
            cmVar5.f219974b = a5;
            cmVar5.f219973a |= 1;
        } else if (findFirst.isPresent()) {
            C80581o a6 = C80595f.m128216f(C80590x.OOBE, ((C89123d) findFirst.get()).mo83107b()).mo74358b().mo74356a();
            clVar.copyOnWrite();
            C80164cm cmVar6 = (C80164cm) clVar.instance;
            a6.getClass();
            cmVar6.f219974b = a6;
            cmVar6.f219973a |= 1;
        } else if (findFirst4.isPresent() && optional.isPresent()) {
            C80581o a7 = new C80595f(C80590x.NEST_PROMO, 0, ((C89123d) findFirst4.get()).mo83107b(), bjVar.f288793a.mo79758x(C90037cp.f248521bw), bjVar.f288793a.mo79758x(C90037cp.f248516br)).mo74358b().mo74356a();
            clVar.copyOnWrite();
            C80164cm cmVar7 = (C80164cm) clVar.instance;
            a7.getClass();
            cmVar7.f219974b = a7;
            cmVar7.f219973a |= 1;
        }
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80164cm cmVar8 = (C80164cm) clVar.build();
        cmVar8.getClass();
        ddVar.f220291b = cmVar8;
        ddVar.f220290a = 10;
        return (C80275dd) buVar.build();
    }
}
